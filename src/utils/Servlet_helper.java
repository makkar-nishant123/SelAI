package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import frontEnd_Utils.Browser;

public class Servlet_helper {
	static String method_code;
	private static WebDriver driver;
	// Wait Object
	private static WebDriverWait wait;
	// Wait
	@SuppressWarnings("rawtypes")
	private static FluentWait fwait;

	// JavascriptExecutor object
	private static JavascriptExecutor executor;

	public static WebDriver getdriver() {

		return driver;
	}

	public static WebDriverWait Getexplicit_wait() {

		wait = new WebDriverWait(getdriver(), 5);
		return wait;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static FluentWait Getfluent_wait() {

		fwait = new FluentWait(getdriver());
		return fwait;
	}

	public static JavascriptExecutor Get_jsExecutor() {

		executor = (JavascriptExecutor) driver;
		return executor;
	}

	public static ArrayList<String> get_windows_all() {

		return new ArrayList<String>(driver.getWindowHandles());
	}

	private static String validate_class(HashMap<String, String> out_map) {
		// TODO Auto-generated method stub
		return out_map.get("class_name");
	}

	public static void execute(HashMap<String, String> out_map, int flag) {
		// TODO Auto-generated method stub

		if (!out_map.get("browser").equals(null) && !out_map.get("browser").equals("")) {
			driver = Browser.getBrowser(out_map.get("browser"), out_map.get("URL"), flag , getdriver());
			if (flag == 1 || flag == 2)
				method_code = "Browsers.getBrowser(\"" + out_map.get("browser") + "\",\"" + out_map.get("URL") + "\""
						+ flag + " , Servlet_helper.getdriver());";
		}

		if (out_map.get("close_browser").equals("YES"))
			method_code += Browser.close_browsers(flag , getdriver());

		if (out_map.get("kill_drivers").equals("YES"))
			method_code += Browser.kill_browser_drivers(out_map.get("browser"), flag ,  getdriver());
		
		for (int i = 0; i < Integer.parseInt(out_map.get("count_actions")); i++) {
			WebElement element;
			List<WebElement> listelement;
			if (out_map.get(String.valueOf(i + 40)).contains("&"))
			if (!out_map.get("count_actions").contains("list")) {
			
				element = Select_locator.select(out_map.get(String.valueOf(i + 30)), out_map.get(String.valueOf(i + 40)), driver);
				method_code += Call_methods.frame_class_method_param(out_map.get(String.valueOf(i + 10)), out_map.get(String.valueOf(i + 20)), out_map.get(String.valueOf(i + 50)),
						out_map.get(String.valueOf(i + 60)), element, flag, method_code);

			} else {
				
				listelement = Select_locator.select_elements(out_map.get(String.valueOf(i + 30)), out_map.get(String.valueOf(i + 40)), driver);
				method_code += Call_methods.frame_class_method_param(out_map.get(String.valueOf(i + 10)), out_map.get(String.valueOf(i + 20)), out_map.get(String.valueOf(i + 50)),
						out_map.get(String.valueOf(i + 60)), listelement, flag, method_code);
			}
		}

		if (flag == 1 || flag == 2)
			Create_runtime.create_Method(validate_class(out_map), out_map.get("method_name"), method_code);
	}

	public static HashMap<String, String> get_value(String input) {
		HashMap<String, String> input_map = new HashMap<String, String>();
		// TODO Auto-generated method stub
		input = input.substring(1, input.length() - 1);
		if (input.contains("]["))
			input = 	input.replace("][", ",");
			
			//input = input.substring(0,input.indexOf("][")) + input.substring(input.indexOf("][") + 2 , input.length());
		String[] s = input.split("},");
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i] + "}";
			JSONObject jObj = new JSONObject(s[i]);
			input_map.put(jObj.get("name").toString(), jObj.get("value").toString());

		}

		return input_map;
	}

	public static String read_input_servlet(HttpServletRequest req) {
		// String body = null;
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;

		try {
			InputStream inputStream = req.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append("");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}

		return stringBuilder.toString();

	}
}