package DemoTestPriority;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMultiBrowser {
	WebDriver driver=null;
	
	@org.testng.annotations.Parameters("Browsername")
	@BeforeTest
	public void setUp(String Browsername) {
		System.out.println("Browser name id" + Browsername);
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else if(Browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\IE Driver\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.google.com/");
		}
	}

	
	@Test
	public void test1() {
		driver.get("https://www.google.com/");

	}
	@AfterTest
	public void teardown() {
		
		System.out.println("The test has been completed  ");
		
	}
}
