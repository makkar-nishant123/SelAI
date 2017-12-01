package frontEnd_Utils;

import java.util.ArrayList;

import utils.Servlet_helper;

public class Tab {

	
	public static String get_All_Tabsorwindows()
	{
    ArrayList<String> windows = new ArrayList<String>(Servlet_helper.getdriver().getWindowHandles());
	return " ArrayList<String> windows = new ArrayList<String>(Servlet_helper.getdriver().getWindowHandles());";
	}
	
	
	public static String switch_Tabsorwindows_name(String name)
	{
   
		Servlet_helper.getdriver().switchTo().window(name);
		return "Servlet_helper.getdriver().switchTo().window(" + name+ ");";
	}
	
	
}
