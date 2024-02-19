package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class LoginPage {
	
	//Web Elements
	@FindBy(id = "user-name") private WebElement userNameTxt;
	@FindBy(id = "password") private WebElement passwordTxt;
	@FindBy(name = "login-button") private WebElement loginBtn;
	@FindBy(xpath = "//*[@data-test = 'error']") private WebElement lockError;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void Login(String user, String pass) {
		WrapClass.sendKeys(userNameTxt, user);
		WrapClass.sendKeys(passwordTxt, pass);
		WrapClass.click(loginBtn);
	}
	
	public boolean validateLockError() {
		boolean errorIsDisplayed = WrapClass.getText(lockError).contains("Sorry, this user has been locked out.");
		return errorIsDisplayed;
	}
}
