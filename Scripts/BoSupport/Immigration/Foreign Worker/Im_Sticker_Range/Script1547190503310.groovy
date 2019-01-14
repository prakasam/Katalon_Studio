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

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Submit with given Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_Submit'))

WebUI.delay(2)

'BO Support Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_Immigration'))

WebUI.delay(2)

'Click Immigration Link '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/a_Foreign Worker'))

not_run: WebUI.delay(2)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/a_im_stk_range'))

not_run: WebUI.delay(2)

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/Imm-StkRange.zul')

'navigate to immigration sticker range '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

'Click Combo Box to Choose the opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/td_Select'))

WebUI.delay(2)

'Click Select opction from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Sector_cb_sector'))

WebUI.delay(2)

'Click Combo Box for Sector Selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/td_PR'))

WebUI.delay(2)

'click Go with Selected PR from opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_Go'))

WebUI.delay(2)

'it will display the sticker range for PR '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/td_Select'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Sector_cb_sector'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/td_FW'))

WebUI.delay(2)

'click Go with Selected PR from opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_Go'))

WebUI.delay(2)

'it will display the sticker range for FW'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/td_Update'))

WebUI.delay(2)

'Click Update form Opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Sector_cb_sector'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/td_PR'))

WebUI.delay(2)

'Click GO with selected Sector as PR from Opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box sticket start , end and use flag '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Set useflag_tb_stkstart'), 
    'PD0890401')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Set useflag_tb_stkend'), 
    'PD2815000')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Set useflag_tb_useflag'), 
    'Y')

'click update with changed required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message" Record Updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/td_Update'))

WebUI.delay(2)

'Selected Update from Opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Sector_cb_sector'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/td_FW'))

'Click Go with Selection of FW Sector '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box sticket start , end and use flag '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Set useflag_tb_stkstart'), 
    'PD0889001')

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Set useflag_tb_stkend'), 
    'PD2815000')

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/input_Set useflag_tb_useflag'), 
    'Y')

'click update with changed required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message" Record Updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_OK'))

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Sticker_Range-OR/button_LogOut'))

'Logged out from BO support '
WebUI.takeScreenshot()

WebUI.closeBrowser()

