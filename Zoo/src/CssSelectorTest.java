// Java JUnit Webdriver Automation Tutorial 11 CssSelector-Xbfd-la6f_U.mp4
// Date: 09-11-2015

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CssSelectorTest {
	
	@Test
	public void cssTest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp");
		
		// id 
		driver.findElement(By.cssSelector("#contact_link")).click();
		
		// On "Contact" page
		// node or tag
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		
		// class
		driver.findElement(By.cssSelector(".home")).click();
		
		// On "Home" page
		// attribute expression
		driver.findElement(By.cssSelector("[href='adoption.html']")).click();
		
		// Now on "Adoption" page
		driver.close();
	}

}
