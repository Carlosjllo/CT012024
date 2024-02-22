package loginTestCases;

import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.LoginPage;
import setUpDriver.SetUpDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC01_Login {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = SetUpDriver.setUpDriver();
	
	//Page Objects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC01() {
		loginPage.Login(GlobalVariables.STANDARD_USER, GlobalVariables.PASSWORD);
	}
	
	@AfterTest
	public void closeDriver() {
		//WrapClass.takeScreenshot(driver, "TC01_Login");
		driver.quit();
	}
}
