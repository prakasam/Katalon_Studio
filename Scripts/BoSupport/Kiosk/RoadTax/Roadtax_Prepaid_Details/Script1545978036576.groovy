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

'BO Support Login Page \t '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click submit with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Kiosk'))

'Click Kiosk Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/a_Road Tax'))

'Click Road Tax Sub Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/a_PrepaidDetails'))

WebUI.delay(2)

'Click Prepaid Details link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Select the Query_cb_tran'))

WebUI.delay(2)

'click check box to choose the opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/td_kioskuser_transByAccNo'))

WebUI.delay(2)

'Select Kiosk User trans by account number from  opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Please enter the Account'), 
    '8069238921')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_From _db_from'), 
    '2016-10-01')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_To _db_to'), '2016-10-31')

'click go with given account number ,from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Select the Query_cb_tran'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/td_kioskuser_transByTransID'))

WebUI.delay(2)

'selected kiosk user transaction  by trans ID from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Please enter the TransID'), 
    '600311106339')

'click go with given transaction ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Go'))

WebUI.delay(5)

'it will displaay the available result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Select the Query_cb_tran'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/td_Updatekioskuser_transAccoun'))

WebUI.delay(2)

'select Kiosk user transaction account from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Please enter the TransID'), 
    '600311106339')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Balance_tb_balance'), 
    '3628')

'click go with given transid and balance '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Go'))

WebUI.delay(2)

'it will display the account no in text box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Set AccNo_tb_acct'), 
    '8069238921')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'click update with given account no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Update'))

WebUI.delay(5)

'it will displaay the confirmation message " record updated successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Select the Query_cb_tran'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/td_Updatetransactionbalance'))

WebUI.delay(2)

'select Update traansaction balance from opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Please enter the TransID'), '600311106339')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Account NO _tb_accno'), 
    '8069238921')

'Click go with given transid and account no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box transaction date set balnce and set pre balance '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Set prevbal_vIGMe8-real'), 
    '2016-10-14 12:13:01', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Sat_vIGMf8'), '3628.04', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Sat_vIGMg8'), '3727.32', 
    FailureHandling.OPTIONAL)

'click update with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message record updated successfully '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Select the Query_cb_tran'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/td_roadtax_inquiryinfo'))

WebUI.delay(2)

'select roadtax inquiry from opctions\t'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_Please enter the ICNO _t'), 
    '911024035695')

WebUI.setText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/input_From _db_trans'), '2018-12-28')

'click go with given ic number and transaction date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Prepaid_Details-OR/button_LogOut'))

WebUI.closeBrowser()

