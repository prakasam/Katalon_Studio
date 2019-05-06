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

'log in page of payme '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme Admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked admin main menu to minimize '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Employees'))

WebUI.waitForPageLoad(5)

'clicked employee main menu to maximise '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Travel Requests'))

WebUI.waitForPageLoad(5)

'clicked travel requests sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Custom Fields'))

WebUI.waitForPageLoad(5)

'cliked sustom fields link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Add New_custom'))

WebUI.waitForPageLoad(5)

'clicked add new , it will open the page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__name'), 'person_incharge')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/select_ShowHidden'), 
    'Hidden', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/select_Text FieldText AreaSelectSelect2Multi SelectFile UploadDateDate TimeTime'), 
    'textarea', true)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__field_label'), 'person_incharge')

WebUI.waitForPageLoad(5)

'given some required info '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__field_label'), Keys.chord(Keys.TAB, Keys.ENTER, 
        'none', Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Add'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__label'), 'person_incharge')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_Value_value'), '3')

WebUI.waitForPageLoad(5)

'given fields options in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/i_Done_fa fa-plus'))

WebUI.waitForPageLoad(5)

'selected done '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Ok_5'))

WebUI.waitForPageLoad(5)

'clicked ok confirmation for info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input__display_order'), '3')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_Display Section_display_section'), 
    'person incharge')

WebUI.waitForPageLoad(5)

'click save , with given all required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Save_custom'))

WebUI.waitForPageLoad(5)

'it will save the person and auto redirected to custom fields page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control_custom'), 'person')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Hidden_tableActionButton'))

WebUI.waitForPageLoad(5)

'selected edit image link , it will open edit page to change '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_Display Section_display_section'), 
    'person in charge edit')

WebUI.waitForPageLoad(5)

'click save with given required  changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Save_custom'))

WebUI.waitForPageLoad(5)

'it will save the changes and auto redirrected to custom fields page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control_custom'), 'person')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Hidden_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'selected copy image link , it will open copy the data in new page  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/i_Save_fa fa-save'))

WebUI.waitForPageLoad(5)

'clicked save . it will display message " duplicate record " '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Ok_6'))

WebUI.waitForPageLoad(5)

'clicked ok for the pop up info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Cancel_1'))

WebUI.waitForPageLoad(5)

'clicked cancel to redirect back to custom fields '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/input_records per page_form-control_custom'), 'person')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/img_Hidden_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'selected delete image link , it will ask confirmation to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button , it will delete the record '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Name'))

'clicked name in table, to arrange assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Name'))

'clicked name in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Display Status'))

'clicked Display statis in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Display Status'))

'clicked Display statis in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Priority'))

'clicked priority in table, to arrange Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/th_Priority'))

'clicked priority in table, to arrange Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_admin (1)'))

'clicked admin name to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Travel_Requests/a_Sign out'))

'clicked sign out '
WebUI.takeScreenshot()

WebUI.closeBrowser(FailureHandling.OPTIONAL)

