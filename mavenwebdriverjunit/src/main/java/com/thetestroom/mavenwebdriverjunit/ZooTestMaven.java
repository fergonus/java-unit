// Java JUnit WebDriver Automation Tutorial 26 Maven Setup-g3JardmgZlk.mp4
// Date: 09-27-2015
// Using Maven
// Pom file: mavenwebdriverjunit/pom.xml

package com.thetestroom.mavenwebdriverjunit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZooTestMaven {

WebDriver driver;
	
	@Before
	public void setUp() 
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
}
