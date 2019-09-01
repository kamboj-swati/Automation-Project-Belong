package pages.actions;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;

//import junit.framework.Assert;
import org.junit.Assert;
import pages.locators.AuthenticationPageLocator;
import utils.SeleniumDriver;

public class AuthenticationPageActions {
	
	
	AuthenticationPageLocator authenticationPageLocator =null;
    String email;
    
	
	/** Constructor to initialize elements on this page using Page Factory pattern
	 * @author Swati Kamboj
	 */
	public AuthenticationPageActions() {
		
		this.authenticationPageLocator = new AuthenticationPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), authenticationPageLocator);
	}
	
	/** Method to generate random email address
	 * @param It takes the String as Input for email type("valid" or "Invalid")
	 * @return String of type email
	 * @author Swati kamboj
	 */
	public String generateRandomEmailaddress(String type) {
		
	
		String EMAILCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder testemail = new StringBuilder();
        Random rnd = new Random();
        while (testemail.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * EMAILCHARS.length());
            testemail.append(EMAILCHARS.charAt(index));
        }
        String emailStr = testemail.toString();
        if(type.equalsIgnoreCase("valid") )
        email = emailStr+"@gmail.com";
        else if (type.equalsIgnoreCase("invalid"))
        email = emailStr+" "+"@gmail.com";
       
        return email;
		
	}
	
	/** Method to add email address in the email field
	 * @param random email generated by method generateRandomEmailaddress(String type)
	 * @author Swati kamboj
	 */
	public void inputEmailAddress(String emailInput) {
		
		authenticationPageLocator.email.sendKeys(emailInput);
		
	}
	
	/** Method to hit Create An account button
	 * @author Swati Kamboj
	 */
	public void clickCreateAnAccountButton() {
		
		authenticationPageLocator.createAnAccountButton.click();
	}
	
	/** Assertion method to check if the error message is displayed
	 * @param expectedMessage
	 * @author Swati Kamboj
	 */
	public void registerationResult(String expectedMessage) {
		
		String actualMessage = authenticationPageLocator.errorMessageInvalidEmail.getText().toLowerCase();
		
		Assert.assertEquals(expectedMessage, actualMessage);
		
	}
	
	
}