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

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input_Remember me_username'), 
    'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/Travel_Requests_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'it will open payme employee dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/a_Personal Information'))

WebUI.waitForPageLoad(5)

'clicked personal information main menu , to minimise the opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/a_Travel Management'))

WebUI.waitForPageLoad(5)

'clicked travel management main menu , it will maximise the opctions  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/a_Travel'))

WebUI.waitForPageLoad(5)

'clicked travel sub menu , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/a_Travel Requests'))

WebUI.waitForPageLoad(5)

'clicked travel requests link  , it will open page  ( by default page for travel ) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/select_PlaneRailTaxiOwn VehicleRented VehicleOther'), 
    'Rail', true)

WebUI.waitForPageLoad(5)

'choosen rail opction from Transportation drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/textarea__purpose'), 'Kl to Singapore')

WebUI.waitForPageLoad(5)

'given Purpose of Travel information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input__travel_from'), 'KL')

WebUI.waitForPageLoad(5)

'given Travel  from information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input__travel_to'), 'Singapore')

WebUI.waitForPageLoad(5)

'given Travel to information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input__travel_date'), '2019-05-15 10:09:00')

WebUI.waitForPageLoad(5)

'given Travel date information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input__return_date'), '2019-05-17 19:30:00')

WebUI.waitForPageLoad(5)

'given return date information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/textarea_Notes_details'), 'for business meeting ')

WebUI.waitForPageLoad(5)

'given notes information '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_User_OR/Travel_Requests_OR/textarea_Notes_details'), Keys.chord(Keys.TAB, 
        Keys.ENTER, 'MYR', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen MYR opction from Currency combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input__funding'), '2500.00')

WebUI.waitForPageLoad(5)

'given Total Funding Proposed information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input__trip_name'), 'KL to Singapore meeting')

WebUI.waitForPageLoad(5)

'click save with given trip name information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.delay(4)

'it will save the record and auto redirected to travel requests page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input_records per page_form-control'), 
    '2019-05-15')

WebUI.waitForPageLoad(5)

'search using travel date , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/img_Pending_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/textarea__purpose'), 'Kl to Singapore edit')

WebUI.waitForPageLoad(5)

'clicke save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.delay(4)

'it will save the record and auto redirected to travel requests page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input_records per page_form-control'), 
    'rejected')

WebUI.waitForPageLoad(5)

'search using status , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/img_Rejected_tableActionButton'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked view log image link , it will open login fo in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok button in pop up '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input_records per page_form-control'), 
    'immigration')

WebUI.waitForPageLoad(5)

'search using purpose , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/img_Approved_tableActionButton'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked delete image link , it will ask confirmation to delete in pop up  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok in pop up '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/input_records per page_form-control'), 
    '2019-05-17')

WebUI.waitForPageLoad(5)

'search using return date(to) , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/img_Pending_tableActionButton_1'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked delete image link , it will ask confirmation to delete in pop up  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete buttion in pop up , it will delete the record and auto redirected to travel requests page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_Travel Type'))

WebUI.waitForPageLoad(5)

'clicked travel type in table , it will display records in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_Travel Type'))

WebUI.waitForPageLoad(5)

'clicked travel type in table , it will display records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_Purpose'))

WebUI.waitForPageLoad(5)

'clicked Purpose  in table , it will display records in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_Purpose'))

WebUI.waitForPageLoad(5)

'clicked Purpose  in table , it will display records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_From'))

WebUI.waitForPageLoad(5)

'clicked From in table , it will display records in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_From'))

WebUI.waitForPageLoad(5)

'clicked From in table , it will display records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_To'))

WebUI.waitForPageLoad(5)

'clicked to in table , it will display records in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_To'))

WebUI.waitForPageLoad(5)

'clicked to in table , it will display records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_Travel Date'))

WebUI.waitForPageLoad(5)

'clicked traveldate in table , it will display records in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_Travel Date'))

WebUI.waitForPageLoad(5)

'clicked travel date in table , it will display records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_Status'))

WebUI.waitForPageLoad(5)

'clicked status in table , it will display records in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/th_Status'))

WebUI.waitForPageLoad(5)

'clicked status in table , it will display records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/a_Subordinate Travel Requests'))

WebUI.waitForPageLoad(5)

'clicked subordinated travel request link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/a_Travel Request Approval'))

WebUI.waitForPageLoad(5)

'clicked subordinated travel request link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/a_Aplus edited 12'))

WebUI.waitForPageLoad(5)

'clicked user name to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Travel_Requests_OR/a_Sign out'))

WebUI.waitForPageLoad(5)

'clicked sign out and close the browser '
WebUI.takeScreenshot()

WebUI.closeBrowser()

