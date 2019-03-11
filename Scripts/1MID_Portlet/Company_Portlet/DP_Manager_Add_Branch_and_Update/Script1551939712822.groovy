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

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'dpmanager@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), 
    '963xRNC9FB6KQH2z41/hJA==')

'Click sign in with given username password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

'Portlet Home Page '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

'Selected Company Name for search drop down opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex LLP new company ')

'click seach with given company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

'it will display the search result '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Branch'), 0)

'it was scroll to view to click add branch , and then clicked it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Branch'))

'it will open the add branch page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'clicked create with out given any info , it will display message " Please enter the Branch Name " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'abc')

'click create with given banch name value as less than five characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Branch name can\'t be less than 5 characters " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'abc #^@%^&$#&(@*')

'click create with given banch name value as special characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Branch Name can contain alphanumeric %\'`: ()-&./@,!© ® ™ only  " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'maximum characterabc %\'`: ()-&./@,! 12345678 svvber regvdsvdf dsfbsgnbsdf sdfbdsbvsdf sdfbfdbfd dbbd')

'click create with given banch name value as max length aphanumaric characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept branch name and  display message "Contact name can\'t be less than 5 characters" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'Apex LLP Branch')

'click create with given valid banch name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it is acceptable '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'abc')

'click create with given Contact name value as less than five characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Contact name can\'t be less than 5 characters " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'abc #^@%^&$#&(@*')

'click create with given Contact name value as special characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Contact Name can contain alphanumeric %\'`: ()-&./@,!© ® ™ only  " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'maximum characterabc %\'`: ()-&./@,! 12345678 svvber regvdsvdf dsfbsgnbsdf sdfbdsbvsdf sdfbfdbfd dbbd')

'click create with given Contact name value as max length aphanumaric characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept contact name and  display message "Please enter the Contact No " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'Apex LLP branch person')

'click create with given Contact name value as valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it is acceptable '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), 'sfdhbfdhgfbd')

'click create with given Contact number value as characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Contact No must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '%#@*$&^@')

'click create with given Contact number value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Contact No must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '32434')

'click create with given Contact number value as lesssthan 9 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Contact No cannot be less than 9 digits" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '0123456788')

'click create with given Contact number value as valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it is acceptable '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), 'sfdhbfdhgfbd')

'click create with given Fax number value as characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Fax No must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '%#@*$&^@')

'click create with given Fax number value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Fax No must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '32434')

'click create with given Fax number value as lesssthan 9 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Fax No cannot be less than 9 digits" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '0123456788')

'click create with given fax number value as valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it is acceptable '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), '@*$%&@*^(*')

'click create with given email value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Email is invalid" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'test')

'click create with given email value as characters only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Email is invalid" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'test@')

'click create with given email value as characters with @ symbol and no domain '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Email is invalid" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'test@gmail.com')

'click create with given email value as valid'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it is accepted email value , and check next mandatory field " Please enter the Address 1" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), '&^$^#&@%$&^*(*')

'click create with given Address1 value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Address 1 can contain alphanumeric & ( ) - , . / @ # : only " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'addr')

'click create with given Address1 value as lessthan 8 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Address 1 can\'t be less than 8 characters" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'Address given max alphanumeric & ( ) - , . / @ 123')

'click create with given Address1 value as maximum length 30 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it is accepted email value , and check next mandatory field " Please enter the City Name " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'Address 1')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), '&^$^#&@%$&^*(*')

'click create with given Address2 value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Address 2 can contain alphanumeric & ( ) - , . / @ # : only " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'Address 2 given max alphanumeric & ( ) - , . / @ 1')

'given Address2 value as maximum length 30 characters '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), '&^$^#&@%$&^*(*')

'click create with given Address3 value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Address 2 can contain alphanumeric & ( ) - , . / @ # : only " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'Address 2 given ')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'Address 3 given max alphanumeric & ( ) - , . / @ 1')

'click create with given Address2 value as maximum length 30 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept address 2 value and display message "Please enter the City Name"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), 'abc')

'click create with given city value as lessthan 4 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "City Name can\'t be less than 4 characters"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), '%!$#&649()%&#*(%')

'click create with given city value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "City can accepts alphabets only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), '4264753854686')

'click create with given city value as numbers only'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "City can accepts alphabets only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), 'Petaling Jaya')

'click create with given city value as valid'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept City value and display message " Please enter the Postcode"\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), 'abcde')

'click create with given city value as characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Postcode must contain digits only"\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '%$&*@')

'click create with given city value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Postcode must contain digits only"\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '5353')

'click create with given city value as lessthan 5 numbers '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message "Postcode cannot be less than 5 digits "\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '47800')

'click create with given city value as numbers only'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will accept Postcode value and display message " Please select the state"\r\n'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), '11', true)

'selected state from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_IsActive_is_active'))

'click create with selected active check box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

WebUI.delay(2)

'it will create a branch with given values. and display the message " branch was successfully created " '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input View Branch'), 0)

'scrool to view buttion from branch details  \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View Branch'))

'clicked view button , it will open view branch details page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Back'))

WebUI.delay(2)

'clicked back button , it will redirect to company details page \r\n'
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'), 0)

'scroll to view edit branch button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'))

'clicked edit branch , it will open enter branh page. and click update branch with out changing any values '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

WebUI.delay(2)

' it will display message " branch successfully Updated " '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'abc')

'click Update with given banch name value as less than five characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Branch name can\'t be less than 5 characters " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'abc #^@%^&$#&(@*')

