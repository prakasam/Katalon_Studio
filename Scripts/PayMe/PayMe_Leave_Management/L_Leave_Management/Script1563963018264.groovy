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

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Login'))

WebUI.waitForPageLoad(2)

'clicked login button with out given username and password  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Login___BVID__11'), 'sigdfhbgj')

WebUI.waitForPageLoad(2)

'Given Username (invalid) and clicked login button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Login'))

WebUI.waitForPageLoad(2)

'clicked login button with given username only'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Login___BVID__11'), 'admin@payme.com')

WebUI.waitForPageLoad(2)

'Given Username and clicked login button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Login'))

WebUI.waitForPageLoad(2)

'clicked login button with given username only'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Login___BVID__11'), 'admin@payme.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Login___BVID__12'), 'f8ArVKsbIHSURGvdcFG35Q==')

WebUI.waitForPageLoad(2)

'Given Username and password ( invalid )clicked login button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Login'))

WebUI.waitForPageLoad(2)

'clicked login button with out given username and password  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Login___BVID__11'), 'admin@payme.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Login___BVID__12'), 'J82CClAl9cv8ngEXbXetJw==')

WebUI.waitForPageLoad(2)

'Given Username and Password and clicked login button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Login'))

WebUI.waitForPageLoad(2)

WebUI.delay(2)

'payme leave dash board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/a_Leave'))

WebUI.waitForPageLoad(2)

WebUI.delay(2)

'clicked leave page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Add'))

WebUI.waitForPageLoad(2)

WebUI.delay(2)

'clicked add button , it will open the page to add leave '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Submit'))

WebUI.delay(2)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

WebUI.delay(2)

'clicked submit button , with out given values , it will display the error messages. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Employee ID_employee_id'), 'pdx0037')

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/div_PDX0037'))

'selected employee from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/div_Select Leave Type'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/div_Annual Leave'))

'selected Anual Leave from Leave type dropdown '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Start Date_date'), '2019-08-01')

'Given start date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_End Date_date'), '2019-08-01')

WebUI.waitForPageLoad(2)

'Given End date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/input_Days Taken_days_taken'), '1')

'Given Days Taken  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/Leave_Management/textarea_Description_description'), 'employee PDX0037 approved Anual Leave')

WebUI.waitForPageLoad(2)

'Given description, and click submit with given required details.'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Submit'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'it will save the record and auto redirect to leave page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'paniendra37')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_PDX0037'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

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

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/textarea_Description_description'), 'employee PDX0037 edited transaction')

WebUI.waitForPageLoad(2)

'click submit with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Submit'))

WebUI.waitForPageLoad(2)

'it will save the record and auto redirect to leave page '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'paniendra37')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_PDX0037'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

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

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset'))

WebUI.waitForPageLoad(2)

'selected reset button to clear the filter.  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'paniendra42')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_PDX0042'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

WebUI.waitForPageLoad(2)

'clicked filter button , it will filter based on the selection  '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Download'))

WebUI.waitForPageLoad(2)

'clicked download button , it will download the filtered result '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_TIA ABDUL (EMP0003)_leave_type'), 'annual leave')

WebUI.waitForPageLoad(2)

'clicked select Leave tyepe , it will display available info to choose'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_Annual Leave'))

WebUI.waitForPageLoad(2)

'click filter with choosen Leave tye as " Annual Leave " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'it will display the annual leave records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_TIA ABDUL (EMP0003)_leave_type'), 'no pay leave')

WebUI.waitForPageLoad(2)

'clicked select Leave tyepe , it will display available info to choose'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_NoPayLeave'))

WebUI.waitForPageLoad(2)

'click filter with choosen Leave tye as " Hospitalization Leave " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'click filter, it will display the Hospitalization leave records \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_TIA ABDUL (EMP0003)_leave_type'), 'medical leave')

WebUI.waitForPageLoad(2)

'clicked select Leave tyepe , it will display available info to choose'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_Medical Leave'))

WebUI.waitForPageLoad(2)

'click filter with choosen Leave tye as " Medical Leave " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

' click filter , it will display the Medical leave records .'
WebUI.takeScreenshot()

'selected reset button to clear the filter.  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_No Pay Leave_date'), '2019-07-01 ~ 2019-07-05')

WebUI.waitForPageLoad(2)

' click filter with given start date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

WebUI.waitForPageLoad(2)

'it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.delay(3)

