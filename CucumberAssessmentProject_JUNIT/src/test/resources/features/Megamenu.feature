@Megamenu
Feature: User is able to click submenu under Dresses menu and add product to the Cart
 In order to validate the link works
 we will move to Dresses menu then a submenu and will add one dress to the cart
 
 Background:
 Given I am on the home page of fashion website "http://automationpractice.com/index.php"
When I click move to "Dresses" menu
And I click on "Summer Dresses" submenu

@Summer-Dresses
Scenario: Verify that Summer dresses submenu works under Dresses menu

Then I should see the "Summer Dresses" page

@Cart-Validation
Scenario: User can add a dress to the cart

And I move to a dress 
And click on Add to cart button
And I go to Cart to view the added product and click on it
Then I verify the product name, colour and quantity





