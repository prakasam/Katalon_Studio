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

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/login.zul')

WebUI.maximizeWindow()

'BO Support Login Page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Submit with given Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_DBKL Support'))

'Click DBKL Support Main Menu '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/a_Payment Request'))

WebUI.delay(2)

'Click Payment Request Sub Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

'Click Combo Box to chosse opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_selectmerchant_transid'))

WebUI.delay(2)

'Click Transaction ID from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/textarea_merchant_transid_tb_m'), 
    'nodata')

WebUI.delay(2)

'Click Go with Given  Transaction ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_Go'))

WebUI.delay(2)

'it will display the info " Record Not Found " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_selectmerchant_transid'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/textarea_merchant_transid_tb_m'), 
    'FXDL1901022480,FXDL1901022481,FXDL1901022482')

'Click GO with Given Valid merchant id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_Go'))

WebUI.delay(2)

'it will dispolay the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_selectidno'))

WebUI.delay(2)

'click select id no from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_idno_tb_idno'), '3000619566')

WebUI.delay(2)

'Click GO with given ID no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_selecttrans_date'))

WebUI.delay(2)

'click transaction date from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_From Date_db_fdate'), '2019-01-01')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_To Date_db_tdate'), '2019-01-15')

'click go with given from and to transaction date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_Excel Report'))

WebUI.delay(2)

'clicked export buttion . it will download in excell sheet '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_update'))

not_run: WebUI.delay(2)

'click Update  from opctions '
not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_selectmerchant_transid'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/textarea_merchant_transid_tb_m'), 
    'FXDL1901042546')

'Click GO with Given Valid merchant id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_Go'))

WebUI.delay(2)

'it will dispolay the result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_update'))

WebUI.delay(2)

'click Update  from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_merchant_transid_tb_mid'), 'FXDL1901042546')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_idno_tb_idno'), 'W6652R/1')

'Click Go with given merchant id and id no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box to change it '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_amount_tb_merId'), 'FXDL1901042546')

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/input_amount_cb_statuscode'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/td_9'))

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/input_P_cb_statusmsg'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/td_Success'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/input_Pending_tb_amount'), '102.12')

'click update with given information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " record Updated Successfully "'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Request-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Request-OR/button_LogOut'))

'Logged out from BO Support '
WebUI.takeScreenshot()

WebUI.closeBrowser()

