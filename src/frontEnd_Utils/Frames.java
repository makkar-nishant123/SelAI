package frontEnd_Utils;

import java.util.Map;

import org.openqa.selenium.WebElement;

import utils.Servlet_helper;

public class Frames {
	
	public static String switch_to_frame_id(Map<String, Object> param) {
	{
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.getdriver().switchTo().frame(id);
		return "Servlet_helper.getdriver().switchTo().frame(" + id+ ");";
	}
	public static String switch_to_frame_name(Map<String, Object> param) {
	{
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.getdriver().switchTo().frame(frame_name);
		return "Servlet_helper.getdriver().switchTo().frame(" + frame_name+ ");";
	}
	public static String switch_to_frame_element(Map<String, Object> param) {
	{
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.getdriver().switchTo().frame(element_frame);
		return "Servlet_helper.getdriver().switchTo().frame(" + element_frame+ ");";
	}
	public static String switch_to_parentframe(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.getdriver().switchTo().parentFrame();
		return "Servlet_helper.getdriver().switchTo().parentFrame();";
	}

}
