package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DressesPageLocator {
	
	
	@FindBy(how=How.XPATH, using="//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]  ")
	public WebElement dresses;	
	
	
	@FindBy(how=How.XPATH, using="//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]")
	public WebElement summerDressesMenu;
	
	@FindBy(how=How.XPATH, using="//span[@class='category-name'] ")
	public WebElement summerDressPage;
	
	@FindBy(how=How.XPATH, using="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//img[@class='replace-2x img-responsive']")
	public WebElement moveToDressElem;
	
	@FindBy(how=How.XPATH, using="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line hovered']//a[@class='product-name']")
	public WebElement selectedDress;
	 
	
	@FindBy(how=How.XPATH, using="//a[@title=\"Add to cart\"][1]")
	public WebElement addToCart;
	
	@FindBy(how=How.XPATH, using="//span[@class='cross']")
	public WebElement closeSmallWindowIcon;
	
	@FindBy(how=How.XPATH, using="//h1[@itemprop=\"name\"]")
	public WebElement dressName;
	
	@FindBy(how=How.XPATH, using="//b[contains(text(),'Cart')]")
	public WebElement cart;
	
	@FindBy(how=How.XPATH, using="//input[@name='quantity_5_19_0_0'] ")
	public WebElement productQuantity;
	
	@FindBy(how=How.XPATH, using="//td[@class='cart_description']//p[@class='product-name']")
	public WebElement productName;
	
	
	
	  
	
	
	
	
	
	
	
	
	
	
	
	 

}
