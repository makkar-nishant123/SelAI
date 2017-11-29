package selenium_utils;

import org.openqa.selenium.WebElement;

import utils.Servlet_helper;

public class Frames {
	
	public static String switch_to_frame_id(int id)
	{
		
		Servlet_helper.getdriver().switchTo().frame(id);
		return "Servlet_helper.getdriver().switchTo().frame(" + id+ ");";
	}
	public static String switch_to_frame_name(String frame_name)
	{
		
		Servlet_helper.getdriver().switchTo().frame(frame_name);
		return "Servlet_helper.getdriver().switchTo().frame(" + frame_name+ ");";
	}
	public static String switch_to_frame_element(WebElement element_frame)
	{
		
		Servlet_helper.getdriver().switchTo().frame(element_frame);
		return "Servlet_helper.getdriver().switchTo().frame(" + element_frame+ ");";
	}
	public static String switch_to_parentframe()
	{
		
		Servlet_helper.getdriver().switchTo().parentFrame();
		return "Servlet_helper.getdriver().switchTo().parentFrame();";
	}

}
