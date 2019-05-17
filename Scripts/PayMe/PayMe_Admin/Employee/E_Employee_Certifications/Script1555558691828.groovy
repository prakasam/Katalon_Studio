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

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/a_Certifications'))

WebUI.waitForPageLoad(5)

'clicked Certification link it will open Certification page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save button with out given required info , it will display in red color for manadatory details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Cancel'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Add New'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/span_Kabir Hussin'))

not_run: WebUI.delay(3)

'clicked employee combo box to view '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_Employee_s2id_autogen2_search'), 
    'tia abdul')

not_run: WebUI.delay(3)

'searched employee to select '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

not_run: WebUI.delay(3)

not_run: WebUI.waitForPageLoad(5)

'selected required employee from combo box  '
not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/span_Red Hat Certified Architect (RHCA)'))

not_run: WebUI.delay(3)

'clicked skills combo box to view '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_Certification_s2id_autogen3_search'), 
    'project man')

not_run: WebUI.delay(3)

'searched required skills to select '
not_run: WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'project man', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required Certification  from combo box  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input__institute'), 'Malayu Mniversity')

WebUI.waitForPageLoad(5)

' given institute information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_Granted On_date_start'), '2019-01-01')

WebUI.waitForPageLoad(5)

'given graduated on date information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_Valid Thru_date_end'), '2019-04-18')

WebUI.waitForPageLoad(5)

'click save with given valid thrue date information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_records per page_form-control'), 'Malayu')

WebUI.waitForPageLoad(5)

'search using name institute name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/img_Malayu Mniversity_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'clicked image edit link , it will open page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input__institute'), 'Malayu Mniversity Edit ')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_records per page_form-control'), 'Malayu')

WebUI.waitForPageLoad(5)

'search using institute info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/img_Malayu Mniversity edit_tableActionButton_copy'))

WebUI.waitForPageLoad(5)

'clicked image copy link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the duplicate record '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Ok'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked image copy link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Cancel'))

WebUI.waitForPageLoad(5)

'it will save the duplicate record '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_records per page_form-control'), 'Malayu')

WebUI.waitForPageLoad(5)

'search using Institute info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/img_Malayu Mniversity edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked image delete link , it will open in pop up for confirmation to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to Certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_records per page_form-control'), 'cisco')

WebUI.waitForPageLoad(5)

'search using Certification info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_records per page_form-control'), 'april')

WebUI.waitForPageLoad(5)

'search using Employee info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_records per page_form-control'), 'singapura')

WebUI.waitForPageLoad(5)

'search using Institute info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_records per page_form-control'), '2018-04-01')

WebUI.waitForPageLoad(5)

'search using Granted on info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/input_records per page_form-control'), '2019-04-17')

WebUI.waitForPageLoad(5)

'search using Valid thru info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Employee'))

'clicked employee namein table  to sort in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Employee'))

'clicked employee namein table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Certification'))

'clicked Certification in table  to sort in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Certification'))

'clicked Certification in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Institute'))

'clicked institute in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Institute'))

'clicked institute in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Granted On'))

'clicked Graduated on date in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Granted On'))

'clicked Graduated On date in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Valid Thru'))

'clicked Valid thru date in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/th_Valid Thru'))

'clicked Valid thru date in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/a_2'), FailureHandling.OPTIONAL)

'clicked second page unsing page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/a_Certifications'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/a_Certifications'))

WebUI.waitForPageLoad(5)

'clicked Certification link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required employee from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'microsoft', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required Certification from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/Certifications/button_Filter_popup'))

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

