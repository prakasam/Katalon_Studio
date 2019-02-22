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

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'dataproc@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), 
    'POeQ1a4GSSTI2WSNm0oiZg==')

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

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Edit'))

'clicked edit button, it will redirect to edit page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'Apex @%#!%$@^%$^*()(@%&')

'Click Update with given company name as special characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Company Name can contain alphanumeric %\'`: () - * &./@,!© ® ™ only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'PDX.COM SDN BHD')

'Click Update with given company name as existing'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Company name already exists"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'abc')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), '')

'Click Update with given company name as lessthan 5 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Company name can\'t be less than 5 characters"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), '12345')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), '')

'Click Update with given company name as numbers only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'company name numbers will accept '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'company name maximum input characters count was 100 test company myeg services berhad ( 213452-  A )')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), '')

'Click Update with given company name as maximum 100 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'company name will accept maximum 100 alpha numaric  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'Apex SDN BHD new company edit')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), '')

'Click Update with Given Company name as valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Please select the company type"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), '&@%$&@(^*')

'Click Update with Given Company Reg No as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Registration no can contain alphanumeric () . : - / only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), '505639-K')

'Click Update with Given Company Reg No as existing value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Company registration number already exists"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), 'a')

'Click Update with Given Company Reg No as single value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will accept single character . it will display message "Company registration number already exists"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), 'registration number maximum size to 50 characters-')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), 'vfdbfdgh')

'Click Update with Given Company Reg No as maximum 50 characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will accept 50 characters in registration number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), 'ap78wr76-0099')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), 'vfdbfdgh')

'Click Update with Given valid Company Reg No and invalid in corporation date as character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Invalid incorporation date format"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), '01071986')

'Click Update with Given in corporation date as number only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Invalid incorporation date format"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), '01-07-1986')

'Click Update with Given in corporation date as wrog format '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Invalid incorporation date format"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), '1986-07-31')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'a')

'Click Update with Given valid in corporation date and invalid address1 '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will accept the incorporation date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'abc12')

'Click Update with Given  Address1 value lessthan 8 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Address 1 can\'t be less than 8 characters"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), '@&^$!*$*!@$)(*()#T')

'Click Update  with Given  Address1 value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Address 1 can contain alphanumeric & ( ) - , . / @ # : only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'address 1 2& ( ) - , . / @ # :')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), '@&^$!*$*!@$)(*()#T')

'Click Update with Given  Address1 value as valid and address2 as invalid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will accept address1 value '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'address12345 edit')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), '@&^$!*$*!@$)(*()#T')

'Click Update with Given  Address2 value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Address 2 can contain alphanumeric & ( ) - , . / @ # : only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'address  2 edit')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), '@&^$!*$*!@$)(*()#T')

'Click Update with Given  valid Address2 value and invalid address 3 value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will accept address 2 and it will display message "Address 3 can contain alphanumeric & ( ) - , . / @ # : only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'address  3 & ( ) - , . / @ # :')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), 'PJ 123456')

'Click Update with Given  valid Address 3 value and city as invalid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will accept address 3 and it will display message "City can accepts alphabets only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'address3 edit')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), 'P')

'Click Update with Given city value as single character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'City name can\'t be less than 2 characters'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), '$#^@&^*(')

'Click Update with Given city value as special character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "City can accepts alphabets only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), 'petaling jaya edit')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__postcode'), 'abc')

'Click Update with Given valis city value and character in post code '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Postcode must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__postcode'), '@!#$&')

'Click Update with Given postcode value as special character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Postcode must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__postcode'), '47400')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), 
    '-1', true)

'Click Update with Given postcode value as valid and state did not selected '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will accept the post code and it will display message "Please select the state"'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), 
    '13', true)

' state value selected from drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), 'abc')

'Click Update with Given contact No value as character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Contact no. must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '^%$^&@%*(')

'Click Update with Given contact No value as special character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Contact no. must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '012345')

'Click Update with Given contact No value as lessthan 9 numbers '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message "Contact no. cannot be less than 9 digits"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '0123456999')

'Given contact No value as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), 'abc')

'Click Update with Given Fax No value as characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message " Fax no. must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), '@$*@&*(8')

'Click Update with Given Fax No value as Special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message " Fax no. must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), '0123')

'Click Update with Given Fax No value as lessthan 9 numbers '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message Fax no. cannot be less than 9 digits"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), '0123456999')

'Given Fax No value as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), 'test')

'Click Update with Given Email value as text only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message " The email must contain an \'@\' symbol and end with either .xx or .xxx"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), '$^#@$%&@^$')

'Click Update with Given Email value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message " The email must contain an \'@\' symbol and end with either .xx or .xxx"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), '12343465787')

'Click Update with Given Email value as numbers only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message " The email must contain an \'@\' symbol and end with either .xx or .xxx"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), 'test@')

'Click Update with Given Email value with out domain name after @ symbol'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display message " The email must contain an \'@\' symbol and end with either .xx or .xxx"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), 'testedit@gmail.com')

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_None Collected Partial'), '2', true)

'Given Valid email Address  and document status as collected '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

'it will display the message  "Company Successfully Updated " '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

'Selected Company Name for search drop down opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex SDN BHD new company ')

'click seach with given company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

'it will display the search result and click view for required company \r\n'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

'it will display the company details page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Back'))

'clicked back to company management page '
WebUI.takeScreenshot()

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/a_Sign Out'))

WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.closeBrowser()

