package frontEnd_Utils;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Helper;
import utils.Servlet_helper;

public class Mouse {

	public static Actions create_action_obj(WebDriver driver )
	{
		
		return new Actions(driver);
	}
	
	
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param flag
	 * @return
	 */
	public static String Submit(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");
		
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			webElement.submit();
		
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return result_webelement + ".submit()";
	}

	
	// Click without Action class.
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param flag
	 * @return
	 */
	public static String Click(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");
		
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			webElement.click();
		
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return result_webelement + ".click()";
	}

	// Click and hold with Action class and without webelement
	/**
	 * @author NMakkar
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_clickandhold(Map<String, Object> param) {
		
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).clickAndHold().build().perform();
		return "new Actions(Servlet_helper.getdriver()).clickAndHold().build().perform();\n";
	}

	// Click and hold with Action class and with webelement
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_clickandhold_webelement(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).clickAndHold(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "create_action_obj(Servlet_helper.getdriver()).clickAndHold(" + result_webelement + ").build().perform();";
	}

	// Click with Action class and with webelement

	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_click_webelement(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).click(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "create_action_obj(Servlet_helper.getdriver()).click(" + result_webelement + ").build().perform();";
	}

	// Click with Action class and without webelement
	/**
	 * @author NMakkar
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_click(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).click().build().perform();
		return "create_action_obj(Servlet_helper.getdriver()).click().build().perform();";
	}

	// ContextClick with Action class and with webelement
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_contextClick_webelement(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).contextClick(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "create_action_obj(Servlet_helper.getdriver()).contextClick(" + result_webelement + ").build().perform();";
	}

	// ContextClick with Action class and without webelement
	/**
	 * @author NMakkar
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_contextClick(Map<String, Object> param) {
		
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).contextClick().build().perform();
		return "create_action_obj(Servlet_helper.getdriver()).contextClick().build().perform();";
	}

	// doubleClick with Action class and with webelement
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_doubleClick_webelement(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).doubleClick(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "create_action_obj(Servlet_helper.getdriver()).doubleClick(" + result_webelement + ").build().perform();";
	}

	// doubleClick with Action class and without webelement
	/**
	 * @author NMakkar
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_doubleClick(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).doubleClick().build().perform();
		return "create_action_obj(Servlet_helper.getdriver()).doubleClick().build().perform();";
	}

	// Drag&Drop with Action class and with webelement
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_dragdrop_webelement(Map<String, Object> param) {
		String[] webElement_string = param.get("element").toString().split(",");
		
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).dragAndDrop(webElement[0], webElement[1]).build().perform();
		String result_webelement0 = Helper.fetch_webelement_string(webElement[0]) + ",";
		String result_webelement1 = Helper.fetch_webelement_string(webElement[1]);
		return "create_action_obj(Servlet_helper.getdriver()).dragAndDrop(" + result_webelement0 + result_webelement1 + ").build().perform();";
	}

	// Drop with Action class and with Webelement and offset
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param offset
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_dragdrop(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).dragAndDropBy(webElement, offset[0], offset[1]).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement) + "," + offset[0] + "," + offset[1];

		return "create_action_obj(Servlet_helper.getdriver()).dragAndDropBy(" + result_webelement + ").build().perform();";
	}

	// KeyDown with Action class and data
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_keyDown(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).keyDown(charseq).build().perform();

		return "create_action_obj(Servlet_helper.getdriver()).keyDown(" + charseq + ").build().perform();";
	}

	// KeyDown with Action class , WebElement and data
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @param webelement
	 * @return
	 */
	public static String mouse_keyDown_webelement(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).keyDown(webElement, charseq).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement) + "," + charseq;

		return "create_action_obj(Servlet_helper.getdriver()).keyDown(" + result_webelement + ").build().perform();";
	}

	// keyUp with Action class and data
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_keyUp(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).keyUp(charseq).build().perform();

		return "create_action_obj(Servlet_helper.getdriver()).keyDown(" + charseq + ").build().perform();";
	}

	// keyUp with Action class , WebElement and data
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @param webelement
	 * @return
	 */
	public static String mouse_keyUp_webelement(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).keyUp(webElement, charseq).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement) + "," + charseq;

		return "create_action_obj(Servlet_helper.getdriver()).keyDown(" + result_webelement + ").build().perform();";
	}

	// release with Action class
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_release(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).release().build().perform();

		return "create_action_obj(Servlet_helper.getdriver()).release().build().perform();";
	}

	// release with Action class , WebElement
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @param webelement
	 * @return
	 */
	public static String mouse_release_webelement(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).release(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);

		return "create_action_obj(Servlet_helper.getdriver()).release(" + result_webelement + ").build().perform();";
	}

	// pause_long with Action class
	/**
	 * @author NMakkar
	 * @param duration
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_pause_duration(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).pause(duration).build().perform();

		return "create_action_obj(Servlet_helper.getdriver()).pause(" + duration + ").build().perform();";
	}
	// _pause_duration with Action class , WebElement and data

	/*
	 * public static String mouse_pause_duration(long duration, int flag,
	 * Actions action) { if (param.get("flag").equals(0) || param.get("flag").equals(2))
	 * action.pause(duration).build().perform();
	 * 
	 * return "action.pause(" + duration + ").build().perform();"; }
	 */

	// moveToElement with Action class , webElement and offset
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_moveToElement_Webelement(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).moveToElement(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "create_action_obj(Servlet_helper.getdriver()).moveToElement(" + result_webelement + ").build().perform();";
	}

	// moveToElement with Action class , webElement and offset
	/**
	 * @author NMakkar
	 * @param offset
	 * @param flag
	 * @param action
	 * @param webElement
	 * @return
	 */
	public static String mouse_moveToElement_Offset(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			action.moveToElement(webElement, offset[0], offset[1]).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement) + "," + offset[0] + "," + offset[1];
		return "action.moveToElement(" + result_webelement + ").build().perform();";
	}

	// MoveByOffset with Action class and offset
	/**
	 * @author NMakkar
	 * @param offset
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_MoveByOffset(Map<String, Object> param) {
		WebElement webElement = (WebElement) param.get("element");

		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			create_action_obj(Servlet_helper.getdriver()).moveByOffset(offset[0], offset[1]).build().perform();

		return "create_action_obj(Servlet_helper.getdriver()).moveByOffset(" + offset[0] + "," + offset[1] + ").build().perform();";
	}

	/*
	 * // Tick with Action class
	 *//**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 */

	/*
	 * public static String mouse_tick_action(int[] offset , WebElement
	 * webElement, int flag, Actions action) { if (param.get("flag").equals(0) || param.get("flag").equals(2))
	 * action.moveToElement(webElement,offset[0],offset[1]).build().perform();
	 * String result_webelement =
	 * Helper.fetch_webelement_string(webElement)+","+offset[0]+","+offset[1];
	 * return "action.moveToElement(" + result_webelement +
	 * ").build().perform();"; }
	 * 
	 * // Tick with Action class and interaciton
	 *//**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 *//*
	 * public static String mouse_tick_interaction(int[] offset, int flag,
	 * Actions action) { if (param.get("flag").equals(0) || param.get("flag").equals(2))
	 * action.moveByOffset(offset[0],offset[1]).build().perform();
	 * 
	 * return "action.moveByOffset(" + offset[0] + "," + offset[1] +
	 * ").build().perform();"; }
	 */
	
	
	
	// SendKeys with Action class and data
		/**
		 * @author NMakkar
		 * @param charseq
		 * @param flag
		 * @param action
		 * @return
		 */
		public static String mouse_sendKeys(Map<String, Object> param) {
			WebElement webElement = (WebElement) param.get("element");

			if (param.get("flag").equals(0) || param.get("flag").equals(2))
				create_action_obj(Servlet_helper.getdriver()).sendKeys(charseq).build().perform();

			return "action.sendKeys(" + charseq + ").build().perform();";
		}

		// SendKeys with Action class , WebElement and data
		/**
		 * @author NMakkar
		 * @param charseq
		 * @param flag
		 * @param action
		 * @param webelement
		 * @return
		 */
		public static String mouse_sendKeys_webelement(Map<String, Object> param) {
			WebElement webElement = (WebElement) param.get("element");

			if (param.get("flag").equals(0) || param.get("flag").equals(2))
				create_action_obj(Servlet_helper.getdriver()).sendKeys(webElement, charseq).build().perform();
			String result_webelement = Helper.fetch_webelement_string(webElement) + "," + charseq;

			return "create_action_obj(Servlet_helper.getdriver()).sendKeys(" + result_webelement + ").build().perform();";
		}
}
