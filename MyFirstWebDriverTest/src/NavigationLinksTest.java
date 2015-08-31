// Java JUnit Webdriver Automation Tutorial 05 Locators-So66Vcw6IOo.mp4

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationLinksTest {

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
	public void testTearDown()
	{
		// close the driver
		driver.close();

	}
	
	@Test
	public void shouldNavigateLinksUsingLocators()
	{
		
		// click on the about link
		driver.findElement(By.id("contact_link")).click();
		
		// check that the about page has the about zoo title
		Assert.assertTrue(
				driver.findElement(By.className("subhead")).getText().equals("Contact Form"));
		
		// using name locator
		driver.findElement(By.name("address_field")).sendKeys("This is address field");
		
		// using cssSelector locator
		//driver.findElement(By.cssSelector("id=adoption_link")).click(); // failed
		
		// using linkText locator
		driver.findElement(By.linkText("HOME")).click();
		
		// using partialLinkText locator
		driver.findElement(By.partialLinkText("ABO")).click();
		
		// using tagName locator
		Assert.assertTrue(
				driver.findElement(By.tagName("p")).getText().contains("animals"));
		
		// using xpath locator
		driver.findElement(By.xpath("//*[@id='contact_link']")).click();
	}
}
