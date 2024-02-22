package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class CheckoutCompletePage {
	
	//Web Elements
	@FindBy(className = "complete-header") private WebElement headerTxt;
	@FindBy(className = "complete-text") private WebElement completeTxt;
	
	//Constructor
	public CheckoutCompletePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public boolean verifyHeaderTxt() {
		return WrapClass.vefifyElementDisplayed(headerTxt);
	}
	
	public boolean verifyCompleteTxt() {
		return WrapClass.vefifyElementDisplayed(completeTxt);
	}
}
