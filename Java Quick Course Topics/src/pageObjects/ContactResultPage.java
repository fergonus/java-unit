package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactResultPage extends AbstractPage {

	public ContactResultPage (WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		super(driver); 
	}
		
	public String getComformationMessage()
	{
		return driver.findElement(By.tagName("p")).getText();
	}
}
