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

'Payme Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/input_Remember me_username'), 'ahmadabd')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/input_Remember me_password'), 
    'Fgb4om/NfyPD4FoUS/u0yg==')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Sign in'))

WebUI.waitForPageLoad(10)

'payme user dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/a_Personal Information'))

WebUI.delay(3)

'Clicked personalmation menu to minimize '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_User Reports'))

WebUI.delay(3)

'Clicked User Reports menu to expand '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports'))

WebUI.waitForPageLoad(5)

'clicked report sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/img_Download your payslips_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked Download payslip , it will open download payslip page '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/select_sdi payroll calculationsde'), 
    '3', true)

'selected required company from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Download'))

WebUI.waitForAlert(5)

'Clicked download Buttion, to download payslip '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Download Report'), FailureHandling.OPTIONAL)

'Clicked download link from result to get excell sheet '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Ok'))

'Clicked Ok button to get back download payslip page  '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Cancel'), FailureHandling.OPTIONAL)

'clicked cancel button '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

'sign out from user '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/input_Remember me_username'), 'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Sign in'))

WebUI.waitForPageLoad(10)

'signed in with different user '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/a_Personal Information'))

WebUI.delay(3)

'clicked personal information menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_User Reports'))

WebUI.delay(3)

'clicked user reports menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports'))

WebUI.waitForPageLoad(5)

'clicked report sub menu '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/Time_Entry_Report'))

WebUI.waitForPageLoad(5)

'clicked time entry report , it will open time entry report page '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/select_Not SelectedPDX ASE - Application LifecycleClient OverseaBarometric verificationcddefghijklmnopqraalert(testing)'), 
    '1', true)

'selected client as PDX ASE - Application Lifecycle from opctions '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/select_All ProjectsPDX HP ASE - Application Project Oversea Mainbcdefghijklmnopaalert(testing)'), 
    'NULL', true)

'selected all projection from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_start'), '2019-01-01')

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_end'), '2019-09-24')

'click download with given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Download'))

'it will display the available result in new page with download opction '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Download Report_1'), FailureHandling.OPTIONAL)

'Clicked download link from result to get excell sheet '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_1'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_2'))

'selected report sub menu to redirect report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/Attendance_Report'))

WebUI.waitForPageLoad(5)

'clicked attendance report image link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_start'), '2019-01-01')

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_end'), '2019-09-26')

'click download with given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Download'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Download Report_2'), FailureHandling.OPTIONAL)

'Clicked download link from result to get excell sheet '
WebUI.takeScreenshot()

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_3'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_3'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_4'))

'selected report sub menu to redirect report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/Time_tracking_Report'))

WebUI.waitForPageLoad(5)

'clicked Time tracking report image link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_start'), '2019-03-01')

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_end'), '2019-03-31')

'click download with given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Download'))

'it will display the result with download link '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Download Report_3'), FailureHandling.OPTIONAL)

'Clicked download link from result to get excell sheet '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_2'), FailureHandling.OPTIONAL)

'selected second page uaing page navigation '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_5'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_6'))

'selected report sub menu to redirect report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/time_sheets_report'))

WebUI.waitForPageLoad(5)

'clicked time sheet report image link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_start'), '2019-01-01')

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_end'), '2019-09-26')

' with given from and to date '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/select_All StatusApprovedPendingRejected'), 
    'NULL', true)

'click download with selected all from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Download'))

'it will display the result with download link '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Download Report_4'), FailureHandling.OPTIONAL)

'Clicked download link from result to get excell sheet '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_2'), FailureHandling.OPTIONAL)

'selected page 2 using pagination opctions'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_7'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_8'))

'selected report sub menu to redirect report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/client_projects_time_report'))

WebUI.waitForPageLoad(5)

'clicked client project time report image link '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/select_PDX ASE - Application LifecycleClient OverseaBarometric verificationcddefghijklmnopqraalert(testing) (1)'), 
    '1', true)

'selected client as PDX ASE - Application Lifecycle from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_start'), '2019-01-01')

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_end'), '2019-09-26')

'click download with given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Download'))

'it will display the result with download link , if available '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_9'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Reports_10'))

'selected report sub menu to redirect report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/travel_requests_report'))

WebUI.waitForPageLoad(5)

'clicked travel request report image link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_start'), '2019-01-01')

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/UR_Reports/input__date_end'), '2019-09-26')

' given from and to date '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/select_All StatusesApprovedPendingRejectedCancellation RequestedCancelled'), 
    'NULL', true)

'selected all from opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/button_Download'))

'it will display the result with download link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Aplus edited 12'))

'selected user name to get sign out opction '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/UR_Reports/a_Sign out'))

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

