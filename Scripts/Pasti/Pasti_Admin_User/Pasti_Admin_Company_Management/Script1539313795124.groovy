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

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/')

WebUI.maximizeWindow()

'Pasti Admin Login Screen '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/input_Sign In_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/button_Sign In'))

'Pasti Admin Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/a_Company Management'))

'Clicked Company Manager menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/a_Company List'))

'Company Manager Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/a_5'))

'Selected fifth page from pagination '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/select_102550100'), 
    '100', true)

'selected list of company\'s from 10 to 100 from pagination drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/th_Company Name'))

'Selected Company Name Assending to desending order '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/select_102550100'), 
    '10', true)

'selected list of company\'s from 100 to 10 from pagination drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/input_List of All Registered C'), 
    'GXP1610')

'Searched required company details using search box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/a_Herman'))

'Selected Company Contact Person link to view details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/a_Edit'))

'Selected edit link for company contact person '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/button_Update (1)'))

'selected update with out changing the value '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/a_Company Management (1)'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/a_Company List (1)'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/input_List of All Registered C'), 
    'GXP1610')

'Searched for required company info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/a_Edit_1'))

'Clicked edit company link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_Company_Management_OR/Page_PASTI by MyEG/button_Update'))

'Selected update with out chanhging value in company edit page '
WebUI.takeScreenshot()

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/logout.php')

'Logout and exit '
WebUI.takeScreenshot()

WebUI.closeBrowser()

