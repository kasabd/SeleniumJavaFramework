package DemoTestPriority;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class RecorderTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\lib\\chromedrive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    baseUrl = "https://www.facebook.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.facebook.com/");
    driver.findElement(By.cssSelector("svg.pzggbiyp > g")).click();
    driver.findElement(By.cssSelector("image")).click();
    driver.findElement(By.cssSelector("svg.pzggbiyp > g")).click();
    driver.findElement(By.xpath("//div[@id='mount_0_0_av']/div/div/div/div[2]/div[4]/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div/div/span")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("kasabd97@gmail.com");
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("sone@2016");
    driver.findElement(By.id("u_0_9_ga")).click();
    driver.findElement(By.cssSelector("svg.pzggbiyp > g")).click();
    driver.findElement(By.xpath("//div[@id='mount_0_0_As']/div/div/div/div[2]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div/div/span")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
