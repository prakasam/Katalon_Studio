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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

'navigated to payme login page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/button_Sign in'))

'Clicked sign in with out given username or password '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Remember me_username'), 
    'wrong')

'Click sign in with out given username only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/button_Sign in'))

'application did not allowed to login '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Remember me_username'), 
    'wrongone')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click sign in with given wrong username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/button_Sign in'))

'it will display message info " Login Faild " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Remember me_username'), 
    'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click sign in with given wrong username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Remember me_remember'), 
    FailureHandling.OPTIONAL)

'Selected Remember me Check Box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/button_Sign in'))

'log in successfull and navigate to dash board of payme '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Dashboard'))

'click View/Edit Profile Imaage link from dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_ViewEdit Profile'))

'it will open the Basic information page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Personal Information'))

'Click Dash Board Sub menu from Personal information'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Dashboard'))

'Click Record Attendance image link from Dashboard '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Record Attendance'))

'it will open the Attendance information page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Personal Information'))

'Click Dash Board Sub menu from Personal information'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Dashboard'))

'Click Update Time Sheet image link from Dashboard '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Update Time Sheet'))

'it will open the Time Sheet information page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Personal Information'))

'Click Dash Board Sub menu from Personal information'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Dashboard'))

'Click my Projects More info image link from Dashboard '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_More info'))

'it will open the My Projects information page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Personal Information'))

'Click Dash Board Sub menu from Personal information'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Dashboard'))

'Click Travel Management image link from Dashboard '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Travel Management'))

'it will open travel information page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Personal Information'))

'Click Dash Board Sub menu from Personal information'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Dashboard'))

'it will open the Dashboard page and clicked notification menu '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/i_PayMe by MyEG_fa fa-tasks'))

'click notification '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/p_Ahmad Albab Abdullah Approvedtimesheet from Oct 28 2018(Sunday) to Nov 03 2018 (Saturday)'))

'it will open the selected notification page '
not_run: WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

'Sign out from user and auto redirect to login page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/a_Forgot password'))

'Click Forgot password link from login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Forgot password_usernameChange'), 
    '')

'Click Request Password Change button with out given username or email address '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/button_Request Password Change'))

'it will display message " You have entered an incorrect email or user id" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Forgot password_usernameChange'), 
    'savbsdjzb')

'Click Request Password Change button with given wrong username or email address '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/button_Request Password Change'))

'it will display message " You have entered an incorrect email or user id" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Forgot password_usernameChange'), 
    'employee')

'Click Request Password Change button with given valid username or email address '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/button_Request Password Change'))

'it will display message " An email has been sent to you with instructions for changing password " '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://mail.google.com')

'navigate to email to verify '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Continue to Gmail_identifier'), 
    'prakasam.myeg')

'given email username and click next '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/content_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/input_Too many failed attempts_password'), 
    'TIX5OH6LPiU6OYJgbL6dGg==')

'given password and click next '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Login_DashBoard_Forgot_Password_OR/span_Next'))

'it will open the email dash board \r\n'
WebUI.takeScreenshot()

'click user image for for sign out '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://accounts.google.com/Logout')

'auto redirect back to login page '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

'navigated to payme login page '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

