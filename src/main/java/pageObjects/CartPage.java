package pageObjects;

import abstractComponant.AbstractComponants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class CartPage extends AbstractComponants{
	
	
		 /* System.out.println(driver.findElement(By.cssSelector(".app_logo")).getText());
			System.out.println(driver.findElement(By.cssSelector(".app_logo")).getTagName());
	 
			System.out.println(driver.findElement(By.id("item_4_title_link")).getText());
			System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bike Light']")).getText());
			driver.findElement(By.cssSelector("#remove-sauce-labs-bolt-t-shirt")).click();
			System.out.println("Sauce Labs Bolt T-Shirt Removed from the cart");
			System.out.println(driver.findElement(By.cssSelector(".checkout_button")).getText());
			driver.findElement(By.cssSelector(".checkout_button")).click();
	*/
		WebDriver driver;
		public CartPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(css=".app_logo")
		WebElement cartTitle;

	 
		@FindBy(id="item_4_title_link")
		WebElement cartProduct1text;
		@FindBy(xpath="//div[normalize-space()='Sauce Labs Bike Light']")
		WebElement cartProduct2text;
		@FindBy(css="#remove-sauce-labs-bolt-t-shirt")
		WebElement cartRemove;
		@FindBy(css=".checkout_button")
		WebElement checkOut;
		//driver.findElement(By.cssSelector(".shopping_cart_link")).click();
	 
	 
		public void cartList()
		{
			System.out.println(cartTitle.getText());
			System.out.println(cartTitle.getTagName());
			System.out.println(cartProduct1text.getText());
			System.out.println(cartProduct2text.getText());
			cartRemove.click();
			System.out.println("Sauce Labs Bolt T-Shirt Removed from the cart");
		}
		public CheckOutPage checkOutButton()
		{
			System.out.println(checkOut.getText());
			checkOut.click();
			CheckOutPage chkoutpage = new CheckOutPage(driver);
			return chkoutpage;
		}

}
