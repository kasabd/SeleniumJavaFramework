package HtmlUnitDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverTest {
	public static void main(String[] args) {
		
		HtmlUnitDriver driver= new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.print("The site title usnig headless driver is  " + driver.getTitle());
		//driver.quit();
	}

}
