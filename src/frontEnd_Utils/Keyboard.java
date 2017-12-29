package frontEnd_Utils;

import java.util.Map;

import org.openqa.selenium.WebElement;

import utils.Helper;

public class Keyboard {

	public static String write_text(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");
		String data = (String) param.get("data");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			webElement.sendKeys(data);

		String result_webelement = Helper.fetch_webelement_string(webElement);
		return result_webelement + ".sendKeys(" + data + ")";
	}
}