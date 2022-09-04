package flipkart.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import flipkart.pages.BaseClass;

public class Helper {

	public static void captureScreenshot(WebDriver driver, String testCaseName) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./Screenshots/Flipkart_" +testCaseName+"_"+getDateTime() + ".png"));
		} 
		catch (Exception e) {
			System.out.print("Unable to capture screenshot" + e.getMessage());
			}
	
		
	}
	
	public static String getDateTime() {
		
		SimpleDateFormat outputFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate = new Date();
		
		return outputFormat.format(currentDate) ;
	}
	
	
	
	public void windowHandle() {
		
	
	}
	
	public void alert() {
		
	}
	
	public void frame() {
		
	}
	
	public void javaScriptExecutor() {
		
	}
	
	public void sync() {
		
	}
}

