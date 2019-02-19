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

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

'Click Sign In with out Given Username and Password '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'read@liferay.com')

'Click Sign In with Given Username only'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display message " You have entered invalid data. Please try again. and Authentication failed. Please try again." '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'invalid@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), 
    'bdcyxfk0gjc=')

'Click Sign In with Given invalid Username and password'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display message " You have entered invalid data. Please try again. and Authentication failed. Please try again." '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'read@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), 
    'bdcyxfk0gjc=')

'Click Sign In with Given valid Username and Password '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

'Portlet Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'Clicked Search with out selection of opctions ,it will display info "Please select the type "'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '0', true)

'Click Search button, with selected type from dropdown and no value for seach text box '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'Clicked Search with out selection of opctions ,it will display info "No Company Found "'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '0', true)

' selected \'Registration No\' type from dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'No value $R*@$')

'Click Search button, with selected type from dropdown and given invalid value in text box'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'Clicked Search with out selection of opctions ,it will display info "No Company Found "'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '0', true)

' selected \'Registration No\' type from dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), '505639-K')

'Click Search button, with selected type from dropdown and given valid value in text box'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'it will display the result in table with details (SNo,Name,\tRegistration No, Is Immi,\tIs Dealer, Is Finance,\tIs Corporate Sales, Document Status, Certified By Director with Edit, Delete, and View Buttons)'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

' selected \'Company Name\' type from dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'pdx')

'Click Search button, with selected type from dropdown and given valid value in text box'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'it will display the result in table with details (SNo,Name,\tRegistration No, Is Immi,\tIs Dealer, Is Finance,\tIs Corporate Sales, Document Status, Certified By Director with Edit, Delete, and View Buttons)'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '5', true)

' selected \'State\' type from dropdown '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), '12', true)

'Click Search button, with selected type and state from dropdown'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'it will display the result in table with details (SNo,Name,\tRegistration No, Is Immi,\tIs Dealer, Is Finance,\tIs Corporate Sales, Document Status, Certified By Director with Edit, Delete, and View Buttons)'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '6', true)

' selected \'Post Code Range\' type from dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'pdx')

'Click Search button, with selected type from dropdown and given in valid value in text box'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'it will display the message " Please enter valid postcode range (Ex : 40700-53000)" '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '6', true)

' selected \'Post Code Range\' type from dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), '47400-48000')

'Click Search button, with selected type from dropdown and given valid value in text box'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'it will display the result in table with details (SNo,Name,\tRegistration No, Is Immi,\tIs Dealer, Is Finance,\tIs Corporate Sales, Document Status, Certified By Director with Edit, Delete, and View Buttons)'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '7', true)

' selected \'Created Date\' type from dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), '325882')

'Click Search button, with selected type from dropdown and given in valid value in text box'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'it will display the message " Please enter valid created date (Ex : 23-07-2015)" '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '7', true)

' selected \'Created Date\' type from dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), '25-01-2019')

'Click Search button, with selected type from dropdown and given valid value in text box'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'it will display the result in table with details (SNo,Name,\tRegistration No, Is Immi,\tIs Dealer, Is Finance,\tIs Corporate Sales, Document Status, Certified By Director with Edit, Delete, and View Buttons)'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '8', true)

' selected \'Expiry Date\' type from dropdown '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_January February March'), '11', true)

'Click Search button, with selected type ,month  from dropdown'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_2000 2001 2002 2003 200'), '2024', true)

'Click Search button, with selected type ,month and year from dropdown'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(2)

'it will display the result in table with details (SNo,Name,\tRegistration No, Is Immi,\tIs Dealer, Is Finance,\tIs Corporate Sales, Document Status, Certified By Director with Edit, Delete, and View Buttons)'
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(1)

WebUI.refresh()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/a_Sign Out'))

'Sign out from portlet user '
WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()

