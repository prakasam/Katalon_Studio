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
import org.apache.commons.lang3.StringUtils as StringUtils
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/')

WebUI.maximizeWindow()

'Pasti Login Screen '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_Sign In_username (1)'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_Sign In_password (1)'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/button_Sign In (1)'))

'Pasti Admin Dash Board'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/a_Alerts (1)'))

'click Alerts menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/a_SMS Reports (1)'))

'SMS Reports Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Generate Report (1)'))

'click generate report woth out given company , vehicle ,from and to date '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_Choose (1)'), 
    '505639-K', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Generate Report (1)'))

'click generate report selected company , with out vehicle ,from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Refersh Vehicle (1)'))

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_Chooseabc1234BNV7781DB2 (1)'), 
    'QATEST', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Generate Report (1)'))

'click generate report selected company ,  vehicle ,with out from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/img (1)'))

WebUI.switchToWindowTitle('DateTime Picker')

'selected date picker '
WebUI.takeScreenshot()

WebUI.closeWindowTitle('DateTime Picker')

not_run: WebUI.click(findTestObject('Page_DateTime Picker/a_10'))

WebUI.switchToWindowTitle('PASTI by MYEG')

not_run: WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_Choose (1)'), 
    '505639-K', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Refersh Vehicle (1)'))

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_Chooseabc1234BNV7781DB2 (1)'), 
    'QATEST', true)

WebUI.focus(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_Start Date  _datefrom (1)'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_Start Date  _datefrom (1)'), 
    '1-9-2018')

not_run: WebUI.sendKeys(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_Start Date  _datefrom (1)'), 
    Keys.chord(Keys.ENTER))

' selected company , vehicle , from date ,with out to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Generate Report (1)'))

'click generate report selected company , vehicle , from date ,with out to date '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_Choose (1)'), 
    '505639-K', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Refersh Vehicle (1)'))

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_Chooseabc1234BNV7781DB2 (1)'), 
    'QATEST', true)

WebUI.focus(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_Start Date  _datefrom (1)'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_Start Date  _datefrom (1)'), 
    '1-9-2018')

not_run: WebUI.sendKeys(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_Start Date  _datefrom (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.focus(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_End Date  _dateto (1)'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_End Date  _dateto (1)'), 
    '30-9-2018')

not_run: WebUI.sendKeys(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/input_End Date  _dateto (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_00010203040506070809101 (1)'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_00010203040506070809101_1 (1)'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_00010203040506070809101_2 (1)'), 
    '23', true)

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_00010203040506070809101_3 (1)'), 
    '59', true)

'Given all required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Generate Report (1)'))

'click generate report selected company , vehicle , from and to date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/input_Top SMS Received_form-co (1)'), 
    'QATEST')

'search for required vehicle info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/input (1)'))

'click down load report '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/a_Alerts (1)'))

'clicked alert menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/a_Vehicle List'))

'vehicle list page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/a_4'))

'clicked 4 th page from pagination \r\n'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_102550100'), 
    '50', true)

'changed from 10 to 50 list of vehicles in page '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/select_102550100'), 
    '10', true)

'changed from 50 to 10 list of vehicles in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/input_All vehicles_form-contro'), 
    'QATEST')

'searched required vehicle from list '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/input_All vehicles_form-contro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/a_Vara prasad'))

'selected vehicle supervisor link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MyEG/a_Edit'))

'clicked Edit link for vehicle supervisor '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/button_Update'))

'general update for supervisor with out changing value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Alerts_OR/Page_PASTI by MYEG/a_Logout (1)'))

'Log out from admin '
WebUI.takeScreenshot()

WebUI.closeBrowser()

