package pageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SwagLabMain extends BaseClass {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public ProductList productList;
	public CartPage cartPage;
	public CheckOutPage chkoutpage;
	public ButtonPage buttonPage;
	public FinishPage finishPage;
	public HomePage homePage;


	@Test
	public void mainProgram() throws Exception
	{
		productList = landingPage.loginApplication("standard_user", "secret_sauce" );
		String testCasename = null;
		getScreenshot(testCasename, driver);
		cartPage = productList.addToCart();
		cartPage.cartList();
		chkoutpage = cartPage.checkOutButton();
		chkoutpage.checkoutLanding();
		buttonPage = chkoutpage.continueBtnChkout();
		buttonPage.btnPageoperation();
		finishPage = buttonPage.finishChkout();
		homePage = finishPage.finishPagechkout();
		System.out.println("FinalMessage");
		String FinalMessage = finishPage.verifyConfirmationmessage();
		Assert.assertEquals(FinalMessage, "Thank you for your order!");
		System.out.println("Assert order matched");
		homePage.homePageOperation();
		homePage.getProductList();
		homePage.listOfItems();

		driver.quit();
	}






		//System.out.println(driver.findElement(By.cssSelector(".complete-text")).getText());
		//System.out.println(driver.findElement(By.cssSelector(".btn")).getText());
		//driver.findElement(By.cssSelector(".btn")).click();
 
		//List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));
 
		//int length = list.size();
		//System.out.println(length);
 
		// All list of WebElement
		//for (WebElement allElement : list) {
			//System.out.println("All Elements Are : " + allElement.getText());
		}
		/*for (WebElement selectedElement : list) {
			if (selectedElement.getText().equalsIgnoreCase(CompareMessage)) {
				System.out.println("Selected Element is : " + selectedElement.getText());
			}
		}*/

	//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.name("login-button")).click();
 
		//System.out.println(driver.findElement(By.cssSelector(".inventory_item_name:first-child")).getText());
		//driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		//System.out.println(driver.findElement(By.partialLinkText("Bike Light")).getText());
		//driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		//System.out.println(driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).getText());
		//String CompareMessage = driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).getText();
		//driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		//driver.findElement(By.cssSelector(".shopping_cart_link")).click();
 
		//System.out.println(driver.findElement(By.cssSelector(".app_logo")).getText());
		//System.out.println(driver.findElement(By.cssSelector(".app_logo")).getTagName());
 
		//System.out.println(driver.findElement(By.id("item_4_title_link")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bike Light']")).getText());
		//driver.findElement(By.cssSelector("#remove-sauce-labs-bolt-t-shirt")).click();
		//System.out.println("Sauce Labs Bolt T-Shirt Removed from the cart");
		//System.out.println(driver.findElement(By.cssSelector(".checkout_button")).getText());
		//driver.findElement(By.cssSelector(".checkout_button")).click();
 
		//System.out.println(driver.findElement(By.cssSelector(".title")).getText());
		//driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Juan Francisco");
		//driver.findElement(By.cssSelector("#last-name")).sendKeys("García Flores");
		//driver.findElement(By.cssSelector("#postal-code")).sendKeys("11000");
		//System.out.println(driver.findElement(By.cssSelector("#continue")).getText());
		//driver.findElement(By.cssSelector(".btn_action")).click();
 
		//System.out.println(driver.findElement(By.cssSelector(".title")).getText());
		//System.out.println(driver.findElement(By.cssSelector(".summary_info_label:first-of-type")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[text()='Shipping Information:']")).getText());
		//System.out.println(driver.findElement(By.cssSelector(".summary_total_label")).getText());
		//System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Finish\")]")).getText());
		//driver.findElement(By.xpath("//button[contains(text(),\"Finish\")]")).click();
 
		//System.out.println(driver.findElement(By.cssSelector(".title")).getText());
		//String FinalMessage = driver.findElement(By.cssSelector(".complete-header")).getText();
		/*FinishPage finishPage = new FinishPage();
		finishPage.finishPagechkout(FinalMessage);
		System.out.println(FinalMessage);
		Assert.assertEquals(FinalMessage, "Thank you for your order!");
		System.out.println("Assert order matched");
		System.out.println(driver.findElement(By.cssSelector(".complete-text")).getText());
		System.out.println(driver.findElement(By.cssSelector(".btn")).getText());
		driver.findElement(By.cssSelector(".btn")).click();
 
		List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));
 
		int length = list.size();
		System.out.println(length);
 
		// All list of WebElement
		for (WebElement allElement : list) {
			System.out.println("All Elements Are : " + allElement.getText());
		}
		for (WebElement selectedElement : list) {
			if (selectedElement.getText().equalsIgnoreCase(CompareMessage)) {
				System.out.println("Selected Element is : " + selectedElement.getText());
			}
		}
			// driver.quit();
	}*/


