// Java JUnit WebDriver Automation Tutorial 17 Taking Screenshots-FVsz1PmCFg0.mp4
// Date: 09-18-2015
// Taking screen shot of a page
// Screen shot files are located in: "/home/errol/SELENIUM/workspace/java-unit/WebDriverScreenShots/"

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;


public class WebDriverUtils {
	
	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void takeScreenShot(String screenShotName) throws IOException
	{
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("/home/errol/SELENIUM/workspace/java-unit/WebDriverScreenShots/" + screenShotName + ".png"));
		
	}

}
