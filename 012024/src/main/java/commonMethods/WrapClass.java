package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
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
	
	public static String getJsonValue(String jsonFile, String jsonKey) {
		try {
			FileInputStream inputstream = new FileInputStream(GlobalVariables.EXT_DATA + jsonFile + ".json"); // Ruta del archivo
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputstream));
			
			//Leer datos
			String jsonValue = jsonObject.getJSONObject(jsonFile).getString(jsonKey);
			return jsonValue;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
	
	public static String getCellData(String excelName, int row, int column) {
		//Leer archivo excel
		try {
			FileInputStream fis = new FileInputStream(GlobalVariables.EXT_DATA + excelName + ".xlsx");
			
			//Construir xlsx como objeto de Java
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(column);
			
			String value = cell.getStringCellValue();
			return value;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e){
			e.printStackTrace();
			return null;
		}
	}
}
