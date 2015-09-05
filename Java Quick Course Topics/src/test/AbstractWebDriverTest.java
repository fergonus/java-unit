package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;

public class AbstractWebDriverTest {

	protected WebDriver driver;
	protected HomePage onHomePage;
	
	@Before
	public void setUp()
	{
		driver = new FirefoxDriver();
		onHomePage = new HomePage(driver);
		System.out.println("before in abstract");
	}
	
	@After
	public void shutDown()
	{
		driver.close();
		System.out.println("after in abstract");
	}
	
}
