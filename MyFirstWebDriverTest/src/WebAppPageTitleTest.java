//  Java JUnit Webdriver Automation Tutorial 04 Writing a Basic JUnit Script Using Selenium-tpaUr4N7eVI.mp4

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebAppPageTitleTest {
	
	WebDriver driver;
	
	@Before
	public void testSetup()
	{
		// create an instance of webdriver
		driver = new FirefoxDriver();
		
		// go to web page
		// driver.navigate().to("http://freelancer.geekngamer.com/webapp"); // no longer exist
		driver.navigate().to("http://www.thetestroom.com/webapp");
	}
	
	@After
	public void testShutDown()
	{
		// close the driver
		driver.close();

	}
	
	@Test
	public void shouldHavePageTitleOfAboutPage()
	{
		
		// click on the about link
		driver.findElement(By.id("about_link")).click();
		
		// check that the about page has the about zoo title
		Assert.assertTrue(driver.getTitle().equals("About Zoo"));		
	}
	
	@Test
	public void shouldHavePageTitleOfContact()
	{
		
		// click on the about link
		driver.findElement(By.id("contact_link")).click();
		
		// check that the about page has the about zoo title
		Assert.assertTrue(driver.getTitle().equals("Contact"));		
	}

}
