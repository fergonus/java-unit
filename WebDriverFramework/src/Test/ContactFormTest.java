// Java JUnit Webdriver Automation Tutorial 14 Parameter Management-xR672HmZZhk.mp4
// Parameters Management
// Date: 09-14-2015

package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

public class ContactFormTest extends AbstractTestDriver {
	
	@Test
	public void shouldPopulateForm()
	{
		// navigate to Zoo site
		driver.navigate().to("http://www.thetestroom.com/webapp");
		
		click(By.id("contact_link"));
		
		type(By.name(property.contactFormNameField), property.contactNameValue);
		type(By.name("address_field"), "test address");
		type(By.name("postcode_field"), "test field");
		type(By.name("email_field"), "test email");
				
		click(By.id("submit_message"));
		
		assertTrue(driver.findElement(By.tagName("p")).getText().contains("Many thanks for your message"));
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
