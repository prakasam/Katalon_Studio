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

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Submit with given Username and Password \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/button_Immigration'))

'Click Immigration main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/a_Maid'))

'Click Maid Sub Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/a_Backward Data'))

WebUI.delay(2)

'Select Backward Date Link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/input_MearchantId_tb_search'), 
    'OTH1710240840124700')

'Click Search with given Merchant id \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/button_Search'))

WebUI.delay(2)

'it will display message " transid not found in the im_transaction "'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/input_MearchantId_tb_search'), 
    'FIM19010482810')

'Click Search with given Merchant id \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/button_Search'))

WebUI.delay(2)

'it will display the available result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/BackWard_Data-OR/button_LogOut'))

WebUI.closeBrowser()

