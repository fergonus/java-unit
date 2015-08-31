// Java JUnit Webdriver Automation Tutorial 03 Writing a Basic Script Using Selenium-Pss-noR4vGc.mp4

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {

	public static void main(String[] args) {
		
		// create an instance of webdriver
		WebDriver driver = new FirefoxDriver();
		
		// go to web page
		// driver.navigate().to("http://freelancer.geekngamer.com/webapp"); // no longer exist
		driver.navigate().to("http://www.thetestroom.com/webapp");
		
		// click on the about link
		driver.findElement(By.id("about_link")).click();
		
		// check that the about page has the about zoo title
		String title = driver.getTitle();
		
		if (title.equals("About Zoo"))
		{
			System.out.println("Found the about page with the value of " + title);
		}
		else
		{
			System.out.println("Insted found page with " + title);
		}
		
		// close the driver
		driver.close();

	}

}
