import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import pageObjectmodels.GoogleSearchPage;

public class DesiredCapability_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME,true);
		caps.setCapability("start-maximized",true);
		driver.get("https://google.com/");
		WebElement textbox= driver.findElement(By.name("q"));
		/*textbox.sendKeys("what is selenium"); */
		GoogleSearchPage.text_searchbox(driver).sendKeys("automation step by step");
		GoogleSearchPage.text_searchbox(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.text_searchbox(driver).sendKeys(Keys.ENTER);
		
	}

}
