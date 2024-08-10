package pageObjects;

import abstractComponant.AbstractComponants;
import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LandingPage extends AbstractComponants{
	
	WebDriver driver;
	 
		public LandingPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	 
		// WebElement userName = driver.findElement(By.id("user-name"));
		@FindBy(id = "user-name")
		WebElement userName;
	 
		// WebElement password=driver.findElement(By.id("password"))
	 
		@FindBy(id = "password")
		WebElement password;
	 
		// WebElement login=driver.findElement(By.name("login-button")).click();
		@FindBy(name = "login-button")
		WebElement login;
	 
		@Test
		public ProductList loginApplication(String email, String pass) {
			userName.sendKeys(email);
			password.sendKeys(pass);
			login.click();
			ProductList productList = new ProductList(driver);
			return productList;
	 
		}
	 
		public void openUrl() throws Exception {
			driver.get("https://www.saucedemo.com/");

		}

}
