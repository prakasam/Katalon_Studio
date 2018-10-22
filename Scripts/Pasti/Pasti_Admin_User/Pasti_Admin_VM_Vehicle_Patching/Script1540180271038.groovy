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

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MyEG/button_Sign In'))

WebUI.maximizeWindow()

'pasti admin page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MyEG/a_Vehicle Management'))

'Click Vehicle Management Menu'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MyEG/a_Vehicle Patching'))

'Vehicle patching page ( Click Vehicle Patching Sub Menu ) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/input'))

'Select Submit with out given Zip file to upload patch '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/button_Patch'))

'click patch button with out given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/form_Choose Company'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/select_Choose'), 
    '505639-K', true)

'click patch button with given company name only  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/button_Patch'))

'click patch button with given company name only  '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/select_Choose'), 
    '505639-K', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/button_Refersh Vehicle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/select_Chooseabc1234BNV7781DB2'), 
    'EMUTEST1', true)

'click patch button with given Company Name and vehicle no with out patch version  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/button_Patch'))

'click patch button with given Company Name and vehicle no with out patch version  '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/select_Choose'), 
    '505639-K', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/button_Refersh Vehicle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/select_Chooseabc1234BNV7781DB2'), 
    'EMUTEST1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/select_Choose                 _1'), 
    '1_04_RS_HEL_SelfUpdating', true)

'click patch button with given Company Name ,vehicle noand patch version. it will send patch successfully '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/button_Patch'))

'click patch button with given Company Name ,vehicle noand patch version. it will send patch successfully '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/input_Download Report_form-con'), 
    'emutest1')

WebUI.scrollToPosition(0, 250)

'Search for requested pach vehicle to check '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/a_Delete All'))

'Selected Delete all patches '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/button_Confirm'))

'click confirm delete button '
WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/input_Download Report_form-con'), 
    'emutest1')

WebUI.scrollToPosition(0, 250)

'verified the deleted patching info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_Vehicle_Patching_OB/Page_PASTI by MYEG/a_Logout'))

'Logout from pasti admin '
WebUI.takeScreenshot()

WebUI.closeBrowser()

