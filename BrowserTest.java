import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjectmodels.GoogleSearchPage;
public class BrowserTest {
	public static void main(String[] args) {
		searchgoogle();
	}
		public static void searchgoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textbox= driver.findElement(By.name("q"));
		/*textbox.sendKeys("what is selenium"); */
		GoogleSearchPage.text_searchbox(driver).sendKeys("automation step by step");
		/* then click on search button */
		/*driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);*/
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		/* taking all elements of type inputs from google and  storing in list */
	}
	
}
