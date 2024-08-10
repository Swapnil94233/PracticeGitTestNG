package pageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestNGListeners extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
 
	}
 
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
 
	}
 
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail");
		WebDriver driver = null;
		String testCaseName = null;
		try {
			getScreenshot(testCaseName, driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
 
	
 
}
