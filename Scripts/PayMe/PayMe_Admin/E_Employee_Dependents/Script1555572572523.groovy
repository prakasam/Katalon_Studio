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

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/a_Dependents'))

WebUI.waitForPageLoad(5)

'clicked Dependents link it will open Dependents page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save button with out given required info , it will display in red color for manadatory details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Cancel'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Add New'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/span_Kabir Hussin'))

not_run: WebUI.delay(3)

'clicked employee combo box to view '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_EmployeeEmployee_s2id_autogen4_search'), 
    'madan ind')

not_run: WebUI.delay(3)

'searched employee to select '
not_run: WebUI.takeScreenshot()

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'madan ind', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required employee from combo box  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input__name'), 'savithri')

WebUI.waitForPageLoad(5)

' given name information '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/select_ChildSpouseParentOther'), 
    'Spouse', true)

WebUI.waitForPageLoad(5)

'selected relation ship from drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input__dob'), '1994-06-25')

WebUI.waitForPageLoad(5)

'given Date of birth  information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_Id Number_id_number'), 'S12345678')

WebUI.waitForPageLoad(5)

'click save with given ID Number information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Dependents page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), 'Madan')

WebUI.waitForPageLoad(5)

'search using Employee name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/img_S12345678_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'clicked image edit link , it will open page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input__name'), 'Savithri edit ')

WebUI.waitForPageLoad(5)

'it will copy the data and open in new page'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Dependents page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), 'Madan')

WebUI.waitForPageLoad(5)

'search using institute info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/img_S12345678_tableActionButton_copy'))

WebUI.waitForPageLoad(5)

'clicked image copy link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the duplicate record '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), 'madan')

WebUI.waitForPageLoad(5)

'search using Institute info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/img_S12345678_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked image delete link , it will open in pop up for confirmation to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to Certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), 'madan')

WebUI.waitForPageLoad(5)

'search using Institute info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/img_S12345678_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked image delete link , it will open in pop up for confirmation to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to Certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), 'april')

WebUI.waitForPageLoad(5)

'search using Employee info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), 'brother')

WebUI.waitForPageLoad(5)

'search using name info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), 'spouse')

WebUI.waitForPageLoad(5)

'search using Relation ship info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), '1994-06-25')

WebUI.waitForPageLoad(5)

'search using Date of Birth info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/input_records per page_form-control'), 'A12345678')

WebUI.waitForPageLoad(5)

'search using ID Number  info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Employee'))

'clicked employee namein table  to sort in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Employee'))

'clicked employee namein table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Name'))

'clicked name in table  to sort in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Name'))

'clicked name in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Relationship'))

'clicked relationship in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Relationship'))

'clicked relation ship in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Date of Birth'))

'clicked date of birth  in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Date of Birth'))

'clicked Date of birth in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Id Number'))

'clicked ID Number in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/th_Id Number'))

'clicked ID Number in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/a_2'), FailureHandling.OPTIONAL)

'clicked second page unsing page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/a_Dependents'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/a_Dependents'))

WebUI.waitForPageLoad(5)

'clicked Dependents link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Filter_Popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required employee from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Dependents/button_Filter_Popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_admin (1)'))

WebUI.waitForPageLoad(5)

'clicked logged in user name to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked sign out '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

