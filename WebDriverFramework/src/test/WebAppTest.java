// Java JUnit Webdriver Automation Tutorial 15 Page Factory-u8XH46u1QAw.mp4
// Date: 09-18-2015
// Page Factory

package test;

import org.junit.Test;

import page.HomePage;

public class WebAppTest extends AbstractTestDriver {

	@Test
	public void shouldPerformSimpleClick()
	{
		HomePage homePage = new HomePage(driver);
		homePage
		.navigateToWebApp()
		.navigateToContactPage()
		.navigateToHomePage();
	}
}
