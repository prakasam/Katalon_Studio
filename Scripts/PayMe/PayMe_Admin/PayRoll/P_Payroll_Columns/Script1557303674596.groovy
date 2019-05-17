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

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/a_Payroll Reports'))

WebUI.waitForPageLoad(5)

'clicked PayRoll Reports sub menu , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/a_Payroll Columns'))

WebUI.waitForPageLoad(5)

'clicked Company PayRoll link  , it will open page ( by default page for payroll reports sub menu ) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input__name_m'), 'Sample Basic Salary')

WebUI.waitForPageLoad(5)

'given name '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input__name_m'), Keys.chord(Keys.TAB, 
        Keys.ENTER, 'total hours from approved time sheets', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected predefined calculations from combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'Samsung SDI ', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected Calculation group from combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'Basic Salary', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected salary Components from combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'Samsung sdi', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected Calculation method from combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'Basic Salary', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected column to add from combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'socso', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected column to subtract from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input__colorder'), '1')

WebUI.waitForPageLoad(5)

'Given Column order '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/select_YesNo_ed'), 'No', 
    true)

WebUI.waitForPageLoad(5)

'Selected editable opction using drop down '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/select_YesNo_en'), 'Yes', 
    true)

WebUI.waitForPageLoad(5)

'Selected enabled opction using drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input__default_value'), '0.00')

WebUI.waitForPageLoad(5)

'Given Default value '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Add'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked add , it open in pop up for adding column opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input__name'), 'paniendra1')

WebUI.waitForPageLoad(5)

'given name '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input__name'), Keys.chord(Keys.TAB, 
        Keys.ENTER, 'gross salary', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected Column from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Done'))

WebUI.waitForPageLoad(5)

WebUI.waitForPageLoad(5)

'clicked done after given name and column , it will display info in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok in pop up , and auto redirect to Company payroll adding page '
WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Save'), 5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to payroll Columns page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input_records per page_form-control'), 
    'Sample Basic Salary')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/img_Yes_tableActionButton_Edit'))

WebUI.waitForPageLoad(5)

'click edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Save'))

WebUI.waitForPageLoad(5)

'click Save, it will save the record and auto redirect to payroll Columns page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input_records per page_form-control'), 
    'Sample Basic Salary')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/img_Yes_tableActionButton_Copy'))

WebUI.waitForPageLoad(5)

'click copy image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Save'))

WebUI.waitForPageLoad(5)

'click Save, it will save the record and auto redirect to payroll Columns page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input_records per page_form-control'), 
    'Sample Basic Salary')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/img_Yes_tableActionButton'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'click delete image link , it will ask confirmation in pop up  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete , it will delete the record and auto redirect to Company payroll page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/input_records per page_form-control'), 
    'Sample Basic Salary')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/img_Yes_tableActionButton'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'click delete image link , it will ask confirmation in pop up  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete , it will delete the record and auto redirect to Company payroll page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Filter_m'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opctions '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'Samsung SDI', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen required Calculation Group from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter in pop up , it will filter selected Calculation Group records and auto redirect to  payroll columns page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/button_Calculation Group  Samsung SDI'))

WebUI.waitForPageLoad(5)

'clicked close filtered opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Name_a'))

WebUI.waitForPageLoad(5)

'clicked name in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Name'))

WebUI.waitForPageLoad(5)

'clicked name in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Column Order_a'))

WebUI.waitForPageLoad(5)

'clicked Column Order in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Column Order'))

WebUI.waitForPageLoad(5)

'clicked Column Order in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Calculation Method_a'))

WebUI.waitForPageLoad(5)

'clicked Calculation Method in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Calculation Method'))

WebUI.waitForPageLoad(5)

'clicked Calculation Method in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Calculation Group_a'))

WebUI.waitForPageLoad(5)

'clicked Calculation Group in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Calculation Group'))

WebUI.waitForPageLoad(5)

'clicked Calculation Group in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Editable_a'))

WebUI.waitForPageLoad(5)

'clicked Editable in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Editable'))

WebUI.waitForPageLoad(5)

'clicked Editable in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Enabled_a'))

WebUI.waitForPageLoad(5)

'clicked Enabled in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/th_Enabled'))

WebUI.waitForPageLoad(5)

'clicked Enabled in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Payroll_Columns_OR/a_2'), FailureHandling.OPTIONAL)

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

WebUI.closeBrowser(FailureHandling.OPTIONAL)

