// Java JUnit WebDriver Automation Tutorial 17 Taking Screenshots-FVsz1PmCFg0.mp4
// Date: 09-18-2015
// Taking screen shot of a page
// Screen shot files are located in: "/home/errol/SELENIUM/workspace/java-unit/WebDriverScreenShots/"

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class PageHeadingTest {
	
	
	@Test
	public void shouldCheckEachMainPage() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverUtils util = new WebDriverUtils(driver);

		driver.navigate().to("http://thetestroom.com/webapp");
		// home page screen shot
		util.takeScreenShot("homepage");
		
		driver.findElement(By.id("adoption_link")).click();
		// adoption page screen shot
		util.takeScreenShot("adoptionpage");
		
		driver.findElement(By.id("about_link")).click();
		// about page screen shot
		util.takeScreenShot("aboutpage");
		
		driver.findElement(By.id("contact_link")).click();
		// contact page screen shot
		util.takeScreenShot("contactpage");
		
		driver.quit();
	}

}
