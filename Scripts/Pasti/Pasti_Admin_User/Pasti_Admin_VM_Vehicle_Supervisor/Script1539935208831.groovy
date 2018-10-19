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

'Pasti Admin Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/button_Sign In'))

'Pasti Admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Management'))

'Selected Vehicle Management Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Supervisor List'))

'Vehicle Supervisor List Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/a_5'))

'selected 5 th page  using pagination '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/select_102550100'), 
    '50', true)

'selected list of person in page 10 to 50 using pagination dropdown '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/select_102550100'), 
    '10', true)

'selected list of person in page 50 to 10 using pagination dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/input_All Vehicle Supervisors_'), 
    'prakasam')

'search for required Vehicle Supervisor '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/button_Add New Vehicle Supervi'))

'clicked add new Vehicle Supervisor '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'clicked register button with out given info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    'a')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Full Nsame as Single Characters'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    '1')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Mobile no as single number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    'dvdfbdffdv')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Mobile no as Characters'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    '!@#^!@%(*()&#')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Mobile no as Special Characters'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    '1234567')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Mobile no as lessthan 8 numbers '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    '987654321')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Mobile no as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_E-mail _email'), 
    'c')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Email as single Characters'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_E-mail _email'), 
    '@$#^*(^*%(^)(*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Email as Special Characters'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_E-mail _email'), 
    'djfvfh893y849')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'given email with out @ symbol '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_E-mail _email'), 
    'djfvfh893y849@gma')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Email wilth out domain '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    '*(@!^$*(@^47*#@%')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Full Name as Special Characters'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_E-mail _email'), 
    'vesu@gmail.com')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Email as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    'subara minutera 123')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Given Full name as alphanumaric '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    'Vehicle Super ')

'Given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Register'))

'Vehicle Supervisor  Created Successfully '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Supervisor List'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/input_All Vehicle Supervisors_'), 
    'Vehicle Super')

'Searched required Vehicle Supervisor '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/Page_PASTI by MYEG/a_Edit'))

'edit cVehicle Supervisor  page '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    '@$$%&!((*%(*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'Given full name as special characters '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    '')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'given full name as empty '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    'TEST 1234')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'given full name as alphanumaric '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Full Name _name'), 
    'Vehicle Super Edit ')

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    '12345')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'given full name as valid and  mobile no as empty lessthan 7 numbers '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    '')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'given mobile no as empty '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    '@(%#&$)*(')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'Given Mobile no as special characters '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    'vsfvtnb')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'Given Mobile number as characters '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/Page_PASTI by MyEG/Page_PASTI by MYEG/input_Mobile Number _mobileno'), 
    '6323147686')

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    '')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'Valid mobile no and Email as Empty '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    '^$#$%!&@^*()')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'given email as special characters '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    'dcbscu1234')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'given email with out @ symbol '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    'dcbscu1234@gmail')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'Given email with out domain name '
WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/input_E-mail _email'), 
    'vesuedit@gmail.com')

'Given valid email address '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Update'))

'Updated Successfully Vehicle Supervisor '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.delay(1)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Supervisor List'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/input_All Vehicle Supervisors_'), 
    'Vehicle Super')

'search required Vehicle Supervisor '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/Page_PASTI by MYEG/a_Delete'))

'Vehicle Supervisor  delete confirmation screen '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/input_Confirm_btn btn-default'))

'clicked Cancel to Vehicle Supervisor  Delete confirmation '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Supervisor List'))

WebUI.delay(1)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/input_All Vehicle Supervisors_'), 
    'Vehicle Super')

'searched  for Vehicle Supervisor  to delete '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MyEG/Page_PASTI by MYEG/a_Delete'))

'Confirmation for delete Vehicle Supervisor '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/button_Confirm'))

'Deleted Vehicle Supervisor '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.delay(1)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Supervisor List'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/input_All Vehicle Supervisors_'), 
    'Vehicle Super')

'Search for deleted contact person '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Contact_List_OB/Page_PASTI by MYEG/a_Logout'))

'Logout from pasti Admin '
WebUI.takeScreenshot()

WebUI.closeBrowser()

