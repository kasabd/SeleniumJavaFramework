package TestNGListeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjectmodels.GoogleSearchPage;

//@Listeners(TestNGListeners.TestNGlistener.class)

public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	@Test
	public void test2() {
		System.out.println("I am sending text inside test2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("qqq")).sendKeys("ABCD");
		
	}
	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("This test has been skipped");
	}
	
}
