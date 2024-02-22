package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class CheckoutTwoPage {
	
	//Web Elements
	@FindBy(id = "finish") private WebElement finishBtn;
	
	//Constructor
	public CheckoutTwoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void finishThePurchase() {
		WrapClass.click(finishBtn);
	}
}
