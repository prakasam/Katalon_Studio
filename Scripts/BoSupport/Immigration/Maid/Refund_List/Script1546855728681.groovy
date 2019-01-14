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

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Submit with Given Username and Password \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/button_Submit'))

'BO Support Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/button_Immigration'))

'Click Immigration main menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/a_Maid'))

'Click Maid Sub Menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/a_Refund List'))

'Select Refund List Link '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/input_Please Enter the Merchan'), 
    'OTH17102408401')

'click search with given merchant id \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/button_Go'))

WebUI.delay(2)

'it will display message " Record Not Found " '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/input_Please Enter the Merchan'), 
    'OTH1710240840124700')

'click search with given merchant id \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Refund_List-OR/button_LogOut'))

'Logged out  from User '
WebUI.takeScreenshot()

WebUI.closeBrowser()

