package flipkart.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import flipkart.pages.BaseClass;
import flipkart.pages.HomePage;
import flipkart.utilities.BrowserFactory;
import flipkart.utilities.Helper;

public class HomePageTest extends BaseClass{
	
	
	@Test
	public void FlipkartHome() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		homePage.loadHomePage();

		System.out.println(driver.getTitle());

		
		}

}
