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

'PayMe Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Remember me_username'), 
    'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Sign in with given Username and Password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/a_Basic Information'))

'cliked Basic information link from personal information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/button_Edit Info'))

'Clicked edit info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input__first_name'), 'Aplus edited 12')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Middle Name_middle_name'), 
    'middle 12')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input__last_name'), 'Multipurpose 12')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/i__fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/span_1986'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/span_Jul'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/td_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/select_MaleFemale'), 
    'Male', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/select_MarriedSingleDivorcedWidowedOther'), 
    'Married', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_SSNNRIC_ssn_num'), '861214785634')

'Changed info based on the needs '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_NIC_nic_num'), 'N12345678')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Other ID_other_id'), 'A123456789')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Driving License No_driving_license'), 
    'CDL98346599')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Work Station Id_work_station_id'), 
    'Johar edit 123')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Address Line 1_address1'), 
    'lot :501, level :5 edit 123')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Address Line 2_address2'), 
    'hotel edit 123')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_City_city'), 'johar edit 123')

'Changed info based on the needs '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Private Email_private_email'), 
    'prakasam.myeg@gmail.com')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_work_location_work_location'), 
    'Johar edit 123', FailureHandling.OPTIONAL)

'click save with Given all required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/button_Save'))

WebUI.waitForPageLoad(5)

'after save the info . it will auto redirect back to basic information page '
WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/button_Upload Profile Image'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/button_Delete Profile Image'))

'click delete profile image button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/button_Change Password'))

WebUI.waitForAlert(5)

'clicked change password it will open in pop up screen'
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_New Password_newpwd'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/input_Confirm Password_conpwd'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click change password with given new and confirm password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/button_Change Password_1'))

'it will display confirmation message in pop up " Password Changed Successfully "'
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Basic_Information_OR/button_Ok'), FailureHandling.OPTIONAL)

WebUI.refresh()

'clicked ok, it will redirect back to basic information page '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

'click company link from Basic information page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/Basic_Information_OR/a_Company'))

'it will open the company structure info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/Basic_Information_OR/a_Api Access'))

'clicked Api Accesskey link , it will display the API Accesskey information '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

'Logged Out from PayMe user '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

