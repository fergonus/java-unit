// Java JUnit Webdriver Automation Tutorial 15 Page Factory-u8XH46u1QAw.mp4
// Date: 09-18-2015
// Page Factory

package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.HomePage;

public class AbstractTestDriver {

	protected WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new FirefoxDriver();
	}
	
	@After
	public void testShutDown()
	{
		driver.quit();
	}
	
}

