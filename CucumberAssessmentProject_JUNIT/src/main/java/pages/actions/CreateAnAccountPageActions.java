package pages.actions;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

//import junit.framework.Assert;
import pages.locators.CreateAnAccountPageLocator;
import utils.SeleniumDriver;


public class CreateAnAccountPageActions {

	String firstNameStr;
	String lastNameStr;
	String passwordStr;
	String addressStr;
	String cityStr;
	String zipCodeStr;
	String mPhoneStr;

	CreateAnAccountPageLocator createAnAccountPageLocator = null;



	/** Constructor to Initialise all the elements on Craete an account page using teh Page Factory pattern
	 * @author Swati
	 */
	public CreateAnAccountPageActions() {

		this.createAnAccountPageLocator = new CreateAnAccountPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), createAnAccountPageLocator);
	}
	
	/** Method to generate random password to fill in the form
	 * @author Swati Kamboj
	 */
	public void generateRandomPassword() {
		
		String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder testpassword = new StringBuilder();
        Random rnd = new Random();
        while (testpassword.length() < 7) { // length of the random string.
            int index = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());;
            testpassword.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        passwordStr = testpassword.toString();
	    System.out.println("Password value is" +passwordStr);
	}

	/** Method to generate random data to fill in the form
	 * @author Swati
	 */
	public void randomData() {

		firstNameStr = new Faker().firstName();
		lastNameStr = new Faker().lastName();
		addressStr = new Faker().secondaryAddress();		
		cityStr = new Faker().streetName();
		zipCodeStr = new Faker().zipCode().substring(0, 5);
		mPhoneStr = new Faker().phoneNumber().replace("\\(", "").replace("\\)", "").replace("-", "").substring(0, 10);
		
		System.out.println("Zip code value is" +zipCodeStr);

	}
	
	/** Method to select the user title
	 * @author Swati kamboj
	 */
	public void selectTitle() {
		
		createAnAccountPageLocator.titleMrRadio.click();
	}
	
	
	/** Method to select a random state to fill the form
	 * @author Swati Kamboj
	 */
	public void selectRandomState() {
		int index = new Random().nextInt(50)+1;
		Select state = new Select(createAnAccountPageLocator.stateDropdown);
		state.selectByIndex(index);
	}


 /** Method to fill in the randomly generated data into the form
 * @author Swati Kamboj
 */
public void fillInData() {
	 
	 createAnAccountPageLocator.titleMrRadio.click();
	 createAnAccountPageLocator.firstName.sendKeys(firstNameStr);
	 createAnAccountPageLocator.lastName.sendKeys(lastNameStr);
	 createAnAccountPageLocator.password.sendKeys(passwordStr);
	 createAnAccountPageLocator.address.sendKeys(addressStr);
	 createAnAccountPageLocator.city.sendKeys(cityStr);
	 createAnAccountPageLocator.postCode.sendKeys(zipCodeStr);
	 createAnAccountPageLocator.mobilePhone.sendKeys(mPhoneStr);
 }
 
 /** Method to hit the Regisyter button
 * @author Swati kamboj
 */
public void clickRegisterButton() {
	 
	 createAnAccountPageLocator.registerButton.click();
 }



/** Method to Assert if the Registration is successful
 * @param of String type
 * @author Swati Kamboj 
 */
public void verifyRegistration(String expectedHeading) {
	
	String actualHeading = createAnAccountPageLocator.myAccountPage.getText().toUpperCase();
	Assert.assertEquals(expectedHeading, actualHeading);
	
	
}

}
