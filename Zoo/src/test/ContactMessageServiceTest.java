package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContactMessageServiceTest extends AbstractWebDriverTest {
	
	@Before
	public void setUp()
	{
		System.out.println("Contact message test before execution");
	}
	
	@After
	public void shutDown()
	{
		System.out.println("Contact message test after execution");
	}
	
	@Test
	public void shouldBeAbleToSendContactMessage()
	{
		System.out.println("Contact message test execution");
	}

}
