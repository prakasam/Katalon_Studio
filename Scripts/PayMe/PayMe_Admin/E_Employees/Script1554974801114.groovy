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

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Admin'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_1'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Add New'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__employee_id'), 'PDX007')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__first_name'), 'paniendra7')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Middle Name_middle_name'), 'myeg')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__last_name'), 'malaysia')

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Afghan_Nactionality_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Nationality_s2id_autogen2_search_Nactionality_Employee'), 
    'indian')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__birthday_Employee'), '1986-12-14')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_MaleFemale'), 'Female', 
    true)

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Select_ethnicity_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Ethnicity_s2id_autogen3_search_ethnicity_Employee'), 
    'indian')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Citizen_immigration_status_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Immigration Status_s2id_autogen4_search_immigration_status_Employee'), 
    'work permit')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_SSNNRIC_ssn_num'), 'NA')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_NIC_nic_num'), 'NA')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Other ID_other_id'), 'A12345678')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Driving License No_driving_license'), 
    'DLN987654')

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Full Time Contract_Employ_status_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Employment Status_s2id_autogen5_search_Employ_status_Employee'), 
    'full time contract')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Software Engineer_job_title_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Job Title_s2id_autogen6_search_job_title_Employee'), 
    'machine operator')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Select_pay_grade_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Pay Grade_s2id_autogen7_search_pay_grade_Employee'), 
    'manufacturing production')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    'melaka009')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    Keys.chord(Keys.TAB, 'block :B-10-11, Malacca Homestay Apartment'))

WebUI.sendKeys(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    Keys.chord(Keys.TAB, Keys.TAB, 'Jalan Melaka Raya 23'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 'Taman Melaka Raya'))

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Albania_country_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Country_s2id_autogen8_search_country_Employee'), 
    'malaysia')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Select_province_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Province_s2id_autogen9_search_province_Employee'), 
    'melaka')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_PostalZip Code_postal_code'), 
    '75000')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Home Phone_home_phone'), '0166602043')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Mobile Phone_mobile_phone'), 
    '0166602045')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Phone_work_phone'), '0166602044')

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Email_work_email'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Private Email_private_email'), 
    'testp@gmail.com')

not_run: WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__joined_date_Employee'), '2011-06-20')

WebUI.sendKeys(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Private Email_private_email'), 
    Keys.chord(Keys.TAB, '2011-06-20'))

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Confirmation Date_confirmation_date_Employee'), 
    '2011-06-21')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Termination Date_termination_date_Employee'), 
    '2019-04-12')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Permit Expiry Date_permit_expiry_Employee'), '2019-04-30')

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Samsung SDI_department_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Department_s2id_autogen10_search_department_Employee'), 
    'pdx.com')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Select_supervisor_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Supervisor_s2id_autogen11_search_supervisor_Employee'), 
    'aplus')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/ul_Indirect Supervisors'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Indirect Supervisors_s2id_autogen15'), 
    'madan')

not_run: WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_None_First_level_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_First Level Approver_s2id_autogen12_search_First_level_Employee'), 
    'madan')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_None_Second_level_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Second Level Approver_s2id_autogen13_search_Second_level_Employee'), 
    'hari')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_None_Third_level_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Third Level Approver_s2id_autogen14_search_Third_level_Employee'), 
    'kumar')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Add'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/textarea__note'), 'hard worker ')

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Done'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Ok'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_No'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__first_name'), 'paniendra edit')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Middle Name_middle_name'), 
    'myeg edit')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__last_name'), 'malaysia edit')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_MaleFemale'), 
    'Male', true)

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_SSNNRIC_ssn_num'), 
    'NA edit')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_NIC_nic_num'), 'NA edit')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Other ID_other_id'), 
    'A123456789')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Driving License No_driving_license'), 
    'DLN98765489')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    'melaka007')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Address Line 1_address1'), 
    'block :B-10-11, Apartment edit')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Address Line 2_address2'), 
    'beside see edit')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_City_city'), 'melaka edit')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_PostalZip Code_postal_code'), 
    '75001')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Home Phone_home_phone'), 
    '0166602049')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Mobile Phone_mobile_phone'), 
    '0166602048')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Phone_work_phone'), 
    '0166602049')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Email_work_email'), 
    'test9@gmail.com')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Private Email_private_email'), 
    'testp9@gmail.com')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton_1'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Edit Info'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton_2'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/li_About_fa fa-times'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Admin'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_2'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton_3'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Upload Profile Image'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Delete Profile Image'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Qualifications'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/h4_Skills'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Skills_btn btn-small btn-success'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_concat(id(  s2id_autogen2_search  ))_s2id_autogen2_search'), 
    'ne')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_One result is available press enter to select it._s2id_autogen2_search'), 
    'networking')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/textarea__details'), 'will do networking ')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Education_btn btn-small btn-success'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__s2id_autogen42_search'), 
    'd')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_One result is available press enter to select it._s2id_autogen42_search'), 
    'diploma')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__institute'), 'Malaysian university')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Start Date_add-on input-group-addon'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Jan'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/td_1'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Completed On_add-on input-group-addon'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Mar'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/td_31'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Certifications_btn btn-small btn-success'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__s2id_autogen77_search'), 
    'itil')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_One result is available press enter to select it._s2id_autogen77_search'), 
    'itil v3')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__institute'), 'Malaysian institute')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Granted On_add-on input-group-addon'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Jan'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/td_1'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Valid Thru_add-on input-group-addon'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Jan'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/td_31'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Languages_btn btn-small btn-success'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_ITIL V3_s2id_autogen146_search'), 
    'e')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_One result is available press enter to select it._s2id_autogen146_search'), 
    'en')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency'), 
    'Limited Working Proficiency', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_1'), 
    'Limited Working Proficiency', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_2'), 
    'Limited Working Proficiency', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_3'), 
    'Limited Working Proficiency', true)

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Family'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Emergency Contacts_btn btn-small btn-success'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__name'), 'santosh')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Relationship_relationship'), 
    'father')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Home Phone_home_phone'), 
    '012345678')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Phone_work_phone'), 
    '012345678')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Mobile Phone_mobile_phone'), 
    '012345678')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Dependents_btn btn-small btn-success'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__name'), 'House wife')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_ChildSpouseParentOther'), 
    'Spouse', true)

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span__add-on input-group-addon'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Jan'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/td_1'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Id Number_id_number'), 
    'B12345678')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_3'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Complete_tableActionButton'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Ok'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_4'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_5'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_6'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Filter'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Filter_1'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Filter'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__s2id_autogen357_search'), 
    'software engineer')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Filter_2'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Filter'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Software Engineer_s2id_autogen423_search'), 
    'samsung ')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Filter_3'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Filter'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Samsung SDI_s2id_autogen498_search'), 
    'ap')

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_One result is available press enter to select it._s2id_autogen498_search'), 
    'aplus')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Filter_4'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/i_Filter_fa fa-times'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Employee ID'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Employee ID'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_First Name'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_First Name'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Last Name'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Last Name'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Mobile Phone'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Mobile Phone'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Department'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Department'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Gender'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Gender'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Registration Status'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Registration Status'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_2'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_admin (1)'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php', FailureHandling.OPTIONAL)

