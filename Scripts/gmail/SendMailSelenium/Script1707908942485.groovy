import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.warrenstrange.googleauth.GoogleAuthenticator

WebUI.openBrowser("https://mail.google.com/")


WebDriver driver = DriverFactory.getWebDriver()

WebElement emailInput = driver.findElement(By.name("identifier"));
emailInput.sendKeys("automatic.test.example@gmail.com");

Thread.sleep(2000);

WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
nextButton.click();

Thread.sleep(2000);

WebElement passwordInput = driver.findElement(By.name("Passwd"));
passwordInput.sendKeys("AutomaticTest123");

Thread.sleep(2000);

WebElement nextButton2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button"));
nextButton2.click();

String secretKey = '47qe 7gd3 oimc ewgi k4ox ixcq udox uoux'

GoogleAuthenticator googleAuthenticator = new GoogleAuthenticator()

int totp = googleAuthenticator.getTotpPassword(secretKey)

WebElement totpInput = driver.findElement(By.id("totpPin"));
totpInput.sendKeys(String.valueOf(totp));

Thread.sleep(2000);

WebElement nextButton3 = driver.findElement(By.id("totpNext"));
nextButton3.click();

Thread.sleep(2000);

WebElement composeButton = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
composeButton.click();

Thread.sleep(2000);

WebElement toInput = driver.findElement(By.xpath("//input[@class='agP aFw']"));
toInput.sendKeys("automatic.test.example@gmail.com");

Thread.sleep(2000);

WebElement subjectInput = driver.findElement(By.name("subjectbox"));
subjectInput.sendKeys("Test");

Thread.sleep(2000);

WebElement messageInput = driver.findElement(By.xpath("//div[@class='Am aiL Al editable LW-avf tS-tW']"));
messageInput.sendKeys("This is test message.");

Thread.sleep(2000);

WebElement sendButton = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
sendButton.click();

