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

'Pasti Admin Login page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/button_Sign In'))

'Click Submit with out given Username and password '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/input_Error_username'), 'xcbfgnvgfnfhn')

'given Username '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/button_Sign In'))

'Click Submit with out given Username and with out password '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/input_Error_username'), 'fdsvfhvjhgj')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/input_Error_password'), 
    'o15fEe6vjwvpbXQUpPfQFw==')

'given wrong  Username and  password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/button_Sign In'))

'Click Submit with out given wrong Username and password '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/input_Error_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/input_Error_password'), 
    'Omr+k6VmOLnhHCAVXDZBzQeDIuS6Aunn')

' given valid Username and wrong password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/button_Sign In'))

'Click Submit with out given valid Username and wrong password '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/input_Error_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/input_Error_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'given valid Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/button_Sign In'))

'Pasti Admin Dash Board'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/a_Status Update'))

'Selected Status Update menu (it was default page ) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/a_'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/a_5'))

'selected fith list from pagination vehicle list '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/input_Status Update_form-contr'), 
    'qatest')

'Search required vehicle no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/a_03)QATEST (Anonymous  )'))

'Selected searched vehicle no info on map '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Login_OB/Page_PASTI by MyEG/a_Logout'))

'logout from user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

