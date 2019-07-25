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

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__employee_id'), findTestData(
        'PayMe/Employee').getValue(1, 2))

WebUI.waitForPageLoad(5)

'given few details for employee '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input__first_name'), findTestData(
        'PayMe/Employee').getValue(2, 2))

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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

WebUI.setText(findTestObject('Object Repository/test_OR/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/test_OR/input_Remember me_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/test_OR/button_Sign in'))

WebUI.click(findTestObject('Object Repository/test_OR/a_Admin'))

WebUI.click(findTestObject('Object Repository/test_OR/a_System'))

WebUI.click(findTestObject('Object Repository/test_OR/a_Data'))

WebUI.click(findTestObject('Object Repository/test_OR/a_Data Import Files'))

WebUI.click(findTestObject('Object Repository/test_OR/button_Add New'))

WebUI.setText(findTestObject('Object Repository/test_OR/input__name'), 'sample')

WebUI.selectOptionByValue(findTestObject('Object Repository/test_OR/select_Employee Data ImportAttendance Data ImportPayroll Data ImportXIMPORTSample Attendance'), 
    '13', true)

WebUI.click(findTestObject('Object Repository/test_OR/i_Upload_fa fa-cloud-upload text-green'))

WebUI.click(findTestObject('Object Repository/test_OR/button_Cancel'))

WebUI.click(findTestObject('Object Repository/test_OR/button_Save'))

WebUI.setText(findTestObject('Object Repository/test_OR/textarea_Last Export Result_details'), 'sample attendance ')

WebUI.click(findTestObject('Object Repository/test_OR/button_Save'))

WebUI.click(findTestObject('Object Repository/test_OR/a_admin (1)'))

WebUI.click(findTestObject('Object Repository/test_OR/a_Sign out'))

