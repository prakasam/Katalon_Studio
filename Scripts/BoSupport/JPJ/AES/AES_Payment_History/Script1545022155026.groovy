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

'Bo Support Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click Submit with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/button_JPJ'))

'click JPJ Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/a_AES'))

'click AES Sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/a_Payment History'))

WebUI.delay(2)

'selected payment history link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_Select the Query_cb_Paym'))

'click combobox to choose ID no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/td_selectidnoandtrans_date'))

WebUI.delay(2)

'Selected ID NO from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_Id No_tb_idno'), '740313145141')

'Click Go with Given ID No '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_From Date_db_fdate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_From Date_db_fdate'), '2018-12-01 15:33:47')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_To Date_db_tdate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_To Date_db_tdate'), '2018-12-17 15:33:47')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_Select the Query_cb_Paym'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/td_selecttrans_date'))

WebUI.delay(2)

'selected payment history from list '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_From Date_db_fdate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_From Date_db_fdate'), '2018-12-01 15:33:47')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_To Date_db_tdate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/input_To Date_db_tdate'), '2018-12-17 15:33:47')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/td_Excel Report'))

WebUI.delay(2)

'click Export button '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Payment_History_OR/button_LogOut'))

WebUI.closeBrowser()

