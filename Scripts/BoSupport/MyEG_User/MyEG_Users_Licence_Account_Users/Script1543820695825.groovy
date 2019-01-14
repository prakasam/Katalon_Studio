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

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_LOGIN - BOSupport/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_LOGIN - BOSupport/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_LOGIN - BOSupport/button_Submit'))

'After Login Dashboard of Bo Support '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportHome/button_MYEG'))

'click MyEG Main Heading '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportHome/a_MYEG Users'))

'click MyEG_Users sub Heading '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportHome/a_License Account User - Read'))

'click Licence Account Users Read-Flag sub Heading , it will open Licence Account Users page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/Page_SupportLicenseAcctUsers/input_Select the Query_cb_lice'))

'click combo box to select licence_acc_users opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/td_license_acct_users'))

WebUI.delay(3)

'selected  licence_acc_users opction '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/Page_SupportLicenseAcctUsers/input_Please enter the UserNam'), 
    'pmeifen')

'given username to search info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/button_Go'))

WebUI.delay(2)

'when click go it will display the search result ( result found )'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/Page_SupportLicenseAcctUsers/input_Select the Query_cb_lice'))

'click combo box to select licence_acc_users opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/td_license_acct_users'))

WebUI.delay(3)

'selected  licence_acc_users opction '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/Page_SupportLicenseAcctUsers/input_Please enter the UserNam'), 
    'sample')

'given username to search info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/button_Go'))

WebUI.delay(2)

'when click go it will display the search result ( no result found) '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/Page_SupportLicenseAcctUsers/input_Select the Query_cb_lice'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/td_updatelicense_acct_users'))

'click combo box to select update_licence_acc_users opction '
WebUI.takeScreenshot()

WebUI.delay(3)

'click go with given username ( valid) '
WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/input_Please enter the UserNam'), 
    'pmeifen')

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/button_Go'))

'it will display the info to change the Y-Yes or N - No Combo Box to update '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/Page_SupportLicenseAcctUsers/td_YN'))

'click combo box it will give opction to choose '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/td_Y'))

WebUI.delay(2)

'select Y and udate it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/button_Update'))

'it will display the confirmation message \'updated record Successfully '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/button_OK'))

'click ok \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_License_Acc_Users_Reset_Status/Page_SupportLicenseAcctUsers/button_LogOut'))

'logout from users '
WebUI.takeScreenshot()

WebUI.closeBrowser()

