package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest extends AbstractWebDriverTest {
	
	@Before
	public void setUp()
	{
		System.out.println("Login test before execution");
	}
	
	@After
	public void shutDown()
	{
		System.out.println("Login test after execution");
	}
	
	@Test
	public void shouldBeAbleToLogin()
	{
		System.out.println("Login test execution");
	}

}
