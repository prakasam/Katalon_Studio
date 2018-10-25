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

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MyEG/button_Sign In'))

'pasti admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MyEG/a_Account Management'))

'click account management menu'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MyEG/a_User Account List'))

'Account list page ( click User Account List sub menu) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MYEG/a_5'))

'selected fifth page using pagination '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MYEG/select_102550100'), 
    '25', true)

'selected list of accounts from 10 to 25 from drop down \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MYEG/input_All Users given access t'), 
    '505639-K')

'search required user '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MYEG/a_Edit'))

'select edit the user '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MYEG/input_Password _password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MYEG/button_Update'))

'updated user successfully with given password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Account_Management_OB/Page_PASTI by MYEG/a_Logout'))

'logout from account '
WebUI.takeScreenshot()

WebUI.closeBrowser()

