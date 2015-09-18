// Java JUnit Webdriver Automation Tutorial 16 Select Class-vSdZw28KYzk.mp4
// Date: 09-18-2015
// Select Class - select an item from a dropdown list

import org.openqa.selenium.support.ui.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AdoptionTest {
	
	@Test
	public void shouldSelectFromStartDateDropDown()
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://thetestroom.com/webapp");
		driver.findElement(By.id("adoption_link")).click();
		
		Select startDropDown = new Select(driver.findElement(By.id("start_select")));
		//startDropDown.selectByIndex(2); // by index
		startDropDown.selectByVisibleText("Today");
	}

}
