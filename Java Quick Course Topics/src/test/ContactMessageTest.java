// Java JUnit Webdriver Automation Tutorial 07 Page Object-pO5Ry_GLC60.mp4
// Java JUnit Webdriver Automation Tutorial 08 Abstract Test Driver-UhXqp9zKNys.mp4
// Page Object
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ContactPage;
import pageObjects.ContactResultPage;
import pageObjects.HomePage;


public class ContactMessageTest extends AbstractWebDriverTest {
	
	@Before
	public void testSetUp()
	{
		onHomePage.navigateToWebApp();
		System.out.println("before in test");
	}
	
	@Test
	public void shouldSendContactMessage()
	{
		ContactPage onContactPage = onHomePage.clickOnContact();
		ContactResultPage onResultPage = onContactPage.fillFormWithData().submitForm();
		
		assertTrue(onResultPage.getComformationMessage().contains("Many thanks for your message"));
	}

}
