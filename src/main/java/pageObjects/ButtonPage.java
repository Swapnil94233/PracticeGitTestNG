package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponant.AbstractComponants;
 

public class ButtonPage extends AbstractComponants {
	
	/*System.out.println(driver.findElement(By.cssSelector(".title")).getText());
	System.out.println(driver.findElement(By.cssSelector(".summary_info_label:first-of-type")).getText());
	System.out.println(driver.findElement(By.xpath("//div[text()='Shipping Information:']")).getText());
	System.out.println(driver.findElement(By.cssSelector(".summary_total_label")).getText());
	System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Finish\")]")).getText());
	driver.findElement(By.xpath("//button[contains(text(),\"Finish\")]")).click();
 * 
 */
WebDriver driver;
public ButtonPage(WebDriver driver) {
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(css=".title")
WebElement btnTitle;


@FindBy(css=".summary_info_label:first-of-type")
WebElement summaryText;
@FindBy(xpath="//div[text()='Shipping Information:']")
WebElement shippingText;
@FindBy(css=".summary_total_label")
WebElement summaryTotal;
@FindBy(xpath="//button[contains(text(),\"Finish\")]")
WebElement finishText;
@FindBy(xpath="//button[contains(text(),\"Finish\")]")
WebElement finishClick;



public void btnPageoperation()
{
	System.out.println(btnTitle.getText());
	System.out.println(summaryText.getText());
	System.out.println(shippingText.getText());
	System.out.println(summaryTotal.getText());
}
public FinishPage finishChkout()
{
	System.out.println(finishText.getText());
	finishClick.click();
	FinishPage finishPage = new FinishPage(driver);
	return finishPage;
}

}
