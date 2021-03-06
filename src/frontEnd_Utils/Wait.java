package frontEnd_Utils;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.Servlet_helper;

public class Wait {

	/**
	 * Implicit wait generic function.
	 * 
	 * @param time
	 * @param tunit
	 * @return
	 */
	public String implicit_wait(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.getdriver().manage().timeouts().implicitlyWait(time, tunit);

		return "Servlet_helper.getdriver().manage().timeouts().implicitlyWait(" + time + "," + tunit + ");";

	}

	/**
	 * Explicit Wait - waiting for webElement to load.
	 * 
	 * @param waitelement
	 * @return
	 */
	public String explicit_wait_visibilityOf(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.Getexplicit_wait().until(ExpectedConditions.visibilityOf(waitelement));
		return "Servlet_helper.Getexplicit_wait().until(ExpectedConditions.visibilityOf(" + waitelement + "));";

	}

	/**
	 * Explicit Wait - waiting for webElement to disappear.
	 * 
	 * @param waitelement
	 * @return
	 */
	public String explicit_wait_invisibilityOf(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.Getexplicit_wait().until(ExpectedConditions.invisibilityOf(waitelement));
		return "Servlet_helper.Getexplicit_wait().until(ExpectedConditions.visibilityOf(" + waitelement + "));";

	}

	@SuppressWarnings("unchecked")
	public String fluent_wait(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
		Servlet_helper.Getfluent_wait().withTimeout(timeout, tunit).pollingEvery(ptime, tunit)
		.ignoring(NoSuchElementException.class);

		return "Servlet_helper.Getfluent_wait().withTimeout(" + timeout + "," + tunit
				+ ").pollingEvery(ptime, tunit).ignoring(NoSuchElementException.class);";

	}

}
