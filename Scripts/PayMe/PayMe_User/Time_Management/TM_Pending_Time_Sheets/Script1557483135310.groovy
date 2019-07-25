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

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

WebUI.maximizeWindow()

'Payme Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Time_Sheets/input_Remember me_username'), 'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Time_Sheets/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Time_Sheets/button_Sign in'))

WebUI.waitForPageLoad(5)

'logged in employee dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Time_Sheets/a_Personal Information'))

WebUI.waitForPageLoad(5)

'clicked personal information main menu to minimise '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Time_Sheets/a_Time Management'))

WebUI.waitForPageLoad(5)

'clicked time manangement main menu to maximise '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Time_Sheets/a_Time Sheets'))

WebUI.waitForPageLoad(5)

'clicked time sheets submenu , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/a_Pending TimeSheets'))

WebUI.waitForPageLoad(5)

'clicked Pending time sheets link , it will open page'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/input_records per page_form-control'), 
    '2018-06-03')

WebUI.waitForPageLoad(5)

'search  using start date , it will dispaly the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/input_records per page_form-control'), 
    '2018-07-07')

WebUI.waitForPageLoad(5)

'search  using end date , it will dispaly the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/input_records per page_form-control'), 
    '63:34')

WebUI.waitForPageLoad(5)

'search  using total time  , it will dispaly the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/input_records per page_form-control'), 
    'Pending')

WebUI.waitForPageLoad(5)

'search  using status , it will dispaly the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/input_records per page_form-control'), 
    '2018-05-06')

WebUI.waitForPageLoad(5)

'search  using date , it will dispaly the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/img_Pending_tableActionButton'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked edt timesheet entries , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/a_Pending TimeSheets'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/a_Pending TimeSheets'))

WebUI.waitForPageLoad(5)

'clicked Pending time sheets link , it will open page'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/th_Start Date_a'))

WebUI.waitForPageLoad(5)

'clicked start date in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/th_Start Date'))

WebUI.waitForPageLoad(5)

'clicked start date in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/th_End Date_a'))

WebUI.waitForPageLoad(5)

'clicked End date in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/th_End Date'))

WebUI.waitForPageLoad(5)

'clicked End date in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/th_Total Time_a'))

WebUI.waitForPageLoad(5)

'clicked Total Time in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/th_Total Time'))

WebUI.waitForPageLoad(5)

'clicked Total Time in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/th_Status_a'))

WebUI.waitForPageLoad(5)

'clicked status in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/th_Status'))

WebUI.waitForPageLoad(5)

'clicked status in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Time_Sheets/Pending_Time_Sheets/a_2'))

WebUI.waitForPageLoad(5)

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/a_Aplus edited 12'))

WebUI.waitForPageLoad(5)

'clicked profile name to get sign out opction '
WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Attendance/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php', FailureHandling.OPTIONAL)

