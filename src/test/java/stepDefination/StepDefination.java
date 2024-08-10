package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BaseClass;
import pageObjects.ButtonPage;
import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.FinishPage;
import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.ProductList;


public class StepDefination extends BaseClass {
	
	public LandingPage landingPage;
	public ProductList productList;
	public CartPage cartPage;
	public CheckOutPage chkoutpage;
	public ButtonPage buttonPage;
	public FinishPage finishPage;
	public HomePage homePage;

	@Given("User landing on Ecommerse page")
	public void user_landing_on_ecommerse_page() throws Exception {
		landingPage = launchApplication();
		String testCasename = null;
		getScreenshot(testCasename, driver);
	}
	@Given("User login with {string} and {string}")
	public void user_login_with_userName_and_password(String userName, String password) {
		productList = landingPage.loginApplication(userName, password);
	}
	@When("I added {string} to cart")
	public void i_added_product_to_cart(String productName) {
		cartPage = productList.addToCart();
		cartPage.cartList();
	}
 
	@When("checkout {string} and continue order")
	public void checkout_product_and_continue_order(String productName) {
		
		chkoutpage = cartPage.checkOutButton();
		chkoutpage.checkoutLanding();
		buttonPage = chkoutpage.continueBtnChkout();
		buttonPage.btnPageoperation();
 
	}
 
	@When("finish the order")
	public void finish_the_order() {
		finishPage = buttonPage.finishChkout();
	}
 
	@Then("{string} message should be displayed")
	public void message_should_be_displayed(String string) {
		homePage = finishPage.finishPagechkout();
		System.out.println("FinalMessage");
		String FinalMessage = finishPage.verifyConfirmationmessage();
		Assert.assertEquals(FinalMessage, "Thank you for your order!");
		System.out.println("Assert order matched");
 
	}
 
	@Then("User land on homepage")
	public void user_land_on_homepage() {
		homePage.homePageOperation();
		homePage.getProductList();
		homePage.listOfItems();
		driver.quit();
 
	}
 

}
