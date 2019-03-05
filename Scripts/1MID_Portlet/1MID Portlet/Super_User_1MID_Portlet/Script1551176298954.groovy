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

WebUI.navigateToUrl('http://uat5.myeg.com.my/portlet/')

WebUI.maximizeWindow()

'Portlet Login Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/General/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/General/input_Email Address__58_login'), 'superuser@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/General/input_Password__58_password'), 'h1bZaoNZrXJGImBBMGIoZQ==')

'Click Sign in with Given Username and Password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/General/input_Remember Me_aui_3_2_0_12'))

'it will log into portlet Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/General/span_1MID User Portlet'))

'Clicked 1MID Portlet page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), '!#^$@$&878bfvshdjv')

'click search with given in Valid data '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'it will dosplay the message " No User Found" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), 'nodata@gmail.com')

'click search with given in Valid email address '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'it will dosplay the message " No User Found" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), 'approver.myeg@gmail.com')

'click search with given Valid email address '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'clicked Search button to view result '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/General/input_Cancel'), 0)

'view Search result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Cancel'))

WebUI.setText(findTestObject('1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), '143517189641')

'click search with given in Valid NRIC No'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'it will dosplay the message " No User Found" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), '340908025111')

'click search with given Valid NRIC No'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'it will display the available result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/General/input_User Name_userId'))

'clicked radio button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_View_Token'))

'Clicked View token button , it will display the message " Warning : You do not have the credential.\r\nPlease contact your Administrator. "'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Cancel'))

'click cancel to go back home screen to search again ( token feature was implemented in separe website )'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), '581023065113')

'click search with given Valid NRIC No'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'it will display the available result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Add_Role'))

'Clicked Add Role button ,it will open the Add role page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input - Submit'))

'Clicked Submit button with out adding role , it will display confirmation message " Role has been successfully updated to user :won581023065113@1mid.myeg.com.my  " \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), '581023065113')

'click search with given Valid NRIC No'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'it will display the available result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Add_Role'))

'Clicked Add Role button ,it will open the Add role page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/option_AGENT'))

'Selected AGENT role '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Selected Roles_btnRight'))

'Clicked right button to apply AGENT rolre to person  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input - Submit'))

'Clicked Submit button to update user role , it will display confirmation message " Role has been Successfully updated to user: won581023065113@1mid.myeg.com.my " \r\nRole updation failed to user: won581023065113@1mid.myeg.com.my " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), '581023065113')

'click search with given Valid NRIC No'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'it will display the available result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_View'))

WebUI.scrollToElement(findTestObject('1MID_Portlet/General/input_Back'), 0)

'Click View Button , it will open view user info page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Back'))

'Click back to main page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/General/input_ENTER ICNOUSER NAME_nric'), '581023065113')

'click search with given Valid NRIC No'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Search'))

'it will display the available result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Edit'))

'Clicked Viwe Edit button , it will open edit account details page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_Email_email'), 'won@1mid.myeg.com.my')

'Given email address '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_MySikap Email_mysikapEma'), 'won@1mid.myeg.com.my')

'Given mysikap email address '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_JPJ Portal Email_jpjPort'), 'won@1mid.myeg.com.my')

'Given JPJ Portal email address '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/General/select_-- Select Status -- NEW'), '1', true)

'selected Active from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Mail sent_mailSent'))

'Clicked mail sent check box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_Integrated User Name_int'), 'wonmyegintUser')

'Given intigrated username details'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_Contact Number_contactNu'), 'sdgdfhsfdsd')

'Given text in contact number field , it will display message " Contact Number must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_Contact Number_contactNu'), '34523')

'Given numbers less than 9 in contact number field , it will display message " Contact Number must be minimum 9 characters and maximum 11"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_Contact Number_contactNu'), '0123456789')

'Given valid Contact Number'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input - Update'))

'it will display the confirmation message" Account successfully updated "'
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/General/input - Check JPJ Security Question'), 0)

'Scroll to view Check JPJ Security Question'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input - Check JPJ Security Question'))

'clicked  Check JPJ Security Question button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input - Delete'))

'clicked  delete button , it will display confirmation " Security Question successfully deleted"'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Back'))

'clicked  Back button ,it will back to enter account details page '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/General/input - Change Password'), 0)

'Scroll to view Change Password'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input - Change Password'))

'clicked  scroll Password button , it will open user password details page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/General/input_Password_password'), '7c222fb2927d828af22f592134e8932480637c0d')

'Given valid Contact Number'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input - Update'))

'it will display the confirmation message" Password successfully updated "'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/a_Sign Out'))

'click sign out from user '
WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()

