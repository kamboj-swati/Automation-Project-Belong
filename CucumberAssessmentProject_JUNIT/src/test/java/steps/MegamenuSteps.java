package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.DressesPageActions;
import pages.actions.HomePageActions;

public class MegamenuSteps {

	public static WebDriver driver=null;

	HomePageActions homePageActions= new HomePageActions();
	DressesPageActions dressesPageActions = new DressesPageActions();


	@When("^I click move to \"([^\"]*)\" menu$")
	public void i_click_move_to_menu(String dressMegaMenu) throws Throwable {

		dressesPageActions.moveToMegaMenu(dressMegaMenu);
		//homePageActions.clickOnSignInLink();
		System.out.println("Thread info" + Thread.currentThread().getId());
	}



	@And("^I click on \"([^\"]*)\" submenu$")
	public void i_click_on_submenu(String dressSubMenu) throws Throwable {

		dressesPageActions.clickDressesSubMenu(dressSubMenu);	
		System.out.println("Thread info" + Thread.currentThread().getId());
	}



	@Then("^I should see the \"([^\"]*)\" page$")
	public void i_should_see_the_page(String expectedText) throws Throwable {

		dressesPageActions.verifySummerDressesPage(expectedText.toLowerCase());
	}

	@And("I move to a dress")
	public void i_move_to_a_dress() {

		dressesPageActions.moveToDress();
	}

	@And("click on Add to cart button")
	public void click_on_Add_to_cart_button() {

		dressesPageActions.addToCart();
	}

	@And("I go to Cart to view the added product and click on it")
	public void i_go_to_Cart_to_view_the_added_product_and_click_on_it() {

		dressesPageActions.viewCart();
	}

	@Then("I verify the product name, colour and quantity")
	public void i_verify_the_product_name_colour_and_quantity() {

		dressesPageActions.verifyCart();

	}

}
