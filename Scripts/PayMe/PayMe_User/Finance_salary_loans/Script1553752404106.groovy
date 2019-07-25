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

'Login Page of Payme'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_Remember me_username'), 'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click sign in with given username and password'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/button_Sign in'))

'Payme user Dash board'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_Finance'))

'clicked finance\tmenu'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_Salary'))

'clicked salary sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_Salary_1'))

WebUI.waitForPageLoad(10)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    'basic salary')

'Search given salary compnent data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    '2000')

'Search given amount data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    'special cases')

'Search given details data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    'no data found')

'Search given invalid data , it will display meessage " No matched records found" '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Salary Component'))

'sort Salary component in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Salary Component'))

'sort Salary component in Dessending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Amount'))

'sort Amount in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Amount'))

'sort Amount in Dessending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Details'))

'sort Details in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Details'))

'sort Details in Dessending Order '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_2'))

'selected second page using pagination '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_Finance'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_Loans'))

'Click Loans sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_Loans Taken'))

WebUI.waitForPageLoad(10)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    'personal loan')

'Search given Loan type data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    '2019-03-01')

'Search given Start date data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    '6')

'Search given duration data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    'Malaysian')

'Search given Currency data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    '2000')

'Search given amount data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    'Approved')

'Search given status data , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/input_records per page_form-control'), 
    'no data found')

'Search given invalid data , it will display Message " No matched records Found"  '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Loan Type'))

'sort loan type in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Loan Type'))

'sort loan type in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Loan Start Date'))

'sort loan start date in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Loan Start Date'))

'sort loan start date in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Loan Period (Months)'))

'sort loan Period in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Loan Period (Months)'))

'sort loan Period in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Currency'))

'sort Currency in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Currency'))

'sort Currency in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Amount'))

'sort Amount in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Amount'))

'sort Amount in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Status'))

'sort status in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/th_Status'))

'sort status in Dessending order'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/img_Suspended_tableActionButton'))

'clicked view loan details '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/button_Cancel'))

'clicked cancel to return back loan page '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_2'))

'clicked second page using pagination '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_Aplus edited 12'))

'Selected user name to sign out '
WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/F_Salary_Loans/a_Sign out'))

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php', FailureHandling.OPTIONAL)

