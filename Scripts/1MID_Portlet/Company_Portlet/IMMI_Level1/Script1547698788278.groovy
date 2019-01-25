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

WebUI.navigateToUrl('http://uat5.myeg.com.my/portlet/')

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Email Address__58_login'), 'read@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Password__58_password'), 'bdcyxfk0gjc=')

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Remember Me_aui_3_2_0_11'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/select_-- Select -- Registrati'), '0', 
    true)

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Warning  You do not have'), 'myeg')

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_1'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_OK'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_2'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_OK'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_3'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/select_-- Select -- Registrati'), '1', 
    true)

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Warning  You do not have_1'), 'e')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Warning  You do not have_2'), 'es')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Warning  You do not have_3'), 'est')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Warning  You do not have_4'), 'este')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Warning  You do not have_5'), 'estee')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Warning  You do not have_6'), 'esteem')

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_Warning  You do not have_7'), 'esteem')

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_5'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_6'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_OK'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_7'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_8'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_9'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_10'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_11'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_OK'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_12'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_OK'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_1MID User Portlet'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_ENTER ICNOUSER NAME_nric'), 'dataentry.myeg@gmail.com')

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input (1)'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_ENTER ICNOUSER NAME_nric'), '340908025111')

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_User Name_userId'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_1 (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_OK (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_2 (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_OK (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_3 (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_4 (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/input_5 (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/span_OK (1)'))

WebUI.click(findTestObject('Object Repository/1MID_Portlet/IMMI_Level1/a_Sign Out'))

