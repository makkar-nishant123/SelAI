package frontEnd_Utils;

import java.util.Map;

import org.openqa.selenium.security.Credentials;

import utils.Servlet_helper;

public class Alert {

	
	public static String accept_alert(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().switchTo().alert().accept();
			

		return "Servlet_helper.getdriver().switchTo().alert().accept();";
	}
	
	
	public static String credentials_set_alert(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().switchTo().alert().setCredentials(credentials);
			

		return "Servlet_helper.getdriver().switchTo().alert().setCredentials(" + credentials + ");";
	}
	
	public static String credentials_authenticate_alert(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().switchTo().alert().authenticateUsing(credentials);
			

		return "Servlet_helper.getdriver().switchTo().alert().authenticateUsing(" + credentials + ");";
	}
	
	public static String credentials_senddata_alert(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().switchTo().alert().sendKeys(data);
			

		return "Servlet_helper.getdriver().switchTo().alert().sendKeys(" + data + ");";
	}
	
	public static String dismiss_alert(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().switchTo().alert().dismiss();
			

		return "Servlet_helper.getdriver().switchTo().alert().dismiss()";
	}
	
	public static String getText_alert(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().switchTo().alert().getText();
			

		return "Servlet_helper.getdriver().switchTo().alert().getText();";
	}
	
	
}
