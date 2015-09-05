// Java JUnit Webdriver Automation Tutorial 09 Writing JUnit Test Suites-bF16VXvfJIk.mp4
// Test Suites

package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.AdoptAnimalServiceTest;
import test.ContactMessageServiceTest;

@RunWith(Suite.class)
@SuiteClasses({ AdoptAnimalServiceTest.class, ContactMessageServiceTest.class })
public class SmallServiceTestSuite {

}
