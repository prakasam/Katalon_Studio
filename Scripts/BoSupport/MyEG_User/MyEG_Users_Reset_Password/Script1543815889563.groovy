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

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_LOGIN - BOSupport/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_LOGIN - BOSupport/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_LOGIN - BOSupport/button_Submit'))

'After Login Dashboard of Bo Support '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportHome/button_MYEG'))

'selected MyEg main heading '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportHome/a_MYEG Users'))

'selected MyEg Users sub heading '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportHome/a_Reset Password'))

'selected reset password menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/td_myeg_users'))

'selected myeg users from combo box '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/Page_SupportMyegUsers/td_UserName'))

'selected username from combo box 2 '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    'something')

'given username ( invalid) to search '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/button_Go'))

'display the info " No record Found " '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/td_myeg_users'))

'selected myeg users from combo box '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/Page_SupportMyegUsers/td_UserName'))

'selected username from combo box 2 '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    'summontest')

'given username to search '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/button_Go'))

'display the search result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/td_updatemyeg_users'))

'selected from combobox update_myeg_user '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/input_Please enter the UserNam'), 
    'summontest')

'given username and click go to update the password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/button_Go'))

WebUI.delay(3)

'it will display the opction to enter the password '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/input_Set Password_tb_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'given password and click Update '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/button_Update'))

'it will display the confirmation info " Updated Record Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/button_OK'))

'click ok \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Password_OB/Page_SupportMyegUsers/button_LogOut'))

'click Logout '
WebUI.takeScreenshot()

WebUI.closeBrowser()

