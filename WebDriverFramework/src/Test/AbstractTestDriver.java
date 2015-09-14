// Java JUnit Webdriver Automation Tutorial 14 Parameter Management-xR672HmZZhk.mp4
// Parameters Management
// Date: 09-14-2015

package Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.PropertyManager;

public class AbstractTestDriver {
	
	protected WebDriver driver;
	protected PropertyManager property;
	
	@Before
	public void testSetUp()
	{
		property = new PropertyManager();
		property.generateProperty();
		driver = new FirefoxDriver();
	}
	
	@After
	public void testShutDown()
	{
		driver.quit();
	}

}
