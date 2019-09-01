package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPageLocator {

	@FindBy(how=How.ID,using="email_create")
	public WebElement email;
	
	@FindBy(how=How.ID,using="SubmitCreate")
	public WebElement createAnAccountButton;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'Invalid email address.')]")
	public WebElement errorMessageInvalidEmail;
	
	
	
}
