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

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'payme Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked Admin main menu ( to close admin opctions ) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees'))

WebUI.waitForPageLoad(5)

'clicked employee main menu to open sub menu opctions  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_1'))

WebUI.waitForPageLoad(5)

'clicked employees sub menu , it will open empoyee details  page'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open new page to add employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__employee_id'), 'PDX0032')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__first_name'), 'paniendra32')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Middle Name_middle_name'), 'myeg')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__last_name'), 'malaysia')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Afghan_Nactionality_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Nationality_s2id_autogen2_search_Nactionality_Employee'), 
    'indian')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

'given few details for employee '
WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__birthday_Employee'), '1986-12-14')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_MaleFemale'), 'Female', 
    true)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Select_ethnicity_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Ethnicity_s2id_autogen3_search_ethnicity_Employee'), 
    'indian')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Citizen_immigration_status_Employee'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Immigration Status_s2id_autogen4_search_immigration_status_Employee'), 
    'work permit', FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Permit Expiry Date_permit_expiry_Employee'), '2019-04-30')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Permit Expiry Date_permit_expiry_Employee'), Keys.chord(
        Keys.TAB, 'pdx.com'))

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_SSNNRIC_ssn_num'), 'NA')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_NIC_nic_num'), 'NA')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Other ID_other_id'), 'A12345678')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Driving License No_driving_license'), 
    'DLN987654')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Driving License No_driving_license'), Keys.chord(
        Keys.TAB, Keys.ENTER, 'full time contract', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Driving License No_driving_license'), Keys.chord(
        Keys.TAB, Keys.TAB, Keys.ENTER, 'machine operator', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Driving License No_driving_license'), Keys.chord(
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'manufacturing', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    'melaka009')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    Keys.chord(Keys.TAB, 'block :B-10-11, Malacca Homestay Apartment'))

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    Keys.chord(Keys.TAB, Keys.TAB, 'Jalan Melaka Raya 23'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 'Taman Melaka Raya'))

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/span_Albania_country_Employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Country_s2id_autogen8_search_country_Employee'), 
    'malaysia')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_City_city'), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 
        'melaka', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_PostalZip Code_postal_code'), 
    '75000')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Home Phone_home_phone'), '0166602043')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Mobile Phone_mobile_phone'), 
    '0166602045')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Phone_work_phone'), '0166602044')

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Email_work_email'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Private Email_private_email'), 
    'testp@gmail.com')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Private Email_private_email'), 
    Keys.chord(Keys.TAB, '2011-06-20'))

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__joined_date_Employee'), '2011-06-20')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Confirmation Date_confirmation_date_Employee'), 
    '2011-06-21')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Termination Date_termination_date_Employee'), 
    '2019-04-12')

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Termination Date_termination_date_Employee'), 
    Keys.chord(Keys.TAB, Keys.ENTER, 'pdx.com', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Termination Date_termination_date_Employee'), 
    Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Termination Date_termination_date_Employee'), 
    Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'paniendra1', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Termination Date_termination_date_Employee'), 
    Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'madan', Keys.ENTER))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Termination Date_termination_date_Employee'), 
    Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'hari', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Termination Date_termination_date_Employee'), 
    Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'kumar', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'click add button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Add'))

WebUI.waitForPageLoad(5)

'it will open in a pop up for details to enter '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/textarea__note'), 'hard worker ')

WebUI.waitForPageLoad(5)

'given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Done'))

WebUI.waitForPageLoad(5)

'clicked done '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok and then clicked save button \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it was added successfilly and it will ask information to create user login details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_No'))

WebUI.waitForPageLoad(5)

'clicked no button ,it will  auto redirect back to employee details page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra32')

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'search using employee name it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image button , it will open in new page to edit '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__first_name'), 'paniendra32 edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Middle Name_middle_name'), 'myeg edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__last_name'), 'malaysia edit')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/select_MaleFemale'), 'Male', 
    true)

'given required changes '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_SSNNRIC_ssn_num'), 'NA edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_NIC_nic_num'), 'NA edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Other ID_other_id'), 'A123456789')

WebUI.waitForPageLoad(5)

'given required changes '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Driving License No_driving_license'), 
    'DLN98765489')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Station Id_work_station_id'), 
    'melaka007')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Address Line 1_address1'), 'block :B-10-11, Apartment edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Address Line 2_address2'), 'beside see edit')

