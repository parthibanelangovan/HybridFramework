package flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.*;
import flipkart.utilities.BrowserFactory;
import flipkart.utilities.ConfigDataProvider;
import flipkart.utilities.ExcelDataProvider;
import flipkart.utilities.Helper;

public class BaseClass {

	public WebDriver driver;
	
	public ExcelDataProvider excel;
	
	public ConfigDataProvider config;
	
	public ExtentReports report;
	public ExtentTest logger;
	public ExtentSparkReporter spark;
	
	@BeforeSuite
	public void setUpDataProvider() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();

		//https://www.softwaretestingmaterial.com/generate-extent-reports/
		report = new ExtentReports();
		 
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/ExtentReport.html");
		report.attachReporter(spark);

	}
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		driver = BrowserFactory.startBrowser(driver, config.getBrowser(), config.getURL())	;  
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	
	
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			Helper.captureScreenshot(driver, result.getName());
		}
		else {
			Helper.captureScreenshot(driver, result.getName());
				
		}
		
	}
}
