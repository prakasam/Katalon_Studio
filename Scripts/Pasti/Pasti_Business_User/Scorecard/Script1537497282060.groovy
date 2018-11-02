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

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Login_username'), '45586-T')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Login_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/button_Sign In'))

'pasti business user Dash Board page. '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/span_Scorecard'))

'Score card page  (Click Score card Menu)'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/button_Show Available Vehicle'))

'click show available vehicle list '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/i_Vehicle List_search fa fa-se'))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Vehicle List_search-vehi'), 
    'JLT7711', FailureHandling.OPTIONAL)

'selected required vehicle '
WebUI.takeScreenshot()

not_run: WebUI.sendKeys(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Vehicle List_search-vehi'), 
    Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/li_JLT7711'))

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/i_Vehicle List_search fa fa-se'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/i_Vehicle List_close-search-ve'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/div_JLT2255'))

'selected required vehicle '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/button_Show Available Vehicle'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/div_JLT2255_status green-dot'))

'selected green dot vehicle '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Date Range_score-date-ra'))

'selected input rage for search '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/li_Last 7 Days'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Date Range_score-date-ra'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/li_Last Month'))

'selected last 7 days from list  \t'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Date Range_score-date-ra'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/li_Custom Range'))

'selected custom date to choose '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Data Not Available._date'), 
    '01/09/2018')

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/input_Sa_daterangepicker_end'), 
    '30/09/2018')

'given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/button_Select'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/button_Export'))

'selected export result '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/select_CSV PDF'), 'pdf', 
    true)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/button_Export (1)'), FailureHandling.OPTIONAL)

'selected pdf format to download \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/button_Cancel'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/div_Hi'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Scorecard/Page_Pasti by MyEG/a_Logout'))

'log out from business user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

