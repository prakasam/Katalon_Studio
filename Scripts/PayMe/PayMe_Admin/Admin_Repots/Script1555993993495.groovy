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

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and paswword '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme Admin DashBoard page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked Admin main menu to minize '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Admin Reports'))

WebUI.waitForPageLoad(5)

'clicked Admin Reports main menu to miximize '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports'))

WebUI.waitForPageLoad(5)

'clicked reports , it will open the page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked report link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'employee details')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/img_Employee Details Report_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'Samsung', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen department from combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'full time contract', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen employee status from combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'machine operator', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen job title from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_3'))

WebUI.waitForPageLoad(5)

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'aplus')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'Active employee')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/AE/img_This report list employees who are currently active based on joined date and termination date_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'Samsung', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen department from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'april fool')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'New Hires Employee')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/NHE/img_This report list employees who are joined between given two dates_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'Samsung', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen department from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/NHE/input__date_start__NHE'), '2019-01-01')

WebUI.waitForPageLoad(5)

'Given start date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/NHE/input__date_end__NHE'), '2019-04-23')

WebUI.waitForPageLoad(5)

'given end date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'april fool')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'Terminated Employee ')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/TR/img_This report list employees who are terminated between given two dates_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'PDX', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen department from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/TR/input__date_start_TE'), '2019-01-01')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/TR/input__date_end_TE'), '2019-04-23')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'paniendra')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'Company Asset')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/CA/img_List company assets assigned to employees and departments_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'PDX', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen department from combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'select', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen Asset type from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'Employee Attendance')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/EA/img_This report list all employee attendance entries by employee and date range_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen employee from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/EA/input__date_start_EA'), '2019-03-01')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/EA/input__date_end_EA'), '2019-04-23')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'aplus')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/EA/a_2_EA'))

WebUI.waitForPageLoad(5)

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'Employee Time Tracking')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETT/img_This report list employee working hours and attendance details for each day for a given period_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen Employee from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETT/input__date_start_ETT'), '2019-01-01')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETT/input__date_end_ETT'), '2019-04-23')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETT/a_2_ETT'))

WebUI.waitForPageLoad(5)

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    '2019-03-13')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'Employee Time Entry')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETE/img_View employee time entries by date range and project_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen Employee from combo box '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETE/select_Not SelectedPDX ASE - Application LifecycleClient OverseaBarometric verificationcddefghijklmnopqraalert(testing)_ETE'), 
    '1', true)

WebUI.waitForPageLoad(5)

'Choosen client from drop down '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETE/select_All ProjectsPDX HP ASE - Application Project Oversea Mainbcdefghijklmnopaalert(testing)_ETE'), 
    '2', true)

WebUI.waitForPageLoad(5)

'Choosen Employee from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETE/input__date_start_ETE'), '2019-01-01')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETE/input__date_end_ETE'), '2019-04-23')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETE/a_2_ETE'))

WebUI.waitForPageLoad(5)

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'time sheet')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'Employee Time Sheet')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETS/img_This report list all employee time sheets by employee and date range_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen employee from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETS/input__date_start_ETS'), '2019-01-01')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETS/input__date_end_ETS'), '2019-04-23')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETS/select_All StatusApprovedPendingRejected_ETS'), 
    'NULL', true)

WebUI.waitForPageLoad(5)

'Choosen status from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/ETS/a_1_ETS'))

WebUI.waitForPageLoad(5)

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'rejected')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'Travel Request')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/TRR/img_This report list employees travel requests for a specified period_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked image download link , it will open the page with opction to download '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Choosen employee from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/TRR/input__date_start_TRR'), '2019-01-01')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/TRR/input__date_end_TRR'), '2019-04-23')

WebUI.waitForPageLoad(5)

'Search using reports name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/TRR/select_All StatusesApprovedPendingRejectedCancellation RequestedCancelled_TRR'), 
    'NULL', true)

WebUI.waitForPageLoad(5)

'Choosen status from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/button_Download'))

WebUI.waitForPageLoad(5)

'clicked download report button , it will display the result to download '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Download Report_Employee_Details'))

WebUI.waitForPageLoad(5)

'clicked Download report link , it will download the report in csv file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/TRR/a_1_TRR'))

WebUI.waitForPageLoad(5)

'clicked third page using page navigation '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/input_records per page_form-control'), 
    'meeting')

WebUI.waitForPageLoad(5)

'Search using reports employee name , it will display the matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Reports_link'))

WebUI.waitForPageLoad(5)

'clicked reports link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/th_Name'))

'click name in table to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/th_Name'))

'click name in table to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/th_Details'))

'click Details in table to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/Admin_Reports/th_Details'))

'click Details in table to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_admin (1)'))

WebUI.waitForPageLoad(5)

'clisk login user name to find sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Admin_Reports/a_Sign out'))

WebUI.waitForPageLoad(5)

'sign out from user '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

