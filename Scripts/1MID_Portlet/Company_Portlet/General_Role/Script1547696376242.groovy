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

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/General/input_Email Address__58_login'), 'read@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/General/input_Password__58_password'), 'bdcyxfk0gjc=')

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

'Clicked Viwe token buttion , it will display the message " Warning : You do not have the credential.\r\nPlease contact your Administrator. "'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/General/span_OK'))

'Clicked OK in Credential Message Info (pop up)'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Add_Role'))

'Clicked Viwe Add Role buttion , it will display the message " Warning : You do not have the credential.\r\nPlease contact your Administrator. "'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/General/span_OK'))

'Clicked OK in Credential Message Info (pop up)'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_View'))

WebUI.scrollToElement(findTestObject('1MID_Portlet/General/input_Back'), 0)

'Click View Buttion , it will open view user info page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Back'))

'Click back to main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/General/input_Edit'))

'Clicked Viwe Edit buttion , it will display the message " Warning : You do not have the credential.\r\nPlease contact your Administrator. "'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/General/span_OK'))

'Clicked OK in Credential Message Info (pop up)'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/General/a_Sign Out'))

'Signed out from user '
WebUI.takeScreenshot()

WebUI.closeBrowser()