'given required changes '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_City_city'), 'melaka edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_PostalZip Code_postal_code'), 
    '75001')

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Home Phone_home_phone'), '0166602049')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Mobile Phone_mobile_phone'), 
    '0166602048')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Phone_work_phone'), '0166602049')

'given required changes '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Work Email_work_email'), 'test9@gmail.com')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Private Email_private_email'), 
    'testp9@gmail.com')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to employees page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra32')

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'search using employ name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked view image link , it will open details to view '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Edit Info'))

WebUI.waitForPageLoad(5)

'clicked edit info , it will  open edit employ details page '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.END))

WebUI.waitForPageLoad(5)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out changing details , it will save and auto redirect to employees page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra32')

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'search using employ name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked logged in as employee '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/li_About_fa fa-times'))

WebUI.waitForPageLoad(5)

'click  X mark to close employ login '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked admin main menu  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees'))

WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

'clicked employee main menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_2'))

WebUI.waitForPageLoad(5)

'clicked employee sub  menu, it will open employee page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra32')

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'search using employ name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton_3'))

WebUI.waitForPageLoad(5)

'clicked view image link , it will open details to view '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Upload Profile Image'))

WebUI.waitForPageLoad(5)

'clicked upload photo button , it will open in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(5)

'clicked choose file button , it will open windows internet explorer to select file  '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

autoit_prj = 'D:\\workspace\\KSW\\UF\\PP\\male.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.waitForPageLoad(5)

'added image to user '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Cancel_popup_upload'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Delete Profile Image'))

WebUI.waitForPageLoad(5)

'clicked delete profile image button , it will delete profile image '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Qualifications'))

WebUI.waitForPageLoad(5)

'clicked qualification link under employee details '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/h4_Skills'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Skills_btn btn-small btn-success'))

WebUI.waitForPageLoad(5)

'clicked add skills , it will open in pop up to add skills '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'networking', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'choosed opction from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/textarea__details__skills'), 'will do networking ')

WebUI.waitForPageLoad(5)

'click save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/button_Save__skills'))

WebUI.waitForPageLoad(5)

'it was added the skills to employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Education_btn btn-small btn-success'))

WebUI.waitForPageLoad(5)

'clicked add eaducation info it will open in pop up to add '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'diploma', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'choosed opction from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input__institute_Education_Education'), 
    'Malaysian university')

' given required details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Start Date_date_start_Education'), 
    '2019-01-01')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Completed On_date_end_Education'), 
    '2019-04-15')

WebUI.waitForPageLoad(5)

'click save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it was added the eaducation detaios to employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Certifications_btn btn-small btn-success'))

WebUI.waitForPageLoad(5)

'clicked add certification info it will open in pop up to add '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'risk management professional ', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'choosed opction from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input__institute_certification'), 'Malaysian institute')

' given required details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Granted On_date_start_certification'), 
    '2019-04-16')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Valid Thru_date_end_certification'), 
    '2019-04-17')

WebUI.waitForPageLoad(5)

'click save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it was added the certification details to employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Languages_btn btn-small btn-success'))

WebUI.waitForPageLoad(5)

'clicked add Languages info it will open in pop up to add \r\n'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'my', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'choosed opction from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/button_Save_language'))

WebUI.waitForPageLoad(5)

'clicked save with given details , it will save details to employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Family'))

WebUI.waitForPageLoad(5)

'clicked family link from employe details '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Emergency Contacts_btn btn-small btn-success'))

WebUI.waitForPageLoad(5)

'clicked add emergency contacts info it will open in pop up to add \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input__name_EC'), 'santosh')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Relationship_relationship_EC'), 
    'father')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Home Phone_home_phone_EC'), '012345678')

'given required details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Work Phone_work_phone_EC'), '012345678')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Mobile Phone_mobile_phone'), '012345678')

WebUI.waitForPageLoad(5)

'click save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/button_Save_EC'))

WebUI.waitForPageLoad(5)

'it was added the emergency contact details to employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Dependents_btn btn-small btn-success'))

WebUI.waitForPageLoad(5)

'clicked add dependents info it will open in pop up to add \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input__name_D'), 'House wife')

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/select_ChildSpouseParentOther_D'), 
    'Spouse', true)

'given required details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input__dob_D'), '1994-06-25')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/input_Id Number_id_number_D'), 'B12345678')

WebUI.waitForPageLoad(5)

'click save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Qualifications/button_Save_D'))

WebUI.waitForPageLoad(5)

'it will save the dependents details to employee '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_3'))

