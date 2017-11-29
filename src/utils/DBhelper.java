package utils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;

import utils.PropertiesReader;


public class DBhelper {







		static String dbUrl = PropertiesReader.readProperty("dburl");
		static String dbUsername = PropertiesReader.readProperty("dbusername");
		static String dbPassword = PropertiesReader.readProperty("dbpassword");
		
		static Connection con = null;
		static PreparedStatement pstmt = null;
		static Statement stmt = null;
		static ResultSet rs = null;
		/**
		 * 
		 */
		static {
					
			String selectdb = PropertiesReader.readProperty("dbtype").toUpperCase();
			switch(selectdb){
			
			case "MYSQL":
				//reportLog.LOG(log.INFO, "creating mysql connection", "static block");
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "ORACLE":
				//reportLog.LOG(log.INFO, "creating oracle connection", "static block");
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					con = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
					
					
				} catch (ClassNotFoundException cnfe) {
					// TODO Auto-generated catch block
					cnfe.printStackTrace();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
				break;
				
			case "POSTGRESS":
				//reportLog.LOG(log.INFO, "creating postgress connection", "static block");
				try {
					Class.forName("org.postgresql.Driver");
					con = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
					
				} catch (ClassNotFoundException cnfe) {
					// TODO Auto-generated catch block
					cnfe.printStackTrace();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
				break;
			default:
				//reportLog.LOG(log.INFO, "Connection available only for  MYSQL ORACLE POSTGRESS  ", "static block");
					
			}
			
		}
		
		/**
		 * 
		 * @param query
		 * @param val
		 * @return
		 */
	public static ResultSet selectQuery(String query, Object [] val){
			 rs = null;
			try {
				pstmt = con.prepareStatement(query);
				for(int i=0;i<val.length;i++)
				{
					if(val[i] instanceof Integer)
					{
						pstmt.setInt(i+1, (int) val[i]);
						
					} else if(val[i] instanceof String)	{
						
						pstmt.setString(i+1, (String) val[i]);
						
					} else if(val[i] instanceof Long ){
						
						pstmt.setLong(i+1, (Long) val[i]);
						
					} else if(val[i] instanceof Double) {
						
						pstmt.setDouble(i+1, (Double) val[i]);
						
					} else if(val[i] instanceof Float) {
						
						pstmt.setDouble(i+1, (Float) val[i]);
						
					} else if(val[i] instanceof Date) {
						
						pstmt.setDate(i+1, (Date) val[i]);
						
					} else if(val[i] instanceof Time) {
						
						pstmt.setTime(i+1, (Time) val[i]);
						
					} else if(val[i] instanceof Timestamp) {
						
						pstmt.setTimestamp(i+1, (Timestamp) val[i]);
						
					}
						
				}
				
				rs=pstmt.executeQuery();  
				
			} catch (SQLException e) {
			
				//reportLog.LOG(log.FATAL, e.getMessage() , "static block");
			}
			
			return rs;	
		}

	/**
	 * 
	 * @param query
	 * @param val
	 * @return
	 */
	public static ResultSet selectQuery(String query){
		 rs = null;
		try {
			stmt = con.createStatement();
			rs=stmt.executeQuery(query);  
			
		} catch (SQLException e) {
		
			System.out.println(e);
		}	
		return rs;	
	}

	public static void main(String[] args) {
		ResultSet result = selectQuery("select Acct_Status from acct where acct_nbr ='JW001001' and site_sid in(select site_sid from site where site_code = 'SYY');");
		try {
			ResultSetMetaData rsmd = result.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println(columnsNumber);
			
			while (result.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) System.out.print(",  ");
			        String columnValue = result.getString(i);
			        System.out.print(columnValue + " " + rsmd.getColumnName(i));
			    }
			    System.out.println("");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}
	