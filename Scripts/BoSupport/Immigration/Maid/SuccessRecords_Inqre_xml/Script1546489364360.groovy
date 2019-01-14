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

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_Submit'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_Immigration'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/a_Maid'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/a_SuccessRecords-inqresxml'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/td_SelectSuccessRecordsList'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_StartDate_db_start'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_StartDate_db_start'), '2018-12-01')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_EndDate_db_end'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_EndDate_db_end'), '2018-12-31')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_Go'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/td_Excel Report'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/td_Selectim_inqresxml'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Passport No_tb_passport'), 
    'M5433222')

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_Go'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/td_Updateupdate_count'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Passport No_tb_passport'), 
    'M5433222')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Id_tb_id'), 
    '3MIMM201812201213551576')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_Go'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_SupportImmigration/input_Set update_count_pY9Qqd'), '1', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_Update'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/td_UpadateAll'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Passport No_tb_passport'), 
    'M5433222')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_Id_tb_id'), 
    '3MIMM201812201213551576')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_Go'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_nornw_tb_state'), 
    '010')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_nornw_tb_status'), 
    'PENDINGAS')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_nornw_tb_updcount'), 
    '2')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/input_nornw_tb_nornw'), 
    '1')

WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_Update'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Successfull_Inquir_xml-OR/button_LogOut'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

