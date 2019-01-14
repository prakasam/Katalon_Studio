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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://uat4.myeg.com.my/BOSupport/login.zul')

not_run: WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_User_j_username'), 'prakasam')

not_run: WebUI.setEncryptedText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/button_Submit'))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/button_JPJ'))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/a_CDL'))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/a_CDLSupportAPP'))

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_ID Number    Merchant I'), 
    'merchant_id', true)

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_ID Number    Merchant I'), 
    'id_no', true)

not_run: WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_ID Number _idNo'), '123456789123')

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/img_Transaction Date _ui-datep'))

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_JanFebMarAprMayJunJulAu'), 
    '7', true)

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/a_1'))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_Transaction Date _btn_ch'))

not_run: WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_ID Number _idNo'), '851209145960')

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/img_Transaction Date _ui-datep'))

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_JanFebMarAprMayJunJulAu'), 
    '0', true)

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/a_2'))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_Transaction Date _btn_ch'))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/a_Edit..'))

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_Success    Failed    Pe'), 
    'S', true)

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_Success    Failed    Pe'), 
    'P', true)

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_Success    Failed    Pe'), 
    'F', true)

not_run: WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/textarea_Remarks_remarks'), 
    '')

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_Remarks_btn_update'))

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_ID Number    Merchant I'), 
    'merchant_id', true)

not_run: WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_Merchant Id _mrchId'), 
    'CRCL1801027810')

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/img_Transaction Date _ui-datep'))

not_run: WebUI.selectOptionByValue(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/select_JanFebMarAprMayJunJulAu'), 
    '0', true)

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/a_2'))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Support_App/input_Transaction Date _btn_ch'))

not_run: WebUI.closeBrowser()

