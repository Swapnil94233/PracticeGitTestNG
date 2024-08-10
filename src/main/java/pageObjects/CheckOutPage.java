package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponant.AbstractComponants;

public class CheckOutPage extends AbstractComponants {

	/*System.out.println(driver.findElement(By.cssSelector(".title")).getText());
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Juan Francisco");
	driver.findElement(By.cssSelector("#last-name")).sendKeys("García Flores");
	driver.findElement(By.cssSelector("#postal-code")).sendKeys("11000");
	System.out.println(driver.findElement(By.cssSelector("#continue")).getText());
	driver.findElement(By.cssSelector(".btn_action")).click();

 */

WebDriver driver;
public CheckOutPage(WebDriver driver) {
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
}


@FindBy(css=".title")
WebElement titleChkoutPage;

@FindBy(xpath="//input[@placeholder='First Name']")
WebElement firstName;

@FindBy(css="#last-name")
WebElement lastName;

@FindBy(css="#postal-code")
WebElement postalCode;

@FindBy(css="#continue")
WebElement continuebtn;

@FindBy(css=".btn_action")
WebElement continuebtnclick;



public void checkoutLanding()
{
	System.out.println(titleChkoutPage.getText());
	firstName.sendKeys("\"Juan Francisco\"");
	lastName.sendKeys("García Flores");
	postalCode.sendKeys("11000");
	
}

public ButtonPage continueBtnChkout()
{
	System.out.println(continuebtn.getText());
	continuebtnclick.click();
	ButtonPage btnPage = new ButtonPage(driver);
	return btnPage;
}



	
	
}