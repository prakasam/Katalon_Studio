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

'BO Support Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Submit with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/button_Submit'))

'BO Support Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/button_DBKL Support'))

WebUI.delay(2)

'Click DBKL Main Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/a_Payment Response'))

WebUI.delay(2)

'Click payment responce Sub menu'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Responce-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

'click Check Box to choose opctions from list '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/td_selectID'))

WebUI.delay(2)

'click select id from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_Id No_tb_idno'), '3000619566')

'click go with given ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Responce-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/td_selectTransDate'))

WebUI.delay(2)

'click Select transaction date from list .'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_From Date_tb_fdate'), '2019-01-01')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_To Date_tb_tdate'), '2019-01-15')

'click Go with Given from anf to Date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/button_Go'))

WebUI.delay(2)

'it will display the result based on the given dates '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/td_Excel Report'))

WebUI.delay(2)

'click export button '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Responce-OR/input_Select the Query_cb_Dbkl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/td_update'))

WebUI.delay(2)

'Select Update button from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_Id No_tb_idno'), '3000619566')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_From Date_tb_fdate'), '2019-01-01')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_To Date_tb_tdate'), '2019-01-02')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_Merchant Trans Id_tb_mti'), 
    'FXDL1901022483')

'Click Go with given required details'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/button_Go'))

WebUI.delay(2)

'it will dipsy the data in text box to change '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_amount_tb_merId'), 'FXDL1901022483')

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Responce-OR/input_amount_cb_statuscode'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/td_9'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/DBKL/Payment_Responce-OR/input_P_cb_statusmsg'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/td_Success'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/input_Pending_tb_amount'), '266.12')

'Click Update with given all required info'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " updated record successfully"  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/DBKL/Payment_Responce-OR/button_LogOut'))

'Logged Out from user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

