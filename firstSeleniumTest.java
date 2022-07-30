package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSeleniumTest {
	public static void main(String[] args)
	{
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		//driver.getCurrentUrl();
		//System.setProperty("webdriver.chrome.driver", "E:/cc/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.navigate().to("http://selenium.dev/");
		//driver.get("https://www.google.com");
		
		System.setProperty("webdriver.chrome.driver","E:/cc/chromedriver.exe");
		WebDriver wd =new ChromeDriver();
		String baseUrl = "https://www.google.com";
		wd.get(baseUrl);
		wd.quit();
	}

}
