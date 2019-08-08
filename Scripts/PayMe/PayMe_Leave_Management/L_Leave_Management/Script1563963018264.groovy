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

WebUI.navigateToUrl('https://payme-generator-uat.myegdev.com/login')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

'PayMe Leave Management login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Login___BVID__11'), 'admin@payme.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Login___BVID__12'), 'J82CClAl9cv8ngEXbXetJw==')

WebUI.waitForPageLoad(2)

'Given Username and Password and clicked login buttion '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Login'))

WebUI.waitForPageLoad(2)

WebUI.delay(2)

'payme leave dash board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/a_Leave'))

WebUI.waitForPageLoad(2)

'clicked leave page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Add'))

WebUI.waitForPageLoad(2)

'clicked add button , it will open the page to add leave '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Submit'))

'clicked ok in allert message " Please fillup all details before submit  " '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.waitForPageLoad(2)

WebUI.delay(2)

'clicked submit button , with out given values , it will display the error messages. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Employee ID_employee_id'), 'pdx0037')

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/div_PDX0037'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/div_Select Leave Type'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/div_Annual Leave'))

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Start Date_start_date'), '25/07/2019')

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_End Date_end_date'), '25/07/2019')

WebUI.waitForPageLoad(2)

'given few details'
WebUI.takeScreenshot()

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/Leave_Management/select_Full DayFirst HalfSecond Half'), 
    'F', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Days Taken_days_taken'), '1')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/Leave_Management/select_ApprovedRejectedCancelled'), 
    'A', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/textarea_Description_description'), 'employee PDX0037 approved Anual Leave')

WebUI.waitForPageLoad(2)

'click submit with given required details'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Submit'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'it will save the record and auto redirect to leave page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'PDX0037')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_PDX0037'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'clicked filter button , it will filter based on the selection  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/td_PDX0037'))

WebUI.waitForPageLoad(2)

'click edit button with selected required leave record '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Edit'))

WebUI.waitForPageLoad(2)

'it will open the edit page , to change required info '
WebUI.takeScreenshot()

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

not_run: WebUI.waitForPageLoad(2)

not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('PayMe_OR/Leave_Management/select_ApprovedRejectedCancelled (1)'), 'R', 
    true)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/textarea_Description_description'), 'employee PDX0037 rejected transaction')

WebUI.waitForPageLoad(2)

'click submit with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Submit'))

WebUI.waitForPageLoad(2)

'it will save the record and auto redirect to leave page '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'PDX0037')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_PDX0037'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'clicked filter button , it will filter based on the selection  '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/td_PDX0037'))

WebUI.waitForPageLoad(2)

'click delete button with selected required leave record '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Delete'))

WebUI.waitForPageLoad(2)

'it will ask confirmation info to delete '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Yes delete it'))

WebUI.waitForPageLoad(2)

'clicked ok button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_OK'))

WebUI.waitForPageLoad(2)

'clicked ok , it will delete the record and auto redirect to leave page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Reset'))

WebUI.waitForPageLoad(2)

'selected reset button to clear the filter.  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'PDX0042')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_PDX0042'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'clicked filter button , it will filter based on the selection  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Download'))

WebUI.waitForPageLoad(2)

'clicked download button , it will download the filtered result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_EMP0003_leave_type'), '')

WebUI.waitForPageLoad(2)

'clicked select Leave tyepe , it will display available info to choose'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_Annual Leave'))

WebUI.waitForPageLoad(2)

'click filter with choosen Leave tye as " Annual Leave " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'it will display the annual leave records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_EMP0003_leave_type'), '')

WebUI.waitForPageLoad(2)

'clicked select Leave tyepe , it will display available info to choose'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_NoPayLeave'))

WebUI.waitForPageLoad(2)

'click filter with choosen Leave tye as " Hospitalization Leave " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'click filter, it will display the Hospitalization leave records \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_EMP0003_leave_type'), '')

WebUI.waitForPageLoad(2)

'clicked select Leave tyepe , it will display available info to choose'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_Medical Leave'))

WebUI.waitForPageLoad(2)

'click filter with choosen Leave tye as " Medical Leave " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

' click filter , it will display the Medical leave records .'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Reset'))

WebUI.waitForPageLoad(2)

'clicked reset , it will display all types of records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_date'), '2019-03-03')

WebUI.waitForPageLoad(2)

' click filter with given start date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Reset'))

WebUI.waitForPageLoad(2)

'clicked reset , it will display all types of records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Dec_date'), '2019-07-20')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/td_31'))

WebUI.waitForPageLoad(2)

' click filter with given end date \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Reset'))

WebUI.waitForPageLoad(2)

'clicked reset , it will display all types of records '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Description'))

not_run: WebUI.waitForPageLoad(2)

'clicked description in table , it will display the records in Assending Order '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Description'))

not_run: WebUI.waitForPageLoad(2)

'clicked description in table , it will display the records in Dessending Order '
not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Start Date'))

WebUI.waitForPageLoad(2)

'clicked Start date in table , it will display the records in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Start Date'))

WebUI.waitForPageLoad(2)

'clicked Start date in table , it will display the records in Dessending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_End Date'))

WebUI.waitForPageLoad(2)

'clicked End date in table , it will display the records in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_End Date'))

WebUI.waitForPageLoad(2)

'clicked End date in table , it will display the records in Dessending Order '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Days Taken'))

not_run: WebUI.waitForPageLoad(2)

'clicked Days Taken in table , it will display the records in Assending Order '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Days Taken'))

not_run: WebUI.waitForPageLoad(2)

'clicked Days Taken in table , it will display the records in Dessending Order '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Status'))

not_run: WebUI.waitForPageLoad(2)

'clicked Status in table , it will display the records in Assending Order '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Status'))

not_run: WebUI.waitForPageLoad(2)

'clicked Status in table , it will display the records in Dessending Order '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Date Created'))

not_run: WebUI.waitForPageLoad(2)

'clicked Created Date in table , it will display the records in Assending Order '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Date Created'))

not_run: WebUI.waitForPageLoad(2)

'clicked Created Date in table , it will display the records in Dessending Order '
not_run: WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'EMP101')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'clicked filter button , before bulk upload from file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Bulk Upload'))

WebUI.waitForPageLoad(2)

'clicked bulk upload button , it will open page to upload '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/input_Select leave file to upload_file'))

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

'clicked choose file/browse  button , it will open windows internet explorer to select file  '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

autoit_prj = 'D:\\workspace\\KSW\\UF\\PP\\leave.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.waitForPageLoad(5)

'added file to upload  '
WebUI.takeScreenshot()

WebUI.delay(2)

not_run: WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Submit'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(2)

'clicked submit button , file will uploaded successfully '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'EMP101')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

'clicked filter button ,after bulk upload from file data.'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'EMP101')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/td_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Delete'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Yes delete it'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_OK'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Reset'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'EMP101')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/td_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Delete'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Yes delete it'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_OK'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Reset'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'EMP101')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/button_Filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/td_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Delete'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Yes delete it'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_OK'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Reset'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Bulk Upload'))

WebUI.waitForPageLoad(2)

'clicked bulk upload button , it will open page to upload '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Download CSV template here'))

WebUI.waitForPageLoad(2)

'clicked download template button , it will download template to upload \r\n'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/img_Users_img-avatar'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

'clicked logged in user image , it will display logout opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/a_Logout'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

'clicked logout '
WebUI.takeScreenshot()

WebUI.closeBrowser()

