package pageObjects;

import abstractComponant.AbstractComponants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProductList extends AbstractComponants {
	
	WebDriver driver;
	 
	public ProductList(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	// driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement product1;
	// syso
	// driver.findElement(By.cssSelector(".inventory_item_name:first-child")).getText()
 
	@FindBy(css = ".inventory_item_name:first-child")
	WebElement product1text;
 
	// driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
 
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement product2;
 
	// syso
	// driver.findElement(By.partialLinkText("Bike Light").getText()
	@FindBy(partialLinkText = "Bike Light")
	WebElement product2text;
 
	// driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement product3;
	// syso
	// String CompareMessage = driver.findElement(By.linkText("Sauce Labs Bolt
	// T-Shirt"))..getText()
	@FindBy(linkText = "Sauce Labs Bolt T-Shirt")
	WebElement product3text;
 
	//driver.findElement(By.cssSelector(".shopping_cart_link")).click();
	@FindBy(css=".shopping_cart_link")
	WebElement cart;
 
	public CartPage addToCart() {
		System.out.println(product1text.getText());
		product1.click();
		System.out.println(product2text.getText());
		product2.click();
		System.out.println(product3text.getText());
		product3.click();
		cart.click();
		CartPage cartPage = new CartPage(driver);
		return cartPage;
 
	}
 
	@Test
	public void openUrl() {
		driver.get("https://www.saucedemo.com/");
	}

}
