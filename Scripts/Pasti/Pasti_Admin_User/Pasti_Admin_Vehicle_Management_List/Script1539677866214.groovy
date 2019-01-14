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

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.maximizeWindow()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/button_Sign In'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Vehicle List'))

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/select_102550100'), 
    '25', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/a_5'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/input_All vehicles_form-contro'), 
    'QAtest')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/a_Vara prasad'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MyEG/a_Edit'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/button_Update'))

WebUI.delay(3)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/a_Vehicle Management (1)'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/a_Vehicle List (1)'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/input_All vehicles_form-contro'), 
    'QAtest')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/a_Edit (1)'))

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/button_Update'))

WebUI.delay(1)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_Vehicle_Management_List_OB/Page_PASTI by MYEG/a_Logout'))

WebUI.closeBrowser()

