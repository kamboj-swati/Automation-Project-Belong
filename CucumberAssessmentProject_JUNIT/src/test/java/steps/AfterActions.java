package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	
	/** Tear down Method to close the browser
	 * @author Swati Kamboj
	 */
	 @After
	public static void tearDown(Scenario scenario) {
		
		
		WebDriver driver = SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		
		if(scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "img/png");
		}
		
		SeleniumDriver.tearDown();
	}

}
