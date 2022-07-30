package webDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerDemo {
public static  String browser;
static WebDriver driver;
	public static void main(String[] args) {
		setbrowser();
		setbrowserconfig();
		runTest();
		
		//ChromeOptions chromeOptions = new ChromeOptions();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\geckodriver\\geckodriver-v0.31.0-win64.zip");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		// Navigate to the demoqa website
		//driver.get("https://www.google.com");
		//driver.quit();
}
	public static void setbrowser()
	{
		//browser="chrome";
		
	}
	public static void setbrowserconfig()
	{
		if(browser.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	}
	public static void  runTest() {
		// Navigate to the demoqa website
			driver.get("https://www.google.com");
			driver.quit();
		
	}
	
}
