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

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_Password_j_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

'click Submit with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_Submit'))

WebUI.delay(2)

'it will Display the BO Support DashBoard \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_eVoucher'))

WebUI.delay(2)

'Click E voucher main menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/a_Update eVoucher'))

WebUI.delay(2)

'Click Update evouche Sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/EVoucher-OR/input_Select the Query_cb_EvcUpdate'))

WebUI.delay(2)

'Click Combo box to choose opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/td_selectVoucherID'))

WebUI.delay(2)

'click select voucher ID opction from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_Voucher Id_tb_idno'), 'evoucher')

'Click Go with given Voucher ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_Go'))

WebUI.delay(2)

'it will display info " Record not found " '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/EVoucher-OR/input_Select the Query_cb_EvcUpdate'))

WebUI.delay(2)

'Click Combo box to choose opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/td_selectVoucherID'))

WebUI.delay(2)

'click select voucher ID opction from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_Voucher Id_tb_idno'), 'VFREE31031501000089')

'Click Go with given Voucher ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_Go'))

WebUI.delay(2)

'it will display the available voucher info '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/EVoucher-OR/input_Select the Query_cb_EvcUpdate'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/td_selectEmailID'))

WebUI.delay(2)

'Click Email ID from opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_owner_email_tb_email'), 'test1234@test.com')

'Click Go with given Email ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/EVoucher-OR/input_Select the Query_cb_EvcUpdate'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/td_updateevh_voucherinfo'))

WebUI.delay(2)

'Click update voucher info from opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_Voucher Id_tb_idno'), 'VFREE31031501000089')

'Click Go with given voucher id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_Go'))

WebUI.delay(2)

'it will display the voucher info in text box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_owner_email_tb_isusd'), 'Y')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_owner_email_tb_rmrks'), 'Updating')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_owner_email_tb_start'), '100.00')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_owner_email_tb_end'), '100.00')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/input_owner_email_tb_ownermail'), 'ravikrishna6291@gmail.com')

'Click update with given all required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Record Updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/EVoucher-OR/button_LogOut'))

'Logged out from browser '
WebUI.takeScreenshot()

WebUI.closeBrowser()

