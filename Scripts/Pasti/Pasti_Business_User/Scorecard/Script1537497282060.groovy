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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pasti.myeg.com.my/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/input_Login_username'), '45586-T')

WebUI.setEncryptedText(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/input_Login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/button_Sign In'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/span_Scorecard'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/button_Show Available Vehicle'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/i_Vehicle List_search fa fa-se'))

WebUI.setText(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/input_Vehicle List_search-vehi'), 'JLT7711', 
    FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

not_run: WebUI.sendKeys(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/input_Vehicle List_search-vehi'), 
    Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/li_JLT7711'))

not_run: WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/i_Vehicle List_search fa fa-se'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/i_Vehicle List_close-search-ve'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/div_JLT2255'))

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Scorecard/Page_Pasti by MyEG/button_Show Available Vehicle'))

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/input'))

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/div_JLT2255_status green-dot'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Scorecard/Page_Pasti by MyEG/input_Date Range_score-date-ra'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/li_Last 7 Days'))

WebUI.click(findTestObject('Scorecard/Page_Pasti by MyEG/input_Date Range_score-date-ra'))

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/li_Last Month'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Scorecard/Page_Pasti by MyEG/input_Date Range_score-date-ra'))

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/li_Custom Range'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/input_Data Not Available._date'), '01/09/2018')

WebUI.setText(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/input_Sa_daterangepicker_end'), '30/09/2018')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/button_Select'))

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/button_Export'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/select_CSV PDF'), 'pdf', true)

WebUI.click(findTestObject('Scorecard/Page_Pasti by MyEG/button_Export (1)'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/div_Hi'))

WebUI.click(findTestObject('Object Repository/Scorecard/Page_Pasti by MyEG/a_Logout'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

