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
import com.warrenstrange.googleauth.GoogleAuthenticator as GoogleAuthenticator

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASKXGp3o20V9DTQPJ_JbTSldd-JPw4eKVLUsSPYRqfPyLTx5w852FGO6C8pb_5DG-I3mM6CsUmRXig&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1190634315%3A1707405635596033&theme=glif')

WebUI.setText(findTestObject('Object Repository/gmail/Page_Gmail/input_to continue to Gmail_identifier'), 'automatic.test.example@gmail.com')

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/gmail/Page_Gmail/input_Too many failed attempts_Passwd'), 'V35d/XPbheD4L6a0D4C/j6Gr7/rVZ25/')

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail/span_Next'))

String secretKey = '47qe 7gd3 oimc ewgi k4ox ixcq udox uoux'

GoogleAuthenticator googleAuthenticator = new GoogleAuthenticator()

int totp = googleAuthenticator.getTotpPassword(secretKey)

WebUI.setText(findTestObject('Object Repository/gmail/Page_Gmail/input_Too many failed attempts_totpPin'), String.valueOf(
        totp))

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail/span_Next'))

WebUI.verifyElementPresent(findTestObject('gmail/Page_Gmail/searchBar'), 10)

WebUI.closeBrowser()

