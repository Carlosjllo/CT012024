package seleniumPrac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class PracticaFindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Obtener objetos / WebElements
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBton = driver.findElement(By.id("login-button"));
		
		//Hacer Login
		userName.sendKeys("standard_user");
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBton.click();
		
		//Find Elements
		List<WebElement> prodList = driver.findElements(By.className("inventory_item_name"));
		System.out.println("Número de Elementos: " + prodList.size());
		
		String primerProd = prodList.get(0).getText();
		System.out.println("Primer producto es: " + primerProd);
		
		System.out.println("La lista de productos son: ");
		for(int i = 0; i < prodList.size(); i++) {
			System.out.println(i + ": " + prodList.get(i).getText());
		}
		
		driver.quit();

	}

}
