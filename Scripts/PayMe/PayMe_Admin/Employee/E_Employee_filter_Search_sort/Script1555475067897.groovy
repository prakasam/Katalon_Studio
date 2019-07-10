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

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'payme Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked Admin main menu ( to close admin opctions ) '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees'))

WebUI.waitForPageLoad(5)

'clicked employee main menu to open sub menu opctions  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_1'))

WebUI.waitForPageLoad(5)

WebUI.delay(2)

'clicked employees sub menu , it will open empoyee details  page'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'paniendra31')

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'search using employ name , it will display the matched records \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Incomplete_tableActionButton_3'))

WebUI.waitForPageLoad(5)

'clicked view image link , it will open details to view '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Upload Profile Image'))

WebUI.waitForPageLoad(5)

'clicked upload photo button , it will open in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(5)

'clicked upload photo button , it will open in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

autoit_prj = 'D:\\workspace\\KSW\\UF\\PP\\male.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.waitForPageLoad(5)

'added image to user '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_1'))

WebUI.waitForPageLoad(5)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_1'))

WebUI.waitForPageLoad(5)

WebUI.delay(2)

'clicked employees sub menu , it will open empoyee details  page'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'aplus')

WebUI.delay(2)

'search using emplopyee first name  , it will display matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'EMP002')

WebUI.delay(2)

'search using emplopyee ID , it will display matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'english')

WebUI.delay(2)

'search using emplopyee last name  , it will display matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    '037878797')

WebUI.delay(2)

'search using emplopyee mobile number  , it will display matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'Samsung SDI')

WebUI.delay(2)

'search using Department , it will display matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'female')

WebUI.delay(2)

'search using gender , it will display matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'incomplete')

WebUI.delay(2)

'search using registration status , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_5'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_5'))

'clicked employees link , it will open employees page  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Employee ID'))

WebUI.delay(2)

'clicked employee id in table , it will change in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Employee ID'))

WebUI.delay(2)

'clicked employee id in table , it will change in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_First Name'))

WebUI.delay(2)

'clicked first naem in table , it will change in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_First Name'))

WebUI.delay(2)

'clicked first naem in table , it will change in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Last Name'))

WebUI.delay(2)

'clicked last name in table , it will change in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Last Name'))

WebUI.delay(2)

'clicked last name in table , it will change in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Mobile Phone'))

WebUI.delay(2)

'clicked mobile number in table , it will change in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Mobile Phone'))

WebUI.delay(2)

'clicked mobile number in table , it will change in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Department'))

WebUI.delay(2)

'clicked Department in table , it will change in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Department'))

WebUI.delay(2)

'clicked Department in table , it will change in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Gender'))

WebUI.delay(2)

'clicked Gender in table , it will change in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Gender'))

WebUI.delay(2)

'clicked Gender in table , it will change in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Registration Status'))

WebUI.delay(2)

'clicked Registration status in table , it will change in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/th_Registration Status'))

WebUI.delay(2)

'clicked Registration status in table , it will change in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_2'))

WebUI.waitForPageLoad(5)

WebUI.delay(2)

'clicked second page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_5'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_5'))

WebUI.waitForPageLoad(5)

'clicked employees link , it will open employees page  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Filter/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter , it will open opction in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Filter/button_Filter_Popup'))

'clicked filter in pop up for confirmation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Filter/button_Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

'clicked filter , it will open opction in pop up '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'software engineer', Keys.ENTER))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

'choosen job title from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Filter/button_Filter_Popup'))

WebUI.waitForPageLoad(5)

'clicked filter in pop up for confirmation , it will display the filtered result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Filter/button_Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

'clicked filter , it will open opction in pop up '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'samsung sdi', Keys.ENTER))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

'choosen job title, department from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Filter/button_Filter_Popup'))

WebUI.waitForPageLoad(5)

'clicked filter in pop up for confirmation , it will display the filtered result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Filter/button_Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

'clicked filter , it will open opction in pop up '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'tia abdul', Keys.ENTER))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

'choosen job title, department and supervisor from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_Employee_OR/Filter/button_Filter_Popup'))

WebUI.waitForPageLoad(5)

'clicked filter in pop up for confirmation , it will display the filtered result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_5'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_Employees_5'))

WebUI.waitForPageLoad(5)

'clicked employees link , it will open employees page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/input_records per page_form-control'), 
    'aplus', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'searched using name , it will display matched records '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/img_Complete_tableActionButton'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked terminate image link '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked terminate image link '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/button_Ok'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'it wiss ask confirmation in pop up '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.refresh(FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'refresh the page '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_Employee_OR/a_admin (1)'), FailureHandling.OPTIONAL)

