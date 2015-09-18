// Java JUnit Webdriver Automation Tutorial 15 Page Factory-u8XH46u1QAw.mp4
// Date: 09-18-2015
// Page Factory

package page;

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
