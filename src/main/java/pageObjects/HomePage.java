package pageObjects;

import abstractComponant.AbstractComponants;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class HomePage extends AbstractComponants{
	
	WebDriver driver;
		public HomePage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		/*
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
			/*for (WebElement selectedElement : list) {
				if (selectedElement.getText().equalsIgnoreCase(CompareMessage)) {
					System.out.println("Selected Element is : " + selectedElement.getText());
				}
			}*/
		@FindBy(css = ".complete-text")
		WebElement homePage;
		@FindBy(css = ".btn")
		WebElement homePageBack;
		@FindBy(css = ".inventory_item_name")
		List<WebElement> homePageList;
		public void homePageOperation()
		{
			System.out.println(homePage.getText());
			homePageBack.click();
		}

		public List<WebElement> getProductList()
		{
			int length = homePageList.size();
			System.out.println("Length of List: " +length);
			return homePageList;
		}
		public void listOfItems()
		{
			for (WebElement allElement : homePageList) {
				System.out.println("All Elements Are : " + allElement.getText());
			}
			for (WebElement selectedElement : homePageList) {
	 
				String CompareMessage = driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).getText();
				if (selectedElement.getText().equalsIgnoreCase(CompareMessage)) {
					System.out.println("Selected Element is : " + selectedElement.getText());
				}
		}

	 
	}

}
