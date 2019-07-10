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

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/login.zul')

WebUI.maximizeWindow()

'Bo Support login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click submit with given User ID and Password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Submit'))

'Bo Support Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Kiosk'))

'Click Kiosh Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/a_Road Tax'))

'Click Roadtax Sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/a_tb_roadtax_reportlogin'))

'selected roadtax report login '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/a_Create User'))

'selected Create user link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input__tb_username'), 
    'prakasam')

'given existing Username '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input__tb_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Record already existed'), 
    'prakasam123')

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input__cb_category'))

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/td_ACCOUNT'))

'given required details '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input__dt_date'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input__dt_date'), '2018-12-21 12:58:17')

'given date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input__tb_agcode'), 
    'A123456')

'click submit with given all required details '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input__tb_agcode'), Keys.chord(Keys.TAB, 
        Keys.ENTER))

not_run: WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Submit'))

'it will created the new user in backend .'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Kiosk'))

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/a_Road Tax'))

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/a_tb_roadtax_reportlogin'))

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/a_Update AG CodeUsername  Pass'))

'selected update AG Code and Username link '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Select the Query_cb_agco'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/td_Selecttb_roadtax_reportlogi'))

'choosen from combo box select roadtax report login details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Please enter the UserNam'), 
    'fvxfdbfbdsdf')

'given username as invalid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Go'))

WebUI.delay(2)

'it will display the message " user not available " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Select the Query_cb_agco'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/td_Selecttb_roadtax_reportlogi'))

'choosen from combo box select roadtax report login details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Please enter the UserNam'), 
    'pakasam')

'click go buttion with given valid username '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Go'))

WebUI.delay(2)

'it will display the user details  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Select the Query_cb_agco'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/td_UpdateAgcode'))

'choosen from combo box Update Agcode  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Please enter the UserNam'), 
    'prakasam')

'click go buttion with given valid username '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Go'))

WebUI.delay(2)

'it will display the text box to change AG Code '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Set Ag Code_tb_agcode'), 
    'A014311')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'Click Update with given  AG Code '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Select the Query_cb_agco'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/td_UpdatePassword'))

'choosen from combo box Update Password'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Please enter the UserNam'), 
    'prakasam')

'click go buttion with given valid username '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Go'))

WebUI.delay(2)

'it will display the text box to change the password'
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Set Password_tb_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'Click Update with given password'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Select the Query_cb_agco'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/td_UpdateUsername'))

'choosen from combo box Update Username '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input_Please enter the UserNam'), 
    'prakasam')

'click go buttion with given valid username '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Go'))

WebUI.delay(2)

'it will display the text box to change the username '
WebUI.takeScreenshot()

'will re do later '
WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/input__tb_name'), 'prakasam', FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Report_Login-OR/button_LogOut'))

'logout from user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

