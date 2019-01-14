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

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/button_Sign In'))

'pasti admin dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_Account Management'))

'click account management '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_User Account List'))

'User account page ( click user account list )'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_New MyEG AdminOps Accou'))

'click new myeg admin/operation account button'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register button with out given values '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Username _userName'), 
    'a')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register button with given username as single character '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'IoSAFDrw05c=')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register button with given username ,password as single character '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/select_Choose Role'), 
    'MYEG ADMIN', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register button with given username ,password as single character and selected roal as myeg admin from drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Username _userName'), 
    '@&($%&@#%&')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/select_Choose Role'), 
    'MYEG ADMIN', true)

'click register button with given username as special character \r\n'
WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Register Login'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Username _userName'), 
    'donation')

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/select_Choose Role'), 
    'MYEG ADMIN', true)

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'HwXnxaZD17M=')

'click register button with given password lessthan 8 characters '
WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Register Login'))

WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/select_Choose Role'), 
    'MYEG ADMIN', true)

'given valid details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'new myeg user created successfully '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_Account Management'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_User Account List'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_All Users given access t'), 
    'donation')

'search for required user '
WebUI.takeScreenshot()

WebUI.doubleClick(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/a_Edit'))

'edit the required user '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update with out given details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'a')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update with out given email ass single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'abc')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update with out given email ass character only \r\n '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'abc@svb.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update with out given email ass valid'
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/input_Password _password'), 
    'HeCM15nHKBI=')

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/input_Email(Password Reset) _e'), 
    'abc@svu.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Update'))

'given password as lessthan 8 characters '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/input_Password _password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/input_Email(Password Reset) _e'), 
    'abc@svu.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update with out given valid password andemail'
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_Account Management'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_User Account List'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_All Users given access t'), 
    'donation')

'select required user to delete '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/a_Delete'))

'click delete link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/button_Confirm'))

'user successfully deleted ( click delete confirmation ) '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_Account Management'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_User Account List'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MYEG/input_All Users given access t'), 
    'donation')

'verifying deleted user '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_Add_OB/Page_PASTI by MyEG/a_Logout'))

'log out from admin user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

