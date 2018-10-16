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

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/button_Sign In'))

'Pasti Admin Dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/a_Score Card'))

'Selected Scorecard menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/a_Score Card_1'))

'Scorecard page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/button_Generate Report'))

'Click Generate button with out given values '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/select_Choose'), 
    '505639-K', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/button_Generate Report'))

'click gerare report with required company from dropdown '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/img'))

WebUI.switchToWindowTitle('DateTime Picker')

WebUI.closeWindowTitle('DateTime Picker')

WebUI.switchToWindowTitle('PASTI by MyEG')

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/input_Start Date  _datefrom'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/input_Start Date  _datefrom'), 
    '1-9-2018')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/button_Generate Report'))

'Selected from date using date picker '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/img'))

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_DateTime Picker/a_27'))

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/input_End Date  _dateto'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/input_End Date  _dateto'), 
    '31-9-2018')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/select_00 01020304050607080910_4'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/select_00 01020304050607080910'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/select_00 01020304050607080910_5'), 
    '23', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/select_00 01020304050607080910_6'), 
    '59', true)

'given all required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MyEG/button_Generate Report'))

'Given required info and select generate report button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MYEG/input'))

'Click download SCV sheet link '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MYEG/select_102550100'), 
    '100', true)

'select list of records for each page using navigation drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MYEG/input_Download CSV Sheet_form-'), 
    'Qatest')

'Search for required vehicle details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Scorecard_OB/Page_PASTI by MYEG/a_Logout'))

'Logout from pasti Admin Account '
WebUI.takeScreenshot()

WebUI.closeBrowser()

