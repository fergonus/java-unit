package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.AdoptAnimalServiceTest;
import test.LoginServiceTest;

@RunWith(Suite.class)
@SuiteClasses({ AdoptAnimalServiceTest.class, LoginServiceTest.class })
public class AllTests {

}
