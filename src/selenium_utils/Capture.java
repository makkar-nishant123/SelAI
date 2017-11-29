package selenium_utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import utils.Servlet_helper;

public class Capture {
	
	public String capture_screenshot_in_path(String path )
	{
		
		
		try {
			FileUtils.copyFile(new File(path), ((TakesScreenshot)Servlet_helper.getdriver()).getScreenshotAs(OutputType.FILE));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FileUtils.copyFile(new File(" + path + "), ((TakesScreenshot)Servlet_helper.getdriver()).getScreenshotAs(OutputType.FILE));";
	}

}
