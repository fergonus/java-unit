// Java JUnit Webdriver Automation Tutorial 18 Headless Browser-L4xLorHi05Y.mp4
// DAte: 09-19-2015
// HeadLess Browser

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class ZooTest {

	@Test
	public void testHeadLessBrowser()
	{
		//WebDriver driver = new FirefoxDriver(); // 19.482 seconds
		WebDriver driver = new HtmlUnitDriver(); // HeadlLess Browser = 16.418 seconds
		driver.navigate().to("http://thetestroom.com/webapp");
		driver.findElement(By.id("about_link")).click();
		String paragraph = driver.findElement(By.tagName("p")).getText();
		assertTrue(paragraph.contains("We love our animals"));
		driver.quit();
	}
}
