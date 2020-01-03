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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev3.myeg.com.my/AIGSales/login.do')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

'opened AIG Sales Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__password'), 'aeHFOx8jV/A=')

WebUI.waitForPageLoad(5)

'Given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__actionloginaction'))

WebUI.waitForPageLoad(5)

'clicked submit , it will redirect to login page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Reports'))

WebUI.waitForPageLoad(5)

'clicked report link , it will open report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Outbound Campaign Tracking Report (OCTR)'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked search , with out given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger_from'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_1'))

WebUI.waitForPageLoad(5)

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_31'))

WebUI.waitForPageLoad(5)

'given todate '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked search , it will featch record from and DB and display the report '
WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/a_Click Here for Excel report'), 10)

WebUI.waitForPageLoad(5)

'Clicked export report link , it will download the report in excell file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Reports'))

WebUI.waitForPageLoad(5)

WebUI.delay(10)

'clicked report link , it will open report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Sale Summary Report - Paid Policy'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked search , with out given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger_from'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_1'))

WebUI.waitForPageLoad(5)

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_31'))

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__todate'), '2019-10-17')

not_run: WebUI.waitForPageLoad(5)

'given from date '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__todate'), '2019-10-17')

WebUI.waitForPageLoad(5)

'given to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.delay(10)

'clicked search , it will featch record from and DB and display the report '
WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/a_Click Here for Excel report_1'), 10)

WebUI.waitForPageLoad(5)

'Clicked export report link , it will download the report in excell file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Reports'))

WebUI.waitForPageLoad(5)

'clicked report link , it will open report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Daily  MTD Sales Summary Report'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked search , with out given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger_from'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_1'))

WebUI.waitForPageLoad(5)

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_31'))

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__fromdate'), '2019-10-01')

not_run: WebUI.waitForPageLoad(5)

'given from date '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__todate'), '2019-10-17')

WebUI.waitForPageLoad(5)

'given to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.delay(10)

'clicked search , it will featch record from and DB and display the report '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Click Here for Excel report_2'))

WebUI.waitForPageLoad(5)

'Clicked export report link , it will download the report in excell file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Reports'))

WebUI.waitForPageLoad(5)

'clicked report link , it will open report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_QA REPORT'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked search , with out given from and to date '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger_from'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_1'))

WebUI.waitForPageLoad(5)

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_31'))

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__fromdate'), '2019-10-01')

not_run: WebUI.waitForPageLoad(5)

'given from date '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__todate'), '2019-10-17')

WebUI.waitForPageLoad(5)

'given to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.delay(10)

'clicked search , it will featch record from and DB and display the report '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Click Here for Excel report_3'))

WebUI.waitForPageLoad(5)

'Clicked export report link , it will download the report in excell file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Reports'))

WebUI.waitForPageLoad(5)

'clicked report link , it will open report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Outbound Campaign Tracking Report by All Agent'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked search , with out given from and to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger_from'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_1'))

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__fromdate'), '2019-10-01')

WebUI.waitForPageLoad(5)

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/img__ui-datepicker-trigger'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '9', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2019', true)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_31'))

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__fromdate'), '2019-10-01')

not_run: WebUI.waitForPageLoad(5)

'given from date '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__todate'), '2019-10-17')

WebUI.waitForPageLoad(5)

'given to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.delay(10)

'clicked search , it will featch record from and DB and display the report '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Click Here for Excel report_4'))

WebUI.waitForPageLoad(5)

'Clicked export report link , it will download the report in excell file '
WebUI.takeScreenshot()

WebUI.navigateToUrl('http://dev3.myeg.com.my/AIGSales/JSP/reports.jsp')

not_run: WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Reports'))

WebUI.waitForPageLoad(5)

'clicked report link , it will open report main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Report/a_Log Out'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

