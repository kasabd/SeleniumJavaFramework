import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectmodels.GoogleSearchPageObject;

public class GoogleSearchboxTest {
	private static WebDriver driver= null;
	public static void googlesearchTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearchPageObject searchpageobj = new  GoogleSearchPageObject(driver);
		driver.get("https://google.com");
		searchpageobj.setText_Insearchbox("ABCD");
		searchpageobj.click_searchbutton();
		//driver.close();
	}

	public static void main(String[] args) {
		googlesearchTest();	

	}
}
