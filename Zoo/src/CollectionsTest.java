// Java JUnit Webdriver Automation Tutorial 13 Collections-ozLlQnSZ5Ak.mp4
// Date: 09-13-2015

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class CollectionsTest {

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
	public void collectionTest()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links)
		{
			if (link.getText().equals("CONTACT"))
			{
				link.click();
				break;
			}
		}
		
		List<WebElement> fields = driver.findElements(By.tagName("input"));
		
		for (WebElement field : fields)
		{
			if (field.getAttribute("name").contains("name"))
			{
				field.sendKeys("name_test");
			}
			if (field.getAttribute("name").contains("address"))
			{
				field.sendKeys("address_test");
			}
			if (field.getAttribute("name").contains("postcode"))
			{
				field.sendKeys("postcode_test");
			}
			if (field.getAttribute("name").contains("email"))
			{
				field.sendKeys("email_test");
				break;
			}
			
		}
	}
}