'click Update with given banch name value as special characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Branch Name can contain alphanumeric %\'`: ()-&./@,!© ® ™ only  " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'maximum characterabc %\'`: ()-&./@,! 12345678 svvber regvdsvdf dsfbsgnbsdf sdfbdsbvsdf sdfbfdbfd dbbd')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contact_name'), '')

'click Update  Branch with given banch name value as max length aphanumaric characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will accept branch name and  display message "Contact name can\'t be less than 5 characters" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'Apex LLP Branch edit')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contact_name'), '')

'click Update with given valid banch name and  display message "Contact name can\'t be less than 5 characters" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it is acceptable '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'abc')

'click Update with given Contact name value as less than five characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Contact name can\'t be less than 5 characters " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'abc #^@%^&$#&(@*')

'click Update with given Contact name value as special characters  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '')

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Contact Name can contain alphanumeric %\'`: ()-&./@,!© ® ™ only  " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'maximum characterabc %\'`: ()-&./@,! 12345678 svvber regvdsvdf dsfbsgnbsdf sdfbdsbvsdf sdfbfdbfd dbbd')

'given Contact name value as max length aphanumaric characters  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '')

'click Update with given Contact number empty '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will accept contact name and  display message "Please enter the Contact No " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'Apex LLP branch person edit')

'given Contact name value as valid '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '')

'click Update with given Contact number empty '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it is acceptable contact name and display message "Please enter the Contact No"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), 'sfdhbfdhgfbd')

'click Update with given Contact number value as characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Contact No must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '%#@*$&^@')

'click Update with given Contact number value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Contact No must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '32434')

'click Update with given Contact number value as lesssthan 9 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Contact No cannot be less than 9 digits" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '0123456799')

' given Contact number value as valid '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), 'sfdhbfdhgfbd')

'click Update with given Fax number value as characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it is acceptable contact number and display message " Fax No must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '%#@*$&^@')

'click Update with given Fax number value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message " Fax No must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '32434')

'click Update with given Fax number value as lesssthan 9 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message " Fax No cannot be less than 9 digits" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '0123456799')

'given fax number value as valid '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), '@*$%&@*^(*')

'click Update with given email value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it is acceptable fax number and display message "Email is invalid" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'test')

'click Update with given email value as characters only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Email is invalid" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'test@')

'click Update with given email value as characters with @ symbol and no domain '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Email is invalid" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'testedit@gmail.com')

' given email value as valid '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), '')

'click Update with given Address1 value as empty'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it is accepted email value , and check next mandatory field " Please enter the Address 1" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), '&^$^#&@%$&^*(*')

'click Update with given Address1 value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message " Address 1 can contain alphanumeric & ( ) - , . / @ # : only " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'addr')

'click Update with given Address1 value as lessthan 8 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Address 1 can\'t be less than 8 characters" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'Address given max alphanumeric & ( ) - , . / @ 123')

'given Address1 value as maximum length 30 characters '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), '&^$^#&@%$&^*(*')

'click Update with given Address2 value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it is accepted Address 1 value , and check next mandatory field " Address 2 can contain alphanumeric & ( ) - , . / @ # : only " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'Address 1 edit')

'given Address1 value as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'Address 2 given max alphanumeric & ( ) - , . / @ 1')

'given Address2 value as maximum length 30 characters '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), '&^$^#&@%$&^*(*')

'click Update with given Address3 value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will accept address2 value and display message " Address 3 can contain alphanumeric & ( ) - , . / @ # : only " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'Address 2 edit')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'Address 3 given max alphanumeric & ( ) - , . / @ 1')

'click Update with given Address 3 value as maximum length 30 characters '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), '')

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will accept address 3 value and display message "Please enter the City Name"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'Address 3 edit')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), '')

'click Update with given city value as empty'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will accept address 3 value and display message "Please enter the City Name"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), 'abc')

'click Update with given city value as lessthan 4 characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "City Name can\'t be less than 4 characters"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), '%!$#&649()%&#*(%')

'click Update with given city value as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "City can accepts alphabets only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), '4264753854686')

'click Update with given city value as numbers only'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "City can accepts alphabets only"'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), 'Petaling Jaya edit')

'given city value as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '')

'click Update with given postvalue value as empty \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will accept City value and display message " Please enter the Postcode"\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), 'abcde')

'click Update with given city value as characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message " Postcode must contain digits only"\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '%$&*@')

'click Update with given city value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message " Postcode must contain digits only"\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '5353')

'click Update with given city value as lessthan 5 numbers '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will display message "Postcode cannot be less than 5 digits "\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '47800')

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), '-1', true)

' given postcode value as numbers only'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will accept Postcode value and display message " Please select the state"\r\n'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), '10', true)

'selected state from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

'it will Update a branch with given values. and display the message " branch was successfully Updated \r\n" '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Branch'), 0)

'it was scroll to view to click add branch , and then clicked it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Branch'))

'it will open the add branch page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'Apex LLP Branch edit')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'Apex LLP branch person')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '0123456788')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '0123456788')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'test@gmail.com')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'address 1')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'Address 2')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'Address 3')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), 'Petaling Jaya')

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '47800')

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), '11', true)

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_IsActive_is_active'))

'Click Create with Given Same name of existing branch '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

'it will display message " Branch Name already exists" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Back'))

'clicked back to go company details page '
WebUI.takeScreenshot()

not_run: WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Delete'), 0)

'scroll to view delete button in branch details  '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Delete'))

'click delete button from branch details , it will shown warning message in pop up . '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/span_OK'))

'clicked OK in pop up to close it '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

not_run: WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.delay(3)

'navigate back to company manager page '
WebUI.takeScreenshot()

