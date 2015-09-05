package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdoptAnimalServiceTest extends AbstractWebDriverTest {
	
	@Before
	public void setUp()
	{
		System.out.println("Adoption test before execution");
	}
	
	@After
	public void shutDown()
	{
		System.out.println("Adoption test after execution");
	}
	
	@Test
	public void shouldBeAbleToAdoptAnAnimal()
	{
		System.out.println("Adoption test execution");
	}

}
