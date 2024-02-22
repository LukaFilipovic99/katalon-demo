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

/* Write a Katalon Studio test case to perform the following steps.
 * 1. Open browser to the URL: "https://croz.net
 * 2. Click on search icon
 * 3. Enter "zadar" in search bar
 * 4. Click "Search"
 * 5. Click on the first result 
 * 6. Close the browser
 * */
/*
 *  This test case performs the following steps:
 *  1. Open browser to the URL: "https://croz.net"
 *  2. Click on search icon
 *  3. Enter "zadar" in search bar
 *  4. Click "Search"
 *  5. Click on the first result
 *  6. Close the browser
 */
// Step 1: Open browser to the URL: "https://croz.net"
WebUI.openBrowser('https://croz.net')

// Step 2: Click on search icon
WebUI.click(findTestObject('croz/Page_Home - CROZ/searchIcon'))

// Step 3: Enter "zadar" in search bar
WebUI.setText(findTestObject('croz/Page_Home - CROZ/searchBar'), 'zadar')

// Step 4: Click "Search"
WebUI.click(findTestObject('croz/Page_Home - CROZ/searchButton'))

// Step 5: Click on the first result
WebUI.click(findTestObject('croz/Page_You searched for zadar - CROZ/a_QED 2013 conference held in Zadar'))

// Step 6: Close the browser
WebUI.closeBrowser()

