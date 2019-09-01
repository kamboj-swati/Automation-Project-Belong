package pages.actions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.HomePageLocator;
import utils.SeleniumDriver;

public class HomePageActions {

	HomePageLocator homePageLocator = null;

	
	/** constructor to initialize elements on Home page using Page factory pattern
	 * @author Swati kamboj
	 */
	public HomePageActions() {

		this.homePageLocator = new HomePageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocator);
	}

	
	/** Method to click on the SignIn button	
	 * @author Swati kamboj
	 */
	public void clickOnSignInLink() {

		homePageLocator.signInLink.click();

	}

	


}
