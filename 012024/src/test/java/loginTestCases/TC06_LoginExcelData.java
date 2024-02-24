package loginTestCases;

import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.LoginPage;
import setUpDriver.SetUpDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC06_LoginExcelData {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = SetUpDriver.setUpDriver();
	
	//Page Objects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC06() {
		String user = WrapClass.getCellData("TC_06", 1, 0);
		String pwd = WrapClass.getCellData("TC_06", 1, 1);
		
		loginPage.Login(user, pwd);
	}
	
	@AfterTest
	public void closeDriver() {
		//WrapClass.takeScreenshot(driver, "TC05_LoginExtData");
		driver.quit();
	}
}
