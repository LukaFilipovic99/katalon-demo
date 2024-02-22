package ebay;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayGeneratedTest {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void ebayaddtocart() {
    driver.get("https://www.ebay.com/");
    driver.manage().window().setSize(new Dimension(1363, 1086));
    driver.findElement(By.id("gh-ac")).click();
    driver.findElement(By.id("gh-ac")).sendKeys("samsung galaxy s24");
    driver.findElement(By.id("gh-btn")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector("#item4be5d2aa5b .s-item__title > span")).click();
    vars.put("win2182", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2182").toString());
    driver.findElement(By.id("x-msku__select-box-1000")).click();
    {
      WebElement dropdown = driver.findElement(By.id("x-msku__select-box-1000"));
      dropdown.findElement(By.xpath("//option[. = 'Titanium Black']")).click();
    }
    driver.findElement(By.cssSelector(".x-atc-action .ux-call-to-action__text")).click();
    assertEquals(driver.findElement(By.cssSelector(".cart-summary-line-item:nth-child(1) > .val-col > .text-display-span > span > span")).getText(), "US $1,334.99");
    driver.close();
  }
}
