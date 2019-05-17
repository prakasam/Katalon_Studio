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

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/a_Payroll Reports'))

WebUI.waitForPageLoad(5)

'clicked PayRoll Reports sub menu , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/a_Calculation Methods'))

WebUI.waitForPageLoad(5)

'clicked Calculation Method link  , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input__name'), 'sample calculation')

WebUI.waitForPageLoad(5)

'given Name details '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input__name'), Keys.chord(Keys.TAB, 
        Keys.ENTER, 'basic', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen salary component type using combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input__name'), Keys.chord(Keys.TAB, 
        Keys.TAB, Keys.ENTER, 'fixed allowance', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen salary component using combo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input__name'), Keys.chord(Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.ENTER, 'gross salary', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen payroll report column using combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Add'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked Add button for calculation process , it will open in pop up for details to add '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/select_No Lower LimitGreater thanGreater than or Equal'), 
    'gte', true)

WebUI.waitForPageLoad(5)

'choosen Lower Limit Condition using drop down  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input__lowerLimit'), '0')

WebUI.waitForPageLoad(5)

'given lower limit details '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/select_No Upper LimitLess thanLess than or Equal'), 
    'lte', true)

WebUI.waitForPageLoad(5)

'choosen Upper Limit Condition using drop down  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input__upperLimit'), '30')

WebUI.waitForPageLoad(5)

'given Upper Limit details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input__amount'), '70')

WebUI.waitForPageLoad(5)

'given value details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Done'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked add button , it will open add to page and display info " This change will be effective only when you save the form" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok in pop up info '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input__name'), Keys.chord(Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'Samsung sdi', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen calculation group using drop down  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save button ,  it will save the record and auto redirect to Calaculation Method page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input_records per page_form-control'), 
    'sample calculation')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/img_Samsung SDI_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'click edit image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked Save, it will save the record and auto redirect to Calculation Method page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input_records per page_form-control'), 
    'sample calculation')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/img_Samsung SDI_tableActionButton_copy'))

WebUI.waitForPageLoad(5)

'click Copy image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked Save, it will save the record and auto redirect to Calculation Method page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input_records per page_form-control'), 
    'sample calculation')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/img_Samsung SDI_tableActionButton'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'click Delete image link , it will ask confirmation in pop up  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete , it will delete the record and auto redirect to Calculation Method page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/input_records per page_form-control'), 
    'sample calculation')

WebUI.waitForPageLoad(5)

'Search using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/img_Samsung SDI_tableActionButton'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'click Delete image link , it will ask confirmation in pop up  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete , it will delete the record and auto redirect to Calculation Method page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/th_Name_a'))

WebUI.waitForPageLoad(5)

'clicked Name in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/th_Name'))

WebUI.waitForPageLoad(5)

'clicked Name in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/th_Calculation Group_a'))

WebUI.waitForPageLoad(5)

'clicked Details in table , it will make records Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/th_Calculation Group'))

WebUI.waitForPageLoad(5)

'clicked Details in table , it will make records Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/P_Sallary_OR/Collection_Methods_OR/a_2'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked Details in table , it will make records Dessending order '
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

