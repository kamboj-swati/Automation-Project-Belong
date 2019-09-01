package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.AuthenticationPageActions;
import pages.actions.CreateAnAccountPageActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

public class UserRegistrationSteps {

	HomePageActions homePageActions = new HomePageActions();
	AuthenticationPageActions authPageAction = new AuthenticationPageActions();
	CreateAnAccountPageActions createAnAccount = new CreateAnAccountPageActions();


	@Given("^I am on the home page of fashion website \"([^\"]*)\"$")
	public void i_am_on_the_home_page_of_fashion_website(String websiteUrl) throws Throwable {
		SeleniumDriver.launchPage(websiteUrl);
		Thread.sleep(5000); //comment or remove this at the end
	}

	@When("I click on Sign in")
	public void i_click_on_Sign_in() {
		homePageActions.clickOnSignInLink();
		System.out.println("Thread info" + Thread.currentThread().getId());

	}


	@And("^I enter \"([^\"]*)\" email address$")
	public void i_enter_email_address(String emailType) throws Throwable {
		String invalidEmail = authPageAction.generateRandomEmailaddress(emailType);
		System.out.println("email address is" + invalidEmail );
		authPageAction.inputEmailAddress(invalidEmail);
		System.out.println("Thread info" + Thread.currentThread().getId());
	}

	@And("I click on Create an account button")
	public void i_click_on_button() {
		authPageAction.clickCreateAnAccountButton();
		System.out.println("Thread info" + Thread.currentThread().getId());
	}


	@Then("^I should see error message \"([^\"]*)\"$")
	public void i_should_see_error_message(String message) throws Throwable {

		authPageAction.registerationResult(message.toLowerCase());
	}


	@And("^I enter a \"([^\"]*)\" email in the Email address field$")
	public void i_enter_a_email_in_the_Email_address_field(String emailType) throws Throwable {

		String validEmail = authPageAction.generateRandomEmailaddress(emailType);
		//System.out.println("email address is" + validEmail );
		authPageAction.inputEmailAddress(validEmail);
	}



	@And("I fill the user registration form with random generated values on Create An Account page")
	public void i_fill_the_user_registration_form_with_random_generated_values_on_Create_An_Account_page() {

		createAnAccount.randomData();
		createAnAccount.generateRandomPassword();
		createAnAccount.fillInData();
		createAnAccount.selectRandomState();

	}

	@And("I click on Register button")
	public void i_click_on_Register_button() {

		createAnAccount.clickRegisterButton();
	}



	@Then("^I should be successfully registered and land on \"([^\"]*)\" page$")
	public void i_should_be_successfully_registered_and_land_on_page(String heading) throws Throwable {

		createAnAccount.verifyRegistration(heading.toUpperCase());
	}



}
