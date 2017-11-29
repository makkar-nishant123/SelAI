package selenium_utils;

import java.util.Map;

import org.openqa.selenium.WebElement;

public class Keyboard {

	public static String write_text(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");
		String data = (String) param.get("data");

		if (param.get("flag") == "0" || param.get("flag") == "2")
			webElement.sendKeys(data);

		return webElement + ".sendKeys(" + data + ")";
	}
}
