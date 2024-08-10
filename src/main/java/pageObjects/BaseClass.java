package pageObjects;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	
	public WebDriver driver;
	public LandingPage landingPage;
	@Test
	public WebDriver initializeDriver() throws Exception {
 
		WebDriver driver = null;
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\properties\\swagLab.properties");
		Properties prop = new Properties();
 
		prop.load(fis);
		String browserName = prop.getProperty("browser");
 
		System.out.println(prop.getProperty("browser"));
 
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.out.println("FirefoxBrowser");
		}
 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		return driver;
 
	}
	public File getScreenshot(String testCaseName, WebDriver driver) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\reports\\swagLab.png");
		FileUtils.copyFile(source, file);
		return file;
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Swapnil.Deshpande\\eclipse\\java-2022-12\\eclipse\\SwagLabFramework\\target\\report.png");
		Files.copy(source, file);*/
	}
	@BeforeMethod(alwaysRun = true)
	public LandingPage launchApplication() throws Exception {
	driver = initializeDriver();
	landingPage = new LandingPage(driver);
	landingPage.openUrl();
	return landingPage;

	}


}
