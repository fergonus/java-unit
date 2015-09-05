package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	public HomePage navigateToWebApp()
	{
		driver.navigate().to("http://www.thetestroom.com/webapp");
		return new HomePage(driver);
	}

	public ContactPage clickOnContact()
	{
		driver.findElement(By.id("contact_link")).click();
		return new ContactPage(driver);
	}
}
