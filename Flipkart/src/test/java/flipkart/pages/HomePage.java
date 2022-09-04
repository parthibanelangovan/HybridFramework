package flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2doB4z']") WebElement closeButton;
	
	public void loadHomePage() {
		closeButton.click();
	}

}
