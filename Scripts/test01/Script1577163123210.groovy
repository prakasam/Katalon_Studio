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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.click(findTestObject('Object Repository/test01/p_NBI'))

WebUI.click(findTestObject('Object Repository/test01/div_How to apply using the Online System'))

WebUI.click(findTestObject('Object Repository/test01/div_How to apply using the Online System'))

WebUI.click(findTestObject('Object Repository/test01/div_How much will it cost me to apply online'))

WebUI.click(findTestObject('Object Repository/test01/div_How much will it cost me to apply online'))

WebUI.click(findTestObject('Object Repository/test01/div_I got a hit on my application can you help me'))

WebUI.click(findTestObject('Object Repository/test01/div_I got a hit on my application can you help me'))

WebUI.click(findTestObject('Object Repository/test01/div_How can I avail of the quick renewal service'))

WebUI.click(findTestObject('Object Repository/test01/div_How can I avail of the quick renewal service'))

WebUI.click(findTestObject('Object Repository/test01/span_MYEG Linkbiz'))

WebUI.click(findTestObject('Object Repository/test01/span_Personal Loan'))

WebUI.click(findTestObject('Object Repository/test01/div_How much can I borrow'))

WebUI.click(findTestObject('Object Repository/test01/div_How much can I borrow'))

WebUI.click(findTestObject('Object Repository/test01/div_What are the CIMB Bank Personal Loan Re_fa0277'))

WebUI.click(findTestObject('Object Repository/test01/div_What are the CIMB Bank Personal Loan Re_fa0277'))

WebUI.click(findTestObject('Object Repository/test01/div_How does the CIMB Bank Personal Loan Ca_3ce75e'))

WebUI.click(findTestObject('Object Repository/test01/div_How does the CIMB Bank Personal Loan Ca_3ce75e'))

WebUI.click(findTestObject('Object Repository/test01/div_Is CIMB Bank Personal Loan the right on_05a87f'))

WebUI.click(findTestObject('Object Repository/test01/div_Is CIMB Bank Personal Loan the right on_05a87f'))

WebUI.click(findTestObject('Object Repository/test01/div_How to Apply for a CIMB Personal Loan'))

WebUI.click(findTestObject('Object Repository/test01/div_How to Apply for a CIMB Personal Loan'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.click(findTestObject('Object Repository/test01/a_About Us'))

WebUI.click(findTestObject('Object Repository/test01/a_Address'))

WebUI.switchToWindowTitle('MYEG Philippines')

WebUI.click(findTestObject('Object Repository/test01/div_Directions'))

WebUI.switchToWindowTitle('MYEG Philippines')

WebUI.click(findTestObject('Object Repository/test01/div_reCAPTCHA_recaptcha-checkbox-border (1)'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.click(findTestObject('Page_MYEG Philippines/a_About Us'))

WebUI.click(findTestObject('test01/select_Product Inquiry Payment Gateway Ser'))

WebUI.selectOptionByValue(findTestObject('test01/select_Product Inquiry Payment Gateway Ser'), 
    'Others', true)

WebUI.click(findTestObject('test01/select_Product Inquiry Payment Gateway Ser'))

WebUI.selectOptionByValue(findTestObject('test01/select_Product Inquiry Payment Gateway Ser'), 
    'Payment Gateway Services', true)

WebUI.selectOptionByValue(findTestObject('test01/select_Product Inquiry Payment Gateway Ser'), 
    'E-Government Solutions', true)

WebUI.selectOptionByValue(findTestObject('test01/select_Product Inquiry Payment Gateway Ser'), 
    'Insurance', true)

WebUI.selectOptionByValue(findTestObject('test01/select_Product Inquiry Payment Gateway Ser'), 
    'NBI Clearance', true)

