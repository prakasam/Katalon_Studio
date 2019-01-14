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

'BO Support Home Page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Submit with given Username and Password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_Immigration'))

'Click Immigration Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/a_Maid'))

'Click Maid Sub menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/a_im_rescustomerinfo'))

WebUI.delay(2)

'select im customer info link . '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Select_cb_rescust'))

WebUI.delay(2)

'click combo box to choose opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/td_Selectim_rescustomerinfo'))

WebUI.delay(2)

'Selected res customer info from opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_UpdateAddress_cb_select'))

WebUI.delay(2)

'click combo box to select opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/td_PassportNo'))

WebUI.delay(2)

'selected passport no opction '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Email_tb_search'), 'OG98764')

'Given Passport no '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Email_db_trans'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Email_db_trans'), '2019-01-04')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_Search'))

WebUI.delay(2)

'it will display the result based on the search '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Select_cb_rescust'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/td_Selectim_rescustomerinfo'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_UpdateAddress_cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/td_EmployerId'))

WebUI.delay(2)

'Selected Employer ID From opctions '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_UpdateAddress_cb_select'), Keys.chord(
        Keys.TAB, '840728146527'))

not_run: WebUI.setText(findTestObject('Page_SupportImmigration/input_Email_tb_search'), '840728146527')

'Given Employer ID '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Email_db_trans'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Email_db_trans'), '2019-01-04')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_Search'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Select_cb_rescust'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/td_Selectim_rescustomerinfo'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_UpdateAddress_cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/td_Email'))

WebUI.delay(2)

'select email from opctions '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_UpdateAddress_cb_select'), Keys.chord(
        Keys.TAB, 'csyoong0728@gmail.com'))

not_run: WebUI.setText(findTestObject('Page_SupportImmigration/input_Email_tb_search'), 'csyoong0728@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

'given email address '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Email_db_trans'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Email_db_trans'), '2018-12-27')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_Search'))

WebUI.delay(2)

'it will display the available result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Select_cb_rescust'))

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/td_UpdateAddress'))

WebUI.delay(2)

'select update address from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_PassportNo_tb_passportno'), 'BL047263')

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_ID_tb_Id'), '3MIMM201812211124505871')

'click search with given passport no and ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_Search'))

WebUI.delay(2)

'it will deplay the result in text box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Set houseno_tb_address'), 'Level 12')

WebUI.sendKeys(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Set houseno_tb_address'), Keys.chord(
        Keys.TAB, 'MyEG Services Berhad ,'))

not_run: WebUI.setText(findTestObject('Page_SupportImmigration/input_Set houseno_tb_address2'), 'MyEG Services Berhad ,', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Set houseno_tb_address3'), 'Tower : N , Empirecity')

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Set houseno_tb_postcode'), '47820')

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Set houseno_tb_town'), 'Petaling Jaya')

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/input_Set houseno_tb_statecode'), '100010')

'Given all required address changes'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Record updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Res_Customer_Info-OR/button_LogOut'))

'Logout from account '
WebUI.takeScreenshot()

WebUI.closeBrowser()

