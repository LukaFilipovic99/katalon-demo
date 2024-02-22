package croz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CrozWebsiteTest {

    WebDriver browser;
    private static final String URL = "https://croz.net/";

    @BeforeEach
    public void initDriverAndConnect() {

        ChromeOptions options = new ChromeOptions();
        browser = new ChromeDriver(options);
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get(URL);
    }

    @Test
    public void testTitle() {
        String title = browser.getTitle();

        assertNotNull(title);
        assertEquals(title, "Home - CROZ");
    }

    @Test
    public void testSearch() throws InterruptedException {
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
        assertEquals(h1Title.getText(), "Search Results for zadar");
    }

    @AfterEach
    public void close() {
        browser.close();
    }
}
