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

WebUI.navigateToUrl('https://pasti.myeg.com.my/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/input_Login_username'), 
    '45586-T')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/input_Login_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/button_Sign In'))

'pasti Business user dash board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/span_Route Replay'))

'click route replay menu\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/div_JLT2255'))

'Selected required vehicle using search '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/span_September'), FailureHandling.OPTIONAL)

//WebUI.scrollToElement(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))
not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/svg'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/input_Selected Date_date-picke'), 
    '01/08/2018', FailureHandling.OPTIONAL)

WebUI.scrollToPosition(50, 60)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/span_Play'))

'selected play button '
WebUI.takeScreenshot()

//WebUI.switchToFrame(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/p_Error'), 0)
WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/p_Error'), FailureHandling.OPTIONAL)

'error info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/button_Close'), FailureHandling.OPTIONAL)

WebUI.refresh()

'closed error info '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/div_Hi MYEG Services'))

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/a_Logout'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_RouteReplay_OB/Page_Pasti by MyEG/div_Hi'))

'click logout from top menu '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://pasti.myeg.com.my/auth/logout')

'login screen page \r\n'
WebUI.takeScreenshot()

WebUI.closeBrowser()

