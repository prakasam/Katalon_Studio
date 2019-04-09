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

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

WebUI.takeScreenshot()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/input_Remember me_password'), 
    'RAIVpflpDOg=')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/button_Sign in'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Manage Employees'))

'clicked Manane Employees image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Manage Company'))

WebUI.waitForPageLoad(5)

'clicked Manane Company image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

WebUI.waitForPageLoad(5)

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Manage Users'))

'clicked Manane Users image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Update ClientsProjects'))

'clicked Update Client/Projects image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Monitor Attendance'))

'clicked Monitor Attendance image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Generate a Report'))

'clicked Generte Report image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Update Settings'))

'clicked Update Settings image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Manage Travel'))

'clicked Manane Travels image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Manage Permissions'))

'clicked Manane Permissions image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Dashboard'))

'Clicked Dashboard link for main page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_admin (1)'))

not_run: WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Login_Dashboard/a_Sign out'))

'clicked user name from right top cornet to view log out opction '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

'logged out from payme application '
WebUI.takeScreenshot()

