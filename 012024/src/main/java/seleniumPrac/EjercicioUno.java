package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjercicioUno {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//Obtener objetos / Web Elements
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBton = driver.findElement(By.id("login-button"));	

		
		//Login
		userName.sendKeys("standard_user");
		passwordTxt.sendKeys("secret_sauce");
		loginBton.click();
		
		//Agregar producto
		WebElement backPackAdd = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement shoppingCart = driver.findElement(By.id("shopping_cart_container"));

		
		backPackAdd.click();
		shoppingCart.click();
		
		//Checkout
		WebElement checkoutBtn = driver.findElement(By.id("checkout"));
		checkoutBtn.click();
		
		//Llenar Formulario y COntinuar
		WebElement firstNameTxt = driver.findElement(By.id("first-name"));
		WebElement lastNameTxt = driver.findElement(By.id("last-name"));
		WebElement postalCodeTxt = driver.findElement(By.id("postal-code"));
		WebElement continueBtn = driver.findElement(By.id("continue"));
		
		firstNameTxt.sendKeys("Charlie");
		lastNameTxt.sendKeys("Jaramillo");
		postalCodeTxt.sendKeys("00535");
		continueBtn.click();
		
		//Finish
		WebElement finishBtn = driver.findElement(By.id("finish"));
		finishBtn.click();
		
		//Validación de los mensajes
		
		String headerText = driver.findElement(By.className("complete-header")).getText();
		String messageText = driver.findElement(By.className("complete-text")).getText();
		
		boolean headerCorrect = headerText.equals("Thank you for your order!");
		boolean messageCorrect = messageText.equals("Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		
		
		if(headerCorrect) {
			System.out.println("The header message is correct");
		}else {
			System.out.println("The header message is incorrect");
		}
		
		if(messageCorrect) {
			System.out.println("The information message is correct");
		}else {
			System.out.println("The information message is incorect");
		}

	}
}
