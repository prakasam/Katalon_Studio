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

'payme login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'payme admin dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked admin main menu to minimise sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_Payroll'))

WebUI.waitForPageLoad(5)

'clicked Payroll main menu to maximise sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Company_Payroll/a_Payroll Reports'))

WebUI.waitForPageLoad(5)

'clicked PayRoll Reports sub menu , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/a_Payroll Reports'))

WebUI.waitForPageLoad(5)

'clicked Company PayRoll link  , it will open page ( by default page for payroll reports sub menu ) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input__name'), 'Sample PayRoll')

WebUI.waitForPageLoad(5)

'given Name details '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/select_Bi WeeklyWeeklySemi MonthlyMonthlyYearly'), 
    '4', true)

WebUI.waitForPageLoad(5)

'Selected pay frequency from drop down '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/select_Samsung SDIsdeIT Calculation Group'), 
    '1', true)

WebUI.waitForPageLoad(5)

'Selected Calculation group from drop down '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/select_PayslipsdeIT -'), 
    '1', true)

WebUI.waitForPageLoad(5)

'Selected pay slip template from drop down '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/select_PayslipsdeIT -'), Keys.chord(
        Keys.TAB, Keys.ENTER, 'Samsung SDI', Keys.ENTER), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

'Selected Department from drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input__date_start'), '2019-04-01')

WebUI.waitForPageLoad(5)

'given start date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input__date_end'), '2019-04-30')

WebUI.waitForPageLoad(5)

'given end date '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input__date_end'), Keys.chord(Keys.TAB, 
        Keys.ENTER, 'Basic Salary', Keys.ENTER), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

'Selected Payroll Columns from combo box '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/select_DraftCompleted'), 
    'Draft', true)

WebUI.waitForPageLoad(5)

'Selected Status from Drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to payroll Report page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input_records per page_form-control'), 
    'Sample Payroll')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/img_Draft_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'click edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/select_DraftCompleted'), 
    'Completed', true)

WebUI.waitForPageLoad(5)

'click save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/button_Save'))

WebUI.waitForPageLoad(5)

'click Save, it will save the record and auto redirect to payroll Report page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input_records per page_form-control'), 
    'Sample Payroll')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/img_Completed_tableActionButton_process'))

WebUI.waitForPageLoad(5)

'click copy image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/button_Download'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'click Save, it will display duplicate info message in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/button_Cancel_d'))

WebUI.waitForPageLoad(5)

'click cancel , it will  auto redirect to payroll Report page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input_records per page_form-control'), 
    'Sample Payroll')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/img_Completed_tableActionButton_Copy'))

WebUI.waitForPageLoad(5)

'click Copy image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/button_Save'))

WebUI.waitForPageLoad(5)

'click Save, it will save the record and auto redirect to payroll Report page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input_records per page_form-control'), 
    'Sample Payroll')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/img_Completed_tableActionButton'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'click Delete image link , it will ask confirmation in pop up  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete , it will delete the record and auto redirect to payroll Report page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/input_records per page_form-control'), 
    'Sample Payroll')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/img_Completed_tableActionButton'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'click Delete image link , it will ask confirmation in pop up  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete , it will delete the record and auto redirect to payroll Report page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Name_a'))

WebUI.waitForPageLoad(5)

'clicked Name in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Name'))

WebUI.waitForPageLoad(5)

'clicked Name in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Pay Frequency_a'))

WebUI.waitForPageLoad(5)

'clicked pay frequency in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Pay Frequency'))

WebUI.waitForPageLoad(5)

'clicked pay frequency in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Department_a'))

WebUI.waitForPageLoad(5)

'clicked Department in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Department'))

WebUI.waitForPageLoad(5)

'clicked Department in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Date Start_a'))

WebUI.waitForPageLoad(5)

'clicked Date Start in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Date Start'))

WebUI.waitForPageLoad(5)

'clicked Date Start in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Date End_a'))

WebUI.waitForPageLoad(5)

'clicked Date end in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Date End'))

WebUI.waitForPageLoad(5)

'clicked Date end in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Status_a'))

WebUI.waitForPageLoad(5)

'clicked Status in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Report_OR/th_Status'))

WebUI.waitForPageLoad(5)

'clicked Status in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_admin (1)'))

WebUI.waitForPageLoad(5)

'clicked admin name to view the sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_Sign out'))

WebUI.waitForPageLoad(5)

'clicked sign out and it will auto redirect to login page '
WebUI.takeScreenshot()

WebUI.closeBrowser(FailureHandling.OPTIONAL)