'selected reset button to clear the filter.  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Dec_date'), '2019-08-01 ~ 2019-08-02')

WebUI.waitForPageLoad(2)

' click filter with given end date \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'selected reset button to clear the filter.  '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Start Date'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked Start date in table , it will display the records in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_Start Date'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked Start date in table , it will display the records in Dessending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_End Date'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked End date in table , it will display the records in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/th_End Date'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked End date in table , it will display the records in Dessending Order '
WebUI.takeScreenshot()

WebUI.delay(3)

'selected reset button to clear the filter.  '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'Ahmad Abu')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

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

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(2)

'clicked submit button , file will uploaded successfully '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.doubleClick(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

WebUI.delay(2)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'Ahmad Abu')

WebUI.waitForPageLoad(2)

'search required employee no'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

'clicked required employee id'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

WebUI.waitForPageLoad(2)

'clicked filter button ,after bulk upload from file data.'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/td_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Delete'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Yes delete it'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_OK'))

WebUI.waitForPageLoad(2)

WebUI.doubleClick(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'Ahmad Abu')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

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

WebUI.doubleClick(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/input_Delete_employee_id'), 'Ahmad Abu')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/div_EMP101'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter'))

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

WebUI.refresh()

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Bulk Upload'))

WebUI.waitForPageLoad(2)

'clicked bulk upload button , it will open page to upload '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(2)

'clicked submit button , with out file upload'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/input_Select leave file to upload_file'))

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

'clicked choose file/browse  button , it will open windows internet explorer to select file  '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

autoit_prj = 'D:\\workspace\\KSW\\UF\\PP\\leaveinvalid.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.waitForPageLoad(5)

'added invalid file to upload  '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(2)

'clicked submit button , it will display error message '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/button_Download CSV template here'))

WebUI.waitForAlert(2, FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

'clicked download template button , it will download template to upload \r\n'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/a_Audit Logs'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked Audit logs link , it will open audit log information page.'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/input_Show_user_id'), 'payme')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/div_Payme Generator Admin'))

WebUI.waitForPageLoad(2)

'selected user name from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/i_Filter_fa fa-filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'filtered paymegenerator admin result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/input_Default User_event'), 'updated')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/div_Updated'))

WebUI.waitForPageLoad(2)

'selected type from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/i_Filter_fa fa-filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'filtered paymegenerator admin  and type result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/input_Updated_date'), '2019-06-19 ~ 2019-09-20')

WebUI.waitForPageLoad(2)

'selected date'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/i_Filter_fa fa-filter'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'filtered paymegenerator admin , type and date result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/button_Reset'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked reset , it will clear the filters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Audit_Logs/a_3'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

WebUI.delay(2)

'clicked third page using page navigation , it will open third page '
WebUI.takeScreenshot()

not_run: WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/a_Attendance (1)'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked Attendance link , it will open attendance information page.'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/Attendance/input_Show_fw_emp_num'), 'PDX0036')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/div_PDX0036'))

WebUI.waitForPageLoad(2)

'selected employee number from list '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter (1)'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'filtered using employee number result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/Attendance/input_TEST0001_employee'), 'paniendra35')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/div_paniendra33 edit malaysia edit'))

WebUI.waitForPageLoad(2)

'selected employee name from list '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter (1)'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'filtered using employee name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/Leave_Management/Attendance/input_TIA ABDUL_date'), '2019-09-05 ~ 2019-09-05')

WebUI.waitForPageLoad(2)

'selected date'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Filter (1)'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'filtered paymegenerator admin , type and date result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/button_Reset (1)'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked reset , it will clear the filters '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Attendance/a_3'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

WebUI.delay(2)

'clicked third page using page navigation , it will open third page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Payme_Open/a_SSO Apps'))

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked SSO App , it will open page with opction to open payme '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/Payme_Open/button_Open Payme'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

WebUI.delay(3)

'clicked Open Payme Button , it will open in new tab PayMe ( dash board ) website with admin login,'
WebUI.takeScreenshot()

WebUI.closeWindowIndex(1)

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

WebUI.refresh()

WebUI.click(findTestObject('PayMe_OR/Leave_Management/a_Leave'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/img_Users_img-avatar'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

'clicked logged in user image , it will display logout opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/Leave_Management/a_Logout'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(2)

'clicked logout '
WebUI.takeScreenshot()

WebUI.closeBrowser()

