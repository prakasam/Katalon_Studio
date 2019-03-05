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

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'corpsales@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), 
    'du3/JDvzDwol+yPMzk8RWQ==')

'Click sign in with given username password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

'Portlet Home Page '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

'Selected Company Name for search drop down opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex SDN BHD new company ')

'click seach with given company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

'it will display the search result '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Delete'))

'clicked delete button, it will open pop up warning message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

'clicked OK in pop up to close it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Edit'))

'clicked edit button, it will redirect to edit page  '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'), 0)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'clicked update with out changing any value , it was updated successfully '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

'navigate to company portlet page \r\n'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

'Selected Company Name for search drop down opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex SDN BHD new company ')

'click seach with given company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

'it will display the search result '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Edit'))

'clicked edit button, it will redirect to edit page  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Is corpSalesAccountChk'))

'selected is caporate sales check box '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'), 0)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'click update with out changing any value '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

'navigate to company portlet page \r\n'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

'Selected Company Name for search drop down opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex SDN BHD new company ')

'click seach with given company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

'it will display the search result '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input View Branch'), 0)

'click scrool to view Branch details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View Branch'))

WebUI.delay(5)

'Branch details Page, Click Back to Company details  \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Back to view Company Details'))

WebUI.delay(4)

'Compaby details page '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'), 5)

'click scrool to Edit  Branch details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'))

' it will display the message " Warnign: You do not have the credentials, Please contact your Administrator. "'
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

'clicked ok in warning message . Company Details Page '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Delete'), 5)

'click scrool to Delete Branch details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Delete'))

' it will display the message " Warnign: You do not have the credentials, Please contact your Administrator. "'
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

'clicked ok in warning message . Company Details Page '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

'navigate to company portlet page \r\n'
WebUI.takeScreenshot()

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

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

'navigate to company portlet page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/a_Sign Out'))

'Sign out from user '
WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()

