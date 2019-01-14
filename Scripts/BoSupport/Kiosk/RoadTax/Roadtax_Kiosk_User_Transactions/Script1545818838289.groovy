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

'BO Support Login Page \t'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click Submit with Given Username and Password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/button_Submit'))

'Bo Support Bash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/button_Kiosk'))

'Click Kiosk Main menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/a_Road Tax'))

'Click Roadtax Sub Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/a_tb_roadtax_kioskusers_trans'))

'click Roadtax User Transaction main link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/a_Update accountIdNobalancepre'))

'Click Update Account id No Balance sub link \r\n'
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_Select the Query_tb_rtxr'))

WebUI.delay(2)

'click combobox to select opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/td_Updateacct_idacctnobalancep'))

WebUI.delay(2)

'selected update id Accountno Balance  opction '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_RequestId_tb_requestId'), 
    'TOPUPREQ')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_AccountNumber_tb_account'), 
    '8023839645')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_transadate_tb_transdate'), 
    '2014-12-12 17:57:28.151609+08')

'click GO With Given Required Information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/button_Go'))

WebUI.delay(2)

'it will display info with text box to change '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_prevbalance_tb_accid'), 
    'INSINSUDENRS')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_prevbalance_tb_acct'), 
    '8023839645')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_prevbalance_tb_balance'), 
    '4482.1')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_prevbalance_tb_prevbalan'), 
    '4282.1')

'Click Update with Given Required info to change '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_Select the Query_tb_rtxr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/td_selectkioskuserTrans'))

WebUI.delay(2)

'clicked Kiosk User transactions from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_AccountNumber_tb_account'), 
    '8023839645')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/input_transadate_tb_transdate'), 
    '2014-12-12  17:57:28')

'click Go with given Account No and transaction Date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/button_Go'))

WebUI.delay(5)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_Transaction_OR/button_LogOut'))

'Logout from Bo Support '
WebUI.takeScreenshot()

WebUI.closeBrowser()

