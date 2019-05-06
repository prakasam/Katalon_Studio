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

'page me login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_Remember me_password'), 
    'RAIVpflpDOg=')

'clicke sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Sign in'))

WebUI.waitForPageLoad(5)

'it will open admin dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked admin main menu to minimize '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Employees'))

WebUI.waitForPageLoad(5)

'clicked employee main menu to expand '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Travel Requests'))

WebUI.waitForPageLoad(5)

'clicked travel requests sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'hari', Keys.ENTER))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/select_PlaneRailTaxiOwn VehicleRented VehicleOther'), 
    'Own Vehicle', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea__purpose'), 'immigration office at putrajaya for meeting ')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__travel_from'), 'MyEG Tower ')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__travel_to'), 'putrajaya')

'given some info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__travel_date'), '2019-04-19 10:00:00')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__return_date'), '2019-04-19 16:00:00')

'given travel date and return '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea_Notes_details'), 'foreign worker sticker printing changes ')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea_Notes_details'), Keys.chord(Keys.TAB, 
        Keys.ENTER, 'myr', Keys.ENTER))

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__funding'), '200.00')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/i_Upload_fa fa-cloud-upload text-green'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Cancel'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/i_Upload_fa fa-cloud-upload text-green_1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Cancel'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/i_Upload_fa fa-cloud-upload text-green_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Cancel'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_accommodation_hotel'), 'NA', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__trip_name'), 'meeting for sticker printing ')

'click save with given required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to travel request page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control'), 
    'hari')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Pending_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open edit page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea__purpose'), 'immigration office at putrajaya for meeting edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea_Notes_details'), 'foreign worker sticker printing changes edit')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__trip_name'), 'meeting for sticker printing edit')

WebUI.waitForPageLoad(5)

'click save with given changes required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to travel request page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control'), 
    'hari')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Pending_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked change status image link ,it willopen in pop up to approve or rezect record '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/select_ApprovedRejected'), 
    'Rejected', true)

'selected reject '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea_Status Change Note_travelrequest_reason'), 
    'permission rejected')

'clicked change travel request status button with  slected approved and given info \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Change TravelRequest Status'))

WebUI.waitForPageLoad(5)

'it will change according to selection , given confirmation info \r\n'
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Ok_1'))

WebUI.waitForPageLoad(5)

'clicked ok in confirmation info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control'), 
    'hari')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n\r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Rejected_tableActionButton'))

WebUI.waitForPageLoad(5)

'selected view logs image link , it will open log info in pop up \r\n\r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/td_2 hours agoPending - Rejected'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Ok_2'))

WebUI.waitForPageLoad(5)

'clicked ok button from the log view in pop up info \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Rejected_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'selected delete image link , it will ask confirmation to delete \r\n'
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete the record and auto redirected to travel request page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'hari', Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/select_PlaneRailTaxiOwn VehicleRented VehicleOther'), 
    'Own Vehicle', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea__purpose'), 'Annual dinner party ')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__travel_from'), 'MyEG Tower')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__travel_to'), 'majestic hotel ')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__travel_date'), '2019-04-19 10:00:00')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__return_date'), '2019-04-19 16:00:00')

'given some info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea_Notes_details'), 'dinner')

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea_Notes_details'), Keys.chord(Keys.TAB, 
        Keys.ENTER, 'myr', Keys.ENTER))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__funding'), '100.00')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_accommodation_hotel'), 'NA', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__trip_name'), 'Annual Dinner ')

'clicked save with given required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to travel request page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control'), 
    'hari')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Pending_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked change status image link ,it willopen in pop up to approve or rezect record '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/select_ApprovedRejected'), 
    'Approved', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/textarea_Status Change Note_travelrequest_reason'), 
    'permission granted')

'clicked change travel request status button with  slected approved and given info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Change TravelRequest Status'))

WebUI.waitForPageLoad(5)

'it will change according to selection , given confirmation info '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Ok_3'))

WebUI.waitForPageLoad(5)

'clicked ok in confirmation info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control'), 
    'hari')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Approved_tableActionButton'))

WebUI.waitForPageLoad(5)

'selected view logs image link , it will open log info in pop up '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Ok_4'))

WebUI.waitForPageLoad(5)

'clicked ok button from the log view in pop up info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control'), 
    'hari')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Approved_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'selected delete image link , it will ask confirmation to delete \r\n'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete the record and auto redirected to travel request page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Employee'))

'clicked Employee in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Employee'))

'clicked Employee in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Travel Type'))

'clicked Travel Type in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Travel Type'))

'clicked Travel Type in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Purpose'))

'clicked purpose in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Purpose'))

'clicked purpose in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_From'))

'clicked from in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_From'))

'clicked from in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_To'))

'clicked to in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_To'))

'clicked to in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Travel Date'))

'clicked Travel Date in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Travel Date'))

'clicked Travel Date in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Status'))

'clicked status in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Status'))

'clicked status in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_2'))

'clicked second page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Travel Requests_1'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Travel Requests_2'))

WebUI.waitForPageLoad(5)

'clicked travel requests link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_admin (1)'), FailureHandling.OPTIONAL)

'clicked admin name to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Sign out'), FailureHandling.OPTIONAL)

'clicked sign out '
WebUI.takeScreenshot()

WebUI.closeBrowser(FailureHandling.OPTIONAL)

