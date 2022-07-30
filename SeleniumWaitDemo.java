package DemoTestPriority;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjectmodels.GoogleSearchPage;

public class SeleniumWaitDemo {
	public static void main(String[] args) {
		seleniuwait();
	}
	public static void seleniuwait() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("selenium wait");
		driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	    WebDriverWait wait = new WebDriverWait(driver,null);
		WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.name("abacd")));
		driver.findElement(By.name("abc")).click();
		driver.close();
		driver.quit();
		
	}

}
