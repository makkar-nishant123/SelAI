package frontEnd_Utils;

import org.testng.Assert;

public class Validate {

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
	
	public String assert_String(String Expected, String Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_integer(int Expected, int Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_long(long Expected, long Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_long(double Expected, double Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_string(String[] Expected, String[] Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_int(int[] Expected, int[] Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_long(long[] Expected, long[] Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_float(float Expected, float Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_float_array(float[] Expected, float[] Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}
	
}
