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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

'Navigate to Payme Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/input_Remember me_username'), 'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click sign in with given uaername and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Sign in'))

'payme user Dash board'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/a_Time Management'))

'click time management menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/a_Attendance'))

'click attendance sub menu '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Punch-in'))

WebUI.waitForAlert(10)

'clicked punch in button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/textarea_Note_note'), 'punch in ')

'click save with given notes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Save'))

'it will save the punch in info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Punch-out'))

WebUI.waitForAlert(0)

'clicked punch out button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/textarea_Note_note'), 'punch out')

'click save with given notes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Save'))

'it will display the message " Punch-in time should be lesser than Punch-out time" '
WebUI.takeScreenshot()

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Ok'), FailureHandling.OPTIONAL)

'clicked ok '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Cancel'), FailureHandling.OPTIONAL)

'clicked cancel '
WebUI.takeScreenshot()

WebUI.refresh()

'it will redirect back to attendance page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/input_records per page_form-control'), 
    '2018')

'search result based on the year '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/input_records per page_form-control'), 
    'jan')

'search result based on the month name. at prasent it was not working displaying message as "no matching result found "'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/input_records per page_form-control'), 
    'invalid data')

'search result invalid data , it will display message as "no matching result found "'
WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/a_Attendance_1'))

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/input_records per page_form-control'), 
    '08:00')

'search result based on the given time'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/th_Time-In'))

'sorting Assending order based on the time in\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/th_Time-In'))

'sorting Dessending order based on the time in'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/th_Time-Out'))

'sorting Assending order based on the time out \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/th_Time-Out'))

'sorting Dessending order based on the time out'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/th_Note'))

'sorting Assending order based on the Notes'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/th_Note'))

'sorting Dessending order based on the Notes'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/a_2'))

'click to view second page using pagination '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Punch-out'))

'Clicked punch out button'
WebUI.takeScreenshot()

WebUI.waitForAlert(10)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/textarea_Note_note'), 'punch out')

'click save with given notes'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/button_Save'))

'it was saved the record '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/a_Aplus edited 12'))

'clicked profile name to get sign out opction '
WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

