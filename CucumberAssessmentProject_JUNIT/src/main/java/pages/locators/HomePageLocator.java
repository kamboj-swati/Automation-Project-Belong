package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocator {
	
	@FindBy(how=How.XPATH,using="//a[@class='login']")
	public WebElement signInLink;
		 
	


}
