// Java JUnit WebDriver Automation Tutorial 23 Randomizing Data-EDeTfhWbXpU.mp4
// Date: 09-25-2015
// Randomizing data

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ZooTestRandomize {
	
	WebDriver driver;

	@Test
	public void shouldBeAbleToSubmitForm()
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.navigate().to("http://thetestroom.com/webapp");
		
		driver.findElement(By.id("contact_link")).click();
		
		driver.findElement(By.name("name_field")).sendKeys(randomString(10));
		
		driver.findElement(By.name("address_field")).sendKeys(timeStamp());
		
		driver.findElement(By.name("postcode_field")).sendKeys(String.valueOf(randomNumber(150)));
		
		driver.findElement(By.name("email_field")).sendKeys(randomEmail());
		
		//driver.findElement(By.id("submit_message")).click();
		
		//assertTrue(driver.getCurrentUrl().contains("contact_confirm"));
		// driver.quit();
	}
	
	public static String randomString(int length)
	{
		final String data = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);
		
		for (int i = 0; i < length; i++)
		{
			sb.append(data.charAt(random.nextInt(data.length())));
		}
		
		return sb.toString();
	}
	
	public static String randomEmail()
	{
		int length = 5;
		String name = "abcdefghijklmnopqrstuvwxyz0123456789";
		String firstDomain = "abcdefghijklmnopqrstuvwxyz0123456789";
		String secondDomain = "abcdefghijklmnopqrstuvwxyz";
		
		Random random = new Random();
		String email = new String();
		
		StringBuilder sb = new StringBuilder(length);
		
		for (int i = 0; i < length; i++)
		{
			sb.append(name.charAt(random.nextInt(name.length())));
		}
		email += sb;
		
		sb = new StringBuilder(length);
		
		for (int i = 0; i < length; i++)
		{
			sb.append(firstDomain.charAt(random.nextInt(firstDomain.length())));
		}
		email += "@" + sb;
		
		sb = new StringBuilder(length);
		
		for (int i = 0; i < length; i++)
		{
			sb.append(secondDomain.charAt(random.nextInt(secondDomain.length())));
		}
		email += "." + sb;
		
		return email;
		
	}
	
	public static int randomNumber(int maxValue)
	{
		Random random = new Random();
		return random.nextInt(maxValue);
	}

	public static String timeStamp()
	{
		Date date = new Date();
		return new Timestamp(date.getTime()).toString();
	}
}
