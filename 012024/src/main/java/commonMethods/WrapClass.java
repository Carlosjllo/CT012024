package commonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WrapClass {

	public static void click(WebElement webUI) {
		webUI.click();
	}
	
	public static void sendKeys(WebElement webUI, String textToSend) {
		webUI.sendKeys(textToSend);
	}
	
	public static String getText(WebElement webUI) {
		return webUI.getText();
	}
	
	public static boolean vefifyElementDisplayed(WebElement webUI) {
		return webUI.isDisplayed();
	}
	
	public static void takeScreenshot(WebDriver webDriver, String testCaseName) {
		//Toma el screenshot sin formato
		File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
		
		//Establecer ruta para guardar el screenshot
		String screenshotPath = "./test-output/ExecutionResults";
		
		
		try {
			FileHandler.createDir(new File(screenshotPath)); // Crear el folder usando la ruta especificada
			FileHandler.copy(scrFile, new File(screenshotPath + File.separatorChar + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
