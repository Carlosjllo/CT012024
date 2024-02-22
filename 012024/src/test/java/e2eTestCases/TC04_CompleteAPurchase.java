package e2eTestCases;

import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.CartPage;
import navigationPages.CheckoutCompletePage;
import navigationPages.CheckoutOnePage;
import navigationPages.CheckoutTwoPage;
import navigationPages.InventoryPage;
import navigationPages.LoginPage;
import setUpDriver.SetUpDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC04_CompleteAPurchase {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = SetUpDriver.setUpDriver();
	
	//Page Objects
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);
	CartPage cartPage = new CartPage(driver);
	CheckoutOnePage chckOne = new CheckoutOnePage(driver);
	CheckoutTwoPage chckTwo = new CheckoutTwoPage(driver);
	CheckoutCompletePage chckComplete = new CheckoutCompletePage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC04() {
		loginPage.Login(GlobalVariables.STANDARD_USER, GlobalVariables.PASSWORD);
		inventoryPage.addAProductAndCheckout();
		cartPage.goToCheckout();
		chckOne.completeTheForm();
		chckTwo.finishThePurchase();
		boolean headerIsDisplayed = chckComplete.verifyHeaderTxt();
		boolean completeTxtIsDisplated = chckComplete.verifyCompleteTxt();
		Assert.assertTrue(headerIsDisplayed);
		Assert.assertTrue(completeTxtIsDisplated);
	}
	
	@AfterTest
	public void closeDriver() {
		//WrapClass.takeScreenshot(driver, "TC03_VerifyRemoveButton");
		//driver.quit();
	}
}
