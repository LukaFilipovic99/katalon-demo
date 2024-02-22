import static org.junit.Assert.*;

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("https://croz.net")

WebDriver browser = DriverFactory.getWebDriver()

WebElement searchIcon = browser.findElement(By.className("search-icon"));
searchIcon.click();

Thread.sleep(2000);

WebElement searchInput = browser.findElement(By.name("s"));
searchInput.sendKeys("zadar");

Thread.sleep(2000);

WebElement searchButton = browser.findElement(By.className("search-submit"));
searchButton.click();

Thread.sleep(2000);

WebElement h1Title = browser.findElement(By.xpath("//h1[contains(text(), 'Search Results for zadar')]"));

assertNotNull(h1Title);
assertEquals(h1Title.getText(),"Search Results for zadar")

browser.close()
/*
 *  This code opens a web browser and navigates to the "https://croz.net" website.
 *
 *  1. It opens a web browser and directs it to the specified URL.
 *  2. It retrieves the web driver instance.
 *  3. It finds and clicks on the search icon element.
 *  4. It pauses the execution for 2 seconds.
 *  5. It finds the search input element and enters the text "zadar".
 *  6. It pauses the execution for 2 seconds.
 *  7. It finds and clicks on the search button element.
 *  8. It pauses the execution for 2 seconds.
 *  9. It finds the h1 title element that contains the text "Search Results for zadar".
 *  10. It asserts that the h1 title element is not null.
 *  11. It asserts that the text of the h1 title element is "Search Results for zadar".
 *  12. It closes the web browser.
 *
 */