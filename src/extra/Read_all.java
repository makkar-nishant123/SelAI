package extra;

import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
public class Read_all {
		

		    public static void main(String[] args) throws Exception{
	        List<Class> classes = getClasses(Read_all.class.getClassLoader(),"frontEnd_Utils");
	        for(Class c:classes){
	        	String cname  = c.toString().substring(c.toString().lastIndexOf(".")+1,c.toString().length());
	        	//System.out.println("*************Class is :" + cname + "***************");
	        	try {
	              
	                Method[] m = c.getDeclaredMethods();
	                for (int i = 0; i < m.length; i++)
	                System.out.println("Class and Method is :" + m[i].toString().substring(m[i].toString().indexOf(cname+"."),m[i].toString().indexOf("(")));
	            } catch (Throwable e) {
	                System.err.println(e);
	            }
	        }
	    }

	    public static List<Class> getClasses(ClassLoader cl,String pack) throws Exception{

	        String dottedPackage = pack.replaceAll("[/]", ".");
	        List<Class> classes = new ArrayList<Class>();
	        URL upackage = cl.getResource(pack);

	        DataInputStream dis = new DataInputStream((InputStream) upackage.getContent());
	        String line = null;
	        while ((line = dis.readLine()) != null) {
	            if(line.endsWith(".class")) {
	               classes.add(Class.forName(dottedPackage+"."+line.substring(0,line.lastIndexOf('.'))));
	            }
	        }
	        return classes;
	    }
	}

