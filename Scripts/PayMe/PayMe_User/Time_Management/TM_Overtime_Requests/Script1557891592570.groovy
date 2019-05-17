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

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_Remember me_username'), 
    'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'clicked sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'it will open the employee dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/a_Personal Information'))

WebUI.waitForPageLoad(5)

'clicked personal information  main menu , it will minimise opctions  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/a_Time Management'))

WebUI.waitForPageLoad(5)

'clicked time Management main menu , it will expand opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/a_Overtime Requests'))

WebUI.waitForPageLoad(5)

'clicked overtime requests sub link , it will open the page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add button , it will open page to add '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'night shift', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected required category from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input__start_time'), '2019-05-15 19:00:00')

WebUI.waitForPageLoad(5)

'given start date and time '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input__end_time'), '2019-05-16 03:00:00')

WebUI.waitForPageLoad(5)

'given end date and time '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input__end_time'), Keys.chord(Keys.TAB, Keys.ENTER, 
        'pdx', Keys.ENTER))

WebUI.waitForPageLoad(5)

'selected required project from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/textarea_Notes_notes'), 'night shift')

WebUI.waitForPageLoad(5)

'given text notes info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.delay(5)

'clicked save buttion , it will save data and  auto redirect to overtime request page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_records per page_form-control'), 
    'night shift')

WebUI.waitForPageLoad(5)

'search using category , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/img_Pending_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open the edit page to change required '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/textarea_Notes_notes'), 'dfgd hbrdhdrh edit')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.delay(5)

'clicked save buttion , it will save data and  auto redirect to overtime request page '
WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_records per page_form-control'), 
    'night shift')

WebUI.waitForPageLoad(5)

'overtime request page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/img_Pending_tableActionButton_1'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(3)

'clicked view log , it will display the log info in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok in pop up , it will auto redirect to overtime request page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_records per page_form-control'), 
    '2019-03-09')

WebUI.waitForPageLoad(5)

'search using start date , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_records per page_form-control'), 
    '2019-05-16')

WebUI.waitForPageLoad(5)

'search using end date , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_records per page_form-control'), 
    'project ')

WebUI.waitForPageLoad(5)

'search using project  name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_records per page_form-control'), 
    'rejected')

WebUI.waitForPageLoad(5)

'search using status , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/input_records per page_form-control'), 
    '')

WebUI.waitForPageLoad(5)

WebUI.refresh()

WebUI.waitForPageLoad(5)

'clicked refresh page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_Category'))

WebUI.waitForPageLoad(5)

'clicked category in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_Category'))

WebUI.waitForPageLoad(5)

'clicked category in table , it will make records in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_Start Time'))

WebUI.waitForPageLoad(5)

'clicked start time in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_Start Time'))

WebUI.waitForPageLoad(5)

'clicked start time in table , it will make records in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_End Time'))

WebUI.waitForPageLoad(5)

'clicked end time in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_End Time'))

WebUI.waitForPageLoad(5)

'clicked end time in table , it will make records in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_Project'))

WebUI.waitForPageLoad(5)

'clicked project in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_Project'))

WebUI.waitForPageLoad(5)

'clicked project in table , it will make records in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_Status'))

WebUI.waitForPageLoad(5)

'clicked status in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/th_Status'))

WebUI.waitForPageLoad(5)

'clicked status in table , it will make records in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/a_Subordinate Overtime Requests'))

WebUI.waitForPageLoad(5)

'clicked subordinate overtime request link , it will open the page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/a_Overtime Request Approval'))

WebUI.waitForPageLoad(5)

'clicked overtime request Approval link , it will open the page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/a_Aplus edited 12'))

WebUI.waitForPageLoad(5)

'clicked aplus name to view the sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/TM_Overtime_Request_OR/a_Sign out'))

WebUI.waitForPageLoad(5)

'clicked sign out and closed the browser '
WebUI.takeScreenshot()

WebUI.closeBrowser()

