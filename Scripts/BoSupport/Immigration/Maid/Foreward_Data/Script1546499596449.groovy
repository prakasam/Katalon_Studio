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

'BO Support Login page'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click submit with given Username and Password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/button_Immigration'))

'Click Immigration main menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/a_Maid'))

'Click Maid Sub menu \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/a_Forward Data'))

WebUI.delay(2)

'select Foreword Data Link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Foreward Data/input_Select_cb_select'))

WebUI.delay(2)

'Click Drop Down to choose opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/td_PassportNo'))

WebUI.delay(2)

'Selected Passport opctions from combo box \r\n '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/input_Email_tb_search'), 'no data')

'Click Search with given Passport Number '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/button_Search'))

WebUI.delay(2)

'it will display the message " transid not found in the im_transaction "  '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Foreward Data/input_Select_cb_select'))

WebUI.delay(2)

'Click Drop Down to choose opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/td_PassportNo'))

WebUI.delay(2)

'Selected Passport opctions from combo box \r\n '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/input_Email_tb_search'), 'AT904290')

'Click Search with given Passport Number '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/button_Search'))

WebUI.delay(2)

'it will display the available result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Foreward Data/input_Select_cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/td_EmployerId'))

WebUI.delay(2)

'Selected Employer id from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/input_Email_tb_search'), '980807-33-3121')

'click Search with given Employer id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/button_Search'))

WebUI.delay(2)

'it will display the available result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Foreward Data/input_Select_cb_select'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/td_Email'))

WebUI.delay(2)

'Select email from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/input_Email_tb_search'), 'lky106@gmail.com')

'Click Search with given Email '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/button_Search'))

WebUI.delay(2)

'it will display the available result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Foreward Data/button_LogOut'))

'Logout From User '
WebUI.takeScreenshot()

WebUI.closeBrowser()

