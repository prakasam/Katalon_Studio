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

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

WebUI.maximizeWindow()

'Payme Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme Admin Dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked Admin main menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_System'))

WebUI.waitForPageLoad(5)

'clicked system main menu'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Settings'))

WebUI.waitForPageLoad(5)

'clicked settings main menu , it will open by default company page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control'), 
    'logo')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_value_gkjSMAq2njUvGA1553488972559_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit tab , it will open in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control'), 
    'name')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_PayMe by MyEG_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit tab , it will open in page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_Value_value'), 'PayMe by MyEG')

WebUI.waitForPageLoad(5)

'given required name in test box to change value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control'), 
    'description')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_PayMe by MyEG HRM_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit tab , it will open in page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_Value_value'), 'PayMe by MyEG HRM')

WebUI.waitForPageLoad(5)

'given required name in test box to change value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Company'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/th_Name'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/th_Value'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/th_Details'))

WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_System_2'))

WebUI.waitForPageLoad(5)

'Clicked System Main link , it will open system page  \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control_System'), 
    'countries')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_Only these countries will be allowed in select boxes_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page \r\n\r\n\r\n'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'malaysia', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen required country name from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel_System'))

WebUI.waitForPageLoad(5)

'clicked edit tab , it will open in page \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_System_3'))

WebUI.waitForPageLoad(5)

'Clicked System Main link , it will open system page  \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Email'))

WebUI.waitForPageLoad(5)

'Clicked email Main link , it will open email page  \r\n\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control_email'), 'email ')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_Email Enable_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel_Email'))

WebUI.waitForPageLoad(5)

'clicked edit tab , it will open in page \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Leave  PTO'))

'Clicked Leave PTO Main link , it will open Leave PTO page  \r\n\r\n'
WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control_Leave'), 'employee')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_Leave Select Leave Period from Employee Department Country_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page \r\n\r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel_Leave'))

WebUI.waitForPageLoad(5)

'clicked edit tab , it will open in page \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_LDAP'))

WebUI.waitForPageLoad(5)

'Clicked LDAP Main link , it will open LDAP page  \r\n\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control_LDAP'), 'password')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_Password of the manager user_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel_LDAP'))

WebUI.waitForPageLoad(5)

'clicked edit tab , it will open in page \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Attendance'))

WebUI.waitForPageLoad(5)

'Clicked Attendance Main link , it will open Attendance page  \r\n\r\n\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control_Attendance'), 
    'photo')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_Require submitting a photo using web cam when marking attendance_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page \r\n\r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel_Attendance'))

WebUI.waitForPageLoad(5)

'Clicked edit tab , it will open in page \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Other'))

WebUI.waitForPageLoad(5)

'Clicked Others Main link , it will open others page  \r\n\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control_other'), 'admins')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/img_Allow indirect admins to approve travel requests_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will redirect to page \r\n\r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Cancel_Others'))

WebUI.waitForPageLoad(5)

'clicked edit tab , it will open in page \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Manage Modules'))

WebUI.waitForPageLoad(5)

'Clicked Malange Modules sub Main  , it will open usage as by default page  \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Modules'))

WebUI.waitForPageLoad(5)

'clicked modules link , it will open modules page  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_2'))

WebUI.waitForPageLoad(5)

'clicked second page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_1'))

WebUI.waitForPageLoad(5)

'clicked first page using page navigation '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control'), 
    'time sheets')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Manage Permissions'))

WebUI.waitForPageLoad(5)

'Clicked Malange Permissions sub Main  , it will open permissions as by default page  \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_4'))

WebUI.waitForPageLoad(5)

'clicked fourth page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_1'))

WebUI.waitForPageLoad(5)

'clicked first page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up to choose opctions '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'personal information employees', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen required opction using combo box '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/button_Filter_1'))

WebUI.waitForPageLoad(5)

'clickd filter in pop up, it will filter the available reqiuired data '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Manage Permissions'))

WebUI.waitForPageLoad(5)

'Clicked Malange Permissions sub Main  , it will open permissions as by default page  \r\n\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/input_records per page_form-control_Permissions1'), 
    'employee', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_admin (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked admin name to choose sign out opction'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Settings_MM_MP_OR/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked sign out . '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

