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

'Payme sign in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'after successfull sign in , it will redirect to dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/a_Employee Custom Fields'))

WebUI.waitForPageLoad(5)

'clicked employ cutom fields sub menu '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_records per page_form-control'), 
    'name')

WebUI.waitForPageLoad(5)

'search using name it will , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/img_Table and Form_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open edit page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will auto redirect to employ field name page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/a_Employee Field Names'))

WebUI.waitForPageLoad(5)

'clicked employ field name link , it will refresh the page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_records per page_form-control'), 
    'email')

WebUI.waitForPageLoad(5)

'search using email it will , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/img_Form_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open edit page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked Save button , it will save data and auto redirect to employ field name page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_records per page_form-control'), 
    'number')

WebUI.waitForPageLoad(5)

'search using original text value , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_records per page_form-control'), 
    'information')

WebUI.waitForPageLoad(5)

'search using mapped text  , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Name'))

'clicked name in table , it will display info in assending order '
WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.doubleClick(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Original Text'))

WebUI.waitForPageLoad(5)

'clicked original text in table , it will display info in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Mapped Text'))

WebUI.waitForPageLoad(5)

'clicked mapped text in table , it will display info in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Display Status - Copy'))

WebUI.waitForPageLoad(5)

'clicked Display status in table , it will display info in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/a_2'))

WebUI.waitForPageLoad(5)

'clicked second page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/a_Employee Custom Fields'))

WebUI.waitForPageLoad(5)

'clicked employ custom fields sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/a_Employee Custom Fields_1'))

WebUI.waitForPageLoad(5)

'clicked employ cutom fields link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new , it will open in page to key in details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input__name_employee'), 'work_location')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/select_ShowHidden'), 
    'Hidden', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/select_Text FieldText AreaSelectSelect2Multi SelectFile UploadDateDate TimeTime'), 
    'text', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input__field_label'), 
    'work_location')

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/span_Required__employee'))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_Validation_s2id_autogen2_search__employee'), 
    'none')

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input__display_order__employee'), '5')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_Display Section_display_section'), 
    'Work Location')

WebUI.waitForPageLoad(5)

'click save with Given All Required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will save the data and auto redirect to employ custom fields page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_records per page_form-control_employee'), 
    'work')

WebUI.waitForPageLoad(5)

'search using name it will , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/img_Hidden_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit link image , it will open page to edit '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/select_ShowHidden'), 
    'Form', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/select_Text FieldText AreaSelectSelect2Multi SelectFile UploadDateDate TimeTime'), 
    'text', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_Display Section_display_section'), 
    'Work Location edit')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will save the data and auto redirect to employ custom fields page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/input_records per page_form-control_employee'), 
    'work')

WebUI.waitForPageLoad(5)

'search using name it will , it will display the matched records  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/img_Form_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked copy image link . it will open new page with coppied details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out changing, it will display error message " Another custom field with same name has already been added" '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok button in pop up info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel , it will redirect to employ custom field page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/img_Form_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will open pop up for confirmation '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete the record and auto redirected to employ custom fields page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Name_employee'))

WebUI.waitForPageLoad(5)

'clicked emply name in table to arrange in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Name_employee'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked emply name in table to arrange in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Display Status'))

WebUI.waitForPageLoad(5)

'clicked display status in table to arrange in assending order '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Display Status'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked display status in table to arrange in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Priority'))

WebUI.waitForPageLoad(5)

'clicked priority in table to arrange in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/th_Priority'))

WebUI.waitForPageLoad(5)

'clicked priority in table to arrange in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/a_2_employee'))

WebUI.waitForPageLoad(5)

'clicked send page using pagination opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Employee_Custom_Fields_OR/a_admin'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

'clicked logged in user name to view sign out opction '
WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php', FailureHandling.OPTIONAL)

