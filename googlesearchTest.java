import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlesearchTest {
	public static void main(String[] args) {
		searchgoogle();
	}
		public static void searchgoogle() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textbox= driver.findElement(By.name("q"));
		textbox.sendKeys("what is selenium");
		/* then click on search button */
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		/* taking all elements of type inputs from google and  storing in list */
	    List<WebElement> listofinputs= driver.findElements(By.xpath("//input"));
	    int count=listofinputs.size();
	    System.out.println("The number of input elemnts are " + count);
	}
	
}
