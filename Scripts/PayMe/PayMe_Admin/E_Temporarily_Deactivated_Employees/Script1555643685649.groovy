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

'Payme Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sigin with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme login Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked payme Admin main memu to minimize it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Employees'))

WebUI.waitForPageLoad(5)

'clicked Employee main memu to maximise it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Employees_1'))

WebUI.waitForPageLoad(5)

'clicked employee sub menu . it will open employee page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_Deactivated Employees'))

WebUI.waitForPageLoad(5)

'clicked Deactivated Employees link it expand to select temporarly Deactivated Employees  and terminated employee page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_Temporarily Deactivated Employees'))

WebUI.waitForPageLoad(5)

'clicked  Temporarily Deactivated Employees link it will open Temporarily Deactivated Employees page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/input_records per page_form-control_terminated'), 
    'paniendra1')

WebUI.waitForPageLoad(5)

'search using first name info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/img_paniendra1 edit malaysia edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will save the record '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/input_records per page_form-control_terminated'), 
    'kenglav')

WebUI.waitForPageLoad(5)

'search using first name info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/img_Kenglav_tableActionButton'))

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked archive Employee image link , it will open in pop up for confirmation archive '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.dismissAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

'clicked Cancel button ,  it will keep the record .'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/input_records per page_form-control_terminated'), 
    'madan')

WebUI.waitForPageLoad(5)

'search using name info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/img_Madan_tableActionButton'))

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked restore image link , it will open in pop up for confirmation to restore'
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

'clicked ok button, it will restore the record to employee info and auto redirected to temporarily deactivated employee page '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Ok_restore'))

WebUI.waitForPageLoad(5)

'clicked ok buttion in information allert '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

'clicked employee link to verify the record '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/input_records per page_form-control'), 
    '100043')

WebUI.waitForPageLoad(5)

'search using Employee Number info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/img_Complete_tableActionButton_terminate_employee'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked Terminate Employee image link , it will open in pop up for confirmation to terminate '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.acceptAlert()

WebUI.waitForPageLoad(5)

'clicked ok button, it will terminate the record from employee page to temporarily deactivated employee page and auto redirected to employee page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Ok_terminate'))

WebUI.waitForPageLoad(5)

'clicked ok buttion in information allert '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_Deactivated Employees'))

WebUI.waitForPageLoad(5)

'clicked Deactivated Employees link it expand to select temporarly Deactivated Employees  and terminated employee page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_Temporarily Deactivated Employees'))

WebUI.waitForPageLoad(5)

'clicked  Temporarily Deactivated Employees link it will open Temporarily Deactivated Employees page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_ID'))

'clicked ID in  table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_ID'))

'clicked ID in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Employee Number'))

'clicked Employee Number in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Employee Number'))

'clicked Employee Number in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_First Name'), FailureHandling.OPTIONAL)

'clicked First name in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_First Name'), FailureHandling.OPTIONAL)

'clicked First Name in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Last Name'), FailureHandling.OPTIONAL)

'clicked Last Name in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Last Name'), FailureHandling.OPTIONAL)

'clicked Last Name in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Mobile'))

'clicked Mobile in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Mobile'))

'clicked Mobile in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Department'), FailureHandling.OPTIONAL)

'clicked Department in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Department'), FailureHandling.OPTIONAL)

'clicked Department in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Gender'), FailureHandling.OPTIONAL)

'clicked Gender in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Gender'), FailureHandling.OPTIONAL)

'clicked Gender in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Supervisor'))

'clicked Supervisor in table to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/th_Supervisor'))

'clicked Supervisor in table  to sort in Dessending order '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/a_2'), FailureHandling.OPTIONAL)

'clicked second page unsing page navigation '
not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_Deactivated Employees'))

WebUI.waitForPageLoad(5)

'clicked Deactivated Employees link it expand to select temporarly Deactivated Employees  and terminated employee page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_Temporarily Deactivated Employees'))

WebUI.waitForPageLoad(5)

'clicked  Temporarily Deactivated Employees link it will open Temporarily Deactivated Employees page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in pop up with out slection opctions , it will display the result  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'machine ', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required Job title from combo box ,'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'PDX', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required Department from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'paniendra3', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required Supervisor from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_Deactivated Employees'))

WebUI.waitForPageLoad(5)

'clicked Deactivated Employees link it expand to select temporarly Deactivated Employees  and terminated employee page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_Deactivated Employees'))

WebUI.waitForPageLoad(5)

'clicked  Deactivated Employees link it will open Deactivated Employees page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Temporarly_deactivated/a_admin'))

WebUI.waitForPageLoad(5)

'clicked logged in user name to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked sign out '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

