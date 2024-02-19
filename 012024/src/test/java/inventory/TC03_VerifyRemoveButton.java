package inventory;

import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.InventoryPage;
import navigationPages.LoginPage;
import setUpDriver.SetUpDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC03_VerifyRemoveButton {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = SetUpDriver.setUpDriver();
	
	//Page Objects
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC03() {
		loginPage.Login(GlobalVariables.STANDARD_USER, GlobalVariables.PASSWORD);
		boolean isDisplayed = inventoryPage.verifyRemoveButton();
		Assert.assertTrue(isDisplayed);
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC03_VerifyRemoveButton");
		driver.quit();
	}
}
