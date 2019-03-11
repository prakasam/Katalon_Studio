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

'Company Portlet Login page'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'dpmanager@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), 
    '963xRNC9FB6KQH2z41/hJA==')

'Click Sign in with given Given Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

'Company Portlet Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Company'))

'Clicked Add Company Button , Add Company Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'Clicked create with out given values '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'ABCDefghijkl')

'Click Crate with Given Company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Please select the company type" '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '6', true)

'Click Crate with seleted Company type '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Please enter the registration no." '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), 'ap78wr76-0099')

'Click Crate with given Company reg no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Please enter the contact no.."'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '4123432553')

'Click Crate with given Contact no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Please enter the Address 1"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'address1')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'address2')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'address3')

'Click Crate with given Address '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Please enter the city name"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), 'petaling jaya')

'Click Crate with given City'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Please enter the postcode"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__postcode'), '47400')

'Click Crate with given postcode'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Please select the state"'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), 
    '11', true)

'Click Crate with selected state '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Invalid incorporation date format"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), '1986-07-01')

'Given Incorporation date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'Apex @%#!%$@^%$^*()(@%&')

'Click Crate with given company name as special characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Company Name can contain alphanumeric %\'`: () - * &./@,!© ® ™ only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'PDX.COM SDN BHD')

'Click Crate with given company name as existing'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Company name already exists"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'abc')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '-1', true)

'Click Crate with given company name as lessthan 5 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Company name can\'t be less than 5 characters"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), '12345')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '-1', true)

'Click Crate with given company name as numbers only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'company name numbers will accept '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'company name maximum input characters count was 100 test company myeg services berhad ( 213452-  A )')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '-1', true)

'Click Crate with given company name as maximum 100 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'company name will accept maximum 100 alpha numaric  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'Apex LLP new company ')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '-1', true)

'Click create with Given Company name as valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Please select the company type"'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '1', true)

'Selected Sdn Bhd or Berhad Company type from drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), '&@%$&@(^*')

'Click create with Given Company Reg No as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Registration no can contain alphanumeric () . : - / only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), '505639-K')

'Click create with Given Company Reg No as existing value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Company registration number already exists"'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Is Corporate Sales_corpS'), FailureHandling.CONTINUE_ON_FAILURE)

'Click checkbox is corporate sales  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Company registration number already exists"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), 'a')

'Click create with Given Company Reg No as single value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept single character . it will display message "Company registration number already exists"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), 'registration number maximum size to 50 characters-')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), 'vfdbfdgh')

'Click create with Given Company Reg No as maximum 50 characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept 50 characters in registration number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), 'LLP78wr76-0099')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), 'vfdbfdgh')

'Click create with Given valid Company Reg No and invalid in corporation date as character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Invalid incorporation date format"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), '01071986')

'Click create with Given in corporation date as number only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Invalid incorporation date format"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), '01-07-1986')

'Click create with Given in corporation date as wrog format '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Invalid incorporation date format"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), '1986-07-01')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'a')

'Click create with Given valid in corporation date and invalid address1 '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept the incorporation date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'abc12')

'Click create with Given  Address1 value lessthan 8 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Address 1 can\'t be less than 8 characters"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), '@&^$!*$*!@$)(*()#T')

'Click create with Given  Address1 value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Address 1 can contain alphanumeric & ( ) - , . / @ # : only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'address 1 2& ( ) - , . / @ # :')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), '@&^$!*$*!@$)(*()#T')

'Click create with Given  Address1 value as valid and address2 as invalid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept address1 value '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'address12345')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), '@&^$!*$*!@$)(*()#T')

'Click create with Given  Address2 value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Address 2 can contain alphanumeric & ( ) - , . / @ # : only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'address  2 & ( ) - , . / @ # :')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), '@&^$!*$*!@$)(*()#T')

'Click create with Given  valid Address2 value and invalid address 3 value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept address 2 and it will display message "Address 3 can contain alphanumeric & ( ) - , . / @ # : only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'address  3 & ( ) - , . / @ # :')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), 'PJ 123456')

