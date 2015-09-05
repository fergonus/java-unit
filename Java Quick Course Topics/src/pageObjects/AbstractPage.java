package pageObjects;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public HomePage navigateToWebApp()
	{driver.navigate().to("http://thetestroom.com/webapp");
		return new HomePage(driver);
	}

}
