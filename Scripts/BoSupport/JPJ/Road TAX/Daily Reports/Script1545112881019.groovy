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

WebUI.navigateToUrl('http://uat4.myeg.com.my/BOSupport/login.zul')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click Submit with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_Submit'))

'BO Support Dash board'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_JPJ'))

'Click JPJ Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Road Tax'))

'Click Roadtax sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Daily Report'))

'Click Daily Report link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Total Inquiries'))

'Click total inquiries report sub link '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'), '01-12-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'), '31-12-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/td_View Report'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_JPJ'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Road Tax'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Daily Report'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Unique Inquiries'))

'clicked Unique Inquiries report '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'), '01-12-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'), '31-12-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/td_View Report'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_JPJ'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Road Tax'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Daily Report'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Success'))

'clicked Success report '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'), '01-12-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'), '31-12-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/td_View Report'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_JPJ'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Road Tax'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Daily Report'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Errors'))

'clicked Errors report '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'), '01-01-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'), '31-01-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/td_View Report'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/td_Clear'))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_OK'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_JPJ'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Road Tax'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Daily Report'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Count By Status'))

'clicked Count By Status report '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'), '01-01-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'), '31-01-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/td_View Report'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_JPJ'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Road Tax'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Daily Report'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Success Credit Card'))

'clicked Success Credit Card report '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date    _fromDate'), '01-12-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_To Date       _toDate'), '31-12-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/td_View Report'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_JPJ'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Road Tax'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_Daily Report'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/a_RoadTax-Report'))

'clicked Road Tax report '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date   _db_trans'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/input_From Date   _db_trans'), '2018-01-04')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/td_Go'))

WebUI.delay(5)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/Road Tax Daily Reports_OR/button_LogOut'))

'Logout From user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

