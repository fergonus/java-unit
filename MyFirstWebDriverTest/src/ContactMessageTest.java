// Java JUnit Webdriver Automation Tutorial 06 JUnit Assertions-DCbxx67vfmo.mp4
// Assertions

import static org.junit.Assert.*; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ContactMessageTest {
	
	WebDriver driver;
	
	@Before
	public void testSetUp()
	{
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp");
	}
	
	@After
	public void testShutDown()
	{
		driver.close();
	}
	
	@Test
	public void shouldSendValidMessage()
	{
		click(By.id("contact_link"));
		assertTrue(driver.getTitle().equals("Contact"));
		
		type(By.name("name_field"), "test name");
		type(By.name("address_field"), "test address");
		type(By.name("postcode_field"), "test field");
		type(By.name("email_field"), "test email");
		assertFalse("Field was empty",!(driver.findElement(By.name("name_field")).getText().isEmpty()));
		
		click(By.id("submit_message"));
		assertEquals(driver.getTitle(), "Contact Confirmation");
	}
	
	public void type(By by, String value)
	{
		driver.findElement(by).sendKeys(value);
	}
	
	public void click(By by)
	{
		driver.findElement(by).click();
	}

}
