package frontEnd_Utils;

import java.util.Map;

import org.testng.Assert;

public class Validate {

	public static String verify_String(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)){
		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  }
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_int(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)){
		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  }
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_float(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)){
		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		}
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_float_array(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))}
		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  }
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_String_array(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)){
		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  }
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_int_array(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)){
		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  }
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_double(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)){
		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    }  
		}
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public static String verify_double_array(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)){
		 try{        
		        Assert.assertEquals(Actual, Expected);            
		    }catch(AssertionError e){           
		        System.out.println(message + "\n");      
		    } } 
		 
	return "try{ \n "
			+ "Assert.assertEquals(" + Actual + "," +  Expected + ");\n"            
		    + "}catch(AssertionError e){\n"           
		      +   "System.out.println(" + message + ");\n}";      
	}
	
	public String assert_String(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_integer(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_long(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_long(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_string(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_int(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_long(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_float(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_float_array(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}
	
}
