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

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

'Payme Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/input_Remember me_username'), 'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/button_Sign in'))

'Pay Me User Dash Board\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/a_Time Management'))

'Click Time Management menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/a_Projects'))

'Clicked projects sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/a_My Projects'))

'Search valid data to get result '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/input_records per page_form-control'), 
    'PDX')

'it will display the matching records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/input_records per page_form-control'), 
    'No data')

'Searched invalid data will display message " no matching record found"'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/th_Project'))

'Sorted in Assending order using project name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/th_Project'))

'Sorted in Dessending order using project name '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/a_2'))

'clicked second page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/a_Aplus edited 12'))

'selected name to sign out '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Projects/a_Sign out'))

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

