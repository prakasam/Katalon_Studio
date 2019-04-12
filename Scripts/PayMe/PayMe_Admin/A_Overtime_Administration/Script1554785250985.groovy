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

'Payme Sign in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'Click sign in with given Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'it will open payme Admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_Overtime Administration'))

WebUI.waitForPageLoad(5)

'clicked overtime Administration sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'click add new button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input__name'), 'working on public holiday ')

'click save with Given name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Overtime Category page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_records per page_form-control'), 
    'working on public')

WebUI.waitForPageLoad(5)

'for Search given name , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/img_working on public holiday_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will open the coppied data in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it save data and auto redirect to overtime category page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_records per page_form-control'), 
    'working on public')

WebUI.waitForPageLoad(5)

'for Search given name , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/img_working on public holiday_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open the coppied data in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input__name'), 'working on public holiday  edit')

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the reocrd and auto redirected to overtime category page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_records per page_form-control'), 
    'working on public')

WebUI.waitForPageLoad(5)

'for Search given name , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/img_working on public holiday  edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked Delete image link , it will open confirmation message in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete record and auto redirected to overtime category page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_records per page_form-control'), 
    'working on public')

WebUI.waitForPageLoad(5)

'for Search given name , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/img_working on public holiday_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked Delete image link , it will open confirmation message in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete record and auto redirected to overtime category page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Name'))

'clicked name to arrange table data in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Name'))

WebUI.waitForPageLoad(5)

'clicked name to arrange table data in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_2'))

WebUI.waitForPageLoad(5)

'clicked second page using pagination '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_Overtime Categories'))

WebUI.waitForPageLoad(5)

'clicked overtime categories link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_Overtime Requests'))

WebUI.waitForPageLoad(5)

'clicked overtime request link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Add New_Requests'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open new page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/span_Kabir Hussin_Requests'))

WebUI.waitForPageLoad(5)

'clicked employ combobox for list \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_Employee_s2id_autogen2_search'), 
    'aplus')

WebUI.waitForPageLoad(5)

'given employee name to select  '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected requred employ name from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/span_Normal OT_Requests'))

WebUI.waitForPageLoad(5)

'clicked category combobox for list \r\n'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_Category_s2id_autogen3_search_Requests'), 
    'pay per hour ')

WebUI.waitForPageLoad(5)

'given category name  to select  reqquired '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected requred employ name from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input__start_time_Requests'), '2019-04-01 09:00:00')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input__end_time_Requests'), '2019-04-01 18:00:00')

WebUI.waitForPageLoad(5)

'given start , end  date and time  for overtime request '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/span_Select_Requests'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

'clicked project combobox to view list \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_Project_s2id_autogen4_search'), 
    'pdx')

WebUI.waitForPageLoad(5)

'given project name  to select  reqquired '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected requred Project name from combo box '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/textarea_Notes_notes_Requests'), 'pay per hour basic ')

WebUI.waitForPageLoad(5)

'click save with given details of work '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/textarea_Notes_notes_Requests'), Keys.chord(
        Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to overtime request page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_records per page_form-control_Requests'), 
    'pay per hour basic ')

WebUI.waitForPageLoad(5)

'search using category name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/img_Pending_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link to change the details , it wwill open edit page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/textarea_Notes_notes'), 
    'pay per hour basic  edit ')

WebUI.waitForPageLoad(5)

'click save with given noted details '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/textarea_Notes_notes_Requests'), Keys.chord(
        Keys.TAB, Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to overtime request page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_records per page_form-control_Requests'), 
    'pay per hour basic ')

WebUI.waitForPageLoad(5)

'search using category name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/img_Pending_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked change status image link to change the details , it will open in pop up to approve or reject '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/select_ApprovedRejected'), 
    'Approved', true)

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'changed status from drop down pending to approved '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/textarea_Status Change Note_overtimerequest_reason'), 
    'approving record ')

WebUI.waitForPageLoad(5)

'click change overtime request button , given note for required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Change OvertimeRequest Status'))

WebUI.waitForPageLoad(5)

'it will display the confirmation info in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Ok_1'))

WebUI.waitForPageLoad(5)

'clicked ok button to get back overtime request page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_Overtime Requests'))

WebUI.waitForPageLoad(5)

'clicked overtime request link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_records per page_form-control_Requests'), 
    'pay per hour basic ')

WebUI.waitForPageLoad(5)

'search using category name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/img_Approved_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked view log image link to view the details , it will open log details '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Ok_2'))

WebUI.waitForPageLoad(5)

'clicked ok button to get back overtime request page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/img_Approved_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will open for confirmation to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete record '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/input_records per page_form-control_Requests'), 
    'pay per hour basic ')

WebUI.waitForPageLoad(5)

'search using category name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_Overtime Requests'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_Overtime Requests'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Employee'))

WebUI.waitForPageLoad(5)

'clicked employ to arrange table data in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Employee'))

'clicked employ to arrange table data in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Category'))

'clicked category to arrange table data in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Category'))

'clicked category to arrange table data in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Start Time'))

'clicked start time to arrange table data in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Start Time'))

'clicked start time to arrange table data in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_End Time'))

'clicked end time to arrange table data in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_End Time'))

'clicked end time to arrange table data in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Project'))

'clicked project to arrange table data in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Project'))

'clicked project to arrange table data in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Status'))

'clicked status to arrange table data in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/th_Status'))

'clicked status to arrange table data in dessending order '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_2_Requests - Copy'))

'selected second page using pagination opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Overtime_Administration_OR/a_admin'))

WebUI.waitForPageLoad(0)

'clicked logged in name to view sign out opction '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php', FailureHandling.OPTIONAL)

