package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class InventoryPage {
	
	//Web Elements
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement addBtn;
	@FindBy(id = "remove-sauce-labs-backpack") private WebElement removeBtn;
	@FindBy(id = "shopping_cart_container") private WebElement shoppingCartBtn;
	
	//Constructor
	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public boolean verifyRemoveButton() {
		WrapClass.click(addBtn);
		return WrapClass.vefifyElementDisplayed(removeBtn);
	}
	
	public void addAProductAndCheckout() {
		WrapClass.click(addBtn);
		WrapClass.click(shoppingCartBtn);
	}
}
