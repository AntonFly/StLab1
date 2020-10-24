// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RegistrationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void registration() {
    driver.get("https://www.domaintools.com/");
    driver.manage().window().setSize(new Dimension(1920, 1040));
    driver.findElement(By.xpath("//a[contains(text(),\'Login\')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),\'BUY A PERSONAL MEMBERSHIP\')]")).click();
    driver.findElement(By.xpath("//input[@id=\'personal-monthly\']")).click();
    driver.findElement(By.xpath("//button[@onclick=\"wAccountType.confirmSelection(\'free-trial-form\',\'continueToCheckout\');return false;\"]")).click();
    driver.findElement(By.xpath("//input[@id=\'jn-first-name\']")).click();
    driver.findElement(By.xpath("//input[@id=\'jn-first-name\']")).sendKeys("Антон");
    driver.findElement(By.xpath("//input[@id=\'jn-last-name\']")).sendKeys("Авраменко");
    driver.findElement(By.xpath("//input[@id=\'jn-email-address\']")).sendKeys("anton99910@gmail.com");
    driver.findElement(By.xpath("//input[@id=\'jn-address-1\']")).sendKeys("Ул. Цветная 20");
    driver.findElement(By.xpath("//input[@id=\'jn-city\']")).sendKeys("Старый Оскол");
    driver.findElement(By.xpath("//input[@id=\'jn-state\']")).sendKeys("Белгородская область");
    driver.findElement(By.xpath("//input[@id=\'jn-zipcode\']")).sendKeys("309503");
    driver.findElement(By.xpath("//input[@id=\'jn-phone\']")).sendKeys("89803295312");
    driver.findElement(By.xpath("//input[@id=\'jn-password\']")).click();
    driver.findElement(By.xpath("//input[@id=\'jn-password\']")).sendKeys("qwerty1234");
    driver.findElement(By.xpath("//input[@id=\'jn-re-password\']")).click();
    driver.findElement(By.xpath("//input[@id=\'jn-re-password\']")).sendKeys("qwerty1234");
    driver.findElement(By.xpath("//input[@id=\'jn-card-number\']")).click();
    driver.findElement(By.xpath("//form[@id=\'process-user-information\']/div[12]/div[2]")).click();
    driver.findElement(By.xpath("//input[@id=\'promo-code\']")).click();
    driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
    {
      WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Terms of Service\')]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.xpath("//body")).click();
  }
}
