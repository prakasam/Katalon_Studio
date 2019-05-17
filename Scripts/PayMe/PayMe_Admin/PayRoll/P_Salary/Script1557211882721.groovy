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

'payme login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'payme admin dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked admin main menu to minimise sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_Payroll'))

WebUI.waitForPageLoad(5)

'clicked Payroll main menu to maximise sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_Salary'))

WebUI.waitForPageLoad(5)

'clicked salary sub menu , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input__code'), 'P007')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input__name'), 'PDX Bonus')

WebUI.waitForPageLoad(5)

'click save with given required details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to salarry Components page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input_records per page_form-control'), 
    'PDX Bonus')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/img_PDX Bonus_tableActionButton'))

WebUI.waitForPageLoad(5)

'click edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input__name'), 'PDX Bonus edit')

WebUI.waitForPageLoad(5)

'given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/button_Save'))

WebUI.waitForPageLoad(5)

'click Save, it will save the record and auto redirect to Salary component types page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input_records per page_form-control'), 
    'pdx bonus')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/img_PDX Bonus edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'click copy image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/button_Save'))

WebUI.waitForPageLoad(5)

'click Save, it will save the record and auto redirect to Salary component types page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input_records per page_form-control'), 
    'pdx bonus')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/img_PDX Bonus edit_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'click delete image link , it will ask confirmation in pop up  '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete , it will delete the record and auto redirect to Salary component types page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/input_records per page_form-control'), 
    'pdx bonus')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/img_PDX Bonus edit_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'click delete image link , it will ask confirmation in pop up  '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete , it will delete the record and auto redirect to Salary component types page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/th_Code'))

WebUI.waitForPageLoad(5)

'clicked code in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/th_Code'))

WebUI.waitForPageLoad(5)

'clicked code in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/th_Name'))

WebUI.waitForPageLoad(5)

'clicked name in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/th_Name'))

WebUI.waitForPageLoad(5)

'clicked name in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_2'))

WebUI.waitForPageLoad(5)

'clicked second page unding page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_admin (1)'))

WebUI.waitForPageLoad(5)

'clicked admin name to view the sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/a_Sign out'))

WebUI.waitForPageLoad(5)

'clicked sign out and it will auto redirect to login page '
WebUI.takeScreenshot()

WebUI.closeBrowser()

