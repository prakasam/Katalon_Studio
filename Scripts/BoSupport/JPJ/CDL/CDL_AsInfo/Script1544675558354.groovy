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

'BO Support Home Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Password_j_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

'Given Login Details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/button_Submit'))

'Dash board of BO Support '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/button_JPJ'))

'Selected JPJ Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/a_CDL'))

'Selected CDL Sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/a_tb_cdl_asinfo'))

'Selected CDL as info link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Select the Query_cb_asin'))

WebUI.delay(2)

'choose the query from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/td_id_no'))

WebUI.delay(2)

'Selected ID No from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Please enter the Id_No_t'), 'Z1799485')

'Click Go buttion with Given Id No Information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/button_Go'))

WebUI.delay(2)

'it will display the search result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Select the Query_cb_asin'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/td_UpdateAllByid_noandreq_date'))

WebUI.delay(2)

'chooseen update all by id no and request date opction from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Please enter the Id_No_t'), 'Z1799485')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_req_date_tb_reqdate'), '2017-05-30 16:08:56.434')

'click go button with given id no and request date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/button_Go'))

WebUI.delay(2)

'it will display the all colums in text box to change it '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_ag_code_db_date'), '2017-05-30 16:08:56.434')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_id'), 'Z1799485')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_scode'), '01')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_smsg'), 'Success')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_mtid'), 'CRCL1705308254')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_itype'), '9')

'given required info '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_itype'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_edate'), '20170530')

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_edate'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_dur'), '5')

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_dur'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_cno'), '012345678')

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_cno'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_agcode'), '005367')

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/input_Sat_tb_agcode'), Keys.chord(Keys.TAB))

'click update with given all required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/button_Update'))

WebUI.delay(2)

'confirmation message " Updated Record Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_AsInfo_OB/button_LogOut'))

'Logout from BO Support  '
WebUI.takeScreenshot()

WebUI.closeBrowser()

