package pageObjects;

import abstractComponant.AbstractComponants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class FinishPage extends AbstractComponants {
	
	WebDriver driver;
	public FinishPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	 
		//	System.out.println(driver.findElement(By.cssSelector(".title")).getText());
//		String FinalMessage = driver.findElement(By.cssSelector(".complete-header")).getText();
		@FindBy(css=".title")
		WebElement finishtitle;
		@FindBy(css=".complete-header")
		WebElement finalMessage;

		public HomePage finishPagechkout()
		{
			System.out.println(finishtitle.getText());
			System.out.println(finalMessage.getText());
			HomePage homePage = new HomePage(driver);
			return homePage;
		}
		public String verifyConfirmationmessage()
		{
			return finalMessage.getText();
		}
	 
		

}
