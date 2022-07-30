package DemoTestPriority;

import java.lang.StackWalker.Option;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          test1();

	}
	public static  void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("selenium wait");
		driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("This is a headles browser to be printed on console");
	}

}
