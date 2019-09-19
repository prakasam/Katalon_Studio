import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/Login_data/input_Continue to Gmail_identifier'), findTestData('login_data/data').getValue(
        1, 1))

WebUI.click(findTestObject('Object Repository/Login_data/span_Next'))

not_run: WebUI.setEncryptedText(findTestObject('Login_data/input_Too many failed attempts_password'), findTestData('login_data/data').getValue(
        1, 2))

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), findTestData('login_data/data').getValue(1, 2))

WebUI.click(findTestObject('Object Repository/Login_data/span_Next'))

WebUI.click(findTestObject('Object Repository/Login_data/span_Send feedback_gb_Ba gbii'))

WebUI.click(findTestObject('Object Repository/Login_data/a_Sign out'))

