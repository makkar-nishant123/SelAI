package utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_locator {
	static WebElement return_element;
	static List<WebElement> return_element_list;
	public static WebElement select(String locator, String locator_value, WebDriver driver) {


		switch (locator) {
		case "id": {
			return_element = driver.findElement(By.id(locator_value));
		}
		break;
		case "xpath": {
			return_element = driver.findElement(By.xpath(locator_value));
		}
		break;

		case "Css": {
			return_element = driver.findElement(By.cssSelector(locator_value));
		}
		break;

		case "name": {
			return_element = driver.findElement(By.name(locator_value));
		}
		break;

		case "Tag": {
			return_element = driver.findElement(By.name(locator_value));
		}
		break;

		case "Linktext": {
			return_element = driver.findElement(By.linkText(locator_value));
		}
		break;

		case "PartialLinktext": {
			return_element = driver.findElement(By.partialLinkText(locator_value));
		}
		break;

		case "ClassName": {
			return_element = driver.findElement(By.className(locator_value));
		}
		break;

		default:
			System.out.println("Using ID by default ");

		}
		return return_element;

	}

	public static List<WebElement> select_elements(String locator, String locator_value, WebDriver driver) {
		
		switch (locator) {
		case "id": {
			return_element_list = driver.findElements(By.id(locator_value));
		}
		break;

		case "xpath": {
			return_element_list = driver.findElements(By.xpath(locator_value));
		}
		break;

		case "Css": {
			return_element_list = driver.findElements(By.cssSelector(locator_value));
		}
		break;

		case "name": {
			return_element_list = driver.findElements(By.name(locator_value));
		}
		break;

		case "Tag": {
			return_element_list = driver.findElements(By.name(locator_value));
		}
		break;

		case "Linktext": {
			return_element_list = driver.findElements(By.linkText(locator_value));
		}
		break;

		case "PartialLinktext": {
			return_element_list = driver.findElements(By.partialLinkText(locator_value));
		}
		break;

		case "ClassName": {
			return_element_list = driver.findElements(By.className(locator_value));
		}
		break;

		default:
			System.out.println("Using ID by default ");

		}

		return return_element_list;

	}

}
