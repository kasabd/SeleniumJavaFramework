import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportBasicDemo {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports.html");
		extent.attachReporter(spark);
		ExtentTest test1= extent.createTest("Google search", " this is  a google search test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
	    test1.log(Status.INFO, "starting the test cases");
	    driver.get("https://google.com");
	    test1.pass("navigated to www.google.com ");
	    driver.findElement(By.name("q")).sendKeys(" Extent Reports");
	    test1.pass("text has been entered in the search box");
	    driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    test1.pass("Enter key has beem pressed to start search");
	    driver.close();
	    test1.pass("test has been completed");
	    System.out.print("Test has been successfully completed");
	    test1.info("Test completed");
	    extent.flush();
	}
}
