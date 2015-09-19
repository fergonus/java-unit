// Java JUnit Webdriver Automation Tutorial 19 Action Builder-jYlvPK85y2Q.mp4
// Date: 09-19-2015
// Action Builder

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ZooTest_ActionBuilder {
	
	@Test
	public void testActionBuilderClass()
	{
		WebDriver driver = new FirefoxDriver(); // 19.482 seconds
		driver.navigate().to("http://thetestroom.com/webapp");
		driver.findElement(By.id("adoption_link")).click();
		
		// on the adoption page
		// Select item from drop down control
		/*
		Actions dropDown = new Actions(driver)
			.click(driver.findElement(By.id("start_select")))
			.click(driver.findElement(By.cssSelector("option:nth-child(3)")));
		
		dropDown.build().perform();
		*/
		
		// go to contact page
		driver.findElement(By.id("contact_link")).click();
		
		// move the slider on the contact page
		Actions slider = new Actions(driver)
			.dragAndDropBy(driver.findElement(By.id("slider-1")), 120, 0);
		
		slider
			.build()
			.perform();
	}

}
