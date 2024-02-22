package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class CartPage {
	
	//Web Elements
	@FindBy(id = "checkout") private WebElement checkoutBtn;
	
	//Constructor
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void goToCheckout() {
		WrapClass.click(checkoutBtn);
	}
}
