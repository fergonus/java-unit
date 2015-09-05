package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractWebDriverTest {

	
	@Before
	public void setUp()
	{
		System.out.println("abstract before execution");
	}
	
	@After
	public void abstractShutDown()
	{
		System.out.println("Abstract after execution");
		System.out.println("---");
	}
	
}
