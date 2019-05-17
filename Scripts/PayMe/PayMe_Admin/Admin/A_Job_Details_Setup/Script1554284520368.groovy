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

'Payme login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme Admin Dash Board'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Job Details Setup'))

WebUI.waitForPageLoad(5)

'clicked Job details page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out given required details'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_PayMe by MyEG/input__code'), 'CFW', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_PayMe by MyEG/input__name'), 'Construction Field Work', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__code'), 'CFW')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__name'), 'Construction Field Work')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/textarea__description'), 
    'with in the site work ')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/textarea__specification'), 
    'hard worker ')

'click save with Given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and auto redirected to job details page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control'), 
    'cfw')

WebUI.waitForPageLoad(5)

'search using Code for required details . it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_Construction Field Work_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__code'), 'CFWJ')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__name'), 'Construction Field Work edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/textarea__description'), 
    'with in the site work edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/textarea__specification'), 
    'hard worker edit')

'click save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and auto redirect to job details page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control'), 
    'construction')

WebUI.waitForPageLoad(5)

'search using name for required details , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_Construction Field Work edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will copy same data '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it saveed and auto redirect to job details page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control'), 
    'CFWJ')

WebUI.waitForPageLoad(5)

'search using Code for required details , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_Construction Field Work edit_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will display confirmation message to delete  '
WebUI.takeScreenshot()

WebUI.waitForAlert(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button from pop up for confirmation , it will delete record and auto redirected to job details page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control'), 
    'construction')

WebUI.waitForPageLoad(5)

'search using name for required details , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_Construction Field Work edit_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation message in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button from pop up for confirmation , it will delete record and auto redirected to job details page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Code'))

'Clicked code to arrange assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Code'))

'Clicked code to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Name'))

'Clicked Name to arrange assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Name'))

WebUI.waitForPageLoad(5)

'Clicked Name to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_2'))

WebUI.waitForPageLoad(5)

'Clicked page two using page navigation '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Job Details Setup'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Pay Grades'))

WebUI.waitForPageLoad(5)

'Clicked PayGrades tab in Job details page  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Add New_paygrades'))

WebUI.waitForPageLoad(5)

'clicked Add New button '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out given data , it will display in red color for mandatory fields '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__name_payGrade'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__name_payGrade'), 'Worker day shift')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__min_salary'), '1500.00')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__max_salary'), '3000.00')

'clicked save with given required fields '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and redirect back to paygrades page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_paygrades'), 
    'worker day shift')

WebUI.waitForPageLoad(5)

'search using name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_Utd. Arab Emir. Dirham_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open to edit details for selected record '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__name_payGrade'), 'Worker day shift edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__min_salary'), '2000.00')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__max_salary'), '4000.00')

'clicked save with given  required changes  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the data and auto redirect to paygrade page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_paygrades'), 
    'worker day shift')

WebUI.waitForPageLoad(5)

'search using name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_Utd. Arab Emir. Dirham_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked Copy image link , it will copy selected record data '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save, it will save data and auto redirect to paygrade page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_paygrades'), 
    'worker day ')

WebUI.waitForPageLoad(5)

'search using name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_Utd. Arab Emir. Dirham_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked Delete image link , it will ask confirmation to delete data '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete buttion . it will delete data and auto redirect to pay grade page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_paygrades'), 
    'worker day')

WebUI.waitForPageLoad(5)

'search using name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_Utd. Arab Emir. Dirham_tableActionButton_3'))

WebUI.waitForPageLoad(5)

'clicked Delete image link , it will ask confirmation to delete data '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete buttion . it will delete data and auto redirect to pay grade page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_paygrades'), 
    'singapore Dollar')

WebUI.waitForPageLoad(5)

'search using Currency name , it will display  matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_paygrades'), 
    '2000')

WebUI.waitForPageLoad(5)

'search using Minimum salary ,'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_paygrades'), 
    '4000')

WebUI.waitForPageLoad(5)

'search using maximum salary ,'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_paygrades'), 
    'worker day')

WebUI.waitForPageLoad(5)

'search using name , it will display message " No matched records found " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Pay Grades'))

WebUI.waitForPageLoad(5)

'clicked paygrades opction from job details  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Name_paygrades'))

'clicked name link  , it will arrange in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Name_paygrades'), FailureHandling.OPTIONAL)

'clicked name link  , it will arrange in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Currency'))

'clicked currency link  , it will arrange in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Currency'))

'clicked currency link  , it will arrange in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Min Salary'))

'clicked salary link  , it will arrange in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Min Salary'))

'clicked salary link  , it will arrange in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Max Salary'))

'clicked max salary link  , it will arrange in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Max Salary'))

WebUI.waitForPageLoad(5)

'clicked max salary link  , it will arrange in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_2_paygrades'))

WebUI.waitForPageLoad(5)

'clicked page two using pagination opctions '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Job Details Setup'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Employment Status'))

WebUI.waitForPageLoad(5)

'clicked Employ status in job details page , it will open employ status page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Add New_employ_status'))

WebUI.waitForPageLoad(5)

'clicked add new button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out given data , it will displau red color font for required fields '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__name_employstatus'), 'contract 12 months')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/textarea__description'), 
    'employ based on the contract ')

'click save with given required data '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and auto redirect to employ status page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_employ_staatus'), 
    'contract 12 months')

WebUI.waitForPageLoad(5)

'click search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_employ based on the contract_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open to change details selected '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input__name_employstatus'), 'contract 12 months edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/textarea__description'), 
    'employ based on the contract  edit')

WebUI.waitForPageLoad(5)

'clicke save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the data and auto redirect to employ status page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_employ_staatus'), 
    'contract 12 months')

'click search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_employ based on the contract  edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will coppy selected details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicke save with given required details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_employ_staatus'), 
    'contract 12 months')

WebUI.waitForPageLoad(5)

'click search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_employ based on the contract  edit_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , data deleted and auto redirecred fo employ status page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_employ_staatus'), 
    'employ based on the ')

WebUI.waitForPageLoad(5)

'click search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/img_employ based on the contract  edit_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , data deleted and auto redirecred fo employ status page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_employ_staatus'), 
    '19')

WebUI.waitForPageLoad(5)

'click search using ID , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_employ_staatus'), 
    'Full day')

WebUI.waitForPageLoad(5)

'click search using description, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/input_records per page_form-control_employ_staatus'), 
    'Nodata')

WebUI.waitForPageLoad(5)

'click search using invalid data , it will display message " No matcheing records found"  '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Job Details Setup'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Employment Status'))

WebUI.waitForPageLoad(5)

'clicked Employ status in job details page , it will open employ status page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_ID'))

'clicked ID, it will arrange  in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_ID'))

'clicked ID, it will arrange  in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Name_employstatus'))

'clicked name,  it will arrange  in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Name_employstatus'), FailureHandling.OPTIONAL)

'clicked name,  it will arrange  in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Description'))

'clicked Description , it will arrange  in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/th_Description'))

WebUI.waitForPageLoad(5)

'clicked Description , it will arrange  in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_2_employstatus'))

WebUI.waitForPageLoad(5)

'clicked page two, using pagination opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Dashboard'))

WebUI.waitForPageLoad(5)

'clicked admin name to selkect sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_admin'))

'it will open in mew pags'
WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Job_Details_Setup_OR/a_Sign out'))

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

