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

'login page of Payme '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Sign in'))

WebUI.waitForPageLoad(5)

'payme dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked admin main menu to minimize '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Employees'))

WebUI.waitForPageLoad(5)

'clicked Employee main menu to maximise '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Monitor Attendance'))

WebUI.waitForPageLoad(5)

'clicked monitor attendance sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open in page '
WebUI.takeScreenshot()

WebUI.delay(3)

not_run: WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/span_alert(1) alert(1)'))

not_run: WebUI.delay(3)

'clicked to select required employee from combo box '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/input_Employee_s2id_autogen2_search'), 
    'aplus')

not_run: WebUI.delay(3)

'given data to chosse '
not_run: WebUI.takeScreenshot()

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

not_run: WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, 'aplus', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected required employee from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/input__in_time'), '2019-04-22 08:00:00')

'given in time '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/input_Time-Out_out_time'), '2019-04-22 12:00:00')

'given out time '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/textarea_Note_note'), 
    'Half Day attendance')

'click save with given required data '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the data and auto redirect to monitor attendance page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/input_records per page_form-control'), 
    'aplus')

WebUI.waitForPageLoad(5)

'search using employee name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/img_one hour_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/textarea_Note_note'), 
    'today one hour edit ')

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to monitor attendance page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/input_records per page_form-control'), 
    '2019-04-22')

WebUI.waitForPageLoad(5)

'search using employee name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/img_today one .._tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask in pop up for confirmation '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete buttion for confirmation , it will delete record and auto redirect to monitor attendance page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter buttion , it will open pop uo for choose employee \r\n'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'april', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected required employee from combo box to filter \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Filter_popup_mt'))

WebUI.waitForPageLoad(5)

'clicked filter button in pop up , it will filter records based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Employee  April Fool'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked filtered button to closed it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Employee'))

'clicked Employee  in table , to arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Employee'))

'clicked Employee  in table , to arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Time-In'))

'clicked Time-in in table , to arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Time-In'))

'clicked Time-in in table , to arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Time-Out'))

'clicked Time-out in table , to arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Time-Out'))

'clicked Time-out in table , to arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Note'))

'clicked note in table , to arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Note'))

'clicked note in table , to arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_3'))

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Monitor Attendance_1'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Monitor Attendance_2'))

'clicked Monitor Attendance  link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Current Clocked In Status'))

WebUI.waitForPageLoad(5)

'clicked current Clocked in status link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Filter_CCS'))

WebUI.waitForPageLoad(5)

'clicked filter buttion , it will open pop uo for choose employee '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected required employee from combo box to filter '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Filter_popup_ccs'))

WebUI.waitForPageLoad(5)

'clicked filter button in pop up , it will filter records based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/button_Employee  Aplus edited 12 Multipurpose 12'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked filtered button to closed it '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Current Clocked In Status'))

WebUI.waitForPageLoad(5)

'clicked current Clocked in status link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/input_records per page_form-control_CCS'), 
    'aplus')

WebUI.waitForPageLoad(5)

'search using employee name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Current Clocked In Status'))

WebUI.waitForPageLoad(5)

'clicked current Clocked in status link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Employee_ccs'))

WebUI.waitForPageLoad(5)

'clicked Employee  in table , to arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Employee_ccs'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked Employee  in table , to arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Clocked In Status'))

WebUI.waitForPageLoad(5)

'clicked clock in status in table , to arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/th_Clocked In Status'))

WebUI.waitForPageLoad(5)

'clicked clock in status in table , to arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_3_CCS'))

WebUI.waitForPageLoad(5)

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_admin (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'click admin name to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_Monitor_Attendance/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'sign out from user '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

