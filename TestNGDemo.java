import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectmodels.GoogleSearchPage;
public class TestNGDemo {
	
		WebDriver driver=null;
	
@BeforeTest	
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
    driver = new ChromeDriver();
	
}

@Test
public  void searchgoogle() {
	    driver.get("https://www.google.com/");
		WebElement textbox= driver.findElement(By.name("q"));
		/*textbox.sendKeys("what is selenium"); */
		GoogleSearchPage.text_searchbox(driver).sendKeys("automation step by step");
		GoogleSearchPage.text_searchbox(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.text_searchbox(driver).sendKeys(Keys.ENTER);
		/* then click on search button */
		/*driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);*/
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		/* taking all elements of type inputs from google and  storing in list */
	}
public  void searchgoogle2() {
    driver.get("https://www.google.com/");
	WebElement textbox= driver.findElement(By.name("q"));
	/*textbox.sendKeys("what is selenium"); */
	GoogleSearchPage.text_searchbox(driver).sendKeys("automation step by step");
	GoogleSearchPage.text_searchbox(driver).sendKeys(Keys.ESCAPE);
	GoogleSearchPage.text_searchbox(driver).sendKeys(Keys.ENTER);
	/* then click on search button */
	/*driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);*/
	//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	/* taking all elements of type inputs from google and  storing in list */
}
@AfterTest
	public void teardownTest() {
		System.out.println("Test has completed succesfully");
		driver.close();
	}
}
