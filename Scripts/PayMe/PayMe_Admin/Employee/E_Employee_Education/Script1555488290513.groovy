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

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/a_Education'))

WebUI.waitForPageLoad(5)

'clicked Eaducation link it will open Eaducation page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save button with out given required info , it will display in red color for manadatory details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Cancel'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Add New'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/span_Kabir Hussin - Copy'))

not_run: WebUI.delay(3)

'clicked employee combo box to view '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input_EmployeeEmployee_s2id_autogen9_search'), 
    'april')

not_run: WebUI.delay(3)

'searched employee to select '
not_run: WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, 'aplus', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required employee from combo box  '
WebUI.takeScreenshot()

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/span_Bachelors Degree'))

not_run: WebUI.delay(3)

'clicked skills combo box to view '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input_QualificationQualification_s2id_autogen10_search'), 
    'masters')

not_run: WebUI.delay(3)

'searched required skills to select '
not_run: WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'masters', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required Qualification from combo box  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input__institute'), 'Malayu Open University')

WebUI.waitForPageLoad(5)

' given institute information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input_Start Date_date_start'), '2019-01-01')

WebUI.waitForPageLoad(5)

'given start date information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input_Completed On_date_end'), '2019-04-17')

WebUI.waitForPageLoad(5)

'click save with given completion date information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Eaducation page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input_records per page_form-control'), 'masters')

WebUI.waitForPageLoad(5)

'search using name Eaducation name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/img_Malayu Open University_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'clicked image edit link , it will open page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input__institute'), 'Malayu Open university Edit ')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Eaducation page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input_records per page_form-control'), 'Open university')

WebUI.waitForPageLoad(5)

'search using institute info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/img_Malayu Open University edit_tableActionButton_copy'))

WebUI.waitForPageLoad(5)

'clicked image copy link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the duplicate record '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input_records per page_form-control'), 'Masters')

WebUI.waitForPageLoad(5)

'search using Qualitication info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/img_Malayu Open University edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked image delete link , it will open in pop up for confirmation to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to Eaducation page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/input_records per page_form-control'), 'Masters')

WebUI.waitForPageLoad(5)

'search using text info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/img_Malayu Open University edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked image delete link , it will open in pop up for confirmation to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to Eaducation page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Employee'))

'clicked employee namein table  to sort in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Employee'))

'clicked employee namein table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Qualification'))

'clicked Qualification in table  to sort in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Qualification'))

'clicked Qualification in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Institute'))

'clicked institute in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Institute'))

'clicked institute in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Start Date'))

'clicked start date in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Start Date'))

'clicked start date in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Completed On'))

'clicked compltion date in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/th_Completed On'))

'clicked compltion date in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/a_2'), FailureHandling.OPTIONAL)

'clicked second page unsing page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/a_Education'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/a_Education'))

WebUI.waitForPageLoad(5)

'clicked Eaducation link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required employee from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'diploma', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required qualification from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Education/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_admin (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked logged in user name to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked sign out '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

