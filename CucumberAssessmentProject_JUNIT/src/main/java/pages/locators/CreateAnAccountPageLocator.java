package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAnAccountPageLocator {
	
	@FindBy(how=How.ID,using="id_gender1")
	public WebElement titleMrRadio;
	
	@FindBy(how=How.ID,using="id_gender2")
	public WebElement titleMrsRadio;
	
	@FindBy(how=How.ID,using="customer_firstname")
	public WebElement firstName;
	
	@FindBy(how=How.ID,using="customer_lastname")
	public WebElement lastName;
	
	@FindBy(how=How.ID,using="passwd")
	public WebElement password;
	
	@FindBy(how=How.ID,using="address1")
	public WebElement address;
	
	@FindBy(how=How.ID,using="city")
	public WebElement city;
	
	@FindBy(how=How.ID,using="id_state")
	public WebElement stateDropdown;

	@FindBy(how=How.ID,using="postcode")
	public WebElement postCode;

	@FindBy(how=How.ID,using="phone_mobile")
	public WebElement mobilePhone;

	@FindBy(how=How.ID,using="submitAccount")
	public WebElement registerButton;
	
	@FindBy(how=How.XPATH, using="//h1[@class='page-heading']")
	public WebElement myAccountPage;
	
}
