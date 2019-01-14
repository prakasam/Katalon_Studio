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

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MyEG/button_Sign In'))

'pasti admin dashboard '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MyEG/a_Account Management'))

'click account management menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MyEG/a_User Account List'))

'user account list page ( click user account list sub menu) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_New Company User Accoun'))

'click new Company user Account login creation button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register login button with out given data '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/select_Choose Company'), 
    '505639-K', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register login button with selected company from dropdown only '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Username _userName'), 
    'a')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register login button with selected company from dropdown and given username as single character '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'IoSAFDrw05c=')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register login button with selected company from dropdown ,given username and password as single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'c')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'click register login button with selected company from dropdown ,given username ,password and email as single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'ware')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'given email with out @ symbol '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'ware@gma')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'given email with out domain '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Username _userName'), 
    '#$%&^)(*')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'given email as special characters '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'IoSAFDrw05c=')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'given password as lessthan 8 characters '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'ware@test.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'given email as valid '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Username _userName'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'ware@test.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'given existing username '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Username _userName'), 
    'signora')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'IoSAFDrw05c=')

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'ware@test.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'given password as lessthan 8 characters '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Password _password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'ware@test.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Register Login'))

'Account created successfully '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_All Users given access t'), 
    'signora')

'searched for required account to edit '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/a_Edit'))

'edit account page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Update'))

'select update with out given password '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    '')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MyEG/input_Password _password'), 
    'J7R4ejOak4Y=')

'click update given email as empty '
WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Update'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    '&^@#&#(%')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update given email as special characters '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'wareedit@test.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update given email valid email '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MyEG/input_Password _password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Email(Password Reset) _e'), 
    'wareedit@test.com')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update given valid email and password '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_All Users given access t'), 
    'signora')

'search for required user '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/a_Delete'))

'click delete link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_Confirm_btn btn-default'))

'click cancel from delete confirmation screen '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_All Users given access t'), 
    'signora')

'searched required user '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/a_Delete'))

'click delete link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/button_Confirm'))

'click confirm deletion confirmation '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/input_All Users given access t'), 
    'signora')

're checking for same user '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_AM_BU_Add_OB/Page_PASTI by MYEG/a_Logout'))

'logout from account '
WebUI.takeScreenshot()

WebUI.closeBrowser()

