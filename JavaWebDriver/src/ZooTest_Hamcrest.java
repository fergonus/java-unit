// Java JUnit Webdriver Automation Tutorial 20 Hamcrest-TbvtZebkr-U.mp4
// Date: 09-19-2015
// Hamcrest provides better and more detailed error message
// Hamcrest jar download: http://code.google.com/p/hamcrest/downloads/detail?name=hamcrest-all-1.3.jar&can=2&q=
// jar file: hamcrest-all-1.3.jar

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ZooTest_Hamcrest {
	
	@Test
	public void testUsingHamcrestAssertion()
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://thetestroom.com/webapp");
		String pageText = driver.findElement(By.className("content")).findElement(By.tagName("h1")).getText();
		assertTrue(pageText.contains("WELCOME"));
		
		// Use Hamcrest assertion
		//assertThat(pageText, is("WELCOME TO THE ZOO ADOPTION CENTER"));          // this is similar to
		assertThat(pageText, is(equalTo("WELCOME TO THE ZOO ADOPTION CENTER"))); // this
		
		driver.findElement(By.id("adoption_link")).click();
		pageText = driver.findElement(By.className("content")).findElement(By.tagName("h1")).getText();
		assertEquals("ADOPTION OPTIONS",pageText);
		// Use Hamcrest assertion
		assertThat(pageText, equalTo("ADOPTION OPTIONS"));
		
		driver.findElement(By.id("about_link")).click();
		assertFalse(driver.getCurrentUrl().contains("adoption"));
		
		// Use Hamcrest assertion
		assertThat(driver.getCurrentUrl(), instanceOf(String.class));
		
		driver.quit();
		
		
	}

}
