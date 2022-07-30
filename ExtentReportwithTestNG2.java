package pageObjectmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportwithTestNG2 {
	ExtentReports extent= new ExtentReports();
	ExtentSparkReporter spark;
	ExtentTest test1;
	WebDriver driver;
	@BeforeSuite
	public void setupNG() {
		spark = new ExtentSparkReporter("ExtentReportsWithTestNG.html");
		extent.attachReporter(spark);
	}
		@BeforeTest
		public void configsetup()
		{
			test1= extent.createTest("Google search", " this is  a google search test");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
			driver = new ChromeDriver();
		}



		@Test
		public  void test3() {
			test1.log(Status.INFO, "starting the test cases");
			driver.get("https://google.com");
			test1.pass("navigated to www.google.com ");
			driver.findElement(By.name("q")).sendKeys(" Extent Reports");
			test1.pass("text has been entered in the search box");
			driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			test1.pass("Enter key has beem pressed to start search");
		}
		@Test
		public  void test4() {
			test1.log(Status.INFO, "starting the test cases");
			driver.get("https://google.com");
			test1.fail("navigated to www.google.com ");
			driver.findElement(By.name("q")).sendKeys(" Extent Reports");
			test1.fail("text has been entered in the search box");
			driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			test1.fail("Enter key has beem pressed to start search");
		}

		@AfterTest
		public  void tearDown1() {
			System.out.print("Test has been successfully completed");
			test1.info("Test completed");
		}
		@AfterSuite
		public  void tearDown() {
			extent.flush();
		}

	} 