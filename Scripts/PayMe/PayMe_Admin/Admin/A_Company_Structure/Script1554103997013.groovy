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

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

WebUI.maximizeWindow()

'PayMe Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given Username and password'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme Admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/a_Company Structure'))

WebUI.waitForPageLoad(5)

'Cliked Company Structure'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/button_Add New'))

WebUI.waitForPageLoad(5)

'Clicked Add New Button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/button_Save'))

'it will display in red color for mandatory field name to fill '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input__title'), 'Touch \'n Go Sdn Bhd')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/textarea__description'), 'RFID work shops ')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/textarea_Address_address'), 'KL')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/select_CompanyHead OfficeRegional OfficeDepartmentUnitSub UnitOther'), 
    'Regional Office', true)

'click Save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the company details and redirect back to Company page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    'touch')

WebUI.waitForPageLoad(5)

'search for required Company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/img_(GMT-1100) Midway Island_tableActionButton'))

'clicked Edit Company image'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input__title'), 'Touch \'n Go Sdn Bhd edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/textarea__description'), 'RFID work shops edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/textarea_Address_address'), 'KL edit')

'Click save with given required details to edit '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and redirected to company page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    'touch')

WebUI.waitForPageLoad(5)

'seach for required company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/img_(GMT-1100) Midway Island_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked copy image link'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save it will save the details and redirected back to company page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    'touc')

WebUI.waitForPageLoad(5)

'search for required company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/img_(GMT-1100) Midway Island_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked delete image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete confirmation button from pop up , it will delete and return back to company page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    'touc')

WebUI.waitForPageLoad(5)

'search for required company name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/img_(GMT-1100) Midway Island_tableActionButton_3'))

WebUI.waitForPageLoad(5)

'clicked delete image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete confirmation button from pop up , it will delete and return back to company page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    'Level 12')

WebUI.waitForPageLoad(5)

'search for required company Address'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    'Head Office')

WebUI.waitForPageLoad(5)

'search for required company Type'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    'AF')

WebUI.waitForPageLoad(5)

'search for required company Country'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    '(GMT-11 :00) Midway Island')

WebUI.waitForPageLoad(5)

'search for required Time Zone'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/input_records per page_form-control'), 
    'Company2')

WebUI.waitForPageLoad(5)

'search for required Time Zone'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/th_Name'))

'Filter based on the company name Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/th_Address'))

'Filter based on the Address Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/th_Type'))

'Filter based on the company Type Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/th_Country'))

'Filter based on the Country Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/th_Time Zone'))

'Filter based on the Time Zone Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/th_Parent Structure'))

WebUI.waitForPageLoad(5)

'Filter based on the Parent Structure Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/a_Company Graph'))

WebUI.waitForPageLoad(5)

WebUI.delay(3)

'Clicked Company Graph Info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/a_Dashboard'))

WebUI.waitForPageLoad(5)

'Clicked Dashboard Info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/a_admin'))

WebUI.delay(2)

'clicked admin name to view sign out '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/Company_Structure/a_Sign out'))

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

'login page '
WebUI.takeScreenshot()

