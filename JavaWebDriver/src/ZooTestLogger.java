// Java JUnit WebDriver Automation Tutorial 24 Logger Class-HGOHL2ULjqY.mp4
// Date: 09-26-2015
// Logging test results

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ZooTestLogger {
	
	WebDriver driver;
	
	private static final Logger logger = Logger.getLogger(ZooTestLogger.class.getName());
	Handler fileHandler = null;
	Formatter formatter = null;
	
	@Before
	public void setUp() throws SecurityException, IOException
	{
		fileHandler = new FileHandler("./zootestlogger.log");
		fileHandler.setLevel(Level.ALL);
		formatter = new SimpleFormatter();
		fileHandler.setFormatter(formatter);
		logger.addHandler(fileHandler);
		logger.info("About to start the test");
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown()
	{
		logger.info("About to quit the driver");
		driver.quit();
	}

	@Test
	public void shouldBeAbleToSubmitForm()
	{
		logger.info("About to run the test");
		String name_field = "name_Test";
		String time_stamp = "01/01/1950 00:00:00";
		
		driver.navigate().to("http://thetestroom.com/webapp");
				
		driver.findElement(By.id("contact_link")).click();

		driver.findElement(By.name("name_field")).sendKeys(name_field);
		
		driver.findElement(By.name("address_field")).sendKeys(time_stamp);
		
		driver.findElement(By.name("postcode_field")).sendKeys("test date");
		
		driver.findElement(By.name("email_field")).sendKeys("email@email.com");
		
		driver.findElement(By.id("submit_message")).click();
		
		assertTrue(driver.getCurrentUrl().contains("contact_confirm"));
		
		try {
			driver.findElement(By.id("doesNotExist")).click();
		}
		catch (Exception e)
		{
			logger.log(Level.SEVERE, "sever issue occurred", e);
		}
		
	}
	
	
}
