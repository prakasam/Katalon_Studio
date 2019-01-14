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

WebUI.navigateToUrl('http://192.168.121.37/auth/login')

WebUI.maximizeWindow()

'Pasti Business User Login Page '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/div_Login'))

WebUI.doubleClick(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/button_Sign In'))

'click sign in button with out given username and password '
WebUI.takeScreenshot()

WebUI.verifyTextPresent('The username field is required.', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('The password field is required.', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/input_Login_username'), 
    'wrong')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/button_Sign In'))

'click sign in button with out given username and with out password '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/input_Login_password'), 
    'o6CDTymj93o=')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/button_Sign In'))

WebUI.delay(2)

not_run: WebUI.verifyTextPresent('These credentials do not match our records.', true, FailureHandling.CONTINUE_ON_FAILURE)

'click sign in button with given username and password as in valid'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/input_Login_username'), 
    '45586-T')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/input_Login_password'), 
    'aeHFOx8jV/A=')

' given username and password as valid'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/button_Sign In'))

WebUI.delay(5)

'Pasti Business User Dash Board ( click sign in button with given username and password as valid)'
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/div_Hi MYEG Services'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/div_Hi'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/pasti_login_OB/Page_Pasti by MyEG/a_Logout'))

'Logout from User '
WebUI.takeScreenshot()

WebUI.navigateToUrl('http://192.168.121.37/auth/logout')

WebUI.delay(2)

'Login page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/a_Forgot password'))

'click forgot password link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Submit'))

'click submit with out given username '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Reset Password_username'), 
    '$%#^&%*#@^()')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Submit'))

WebUI.delay(2)

'click submit with given username special characters '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Reset Password_username'), 
    'qatest')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Submit'))

WebUI.delay(2)

'click submit with given username invalid'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Reset Password_username'), 
    '505639-K')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Submit'))

WebUI.delay(6)

'click submit with given username valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/a_Already have account'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'login page (click already have an account link)'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/pasti_login/Page_Pasti by MyEG/Page_Pasti by MyEG/img_Forgot password_img-respon'))

'click get an google play image link '
WebUI.takeScreenshot()

WebUI.closeBrowser()

