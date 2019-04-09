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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_Remember me_username'), 'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Sign in'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Qualifications'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Add New'))

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/span_Programming and Application Development'), 
    'Programming and Application Development', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/textarea__details'), 'Accer Myrelo')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Save'))

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'myrelo')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_Accer Myrelo_tableActionButton'))

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/textarea__details'), 'Accer Myrelo edit ')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Save'))

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'myrelo')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_Accer Myrelo edit_tableActionButton'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Save'))

WebUI.waitForAlert(5)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Ok'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Cancel'), FailureHandling.OPTIONAL)

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'myrelo')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_Accer Myrelo edit_tableActionButton_1'))

WebUI.waitForAlert(0)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Delete'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Skill'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Skill'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Details'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Details'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_2'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Qualifications'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Education'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Education'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Add New'))

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input__institute'), 'Malayu OSM University')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/i_Start Date_fa fa-calendar'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_Jan'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/td_1'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_Completed On_add-on input-group-addon'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_Mar'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/td_31'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Save'))

not_run: WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Education'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'Malayu OSM')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_Malayu OSM University_tableActionButton'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Save'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'Malayu OSM')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_Malayu OSM University_tableActionButton_1'))

not_run: WebUI.waitForAlert(5)

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Delete'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'Malayu OSM')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_Malayu OSM University_tableActionButton_2'))

not_run: WebUI.waitForAlert(5)

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Delete'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'bachelor degree')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Qualification'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Qualification'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Institute'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Institute'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Start Date'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Start Date'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Completed On'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Completed On'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_2'))

not_run: WebUI.refresh()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Certifications'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Add New'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input__institute'), 'GrandStream ')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/i_Granted On_fa fa-calendar'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_Feb'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/td_1'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/i_Valid Thru_fa fa-calendar'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_2019'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/span_Feb'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/td_28'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Save'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'grandstream')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_GrandStream edit_tableActionButton'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input__institute'), 'GrandStream edit')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Save'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'grandstream')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_GrandStream edit_tableActionButton_1'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Save'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Ok'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Cancel'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'grandstream')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/img_GrandStream edit_tableActionButton_2'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Delete'))

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_records per page_form-control'), 
    'grandstream')

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Certifications'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Certification'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Certification'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Institute'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Institute'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Granted On'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Granted On'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Valid Thru'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/th_Valid Thru'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Languages'))

