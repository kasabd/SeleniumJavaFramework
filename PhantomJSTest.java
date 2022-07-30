package PhantomJS;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {
	public static void main(String[] args) {
		System.setProperty("phantomjs.binary.path", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\phantomJS\\phantomjs.exe");
		PhantomJSDriver driver = new PhantomJSDriver();
		driver.get("https://www.google.com/");
		System.out.println("the title if the site  we are looking for is " + driver.getTitle());
		driver.quit();
	} 

}
