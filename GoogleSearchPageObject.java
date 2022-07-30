package pageObjectmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	static  WebDriver driver = null;
	By textbox_search = By.name("q");
	By button_search = By.name("btnk");

	public GoogleSearchPageObject(WebDriver driver) {
		this.driver=driver;
	}
	public  void setText_Insearchbox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	public void click_searchbutton()
	{
		driver.findElement(textbox_search).sendKeys(Keys.ESCAPE);
		driver.findElement(textbox_search).sendKeys(Keys.ENTER);
		driver.findElement(button_search).sendKeys(Keys.ENTER);
	  
	  }
}
