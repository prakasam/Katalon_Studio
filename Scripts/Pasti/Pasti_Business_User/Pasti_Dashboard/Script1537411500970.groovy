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

WebUI.setText(findTestObject('Object Repository/Pasti_Dasboard_OB/Page_Pasti by MyEG/input_Login_username'), '45586-T')

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti_Dasboard_OB/Page_Pasti by MyEG/input_Login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Pasti_Dasboard_OB/Page_Pasti by MyEG/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Pasti_Dasboard_OB/Page_Pasti by MyEG/span_Dashboard'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti_Dasboard_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/div_JLT1155'))

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Pasti_Dasboard_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/i_Vehicles List_search fa fa-s'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pasti_Dasboard_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/input_SP_search-vehicle'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Pasti_Dasboard_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/input_SP_search-vehicle'), 'JQA5533', 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Pasti_Dasboard_OB/Page_Pasti by MyEG/i_SP_search fa fa-search'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti_Dasboard_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/li_JQA5533'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pasti_Dasboard_OB/Page_Pasti by MyEG/Page_Pasti by MyEG/i_SP_close-search-vehicle fa f'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti_Dasboard_OB/Page_Pasti by MyEG/div_Hi MYEG Services'))

WebUI.click(findTestObject('Pasti_Dasboard_OB/Page_Pasti by MyEG/div_Hi'))

not_run: WebUI.click(findTestObject('Object Repository/Pasti_Dasboard_OB/Page_Pasti by MyEG/a_Logout'))

WebUI.navigateToUrl('https://pasti.myeg.com.my/auth/logout')

WebUI.closeBrowser()

