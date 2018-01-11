package frontEnd_Utils;

import java.util.Map;

import org.openqa.selenium.WebElement;

import utils.Servlet_helper;

public class JavaScript {

	
public static String perform_js_action(Map<String, Object> param) {

	if (param.get("flag").equals(0) || param.get("flag").equals(2))
	Servlet_helper.Get_jsExecutor().executeScript(action , element);
	return "Servlet_helper.Get_jsExecutor().executeScript(" + action + ","+  element+ ");";
}
	
	
}
