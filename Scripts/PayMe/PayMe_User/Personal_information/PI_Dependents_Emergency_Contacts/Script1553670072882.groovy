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

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'Navigate to Payme Login page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Remember me_username'), 
    'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Click Sign in with given Username and Password \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Sign in'))

'Dash board of user login \r\n'
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/a_Dependents'))

'Clicked  Dependents from Personal information menu \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Add New'))

'Clicked Add new from Dependents page \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Save'))

'Clicked save with out given info, it will change block to red color for required fields name \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input__name'), 
    'Baseus S-09A')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/select_ChildSpouseParentOther'), 
    'Other', true)

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/i__fa fa-calendar'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/span_2010'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/span_Jan'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/td_1'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Id Number_id_number'), 
    '6953156288287')

'Click save with given all required information \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Save'))

'it will save the data and auto redirect to dependents page '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

'Search invalid data \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    'invalid data 7855')

'it will display info " No Matching record found " \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

'Search Using name \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    'baseus')

'it will display the available matched records \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Other_tableActionButton'))

'Clicked  edit image link, it will open the edit page for selected info \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input__name'), 
    'Baseus S-09A edit')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/select_ChildSpouseParentOther'), 
    'Child', true)

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/i__fa fa-calendar'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/span_2017'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/span_Feb'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/td_28'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Id Number_id_number'), 
    '6953156288287_edit')

'Click save with given updated information \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Save'))

'it will save the data and auto redirect to dependents page '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

'Search using Id Number \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    '6953156288287')

'it will display the available information \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Child_tableActionButton'))

'Click copy image link, \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Save'))

'Click save with out changing copy information , it will save in new record '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

'Search using Relathion ship info \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    'child')

'it will filter the available searched info '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

'Search using Date of Birth info \r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    '2017-02-28')

'it will filter the available searched info '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Child_tableActionButton_1'))

'clicked delete image link '
not_run: WebUI.takeScreenshot()

not_run: WebUI.waitForAlert(10)

'it will ask confirmstion to delete'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Delete'))

'clicked delete. it will delete the record '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

'Search using ID Number info\r\n'
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    '6953156288287')

'it will filter the available searched info '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Child_tableActionButton_2'))

'clicked delete image link '
not_run: WebUI.takeScreenshot()

not_run: WebUI.waitForAlert(10)

'it will ask confirmstion to delete'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Delete'))

'clicked delete. it will delete the record '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Name'))

'Ascending order Soted based on the name '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Name'))

'descending order Soted based on the name '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Relationship'))

'Ascending order Soted based on the Relation ship '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Relationship'))

'descending order Soted based on the Relation ship '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Date of Birth'))

'Ascending order Soted based on the Date of birth'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Date of Birth'))

'descending order Soted based on the Date of Birth'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Id Number'))

'Ascending order Soted based on the ID Number'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Id Number'))

'descending order Soted based on the ID Number'
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

'click second page in pagination opctions '
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/a_2'))

'it will open second page od dependents  '
not_run: WebUI.takeScreenshot()

not_run: WebUI.refresh()

not_run: WebUI.delay(5)

'click Emergency Contacts sub menu from Personal Information '
not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/a_Emergency Contacts'))

'it will open Emergency Contacts page'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Add New'))

'clicked Add New , and it open in new page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Save'))

'clicked save button with out given info, mandatory field name text color changed from black to red '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input__name'), 'Black View BV6800')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Relationship_relationship'), 
    'Friend')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Home Phone_home_phone'), 
    '0123456789')

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Home Phone_home_phone'), Keys.chord(
        Keys.TAB, '9876543210'))

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Home Phone_home_phone'), Keys.chord(
        Keys.TAB, Keys.TAB, '1928374650'))

'clicked save button with given required info'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Save'))

'it will save the new record.'
WebUI.takeScreenshot()

WebUI.refresh()

'Search using name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    'Black view ')

'it will display the matched available records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Friend_tableActionButton'))

'clicked Edit image link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input__name'), 'Black View BV6800 edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Relationship_relationship'), 
    'Friend edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Home Phone_home_phone'), 
    '01234567899')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Work Phone_work_phone'), 
    '98765432199')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_Mobile Phone_mobile_phone'), 
    '19283746509')

'click save after edit required information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Save'))

'it will save the records and auto redirect back to Emergency Contacts page '
WebUI.takeScreenshot()

WebUI.refresh()

'Search relation ship info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    'black view ')

'it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Friend edit_tableActionButton'))

'click copy image link, it will copy the contact information into new record'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Save'))

'clicked save button with out changing info, it will store the new record. '
WebUI.takeScreenshot()

WebUI.refresh()

'Search Home phone number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    '01234567899')

'it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Friend edit_tableActionButton_1'))

'clicked delete image link,'
WebUI.takeScreenshot()

WebUI.waitForAlert(10)

' it will open in pop up for confirmation. clicked delete'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Delete'))

' it will delete the record '
WebUI.takeScreenshot()

WebUI.refresh()

'Search work phone number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    '98765432199')

'it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Friend edit_tableActionButton_2'))

'clicked delete image link,'
WebUI.takeScreenshot()

WebUI.waitForAlert(10)

' it will open in pop up for confirmation. clicked delete'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Delete'))

' it will delete the record '
WebUI.takeScreenshot()

WebUI.refresh()

'Search Mobile phone number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/input_records per page_form-control'), 
    '0060123456789')

'it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/img_Parent_tableActionButton'))

'clicked edit image link,'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/button_Cancel'))

'clicked Cancel button ,'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Name'))

'Ascending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Name'))

'descending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Relationship'))

'Ascending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Relationship'))

'descending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Home Phone'))

'Ascending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Home Phone'))

'descending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Work Phone'))

'Ascending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Work Phone'))

'descending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Mobile Phone'))

'Ascending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/th_Mobile Phone'))

'descending order Soted based on the Relation ship '
WebUI.takeScreenshot()

WebUI.refresh()

'click second page in pagination opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/Dependents_Emergency_Contacts_OR/a_2'))

'it will open second page od dependents  '
WebUI.takeScreenshot()

WebUI.refresh()

'Click username from right side top to sign out '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

'Clicked sign out '
WebUI.takeScreenshot()

WebUI.closeBrowser()