'Click create with Given  valid Address 3 value and city as invalid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept address 3 and it will display message "City can accepts alphabets only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'address3')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), 'P')

'Click create with Given city value as single character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'City name can\'t be less than 2 characters'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), '$#^@&^*(')

'Click create with Given city value as special character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "City can accepts alphabets only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), 'petaling jaya')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__postcode'), 'abc')

'Click create with Given valis city value and character in post code '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Postcode must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__postcode'), '@!#$&')

'Click create with Given postcode value as special character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Postcode must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__postcode'), '47400')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), 
    '-1', true)

'Click create with Given postcode value as valid and state did not selected '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept the post code and it will display message "Please select the state"'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), 
    '13', true)

' state value selected from drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), 'abc')

'Click create with Given contact No value as character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Contact no. must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '^%$^&@%*(')

'Click create with Given contact No value as special character'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Contact no. must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '012345')

'Click create with Given contact No value as lessthan 9 numbers '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Contact no. cannot be less than 9 digits"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '0123456789')

'Given contact No value as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), 'abc')

'Click create with Given Fax No value as characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Fax no. must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), '@$*@&*(8')

'Click create with Given Fax No value as Special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Fax no. must contain digits only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), '0123')

'Click create with Given Fax No value as lessthan 9 numbers '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message Fax no. cannot be less than 9 digits"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), '0123456789')

'Given Fax No value as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), 'test')

'Click create with Given Email value as text only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " The email must contain an \'@\' symbol and end with either .xx or .xxx"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), '$^#@$%&@^$')

'Click create with Given Email value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " The email must contain an \'@\' symbol and end with either .xx or .xxx"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), '12343465787')

'Click create with Given Email value as numbers only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " The email must contain an \'@\' symbol and end with either .xx or .xxx"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), 'test@')

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '2', true)

'Click create with Given Email value with out domain name after @ symbol'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " The email must contain an \'@\' symbol and end with either .xx or .xxx"'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '6', true)

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), 'test@gmail.com')

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_None Collected Verified Rejected Partial -DPManager'), 
    '2', true)

'Given Valid email Address  and document status as collected '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 27'))

'selected check box for Sijil Perakuan Pendaftaran (compulsory)- CTC Copy'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg llpsiji.27'))

WebUI.delay(3)

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\Sijil Perakuan Pendaftaran compulsory- CTC Copy.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

'uploaded document of Sijil Perakuan Pendaftaran (compulsory)- CTC Copy'
WebUI.takeScreenshot()

//WebUI.uploadFile(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdForm9.1'), '‪C:\\Users\\Owner\\Desktop\\Validation Rule.pdf')
WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 28'))

'selected check box for Profail Terkini (compulsory)- CTC Copy '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg llppro.28'))

WebUI.delay(3)

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\Persatuan - Cancellation of Authorized Personnel.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

'uploaded document of Profail Terkini (compulsory)- CTC Copy \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 29'))

'selected check box for  Copy of company director(s) and representative(s) MyKad'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg llpcopy.29'))

WebUI.delay(3)

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\DRM.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

'uploaded document of Copy of company director(s) and representative(s) MyKad\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 30'))

'selected check box for Appointment Letter (Only if applicable) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg llpAppLetter.30'))

WebUI.delay(3)

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\APL.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

'uploaded document of  Appointment Letter (Only if applicable) \r\n'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 31'))

'selected check box for  Authorization Letter'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg llpAuthLetter.31'))

WebUI.delay(3)

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\AUL.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

'uploaded document of   Authorization Letter'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 39'))

'selected check box for Cancellation of Authorized Personnel '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg llpCancelAp.39'))

WebUI.delay(3)

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\CAPL.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

'uploaded document of Cancellation of Authorized Personnel '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Remarks_remark'), 'Documents collected')

'Given remark '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'Company Successfully Created '
WebUI.takeScreenshot()

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/a_Sign Out'))

WebUI.takeScreenshot()

WebUI.refresh()

