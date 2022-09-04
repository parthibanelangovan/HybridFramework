package flipkart.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HomePageTest {

	@Test
	public  void homePage() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parth\\eclipse-workspace\\drivers\\chromedriver.exe"); 
		  //ChromeOptions chromeOptions = new ChromeOptions();
		  //chromeOptions.addArguments("--headless");
		  //chromeOptions.setHeadless(true);
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://www.flipkart.com");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  // System.out.println(driver.getTitle());
		  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iPhone 12 128GB");

		  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button[@class='L0Z3Pu']")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  //driver.close();
	}

}
