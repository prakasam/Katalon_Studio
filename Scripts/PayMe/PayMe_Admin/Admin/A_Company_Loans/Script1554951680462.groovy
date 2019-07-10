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

'Sign in page of  Payme Application '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'it will open payme admin Dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_Company Loans'))

WebUI.waitForPageLoad(5)

'Clicked Company Loans sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button in loan types '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input__name'), 'car loan')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/textarea_Details_details'), 'Employ car loan')

'click save with given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and auto redirected to loan types page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control'), 
    'car ')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/img_Employ car loan_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked copy Image link , it will copy selected record in new page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it save data and auto redirect to loan types page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control'), 
    'car')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/img_Employ car loan_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked Edit Image link , it will open selected record in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input__name'), 'car loan edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/textarea_Details_details'), 'Employ car loan edit')

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Save'))

WebUI.waitForPageLoad(5)

' it save data and auto redirect to loan types page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control'), 
    'employ car')

WebUI.waitForPageLoad(5)

'search using details , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/img_Employ car loan edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked Delete Image link , it will ask confirmation message to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation. it will delete record and auto redirect to loan types page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control'), 
    'employ car')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/img_Employ car loan_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked Delete Image link , it will ask confirmation message to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation. it will delete record and auto redirect to loan types page  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Name'))

WebUI.waitForPageLoad(5)

'clicked name in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Name'))

WebUI.waitForPageLoad(5)

'clicked name in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Details'))

WebUI.waitForPageLoad(5)

'clicked Details in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Details'))

WebUI.waitForPageLoad(5)

'clicked Details in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_2'))

WebUI.waitForPageLoad(5)

'clicked Second page using pagination opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_Loan Types'))

WebUI.waitForPageLoad(5)

'clicked loan types link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_Company Loans'))

WebUI.waitForPageLoad(5)

'clicked company Loans sub menu ,'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_Employee Loans'))

WebUI.waitForPageLoad(5)

'clicked employ Loans link , it will open employ loans page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Add New_Employee'))

WebUI.waitForPageLoad(5)

'clicked add new page , it will open in new page '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.delay(2)

WebUI.waitForPageLoad(5)

'selected required employ '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/select_Personal loanEducational loanSalary in Advance Salary Advance  - HSBC LoanProperty Loancdefghijklmaalert(XSSR)'), 
    '7', true)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input__start_date'), '2019-04-01')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_Last Installment Date_last_installment_date'), 
    '2019-12-31')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input__period_months'), '9')

WebUI.delay(2)

WebUI.waitForPageLoad(5)

'given few details '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input__period_months'), Keys.chord(Keys.TAB, Keys.ENTER, 
        'malaysian', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected required currency '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input__amount'), '9000.00')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input__monthly_installment'), 
    '1000.00')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/select_Personal loanEducational loanSalary in Advance Salary Advance  - HSBC LoanProperty Loancdefghijklmaalert(XSSR)'), 
    'Approved', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/textarea_Details_details'), 'amount deducted from salary ')

WebUI.waitForPageLoad(5)

'click save with given all other details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to employ loans page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_Employee Loans'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_Employee Loans'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked employ loans link'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    'property')

WebUI.waitForPageLoad(5)

'search using Loan type , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/img_Approved_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will copy the data into new page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save button. it will save and auto redirect to employ loans page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    'property')

WebUI.waitForPageLoad(5)

'search using Loan type , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/img_Approved_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open edit page for selected details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/textarea_Details_details'), 'amount deducted from salary  edit')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Save'))

WebUI.waitForPageLoad(5)

' it will save and auto redirect to employ loans page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    'property')

WebUI.waitForPageLoad(5)

'search using Loan type , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/img_Approved_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked delte image button, it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete record and auto redirected to employ loans page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    'property')

WebUI.waitForPageLoad(5)

'search using Loan type , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/img_Approved_tableActionButton_3'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete record and auto redirected to employ loans page \r\n'
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delte image button, it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    'April fool')

WebUI.waitForPageLoad(5)

'search using Employee  , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    'property')

WebUI.waitForPageLoad(5)

'search using Loan type , it will display message "no matched records found"  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    '2018-11')

WebUI.waitForPageLoad(5)

'search using Loan start date , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    '45')

WebUI.waitForPageLoad(5)

'search using Loan Period (months), it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    'dollar')

WebUI.waitForPageLoad(5)

'search using Currency  , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    '1000')

WebUI.waitForPageLoad(5)

'search using Amount  , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_records per page_form-control_Employee'), 
    'paid')

WebUI.waitForPageLoad(5)

'search using Status , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_Employee Loans'))

WebUI.waitForPageLoad(5)

'clicked Employee loans link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Employee'))

WebUI.waitForPageLoad(5)

'clicked Employee in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Employee'))

WebUI.waitForPageLoad(5)

'clicked Employee in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Loan Type'))

WebUI.waitForPageLoad(5)

'clicked Loan type in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Loan Type'))

WebUI.waitForPageLoad(5)

'clicked Loan type in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Loan Start Date'))

WebUI.waitForPageLoad(5)

'clicked Loan Start date in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Loan Start Date'))

WebUI.waitForPageLoad(5)

'clicked Loan Start date in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Loan Period (Months)'))

WebUI.waitForPageLoad(5)

'clicked Loan Period  in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Loan Period (Months)'))

WebUI.waitForPageLoad(5)

'clicked Loan Period  in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Currency'))

WebUI.waitForPageLoad(5)

'clicked Currency in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Currency'))

WebUI.waitForPageLoad(5)

'clicked Currency in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Amount'))

WebUI.waitForPageLoad(5)

'clicked Amount in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Amount'))

WebUI.waitForPageLoad(5)

'clicked Amount in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Status'))

WebUI.waitForPageLoad(5)

'clicked Status in table, to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/th_Status'))

WebUI.waitForPageLoad(5)

'clicked Status in table, to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Filter__Employee'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up to filter data '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Filter__Employee_pop'))

WebUI.waitForPageLoad(5)

'clicked filter in pop up with out coosen opctions , it will display the result available '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Filter__Employee'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up to filter data '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/span_All Employees__Employee_pop'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.waitForPageLoad(5)

'clicked all employ to choose required '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/input_concat(id(  s2id_autogen3_search  ))_s2id_autogen3_search__Employee_pop'), 
    'aplus', FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.waitForPageLoad(5)

'entered text to search required '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.waitForPageLoad(5)

'selected required employ '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Filter__Employee_pop'))

WebUI.waitForPageLoad(5)

'clicked filter in pop up with coosen required employ , it will display the result available '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Filter__Employee'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up to filter data '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/select_All Loan TypesPersonal loanEducational loanSalary in Advance Salary Advance  - HSBC LoanProperty Loancdefghijklmaalert(XSSR)'), 
    '1', true, FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'licked loan type as personal '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Filter__Employee_pop'))

WebUI.waitForPageLoad(5)

'clicked filter in pop up with coosen required employ and loan type  , it will display the result available '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/button_Employee  Aplus edited 12 Multipurpose 12  Loan Type  Personal loan__Employee'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked reset filter opction , it will display all available records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_2_Employee'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked second page using pagination opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Company_Loan_OR/a_admin'))

WebUI.waitForPageLoad(5)

'clicked logged in user name to view sign out opction '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php', FailureHandling.OPTIONAL)

