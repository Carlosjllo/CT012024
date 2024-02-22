package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class CheckoutOnePage {
	
	//Web Elements
	@FindBy(id = "first-name") private WebElement firstNameTxt;
	@FindBy(id = "last-name") private WebElement lastNameTxt;
	@FindBy(id = "postal-code") private WebElement postalCode;
	@FindBy(id = "continue") private WebElement continueBtn;
	
	//Constructor
	public CheckoutOnePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	private void enterName(String name) {
		firstNameTxt.sendKeys(name);
	}
	
	private void enterLastName(String lastName) {
		lastNameTxt.sendKeys(lastName);
	}
	
	private void enterPostalCode(String pCode) {
		postalCode.sendKeys(pCode);
	}
	
	public void completeTheForm() {
		enterName("Charlie");
		enterLastName("Jaramillo");
		enterPostalCode("20054");
		WrapClass.click(continueBtn);
	}
}
