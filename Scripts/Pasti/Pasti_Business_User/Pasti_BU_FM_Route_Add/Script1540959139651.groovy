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

WebUI.navigateToUrl('http://192.168.121.37/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Login_username'), 
    '45586-T')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Login_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Sign In'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/a_Fleet Management'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Add'))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Export_input'), 
    'genting')

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Add New Route'))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Choose Destination_input'), 
    'PWTC Bus Stop')

WebUI.delay(1)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/span_Bus Stop Star Pwtc'))

WebUI.sendKeys(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Choose Destination_input'), 
    Keys.chord(Keys.TAB))

not_run: webElement.sendKeys(Keys.TAB)

WebUI.delay(2)

WebUI.setText(findTestObject(null), 'Cameron')

not_run: WebUI.focus(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Choose Destination_input'))

not_run: WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Choose Destination_input'), 
    'cameron')

WebUI.delay(1)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/span_Cameron Highlands'))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Route Name_name'), 
    'PWTC to Cameron ')

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/textarea_Route Description_des'), 
    'PWTC bus terminal to Cameron highlands ')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Create'))

WebUI.focus(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Choose Destination_input'))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Choose Destination_input'), 
    'cameron')

WebUI.delay(1)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/span_Cameron Highlands'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Create'))

WebUI.delay(2)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Edit'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/div_Choose Destination_icon'))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Choose Destination_input'), 
    'penang is')

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/textarea_Route Description_des'), 
    'PWTC bus terminal to Cameron highlands to penang island ')

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Route Name_name'), 
    'PWTC to Cameron to penang')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Update'))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Export_input'), 
    'cameron')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Delete'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/button_Delete'))

WebUI.sendKeys(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Export_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/input_Export_input'), 
    'cameron')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Route_add_OB/Page_Pasti by MyEG/a_Logout'))

