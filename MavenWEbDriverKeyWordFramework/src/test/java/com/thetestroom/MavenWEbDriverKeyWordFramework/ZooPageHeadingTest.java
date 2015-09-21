// Java JUnit WebDriver Automation Tutorial 21 Keyword Framework Part 2-3JQmkopPtRI.mp4
// Reading the excel and and running the test
// Java JUnit WebDriver Automation Tutorial 21 Keyword Framework Part 3-PEVl6ciYquo.mp4
// Writing the test results back to the Excel file
// Date: 09-20-2015

package com.thetestroom.MavenWEbDriverKeyWordFramework;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZooPageHeadingTest {
	
	WebDriver driver;
	ExcelFileHandler excelFileHandler;
	
	@Before
	public void setUp()
	{
		driver = new FirefoxDriver();
		excelFileHandler = new ExcelFileHandler();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void shouldTestPageHeading()
	{
		List<List<String>> data = excelFileHandler.readFromFile("PageHeading.xls");
		
		List<String> results = new ArrayList<String>();
		results.add("Results");
		
		for(int i = 1; i < data.size(); i++)
		{
			for (int j = 0; j < data.get(i).size(); j++)
			{
				driver.navigate().to("http://www.thetestroom.com/webapp");
				driver.findElement(By.id(data.get(i).get(j).toLowerCase() + "_link")).click();
				if (driver.getTitle().contains(data.get(i).get(++j)))
					{
						System.out.println(data.get(i).get(j));
						results.add("PASS");
					}
				else
				{
					results.add("FAIL");
				}
				j++;
			}
		}
		excelFileHandler.writeToFile("PageHeading.xls", results);
		
		System.out.println("Now printing from results array: ");
		for (int i = 0; i < results.size(); i++)
		{
			System.out.println(results.get(i));
		}
	}

}
