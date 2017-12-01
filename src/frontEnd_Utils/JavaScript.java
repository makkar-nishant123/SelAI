package frontEnd_Utils;

import org.openqa.selenium.WebElement;

import utils.Servlet_helper;

public class JavaScript {

	
public static String perform_js_action(String action , WebElement element)
{
	Servlet_helper.Get_jsExecutor().executeScript(action , element);
	return "Servlet_helper.Get_jsExecutor().executeScript(" + action + ","+  element+ ");";
}
	
	
}
