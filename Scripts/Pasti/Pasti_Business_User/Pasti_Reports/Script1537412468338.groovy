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

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_Login_username'), '45586-T')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_Login_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/button_Sign In'))

'Pasti business user Dash board page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/span_Report'))

'Reports page ( click reports menu ) '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_overspeeding update offe'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/label_Harsh Braking_checkbox'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/div_Logout_spinner-bg'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_Date Time Range_date-ran'), 
    FailureHandling.OPTIONAL)

'Selected input date range '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/li_Last 7 Days'), FailureHandling.OPTIONAL)

'Selected 7 days from the list '
WebUI.takeScreenshot()

WebUI.refresh(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_Date Time Range_date-ran'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/li_Custom Range'), FailureHandling.OPTIONAL)

'selected custom range from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_Export_daterangepicker_s'), 
    '01/02/2018 12:00 AM', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_Sa_daterangepicker_end'), 
    '28/02/2018 12:00 AM', FailureHandling.OPTIONAL)

'given date and time from and two '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/button_Select'), FailureHandling.OPTIONAL)

'search result will display '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/button_Export'), FailureHandling.OPTIONAL)

'click export button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_Cancel_daterangepicker_s'), 
    '04/02/2018', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/input_Sa_daterangepicker_end'), 
    '11/02/2018', FailureHandling.OPTIONAL)

'given required date rage '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/button_Select'), FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/select_CSV PDF'), 
    'pdf', true, FailureHandling.OPTIONAL)

'selected document type as pdf '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/select_JLT1155JLT2255JLT7711JL'), 
    'JMD2299', true, FailureHandling.OPTIONAL)

'selected vehicle from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/button_Export'), FailureHandling.OPTIONAL)

'click export button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/button_A_delete'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/div_Hi MYEG Services'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/span_Report'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/a_4'))

'selected 4 th list from vehicle pagination '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_Reports_OB/Page_Pasti by MyEG/div_Hi'))

'Selected name of the company to log out '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://pasti.myeg.com.my/auth/logout')

'logout from user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

