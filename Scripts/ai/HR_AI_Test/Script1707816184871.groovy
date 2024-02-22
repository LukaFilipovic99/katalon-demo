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

/* Write a Katalon Studio test case to perform the following steps and use Page_OrangeHRM folder for test objects.
 * 1. Open browser to the URL: "https://opensource-demo.orangehrmlive.com/"
 * 2. Enter "Admin" into "input_Username_username" test object
 * 3. Enter "admin123" into "input_Password_password" test object
 * 4. Click on "button_Login" test object
 * 5. Check that "h6_Dashboard" test object is displayed
 * 6. Close the browser
/*
 */
// Open browser to the URL: "https://opensource-demo.orangehrmlive.com/"
WebUI.openBrowser("https://opensource-demo.orangehrmlive.com/")

// Enter "Admin" into "input_Username_username" test object
WebUI.setText(findTestObject("Page_OrangeHRM/input_Username_username"), "Admin")

// Enter "admin123" into "input_Password_password" test object
WebUI.setText(findTestObject("Page_OrangeHRM/input_Password_password"), "admin123")

// Click on "button_Login" test object
WebUI.click(findTestObject("Page_OrangeHRM/button_Login"))

// Check that "h6_Dashboard" test object is displayed
WebUI.verifyElementVisible(findTestObject("Page_OrangeHRM/h6_Dashboard"))

// Close the browser
WebUI.closeBrowser()
