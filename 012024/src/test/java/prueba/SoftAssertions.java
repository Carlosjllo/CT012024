package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
  @Test
  public void f() {
	  
	  	SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		String badTitle = "My Labs";
		
		sa.assertEquals(actualTitle, expectedTitle);
		sa.assertEquals(badTitle, expectedTitle);
		
		driver.quit();
		sa.assertAll();
  }
}
