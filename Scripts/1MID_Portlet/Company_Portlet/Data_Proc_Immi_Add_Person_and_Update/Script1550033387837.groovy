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
import org.openqa.selenium.Keys as Keys

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

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToPosition(400, 500)

WebUI.takeScreenshot()

not_run: WebUI.refresh()

not_run: WebUI.delay(2)

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER))

not_run: WebUI.delay(2)

not_run: WebUI.refresh()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Person'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'clicked Add with out given any info ,it will display message " Please enter name" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'one')

'click add with given name as thrre characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display message " Name can\'t be less than 5 characters " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), '$%@^&$@*($0')

'click add with given name as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display messahe "Name can accept alphabets and ` @ ( ) \' / , . -" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'abc 1234')

'click add with given name as alpha numaric characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display messahe "Name can accept alphabets and ` @ ( ) \' / , . -'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'maximum lengt` @ ( ) \' /on na` @ ( ) \' / , . - vsdjnvjhsdjbvsxjcsdjhcnsdncjdsnvcjkdnsvjmsdkvnmsdkjv')

'click add with given name as maximum length 100 char '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept maximum length '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'first person in Apex SDN BHD new company')

'click add with given name as valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept the given name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '98067')

'click Add with given IC No value as lessthan 8 characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display the message " ICNO must be minimum 8 characters " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '$@&%#^*(@%^')

'click Add with given IC No value as special characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display the message " ICNO can contain alphanumeric ,Slash (/) and star(*) only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '1234567890123')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), 'abc')

'click Add with given IC No value maximum 13 characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept the given IC No '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), 'A1234567')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), 'abc')

'click Add with given valid IC No ( old ic )'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept the given IC No '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '980701543278')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), 'abc')

'click Add with given valid IC No '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept the given IC No '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), 'abcd')

'click Add with given contact no value as character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will disply message " Contact no. must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), '$*%&($^@)')

'click Add with given contact no value as special character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will disply message " Contact no. must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), '345436')

'click Add with given contact no value as special character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will disply message " Contact no. cannot be less than 9 digits" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), '0123456789')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'test')

'click Add with given valid contact no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept the given Contact no '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), '%#^%#$^$&&(*')

'click Add with given email value as special character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept display message " The email must contain an \'@\' symbol and end with either .xx or .xxx " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'test')

'click Add with given email value as character only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept display message " The email must contain an \'@\' symbol and end with either .xx or .xxx " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'test@')

'click Add with given email value as character with @ symbol  with out domain '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept display message " The email must contain an \'@\' symbol and end with either .xx or .xxx " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), '$*$@*9737*********$&')

'click Add with given valid email'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will accept the given email '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Non-Director_directorRad'))

'Selected radio button non director '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), '$*$@*9737*********$&')

'click Add with given Designation value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display the message " Designation can accept alphabets and ` @ ( ) \' / , . -" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), 'na` @ ( ) \' / , . dfsdb dfgbdfgbdfs fdgsfadfaf dsvsdvsadvdgv ffgsedfaefaewgvr etdhytfjgyujhm hhnfhn')

'click add with given designation value as maximun characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

'it will accept the given values and add the person, display the confirmation " Person successfully added but please remind that the ICNO not registered for 1MID account yet" '
WebUI.takeScreenshot()

not_run: WebUI.sendKeys(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), Keys.chord(Keys.TAB, 
        Keys.ENTER))

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input View AP Details'), 0)

'Scroll down to view ap details and click view '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View AP Details'))

WebUI.delay(2)

'it will display the View personnel details page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Back to view Company Details'))

WebUI.delay(2)

'when click back it will navigate to company details page '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Person Edit'), 2)

'scroll down to edit person and click edit '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Person Edit'))

'it will open the   Edit personnel details page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'clicked update with out changing person details. it will display comfirmation message " person successfully updated " '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Person Edit'), 2)

'scroll down to edit person and click edit '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Person Edit'))

'it will open the   Edit personnel details page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'one')

'click Update with given name as thrre characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will display message " Name can\'t be less than 5 characters " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), '$%@^&$@*($0')

'click Update with given name as special characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will display messahe "Name can accept alphabets and ` @ ( ) \' / , . -" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'abc 1234')

'click Update with given name as alpha numaric characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will display messahe "Name can accept alphabets and ` @ ( ) \' / , . -'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'maximum lengt` @ ( ) \' /on na` @ ( ) \' / , . - vsdjnvjhsdjbvsxjcsdjhcnsdncjdsnvcjkdnsvjmsdkvnmsdkjv')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '98067')

'click Update with given name as maximum length 100 char '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept maximum length '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'first person edit in Apex SDN BHD new company')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '98067')

'click Update with given name as valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept the given name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '98067')

'click Update with given IC No value as lessthan 8 characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will display the message " ICNO must be minimum 8 characters " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '$@&%#^*(@%^')

'click Update with given IC No value as special characters  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will display the message " ICNO can contain alphanumeric ,Slash (/) and star(*) only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '1234567890123')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), 'abc')

'click Update with given IC No value maximum 13 characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept the given IC No '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), 'A1234567')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), 'abc')

'click Update with given valid IC No ( old ic )'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept the given IC No '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '98070154399')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), 'abc')

'click Update with given valid IC No '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept the given IC No '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), 'abcd')

'click Update with given contact no value as character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will disply message " Contact no. must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), '$*%&($^@)')

'click Update with given contact no value as special character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will disply message " Contact no. must contain digits only" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), '345436')

'click Update with given contact no value as special character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will disply message " Contact no. cannot be less than 9 digits" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), '1234567999')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'test')

'click Update with given valid contact no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept the given Contact no '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), '%#^%#$^$&&(*')

'click Update with given email value as special character '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept display message " The email must contain an \'@\' symbol and end with either .xx or .xxx " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'test')

'click Update with given email value as character only '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept display message " The email must contain an \'@\' symbol and end with either .xx or .xxx " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'test@')

'click Update with given email value as character with @ symbol  with out domain '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept display message " The email must contain an \'@\' symbol and end with either .xx or .xxx " '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'testedit@gmail.com')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), '12344352')

'click Update with given valid email'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will accept the given email '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), '$*$@*9737*********$&')

'click Update with given Designation value as special characters'
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

'it will display the message " Designation can accept alphabets and ` @ ( ) \' / , . -" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Director Representative_'))

'Selected radio button director reprasentative '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), 'edit na` @ ( ) \' / , . fgbdfgbdfs fdgsfadfaf dsvsdvsadvdgv ffgsedfaefaewgvr etdhytfjgyujhm hhnfhn')

'click Update with given designation value as maximun characters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

WebUI.delay(3)

'it will accept the given values and add the person, display the confirmation " Person successfully added but please remind that the ICNO not registered for 1MID account yet" '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Person'))

'click add person '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'Second person to company ')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '98070154399')

'click add with given existing NRIC to the same company '
WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add new A P'), FailureHandling.CONTINUE_ON_FAILURE)

'it will display message " ICNO already exists in this company" '
WebUI.takeScreenshot()

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

