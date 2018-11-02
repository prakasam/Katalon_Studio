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

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/input_Login_username'), 
    '45586-T')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/input_Login_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/button_Sign In'))

WebUI.delay(4)

'pasti business user Dash Board page. '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/span_Scorecard'))

'Score card page  (Click Score card Menu)'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/button_Show Available Vehicle'))

'click show available vehicle list '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/div_JLT2255'))

'selected required vehicle '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/li_Last 30 Days'))

'selected last 30 days from list  \t'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/input_Data Not Available._date'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/button_Show Available Vehicle'))

'selected show available vehicle after reftred the pahgr'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/li_Custom Range'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/input_Data Not Available._date'), 
    '02/02/2018')

'given from date \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/input_Sa_daterangepicker_end'), 
    '28/02/2018')

'given to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/button_Select'))

'Select required button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/button_Export'))

'click export button \r\n'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/select_CSV PDF'), 
    'pdf', true)

'select pdf documtnrn opction from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/button_Export'))

'click export button'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/button_Cancel'))

'button cancel'
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/div_Hi MYEG Services'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/div_Hi'))

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_ScoreCard_OB/Page_Pasti by MyEG/a_Logout'))

'click logout logouiuo'
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://pasti.myeg.com.my/auth/logout')

'Business User log in screen '
WebUI.takeScreenshot()

WebUI.closeBrowser()

