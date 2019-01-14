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

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_LOGIN - BOSupport/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_LOGIN - BOSupport/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click submit with given Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_LOGIN - BOSupport/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_SupportHome/button_JPJ'))

'select JPJ Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_SupportHome/a_CDL'))

'Select CDL Sub Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_SupportHome/a_tb_cdl_licenseinfo'))

'click CDL Licence info link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Select the Query_cb_lice'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_merchant_tx_id'))

WebUI.delay(2)

'Click merchant id from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/textarea_Please enter the merc'), 
    '')

'click go with out given merchant id  information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Go'), FailureHandling.OPTIONAL)

WebUI.delay(2)

'it will display message "Please fill up this field "'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Select the Query_cb_lice'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_merchant_tx_id'))

WebUI.delay(2)

'Click merchant id from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/textarea_Please enter the merc'), 
    'dvbshdjvbshjfvc')

'click go with given merchant id (Invalid)  information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Go'))

WebUI.delay(2)

'it will display message "record Not available "'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Select the Query_cb_lice'))

'click combobox to choose the opction required '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_merchant_tx_id'))

WebUI.delay(2)

'Click merchant id from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/textarea_Please enter the merc'), 
    'CRCL1805274254,CRCL1805274253,CRCL1805274252,CRCL1805274251')

'click go with given merchant id information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Go'))

WebUI.delay(2)

'it will display the available merchant id information '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Select the Query_cb_lice'))

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_id_no'))

'Choosen ID No from list '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/textarea_Please enter the Id_N'), 
    '789456237894,7894565641514')

'click Go with given ID No information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Go'))

WebUI.delay(2)

'it will display the result . '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Select the Query_cb_lice'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_UpdateAllByid_noandreq_date'))

'clicked update all by NRIC and req_date from combobox '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Please enter the Id_No_t'), 
    '7894565641514')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_req_date_tb_reqdate'), 
    '2018-05-24 18:17:08+08')

'click Go with given NRIC and Request date \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Go'))

WebUI.delay(2)

'it will display the all information with text box opction to change '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_merchant_transid_tb_mid'), 
    'MC1805240144')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_name_1_tb_nam1'), 
    'Kajesh Kamma edit')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_name_2_tb_nam2'), 
    ' edit')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_name_3_tb_nam3'), 
    ' edit')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_duration_tb_dur'), 
    '2')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_license_class_tb_lclass'), 
    'E')

'click Update with given required information to change '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Update'))

WebUI.delay(2)

'confirmation message " Updated Record Successfully "  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Select the Query_cb_lice'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_UpdateByreq_id'))

'Chooseen Update BY Request ID opction from Combo Box '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Please enter the req_id_'), 
    '3MYCDL201805241817085851')

'Click GO with Given Request ID information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Go'))

WebUI.delay(2)

'it will display the result in text box to change the value '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_code_tb_scode1'), '01')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_msg_tb_smsg1'), 'Success')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_msg_tb_name1'), 'kajesh kamma edit')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_msg_tb_tb_effdate1'), 
    '2018-11-08')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_msg_tb_tb_tb_expdate1'), 
    '2018-12-08')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_msg_tb_tb_tb_jpjrcode1'), 
    '111111111')

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_msg_tb_tb_tb_jpjrcode1'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_msg_tb_tb_tb_jrcode1'), 
    '222222222')

'click Update with Given Required information '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_status_msg_tb_tb_tb_jrcode1'), 
    Keys.chord(Keys.TAB, Keys.ENTER))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Record Successfully Updated " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Select the Query_cb_lice'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_Resetprintflag'))

'Choosen opction Reset print flag from combo box  '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Please enter the Id_No_t'), 
    '852963787412')

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_req_date_tb_reqdate'), 
    '2018-05-27 19:32:18.469+08')

'click Go with given required information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Go'))

WebUI.delay(2)

'it will display Print flag in text box to update it '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_printflag_tb_flag'), 
    'N')

'click update with given required information '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_printflag_tb_flag'), Keys.chord(
        Keys.TAB, Keys.ENTER))

not_run: WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Update'))

'it will display the confirmation message " Record Successfully Updated " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_OK'))

WebUI.delay(0)

'click Ok from confirmation info screen '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_Select the Query_cb_lice'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_LicenseInfoReport'))

'choosen licence info report from combo box opctions '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_From_db_reqdate1'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_From_db_reqdate1'), '2018-05-01 15:33:47')

'given from date '
WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_To_db_reqdate2'), 
    3)

WebUI.focus(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_To_db_reqdate2'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/input_To_db_reqdate2'), '2018-05-30 15:33:47')

'click Go given required info (to date) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/button_Go'))

WebUI.delay(2)

'it will display the avalilable records with given date range '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_Support  CDL/td_Excel Report'), 
    FailureHandling.OPTIONAL)

'click Ecport Report button to download it '
WebUI.takeScreenshot()

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BO_Support-OR/JPJ-OR/CDL/CDL_Licence_info_OB/Page_SupportHome/button_LogOut'))

'Click logout '
WebUI.takeScreenshot()

WebUI.closeBrowser()

