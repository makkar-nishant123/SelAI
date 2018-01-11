package frontEnd_Utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select {

	// Selecting By Index.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String select_by_id(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)) {
			Select select = new Select(webElement);
			select.selectByIndex(index);
		}
		return "select.selectByIndex(" + index + ")";
	}

	// Selecting by Value.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String select_by_value(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)) {
			Select select = new Select(webElement);
			select.selectByValue(value);
		}
		return "select.selectByValue(" + value + ")";
	}

	// Selecting by VisibleText.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String select_by_VisibleText(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)) {
			Select select = new Select(webElement);
			select.selectByVisibleText(text);
		}
		return "select.selectByValue(" + text + ")";
	}

	// DeSelecting All.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String select_deselectAll(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)) {
			Select select = new Select(webElement);
			select.deselectAll();
		}
		return "select.deselectAll()";
	}

	// DeSelecting By Index.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String deselect_by_id(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)) {
			Select select = new Select(webElement);
			select.deselectByIndex(index);
		}
		return "select.deselectByIndex(" + index + ")";
	}

	// deSelecting by Value.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String deselect_by_value(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)) {
			Select select = new Select(webElement);
			select.deselectByValue(value);
		}
		return "select.deselectByValue(" + value + ")";
	}

	// deSelecting by VisibleText.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String deselect_by_VisibleText(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2)) {
			Select select = new Select(webElement);
			select.deselectByVisibleText(text);
		}
		return "select.deselectByValue(" + text + ")";
	}
	// fetch all selected options 
		/**
		 * 
		 * @param webElement
		 * @param index
		 * @param flag
		 * @return
		 */
		public static Dropdown_Select deselect_getAllSelectedOptions(Map<String, Object> param) {
			List<WebElement> selected_options = new LinkedList<WebElement>();
			if (param.get("flag").equals(0) || param.get("flag").equals(2)) {
				Select select = new Select(webElement);
				 selected_options = select.getAllSelectedOptions();
			}
			String method_code =  "select.getAllSelectedOptions()";
			return new Dropdown_Select(method_code, selected_options);
		}

		private String method_code;
		private List<WebElement> selected_options;
		
		public  Dropdown_Select(Map<String, Object> param) {
			// TODO Auto-generated method stub
			this.method_code = method_code;
			this.selected_options = selected_options;
		}
		
		
		public List<WebElement> get_selected_options()
		{
			return selected_options;
		}
		
		public String get_method_code()
		{
			return method_code;
		}
}