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

'Portlet Login Page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'read2@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), 
    '9DvudInqbqE=')

'Click Sign In with Given Username and Password '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

'Portlet Dash Board '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

'Selected Company Name From Drop down opctions for search '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

'Click Go Given Company Name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(5)

'it will search the result and display available '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Edit'))

'Click edit in Company details , it will display the message " Warnign: You do not have the credentials, Please contact your Administrator. "'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

WebUI.refresh()

'Clicked ok in alert message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Delete'))

' it will display the message " Warnign: You do not have the credentials, Please contact your Administrator. "'
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

'Click Ok in Alert Message '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(5)

'Click View in Company search page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

'it will display the company detailed information'
WebUI.takeScreenshot()

WebUI.scrollToPosition(300, 250)

'it will display the company detailed information'
WebUI.takeScreenshot()

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Form 9 - Certificate of inco'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

'Form 9 Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Form 13 - Certificate of inc'))

WebUI.delay(1)

WebUI.switchToWindowIndex(2)

'Form 13 Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Form 24 - Return of allotmen'))

WebUI.delay(1)

WebUI.switchToWindowIndex(3)

'Form 24 Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Form 49 - Return giving part'))

WebUI.delay(1)

WebUI.switchToWindowIndex(4)

'Form 49 Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Copy of company director(s)'))

WebUI.delay(1)

WebUI.switchToWindowIndex(5)

'Copy of Directors mykad Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Appointment Letter'))

WebUI.delay(1)

WebUI.switchToWindowIndex(6)

'Appointment Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Authorization Letter'))

WebUI.delay(1)

WebUI.switchToWindowIndex(7)

'Authorization Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Cancellation of Authorized P'))

WebUI.delay(1)

WebUI.switchToWindowIndex(8)

'Cancelation of Authorization Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1MID_Portlet/IMMI_Level_2/a_Section 58 - CertificateNoti'))

WebUI.delay(1)

WebUI.switchToWindowIndex(9)

'Section 58 Document downloaded to view '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.delay(5)

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Sathya Branch 789 to check')

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(5)

'Click View in Company search page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

'it will display the company detailed information'
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input View Branch'), 0)

'Click Scroll down to view branch details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View Branch'))

'it will display the branch detailed information '
WebUI.takeScreenshot()

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

'Company detaild information page , (clicked back to view company details page )'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'), 0)

'Scroll to edit branch details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'))

' it will display the message " Warnign: You do not have the credentials, Please contact your Administrator. "'
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

'Click Ok in Alerert info '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Delete'), 0)

'click scrool to view delete branch details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Delete'))

' it will display the message " Warnign: You do not have the credentials, Please contact your Administrator. "'
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

'Click Ok in Alerert info '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(5)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input View AP Details'), 0)

'click scrool to view Authentication Person details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View AP Details'))

WebUI.delay(5)

'Authentication Personal details Page, Click Back to Company details  \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Back to view Company Details'))

WebUI.delay(4)

'Compaby details page '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Person Edit'), 5)

'click scrool to Edit Authentication Person details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Person Edit'))

' it will display the message " Warnign: You do not have the credentials, Please contact your Administrator. "'
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

'Company Details Page '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/a_Sign Out'))

'Sign out from portlet user '
WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()

