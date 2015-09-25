// Java JUnit WebDriver Automation Tutorial 22 Waiting-DFHv3BLHckw.mp4
// Date: 09-25-2015
// Waiting

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ZooTestWait {
	
	WebDriver driver;

	@Test
	public void shouldBeAbleToSubmitForm()
	{
		WebDriver driver = new FirefoxDriver(); // 19.482 seconds
		driver.navigate().to("http://thetestroom.com/webapp");
				
		// waitForPageUntilIsVisible(By.tagName("p"), 5000); // *** FAILING ****
		
		driver.findElement(By.id("contact_link")).click();
		
		wait(5);
		
		driver.findElement(By.name("name_field")).sendKeys("name field test");
		driver.findElement(By.name("address_field")).sendKeys("address field test");
		driver.findElement(By.name("postcode_field")).sendKeys("postcode field test");
		driver.findElement(By.name("email_field")).sendKeys("email field test");
		driver.findElement(By.id("submit_message")).click();
		assertTrue(driver.getCurrentUrl().contains("contact_confirm"));
		driver.quit();
	}
	
	// wait for a set amount of time
	public void wait(int seconds)
	{
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// basically do the same as above wait method does
	// but wait for as long as required
	public WebElement waitForPageUntilIsVisible(By locator, int maxSeconds)
	{
		return (new WebDriverWait(driver, maxSeconds))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
