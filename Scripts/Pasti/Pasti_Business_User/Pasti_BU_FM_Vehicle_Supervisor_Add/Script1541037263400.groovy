import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.121.37/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input_Login_username'), 
    '45586-T')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input_Login_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/button_Sign In'))

'pasti business user login page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/span_Fleet Management'))

'click fleet Management menu\r\n'
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input'))

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input'))

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input'))

'click \t'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input'))

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create'))

'click button '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Schedule Name_name'), 
    'New Route ', FailureHandling.OPTIONAL)

'click new route '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create'))

'click create with out given values '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/i_Vehicle List_search fa fa-se'))

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Add_search-vehicle'), 
    'qates')

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_QATEST'), 
    FailureHandling.OPTIONAL)

'search for required vehicle info '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

'Use the dragAndDropObjectToObject keyword to perform the drag and drop action.'
not_run: WebUI.dragAndDropToObject(findTestObject('Page_Droppable  jQuery UI/div_draggable'), findTestObject('Page_Droppable  jQuery UI/div_droppable'))

'Get the text content of our droppable object.'
not_run: droppable_text = WebUI.getText(findTestObject('Page_Droppable  jQuery UI/div_droppable'))

'Verify if it is actually changed to "Dropped!" because of the drag and drop action.'
not_run: WebUI.verifyEqual(droppable_text, 'Dropped!')

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/i_Route List_search fa fa-sear'))

'search for route '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Add_search-route'), 
    'lan')

'it will display the required vehicle info '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_pwtc to Langkawi'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/i_Driver List_search fa fa-sea'))

'search for driver '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Add_search-driver'), 
    'prakas')

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_prakasam'), 
    FailureHandling.OPTIONAL)

'search for required vehicle'
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Add'), 
    FailureHandling.STOP_ON_FAILURE)

'Add new '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

not_run: WebUI.delay(3)

'Use the dragAndDropObjectToObject keyword to perform the drag and drop action.'
not_run: WebUI.dragAndDropToObject(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_JHG5599 (1)'), 
    findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Drop Vehicle Number Here_d'))

'Get the text content of our droppable object.'
not_run: droppable_text = WebUI.getText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Drop Vehicle Number Here_d'))

not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(3)

'Use the dragAndDropObjectToObject keyword to perform the drag and drop action.'
not_run: WebUI.dragAndDropToObject(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Kedah To Perak (1)'), 
    findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Drop Route Name Here_drop'))

'Get the text content of our droppable object.'
not_run: droppable_text = WebUI.getText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Drop Route Name Here_drop'))

not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(3)

'Use the dragAndDropObjectToObject keyword to perform the drag and drop action.'
not_run: WebUI.dragAndDropToObject(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Akmal Halabi (1)'), 
    findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Drop Driver Name Here_drop'))

'Get the text content of our droppable object.'
not_run: droppable_text = WebUI.getText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Drop Driver Name Here_drop'))

not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(3)

'Verify if it is actually changed to "Dropped!" because of the drag and drop action.'
not_run: WebUI.verifyEqual(droppable_text, 'Dropped!')

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_View list of schedule_d'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.acceptAlert()

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Add'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/a_5'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Export_input'), 
    'JQV1100')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Vehicle Supervisor'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Add New'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Name_name'), 
    'a')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Name_name'), 
    '&^$^#@&*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Staff ID_staff_id'), 
    'b')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Staff ID_staff_id'), 
    '*$^#@&$*(*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Contact Number_mobileno'), 
    'c')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Contact Number_mobileno'), 
    'cdjabcjhbcjhsdbjjksad')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Contact Number_mobileno'), 
    '948369')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Contact Number_mobileno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Contact Number_mobileno'), 
    '01111784357')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Email_email'), 
    'test')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Email_email'), 
    '&@$%(&*#&)*(')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Email_email'), 
    'test@gmai')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Email_email'), 
    'test@gmai.com')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Staff ID_staff_id'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Staff ID_staff_id'), 
    'PG70')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Create (1)'))

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Vehicle Supervisor'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Add New'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Edit'))

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Name_name'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Name_name'), 
    'aplus')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Staff ID_staff_id'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Staff ID_staff_id'), 
    'PG70edit')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Contact Number_mobileno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Contact Number_mobileno'), 
    '01111452999')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Email_email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Email_email'), 
    'testedit@gmai.com')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Update'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Vehicle Supervisor'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Add New'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Delete'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Delete'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/div_Hi MYEG Services'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/div_Hi'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/a_Logout'), FailureHandling.OPTIONAL)

'log out from business user '
WebUI.takeScreenshot()

not_run: WebUI.navigateToUrl('https://pasti.myeg.com.my/auth/logout')

WebUI.closeBrowser()

