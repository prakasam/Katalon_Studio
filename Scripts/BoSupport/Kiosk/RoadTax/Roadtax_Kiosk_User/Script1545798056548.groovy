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

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click submit with given Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Submit'))

'BO Support Home Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Kiosk'))

'Click Kiosk Main Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/a_Road Tax'))

'Click Roadtax Sub Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/a_tb_roadtax_kioskusers'))

'Click Roadtax kiosk Users main link \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/a_Update FeeBalanceUseFlag  Pa'))

'click Update Fee , Balance ,flag link \r\n'
WebUI.takeScreenshot()

WebUI.delay(2)

'it will open the reoatax kiosk users page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Select the Query_cb_user'))

WebUI.delay(2)

'click combo box to choose the opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/td_Select'))

WebUI.delay(2)

'clicked Select opction from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Please enter the UserNam'), 'invalid')

'click go with given User name \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Go'))

WebUI.delay(2)

'it will display message " record not found " '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Select the Query_cb_user'))

WebUI.delay(2)

'click combo box to choose the opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/td_Select'))

WebUI.delay(2)

'clicked Select opction from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Please enter the UserNam'), '1441')

'click go with given User name \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Go'))

WebUI.delay(2)

'it will display the search result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/td_UpdateFee'))

WebUI.delay(2)

'Click Update Fee from Combo Box opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Please enter the UserNam'), '1441')

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Go'))

WebUI.delay(2)

'click go with given Username '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Set Balance_upduser_fee'), '2.75', 
    FailureHandling.OPTIONAL)

'click Update button with given required Fee amount '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Updated Record Succesfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/td_UpdateBalance'))

WebUI.delay(2)

'click update balance from combo box opctions \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Please enter the UserNam'), '1441')

'click go with given username \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Go'))

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_upduser_balance'), '5000', FailureHandling.STOP_ON_FAILURE)

'click update with given the required balance '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Updated Record Succesfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_OK'))

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/td_UpdatePassword'))

WebUI.delay(2)

'click update password from combo box opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Please enter the UserNam'), '1441')

'click Go woth given Username '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Go'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Set Password_tb_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click update with given required password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Updated Record Succesfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/td_UpdateUseFlag'))

WebUI.delay(2)

'click update user flag from combo box opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_Please enter the UserNam'), '1441')

'click go with given user name \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Go'))

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/input_account Number_tb_usefla'), 'Y')

'click Update with given user flag value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Updated Record Succesfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_User_OR/button_LogOut'))

'Logout from Bo Support '
WebUI.takeScreenshot()

WebUI.closeBrowser()

