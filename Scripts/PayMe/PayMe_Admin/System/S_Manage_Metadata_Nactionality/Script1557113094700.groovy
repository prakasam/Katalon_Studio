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

WebUI.maximizeWindow()

'Payme Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme Admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked Admin Main Menu to minimize opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/a_System'))

WebUI.waitForPageLoad(5)

'clicked System Main Menu to maximize opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/a_Manage Metadata'))

WebUI.waitForPageLoad(5)

'clicked Manage meta data sub Menu , it will open the page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/a_Nationality'))

WebUI.waitForPageLoad(5)

'clicked Nactionality link  , it will open the page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/button_Add New'))

WebUI.waitForPageLoad(5)

'cliccked Add New buttion , it will open page to add '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/input__name'), 'Vatican City')

'click save with given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the data and auto redirect to Nactionality page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/input_records per page_form-control'), 
    'Vatican City')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/img_Vatican City_tableActionButton_Edit'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/input__name'), 'Vatican City edit')

'click save with given required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the data and auto redirect to Nactionality page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/input_records per page_form-control'), 
    'Vatican City')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/img_Vatican City edit_tableActionButton_Copy'))

WebUI.waitForPageLoad(5)

'clicked Copy image link , it will open page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/button_Save'))

WebUI.waitForPageLoad(5)

'click save with given required info , it will save data'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/input_records per page_form-control'), 
    'Vatican City')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/img_Vatican City edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked Delete image link , it will ask confirmation to delete \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete button, it will delete the record , it will auto redirect to Nactionality page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/input_records per page_form-control'), 
    'Vatican City')

WebUI.waitForPageLoad(5)

'search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/img_Vatican City edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked Delete image link , it will ask confirmation to delete \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete button, it will delete the record , it will auto redirect to Nactionality page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/th_Name_a'))

WebUI.waitForPageLoad(5)

'clikced the name in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/th_Name'))

WebUI.waitForPageLoad(5)

'clikced the name in table, it will order data in Dessending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Nactionality/a_3'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked third page using pagination , it will open '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

'clicked third page using pagination , it will open '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/a_admin (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked admin link to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked sign out '
WebUI.takeScreenshot()

WebUI.closeBrowser(FailureHandling.OPTIONAL)

