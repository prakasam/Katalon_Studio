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

'BO Support Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click Submit with given Username and password'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Submit'))

'BO Support Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Immigration'))

'Click Immigration Main Menu '
WebUI.takeScreenshot()

WebUI.delay(2)

not_run: WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/a_Foreign Worker'))

'Click Foreign worker Sub Menu '
not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/a_im_inqresxml'))

'Select im_inquiry res xml link '
not_run: WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/Imm-Inqresxml.zul')

WebUI.delay(2)

'navigate to inquery responce xml page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

'Choose Combo Box to select opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/td_ByPassportNo'))

WebUI.delay(2)

'Selected passport no opction '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Passport No_tb_passport'), 
    'JH0151093')

'Click Go with given passport no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/td_Bydate'))

WebUI.delay(2)

'select by date opction '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_CreatedDate_db_start'), 
    '2017-12-27')

'click go with given date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/td_Selectid'))

WebUI.delay(2)

'select id from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Passport No_tb_passport'), 
    '3MIMT120171227165600')

'click go with given passwort no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Go'))

WebUI.delay(2)

'it will display the info " record not found " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_OK'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Passport No_tb_passport'), 
    'JH0151093')

'click go with given valid passport '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Go'))

WebUI.delay(2)

'it will display the Id numbers '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/td_Updateprint_status'))

WebUI.delay(2)

'select update print status from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Passport No_tb_passport'), 
    'JH0151093')

'click go with given passport no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Go'))

WebUI.delay(2)

'it will display the result "record not found"'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_OK'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Passport No_tb_passport'), 
    'AU242338_')

'click go with given valid passport no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box to change the status '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/input_Set print_status_tb_stat'), 
    'SUCCESS')

'click Update with given status '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " record updated successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Inquiry_XML-OR/button_LogOut'))

'Logged out from User '
WebUI.takeScreenshot()

WebUI.closeBrowser()

