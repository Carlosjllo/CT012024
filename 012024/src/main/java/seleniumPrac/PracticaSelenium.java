package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSelenium {

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
		
		//Métodos del explorador
		//Obteer el título de la página
		
		String title = driver.getTitle();
		System.out.println("El título de la página es: " + title);
		
		//Obtener URL
		String url = driver.getCurrentUrl();
		System.out.println("La URL es: " + url);
		
		//Métodos de Navegación
		/*
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		*/
		
		//Verificar elemento desplegado de la página
		boolean product = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		
		if(product) {
			System.out.println("El artículo es desplegado");
		}
		
		//Obtener el texto de un WebElement
		String prodTxt = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean textCorrect = prodTxt.contains("Sauce Labs Backpack"); //Contains es un método de Java que evalúa 2 Stirngs
		
		if(textCorrect) {
			System.out.println("El nombre del producto es correcto");
		}else {
			System.out.println("El nombre del producto es incorrecto");
		}
		
		//Dropdown
		Select dropd = new Select(driver.findElement(By.className("product_sort_container")));
		dropd.selectByValue("lohi");
		
		//driver.close(); //Close cierra la ventana actual con la que se está interactuando
		driver.quit(); //Quit cierra todas las ventanas o pestañas abiertas durante la ejecución
		
		
	}

}