package frontEnd_Utils;

import java.util.ArrayList;
import java.util.Map;

import utils.Servlet_helper;

public class Tab {

	
	public static String get_All_Tabsorwindows(Map<String, Object> param) 
	{
		ArrayList<String> windows = new ArrayList<String>();
	
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
  windows = new ArrayList<String>(Servlet_helper.getdriver().getWindowHandles());
	return " ArrayList<String> windows = new ArrayList<String>(Servlet_helper.getdriver().getWindowHandles());";
	}
	
	
	public static String switch_Tabsorwindows_name(Map<String, Object> param) 
	{
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.getdriver().switchTo().window(name);
		return "Servlet_helper.getdriver().switchTo().window(" + name+ ");";
	}
	
	
}
