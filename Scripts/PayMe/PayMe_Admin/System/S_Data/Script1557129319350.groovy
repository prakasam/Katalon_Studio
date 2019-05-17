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

'Login page of PaYme '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input_Remember me_password'), 
    'RAIVpflpDOg=')

WebUI.waitForPageLoad(5)

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Sign in'))

WebUI.waitForPageLoad(5)

'it will open the payme admin dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked admin menu to minimise it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/a_System'))

WebUI.waitForPageLoad(5)

'clicked system menu to miximise it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/a_Data'))

WebUI.waitForPageLoad(5)

'clicked data sub menu , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/a_Data Importers'))

WebUI.waitForPageLoad(5)

'clicked data import ( by default pafe for data menu ) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new . it will open page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input__name'), 'Sample Attendance')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input__dataType'), 'Employ_Attendance')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/textarea_Details_details'), 'Employ Attendance Data Imports ')

WebUI.waitForPageLoad(5)

'given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Add'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked add for adding columns '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/input__name_popup'), 'employee')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/select_NormalReferenceAttached'), 
    'Reference', true)

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/select_NAEmergency ContactsEthnicityNationalityJobTitlePayFrequencyPayGradeEmploymentStatusCompanyStructureEmployee'), 
    'Employee', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input_Depends On Field_dependOnField'), 
    'employee_id')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/select_NoYes'), 'Yes', 
    true)

WebUI.waitForPageLoad(5)

'click done with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Done'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'it will display the information in pop up " the changes will be effective only when you save the form " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok in pop up info  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Add'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked add for adding columns \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/input__name_popup'), 'in_time')

WebUI.waitForPageLoad(5)

'click done with given required details \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Done'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'it will display the information in pop up " the changes will be effective only when you save the form " \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok in pop up info  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Add'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked add for adding columns \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/input__name_popup'), 'out_time')

WebUI.waitForPageLoad(5)

'click done with given required details \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Done'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'it will display the information in pop up " the changes will be effective only when you save the form " \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok in pop up info  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Add'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked add for adding columns \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/input__name_popup'), 'note')

WebUI.waitForPageLoad(5)

'click done with given required details \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Done'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'it will display the information in pop up " the changes will be effective only when you save the form " \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok in pop up info  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save it will save the data and auto redirected to data imports page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input_records per page_form-control'), 
    'sample')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/img_Employ Attendance Data Imports_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save it will save the data and auto redirected to data imports page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input_records per page_form-control'), 
    'sample')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/img_Employ Attendance Data Imports_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save it will save the data and auto redirected to data imports page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input_records per page_form-control'), 
    'sample')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/img_Employ Attendance Data Imports_tableActionButton_2'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked delete image link , it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete it will delete the data and auto redirected to data imports page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/input_records per page_form-control'), 
    'sample')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/img_Employ Attendance Data Imports_tableActionButton_3'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked delete image link , it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete it will delete the data and auto redirected to data imports page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/th_Name'))

WebUI.waitForPageLoad(5)

'clikced name in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/th_Name'))

WebUI.waitForPageLoad(5)

'clikced name in table, it will order data in dessending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/th_Data Type'))

WebUI.waitForPageLoad(5)

'clikced data type in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/th_Data Type'))

WebUI.waitForPageLoad(5)

'clikced data type in table, it will order data in dessending '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

'refresh the page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/a_Data Import Files'))

WebUI.waitForPageLoad(5)

'clicked data imports files link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new it will open page'
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/input__name'), 'Sample Attendance Import Files')

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/select_Employee Data ImportAttendance Data ImportPayroll Data ImportXIMPORTSample Attendance'), 
    '2', true, FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'given required info '
WebUI.takeScreenshot()

WebUI.waitForAlert(2)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/i_Upload_fa fa-cloud-upload text-green'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.waitForPageLoad(5)

'clicked upload image it will open in pop up to choose upload '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(5)

'clicked choose file in pop up to upload '
WebUI.takeScreenshot()

autoit_prj = 'D:\\workspace\\KSW\\UF\\PP\\File_Attendance_PD0001.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.waitForPageLoad(5)

'selected required file to upload it '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/textarea_Last Export Result_details'), 
    'Employ Attendance Data Imports files')

WebUI.waitForPageLoad(5)

'given required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save it will save the data and auto redirected to data imports files page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/input_records per page_form-control'), 
    'Sample Attendance')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/img_Not Processed_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/textarea_Last Export Result_details'), 
    'Employ Attendance Data Imports files Edit')

WebUI.waitForPageLoad(5)

'changed required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save it will save the data and auto redirected to data imports files page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/input_records per page_form-control'), 
    'Sample Attendance')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/img_Not Processed_tableActionButton_Copy'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save it will save the data and auto redirected to data imports files page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/input_records per page_form-control'), 
    'Sample Attendance')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/img_Not Processed_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete it will delete the data and auto redirected to data imports files page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/input_records per page_form-control'), 
    'Sample Attendance')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/img_Not Processed_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete it will delete the data and auto redirected to data imports files page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/th_Name_a'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clikced name in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/th_Name'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clikced name in table, it will order data in Dessending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/th_Data Import Definition_a'))

WebUI.waitForPageLoad(5)

'clikced Data Import Definition in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/th_Data Import Definition'))

WebUI.waitForPageLoad(5)

'clikced Data Import Definition in table, it will order data in dessending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/th_Status_a'))

WebUI.waitForPageLoad(5)

'clikced status in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_data_import_or/Import_Files/th_Status'))

WebUI.waitForPageLoad(5)

'clikced status in table, it will order data in dessending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/a_admin (1)'))

WebUI.waitForPageLoad(5)

'clicked admin link to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_data_import_or/a_Sign out'), FailureHandling.OPTIONAL)

