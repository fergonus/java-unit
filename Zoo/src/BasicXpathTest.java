// Java JUnit Webdriver Automation Tutorial 10 Xpath-AiD33piY-sM.mp4
// Date: 09-11-2015

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicXpathTest {
	
	@Test
	public void xpathTest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp");
		
		// locate the contact link using xpath and click on it
		driver.findElement(By.xpath("//a[contains(@id, 'contact_link')]")).click();
		
		// Now we are on the "Contact" page
		// locate the name input on "Contact" page using xpath and enter text into it
		driver.findElement(By.xpath("//input[contains(@name, 'name_field')]")).sendKeys("test name");
		
		driver.close();
	}

}
