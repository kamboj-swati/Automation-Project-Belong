package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;

	
	private static WebDriver driver;

	String browserSpecified;
	//waits
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 40;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	/** Constructor to initialize driver with right browser
	 * @author Swati Kamboj
	 */
	private SeleniumDriver(String givenBrowser) {	

		browserSpecified = givenBrowser;

		if (browserSpecified.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if (browserSpecified.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);

	}

/** Method to launch browser with given url
	 * @author Swati Kamboj
	 */
	public static void launchPage(String url) {

		driver.get(url);
	}

	public static WebDriver getDriver() {

		return driver;
	}

	/** Method to set Up the Driver
	 * @author Swati Kamboj
	 */
	public static void setUpDriver(String browser) {

		if(seleniumDriver ==null) {

			seleniumDriver = new SeleniumDriver(browser);
		}
	}

	/** Method to close the browser
	 * @author Swati Kamboj
	 */
	 
	public static void tearDown() {

		if(driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

}
