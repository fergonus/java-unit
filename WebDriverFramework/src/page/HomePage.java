// Java JUnit Webdriver Automation Tutorial 15 Page Factory-u8XH46u1QAw.mp4
// Date: 09-18-2015
// Page Factory

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {
	
	//@FindBy(how = How.NAME, using = "nav_contact")
	@FindBy(name = "nav_contact") // alternate way
	private WebElement contactPageLink;

	public HomePage(WebDriver driver) {
		super(driver);
	}
	

	public ContactPage navigateToContactPage()
	{
		driver.navigate().to("http://www.thetestroom.com/webapp");
		return PageFactory.initElements(driver, ContactPage.class);
	}
}
