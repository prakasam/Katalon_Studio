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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://uat4.myeg.com.my/BOSupport/login.zul')

WebUI.maximizeWindow()

'Bo Support Home page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Password_j_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

'Click Submit with given username and password'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_JPJ'))

'Click JPJ main menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/a_AES'))

'click AES Sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/a_Summon Details'))

'click summon details link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Select the Query_cb_JpjS'))

'choose combo box to select from list '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/td_selectIdNo'))

'selected id no from list '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Id No_tb_id'), '740313145141')

'click go with given ID Number \t'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Select the Query_cb_JpjS'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/td_selectmerchant_transid'))

'select merchant id from list '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/textarea_merchant_transid_tb_m'), 'FXJS201812070007859M')

'click go with given merchant id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Select the Query_cb_JpjS'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/td_selectSummonscount'))

'select summon count from list '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_From Date_tb_fdate'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_From Date_tb_fdate'), '2018-12-01 15:33:47')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_To Date_tb_tdate'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_To Date_tb_tdate'), '2018-12-30 15:33:47')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Select the Query_cb_JpjS'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/td_update'))

WebUI.delay(2)

'selected update from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Trans_ID_tb_tid'), 'MYEG2018120701312')

'click go with given transaction id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Select the Query_cb_statuscode'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/td_9'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_P_cb_statusmsg'))

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_P_cb_statusmsg'), 'Success')

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/td_Success (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Pending_tb_respcode'), 'G00000000I')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Pending_tb_revcode'), '77777')

not_run: WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Pending_tb_transdate'), '2018-12-07 12:00:59')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_userid'), 'qatest1819@gmail.com')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_idno'), '740313145141')

'Change values as required '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_idno'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_summonno'), '20150103091A0000822613')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_summontype'), 'JPJ')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_reqtime'), 'FXJS201812070007859M')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_vehicleno'), 'PJJ9310')

'next fields to change '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_vehicleno'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_amtpaid'), '7000')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_receiptno'), 'MYEG/071218/SMN00003')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_requestid'), '3MYJPJM201812071200598283')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_issuecode'), '111111')

'change required info '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_issuecode'), Keys.chord(Keys.TAB))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_requestid'), 'eServSummonSub20181207120059828006')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_summondate'), '2015-08-27 00:00:00')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_wsrequest'), 'FXJS201812070007859M')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_transid'), 'MYEG2018120701312')

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/input_Sat_tb_transid'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_Update'), Keys.chord(Keys.TAB))

WebUI.delay(2)

'click update with given all required information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_Update'))

WebUI.delay(2)

'it will display message " Record Successfully Updated " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/AES/AES_Summon_Details/button_LogOut'))

'Logout from menu '
WebUI.takeScreenshot()

WebUI.closeBrowser()

