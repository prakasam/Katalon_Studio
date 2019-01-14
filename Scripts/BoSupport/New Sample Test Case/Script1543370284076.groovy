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

WebUI.navigateToUrl('http://uat4.myeg.com.my/BOSupport/login.zul')

WebUI.focus(findTestObject('BO_Support-OR/MyEG_User_OB/Page_LOGIN - BOSupport/input_User_j_username'))

WebUI.setText(findTestObject('BO_Support-OR/MyEG_User_OB/Page_LOGIN - BOSupport/input_User_j_username'), 'prakasam')

WebUI.setEncryptedText(findTestObject('BO_Support-OR/MyEG_User_OB/Page_LOGIN - BOSupport/input_Password_j_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('BO_Support-OR/MyEG_User_OB/Page_LOGIN - BOSupport/button_Submit'))

WebUI.click(findTestObject('BO_Support-OR/MyEG_User_OB/Page_SupportHome/button_LogOut'))

WebUI.closeBrowser()

WebUI.selectOptionByIndex(findTestObject(null), null)

