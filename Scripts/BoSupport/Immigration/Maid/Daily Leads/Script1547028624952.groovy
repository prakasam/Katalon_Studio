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

'BO Support Login Screen '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click Submit with Given Username and Password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/button_Immigration'))

'Click Immigration main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Maid'))

'Click Maid Sub Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Daily Leads'))

'Select Daily Leads main Link '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Maid_1'))

WebUI.delay(2)

'Select Maid Sub Link '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_Start Date _db_start'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_Start Date _db_start'), '2018-06-01')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_End Date _db_end'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_End Date _db_end'), '2018-06-30')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/td_Go'))

WebUI.delay(2)

WebUI.takeScreenshot()

'It will display the result for given dates '
WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/button_Immigration'))

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Maid'))

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Daily Leads'))

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Foreign Worker'))

'Selected Foreign Worker '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_Start Date _db_start'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_Start Date _db_start'), '01-06-2019')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_End Date _db_end'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_End Date _db_end'), '10-01-2019')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/td_Go'))

WebUI.delay(2)

'it will display the info please check date range \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/button_Immigration'))

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Maid'))

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Daily Leads'))

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/a_Foreign Worker'))

WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_Start Date _db_start'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_Start Date _db_start'), '01-06-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_End Date _db_end'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/input_End Date _db_end'), '30-06-2018')

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/td_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Maid/Daily_Leads-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Maid/Daily_Leads-OR/button_LogOut'))

'Logout from user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

