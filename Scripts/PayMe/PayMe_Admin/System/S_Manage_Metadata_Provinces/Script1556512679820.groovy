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

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/a_Provinces'))

WebUI.waitForPageLoad(5)

'clicked Provinces link , it will open the page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Add New'))

WebUI.waitForPageLoad(5)

'cliccked Add New buttion , it will open page to add '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/input__code'), 'AP')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/input__name'), 'Andhra Pradesh')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/input__name'), Keys.chord(Keys.TAB, Keys.ENTER, 
        'india', Keys.DOWN, Keys.ENTER))

WebUI.delay(3)

'click save with given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the data and auto redirect to Provinces  page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/input_records per page_form-control'), 
    'andhra')

WebUI.waitForPageLoad(5)

'search using country name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/img_India_tableActionButton_Edit'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/input__name'), 'Andhra Pradesh Edit ')

'click save with given required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the data and auto redirect to country page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/input_records per page_form-control'), 
    'Andhra')

WebUI.waitForPageLoad(5)

'search using country name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/img_India_tableActionButton_Copy'))

WebUI.waitForPageLoad(5)

'clicked Copy image link , it will open page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Save'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'click save with given required info , it wil save the data and auto redirect to provinces page \r\n'
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/input_records per page_form-control'), 
    'Andhra')

WebUI.waitForPageLoad(5)

'search using country name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/img_India_tableActionButton_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete image link , it will ask confirmation to delete \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete button, it will delete the record , it will auto redirect to Provinces page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/input_records per page_form-control'), 
    'Andhra')

WebUI.waitForPageLoad(5)

'search using country name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/img_India_tableActionButton_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete image link , it will ask confirmation to delete \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked Delete button, it will delete the record , it will auto redirect to Provinces page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Filter_main'))

WebUI.waitForPageLoad(5)

'clicked refresh tha page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'Malaysia', Keys.ENTER))

WebUI.waitForPageLoad(5)

'clikced the code in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clikced the code in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/button_Country  Malaysia'))

WebUI.waitForPageLoad(5)

'clikced the code in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/a_Provinces'))

'clikced the code in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/th_Code'))

WebUI.waitForPageLoad(5)

'clikced the code in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/th_Code_D'))

WebUI.waitForPageLoad(5)

'clikced the code in table, it will order data in Dessending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/th_Name'))

WebUI.waitForPageLoad(5)

'clikced the Name in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/th_Name_D'))

WebUI.waitForPageLoad(5)

'clikced the Name in table, it will order data in Dessending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/th_Country'))

WebUI.waitForPageLoad(5)

'clikced the Country in table, it will order data in assending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/th_Country'))

WebUI.waitForPageLoad(5)

'clikced the Country in table, it will order data in Dessending '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Manage_Metadata/Province/a_3'))

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

