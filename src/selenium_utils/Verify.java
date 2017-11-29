package selenium_utils;

import org.testng.Assert;

public class Verify {

	public static String verify_String(String Expected, String Actual, String message) {

		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_int(int Expected, int Actual, String message) {

		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_float(float Expected, float Actual, String message) {

		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_float_array(float[] Expected, float[] Actual, String message) {

		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_String_array(String[] Expected, String[] Actual, String message) {

		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_int_array(int[] Expected, int[] Actual, String message) {

		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_double(double Expected, double Actual, String message) {

		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_double_array(double[] Expected, double[] Actual, String message) {

		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
}
