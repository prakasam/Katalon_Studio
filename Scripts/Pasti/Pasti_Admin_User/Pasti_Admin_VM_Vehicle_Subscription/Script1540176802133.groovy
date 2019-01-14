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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/')

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MyEG/button_Sign In'))

'pasti admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MyEG/a_Vehicle Management'))

'click Vehicle Management menu '
WebUI.takeScreenshot()

WebUI.doubleClick(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MyEG/a_Vehicle Subscription'))

'vehicle maitenance page ( click Vehicle maintenance sub menu) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/a_4'))

'clicked 4th page using pagination '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/select_102550100'), 
    '25', true)

'selected list of vehicles from page 10 to 25 \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/input_UPDATE_form-control inpu'), 
    'QAtest')

'Searched for required vehicle using search feature '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/input'))

'click download report page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/button_UPDATE'))

'select update with out filter the vehicle , it will display all '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/select_ALL'), 
    '505639-K', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/button_UPDATE'))

'select update with Company filter , it will list of avalable vehicles for company  '
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MyEG/a_1'), 
    0)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/select_ALL                    _1'), 
    '6', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/button_UPDATE'))

'select update with Company and vehicle category filter , it will display the available list  '
WebUI.takeScreenshot()

WebUI.scrollToPosition(0, 250)

'scroll down page screen '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/select_ALL                    _2'), 
    '5', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/button_UPDATE'))

'select update with Company ,vehicle category and type filter , it will display the available list  '
WebUI.takeScreenshot()

WebUI.scrollToPosition(0, 250)

'Scroll down page screen \r\n'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/select_ALL                    _3'), 
    '2', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/button_UPDATE'))

'select update with Company ,vehicle category ,type and status filter , it will display the available list  '
WebUI.takeScreenshot()

WebUI.scrollToPosition(0, 250)

'Scroll down page screen \r\n'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/select_ALL                    _4'), 
    'B', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/button_UPDATE'))

'select update with Company ,vehicle category ,type ,status and  Subscription Type filter , it will display the available list  '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/select_ALL                    _5'), 
    'f1.00                                             ', true)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/button_UPDATE'))

'select update with Company ,vehicle category ,type ,status ,Subscription Type and version filter , it will display the available list  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Subscriptions_OB/Page_PASTI by MYEG/a_Logout'))

'Logout from broeaser '
WebUI.takeScreenshot()

WebUI.closeBrowser()

