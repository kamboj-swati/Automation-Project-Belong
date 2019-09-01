package pages.actions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.DressesPageLocator;
import utils.SeleniumDriver;

public class DressesPageActions {
	
	DressesPageLocator dressesPagelocator = null;
	
	String dressSelected;
	
	/** Constructor to Initialse elements on this Dresses page using Page Factory pattern
	 * @author Swati Kamboj
	 */
	public DressesPageActions() {
		
		this.dressesPagelocator = new DressesPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), dressesPagelocator);
	}
	
	

		/** Methopd to move over to Menu Dresses
		 * @param of Type String
		 * @author Swati Kamboj
		 */
		public void moveToMegaMenu(String menuName) {

			Actions action = new Actions(SeleniumDriver.getDriver());
			action.moveToElement(dressesPagelocator.dresses).build().perform();

		}

		
		/** Method to click on submenu under Main menu in this case Dresses
		 * @param of Type String
		 * @author Swati kamboj
		 */
		public void clickDressesSubMenu(String subMenu) {

			if (subMenu.equalsIgnoreCase("summer dresses")) {					
				dressesPagelocator.summerDressesMenu.click();
			}
		}

		/** Assertion method to verify that user is on clicked submenu page in this case Summer Dresses
		 * @param expectedPageHeading
		 * @author Swati Kamboj
		 */
		public void verifySummerDressesPage(String expectedPageHeading) {

			String actualPageHeading = dressesPagelocator.summerDressPage.getText().toLowerCase();
			Assert.assertEquals(expectedPageHeading, actualPageHeading);

		}
		
		/** Method to move over to a dress displayed on the page
		 * @author Swati kamboj
		 */
		public void moveToDress() {
			
			Actions action = new Actions(SeleniumDriver.getDriver());
			action.moveToElement(dressesPagelocator.moveToDressElem).build().perform();
			dressSelected = dressesPagelocator.selectedDress.getText().trim();
			//System.out.println("Dress Name" + dressesPagelocator.selectedDress.getText().trim());
		
		}
		
		/** Method to add dress to the cart
		 * @author Swati kamboj
		 */
		public void addToCart() {
			
			dressesPagelocator.addToCart.click();
			dressesPagelocator.closeSmallWindowIcon.click();
			
		}
		
		/**
		 * Method to view the cart
		 * @author Swati Kamboj
		 */
		public void viewCart() {
			
			Actions action = new Actions(SeleniumDriver.getDriver());
			action.moveToElement(dressesPagelocator.cart).build().perform();
			dressesPagelocator.cart.click();
			
		}		
		
		/** Assertion Method to validate the item in cart
		 * @author Swati kamboj
		 */
		public void verifyCart() {
			System.out.println("Product Name : " + dressesPagelocator.productName.getText() );
			System.out.println("Product Quantity : " + dressesPagelocator.productQuantity.getAttribute("value"));
			
			String actualselectedProduct = dressesPagelocator.productName.getText().trim();
						
			Assert.assertEquals(dressSelected, actualselectedProduct);
			
		}

}
