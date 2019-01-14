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

'BO_Support  login page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/button_Submit'))

'click submit with out given username and password . it will display message "bad credentials "'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/input_User_j_username'), 
    'prakasam')

'click submit with given username '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/button_Submit'))

'click submit with given username only . it will display message "bad credentials "'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/input_Password_j_password'), 
    'bXXKCTKg5yobv+BGum3jcQ==')

'click submit with given username and wrong password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/button_Submit'))

' it will display message "bad credentials "'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Given Username and password Valid \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_LOGIN - BOSupport/button_Submit'))

'After Login Dashboard of Bo Support '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportHome/button_MYEG'))

'click MyEG Main Heading '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportHome/a_MYEG Users'))

'Click Myeg Users Sub Heading \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportHome/a_Reset Status'))

'selected reset status menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select the Query_cb_user'))

'click combo box for myeg users'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_myeg_users'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'selected myeg users '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_UserName'))

'selected username from combo box 2'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    'something')

'given username( invalid) and click go for search '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Go'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'it will display message "no record found "'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select the Query_cb_user'))

'click combo box for myeg users'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_myeg_users'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'selected myeg users '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_UserName'))

'selected username from combo box 2'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    'summontest')

'given username and click go for search '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Go'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'it will display found the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_myeg_users'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/td_Email'))

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    'skumar.sasaie@myeg.com.my')

'click Go with selected Email and given email info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Go'))

WebUI.delay(2)

'it will display found the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_myeg_users'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/td_NRICPolice'))

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    '340908025111')

'click Go with selected NRIC/Police  and given NRIC info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Go'))

WebUI.delay(2)

'it will display found the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_myeg_users'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/td_PassportNo'))

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    'A123456')

'click Go with selected passport  and given passport info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Go'))

WebUI.delay(2)

'it will display found the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_myeg_users'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/td_CompanyReg.No'))

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    '112233-A')

'click Go with selected Company Registration No and given Company Registration No info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Go'))

WebUI.delay(2)

'it will display found the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_myeg_users'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select _cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/td_CompanyName'))

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_CompanyName_tb_search'), 
    'uat4comp')

'click Go with selected Company Name and given Company Name info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Go'))

WebUI.delay(2)

'it will display found the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/SPY/Page_SupportMyegUsers/input_Select the Query_cb_user'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/td_updatemyeg_users'))

WebUI.delay(3)

'Selected Update_Myeg_Users from combobox '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_Please enter the UserNam'), 
    'summontest')

'click GO with Given Username to update the status '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Go'))

'it will display text box to enter the status Active or Inactive or Suspended '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/input_Set Status_flag_tb_statu'), 
    'A')

'click Update with Given info as A meance Active '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_Update'))

'it will Display the confirmation message " Updated Record Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/MyEG Users-OR/MyEG_Users_Reset_Status_OB/Page_SupportMyegUsers/button_OK'))

'click ok button '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/j_spring_security_logout')

not_run: WebUI.click(findTestObject('BO_Support-OR/MyEG_Users_Reset_Status_OB/Page_SupportLicenseAcctUsers/button_LogOut'))

'click logout '
WebUI.takeScreenshot()

WebUI.closeBrowser()

