// Java JUnit Webdriver Automation Tutorial 12 Pop-ups and Windows-jMpMk6YxgAY.mp4
// Date: 09-13-2

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlterWindowTest {

	WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp");
	}
	
	@After
	public void shutDown()
	{
		//driver.close();
	}
	
	@Test
	public void alertTest()
	{
		driver.findElement(By.id("contact_link")).click();
		
		// Now on "Contact" page
		driver.findElement(By.id("submit_message")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		assertTrue(alert.getText().contains("Name"));
	}
	
	@Test
	public void windowTest()
	{
		String parentWindow = driver.getWindowHandle();
		
		// Click on the "Terms" link to get a popup
		driver.findElement(By.id("footer_term")).click();
		
		// loop thru the all the windows
		for (String currentWindow : driver.getWindowHandles())
		{
			driver.switchTo().window(currentWindow);
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		// switch back to the previous window
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
	}
}
