// Java JUnit WebDriver Automation Tutorial 25 Failed Test Rule-EWhvMuqJBYU.mp4
// Date: 09-27-2015
// Failed Test Rule
// Takes screenshot of failed page
// Screenshot file: webdriverScreenshotZooTestFailedTestRules_shouldBeAbleToSeeTitleOnAdoptionPage.png

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ZooTestFailedTestRules {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws SecurityException, IOException
	{
		driver = new FirefoxDriver();
		driver.navigate().to("http://thetestroom.com/webapp");
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}

	@Test
	public void shouldBeAbleToSeeTitleOnHomePage()
	{
		assertTrue(driver.getTitle().contains("Home"));

	}
	
	@Test
	public void shouldBeAbleToSeeTitleOnAdoptionPage()
	{
		driver.findElement(By.id("adoption_link")).click();
		assertTrue(driver.getTitle().contains("VideosOnAutomation")); // Should fail

	}
	
	@Rule
	public TestRule listen = new TestWatcher() 
	{
		@Override // This method is only called whenever a test fails; create a screenshot
		public void failed(Throwable t, Description description)
		{
			//System.out.println("test failed");
			try {
				takeScreenShot(description.getClassName() + "_" + description.getMethodName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	};
	
	public void takeScreenShot(String name) throws IOException
	{
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("./webdriverScreenshot" + name + ".png"));
	}
}
