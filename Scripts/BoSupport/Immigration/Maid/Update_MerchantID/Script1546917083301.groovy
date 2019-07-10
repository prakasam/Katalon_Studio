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

'BO Support Login Page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Submit with given Username and Password \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/button_Submit'))

'BO Support Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/button_Immigration'))

'Click Immigration main Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/a_Maid'))

'Click maid Sub Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/a_Update Merchant Id'))

WebUI.delay(2)

'Select Update merchan id link \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_Select the Query _cb_mer'))

WebUI.delay(2)

'Select the Combo box to choose opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/td_Select'))

WebUI.delay(2)

'Clicked Select opction from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_Transaction Id _tb_trans'), 
    'nodata')

WebUI.delay(2)

'click Go with Given transaction id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/button_Go'))

WebUI.delay(2)

'it will display the message " record not found " '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_Select the Query _cb_mer'))

WebUI.delay(2)

'Select the Combo box to choose opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/td_Select'))

WebUI.delay(2)

'Clicked Select opction from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_Transaction Id _tb_trans'), 
    'FW3704209')

WebUI.delay(2)

'click Go with Given transaction id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/button_Go'))

WebUI.delay(2)

'it will display the available result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_Select the Query _cb_mer'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/td_Update'))

'click update opction from list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_Transaction Id _tb_trans'), 
    'FW3704209')

'click go with given transaction id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/button_Go'))

WebUI.delay(2)

'it will display the merchant id in text box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/input_Set Merchant_id_tb_merch'), 
    'OTH1903061201096549')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'click update with given merchant id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Record Updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Update_MerchantID-OR/button_LogOut'))

'Logged out from User '
WebUI.takeScreenshot()

WebUI.closeBrowser()

