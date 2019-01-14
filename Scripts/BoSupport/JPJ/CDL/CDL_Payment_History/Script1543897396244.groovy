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

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_LOGIN - BOSupport/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_LOGIN - BOSupport/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Login Page of Bo Support '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_LOGIN - BOSupport/button_Submit'))

'DashBoard of Bo Support \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportHome/button_JPJ'))

'Selected JPJ Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportHome/a_CDL'))

'Selected CDL Sub Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportHome/a_cdl_pymt_history'))

'clicked cdl_payment_history link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Select the Query_cb_merc'))

'click combobox for selection of required info \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/td_id_no'))

'choosen Id_No from List '
WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Please enter the Id_No_t'), 
    3)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Please enter the Id_No_t'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/input_Please enter the Id_No_t'), 
    'dsjbchsdvj')

'click go with given NRIC (invalid)  info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/button_Go'))

WebUI.delay(2)

'it will display message " record not found " '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Select the Query_cb_merc'))

'click combobox for selection of required info \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/td_id_no'))

'choosen Id_No from List '
WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Please enter the Id_No_t'), 
    3)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Please enter the Id_No_t'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/input_Please enter the Id_No_t'), 
    '123456789123')

'click go with given NRIC info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/button_Go'))

WebUI.delay(2)

'it will display the search result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Select the Query_cb_merc'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/td_merchant_tx_id'))

'Choosen merchant id from combo box '
WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/textarea_Please enter the merc'), 
    3)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/textarea_Please enter the merc'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/textarea_Please enter the merc'), 
    'CRCL1808015408,CRCL1808015400,CRCL1805274254')

'click go with given merchantid  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/button_Go'))

WebUI.delay(2)

'it will display the avalable transaction details for given merchant id '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Select the Query_cb_merc'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/td_UpdateMerchantId'))

'selected Update merchant id from combobox list '
WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Please enter the tx_code'), 
    3)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Please enter the tx_code'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/input_Please enter the tx_code'), 
    '10210000073855')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/input_tx_datetime_tx_datetime'), 
    '2018-08-01 21:10:11')

'click go with given transaction code and transaction time '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/button_Go'))

'it will display the result in text box merchant id , status and remark '
WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_remarks_tb_merchant'), 
    3)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_remarks_tb_merchant'), 
    'CRCL1808015123')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_remarks_tb_payment'), 
    'S')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_remarks_tb_remarks'), 
    'C')

'click update with given required info ( merchant id , status and remark '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Updated record Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/button_OK'))

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_Select the Query_cb_merc'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/td_pymt_historyReport'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Choosen payment History Report '
WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_From_db_reqdate1'), 
    3)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_From_db_reqdate1'), 
    FailureHandling.OPTIONAL)

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_From_db_reqdate1'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_From_db_reqdate1'), 
    '2018-08-01 15:33:47')

'given from date '
WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_To_db_reqdate2'), 
    3)

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_To_db_reqdate2'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/Page_SupportCDL/input_To_db_reqdate2'), 
    '2018-08-30 15:33:47')

'click Go given required info (to date) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/button_Go'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

'it will display the avalable records between given dates '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Payment_History_OB/Page_SupportCDL/button_LogOut'))

'logout from user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

