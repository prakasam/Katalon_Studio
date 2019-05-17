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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

WebUI.setText(findTestObject('Object Repository/test_OR/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/test_OR/input_Remember me_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/test_OR/button_Sign in'))

WebUI.click(findTestObject('Object Repository/test_OR/a_Admin'))

WebUI.click(findTestObject('Object Repository/test_OR/a_System'))

WebUI.click(findTestObject('Object Repository/test_OR/a_Data'))

WebUI.click(findTestObject('Object Repository/test_OR/a_Data Import Files'))

WebUI.click(findTestObject('Object Repository/test_OR/button_Add New'))

WebUI.setText(findTestObject('Object Repository/test_OR/input__name'), 'sample')

WebUI.selectOptionByValue(findTestObject('Object Repository/test_OR/select_Employee Data ImportAttendance Data ImportPayroll Data ImportXIMPORTSample Attendance'), 
    '13', true)

WebUI.click(findTestObject('Object Repository/test_OR/i_Upload_fa fa-cloud-upload text-green'))

WebUI.click(findTestObject('Object Repository/test_OR/button_Cancel'))

WebUI.click(findTestObject('Object Repository/test_OR/button_Save'))

WebUI.setText(findTestObject('Object Repository/test_OR/textarea_Last Export Result_details'), 'sample attendance ')

WebUI.click(findTestObject('Object Repository/test_OR/button_Save'))

WebUI.click(findTestObject('Object Repository/test_OR/a_admin (1)'))

WebUI.click(findTestObject('Object Repository/test_OR/a_Sign out'))

