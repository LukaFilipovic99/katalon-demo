import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.ebay.com/')

WebUI.setText(findTestObject('Object Repository/ebay/Page_Electronics, Cars, Fashion, Collectibl_475ffe/input_Enter your search keyword__nkw'), 
    'samsung galaxy s24')

WebUI.click(findTestObject('Object Repository/ebay/Page_Electronics, Cars, Fashion, Collectibl_475ffe/input_Enter your search keyword_gh-btn'))

WebUI.click(findTestObject('ebay/Page_samsung galaxy s24 for sale  eBay/span_Samsung Galaxy S24 Ultra  S928B 512GB GSM Unlocked International Version (New)'))

WebUI.switchToWindowTitle('Samsung Galaxy S24 Ultra S928B 512GB GSM Unlocked International Version (New) | eBay')

WebUI.selectOptionByLabel(findTestObject('ebay/Page_Samsung Galaxy S24 Ultra S928B 512GB G_3ee966/select_- Select - Titanium Black  Titanium _12f0d4'), 
    'Titanium Black', false)

WebUI.click(findTestObject('ebay/Page_Samsung Galaxy S24 Ultra S928B 512GB GSM Unlocked International Version (New)  eBay/a_Add to cart'))

WebUI.verifyElementText(findTestObject('ebay/Page_eBay shopping cart/span_US 1,334.99'), 'US $1,334.99')

WebUI.closeBrowser()

/*
 *  This code opens a web browser, navigates to the eBay website, searches for a Samsung Galaxy S24, selects a specific listing, switches to the listing's window, selects a color option, adds the item to the cart, verifies the price in the cart, and then closes the browser.
 *
 *  1. Open a web browser.
 *  2. Navigate to the eBay website.
 *  3. Set the search text to "samsung galaxy s24".
 *  4. Click the search button.
 *  5. Click on a specific listing for the Samsung Galaxy S24.
 *  6. Switch to the window of the listing.
 *  7. Select the color option "Titanium Black".
 *  8. Click the "Add to cart" button.
 *  9. Verify that the price in the cart is "US $1,334.99".
 *  10. Close the web browser.
 *
 */

