// Java JUnit Webdriver Automation Tutorial 09 Writing JUnit Test Suites-bF16VXvfJIk.mp4
// Test Suites

package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.AdoptAnimalServiceTest;
import test.ContactMessageServiceTest;
import test.LoginServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses ({
	AdoptAnimalServiceTest.class,
	ContactMessageServiceTest.class,
	LoginServiceTest.class
})
public class AllTestSuite {

}
