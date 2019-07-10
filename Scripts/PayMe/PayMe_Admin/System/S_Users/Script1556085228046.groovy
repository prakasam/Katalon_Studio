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

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme Admin Dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked admin main menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_System'))

WebUI.waitForPageLoad(5)

'clicked system main menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_Users'))

WebUI.waitForPageLoad(5)

'clicked users sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_Users_1'))

WebUI.waitForPageLoad(5)

'clicked users link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked Add new button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__username'), 'paniendra')

'given username '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__email'), 'praniendra9@gmail.com')

'given Email '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__email'), Keys.chord(Keys.TAB, Keys.ENTER, 'paniendra8', 
        Keys.ENTER))

'Selected employee from commbo box '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/select_AdminManagerEmployeeOther'), 
    'Employee', true)

WebUI.waitForPageLoad(5)

'selected user level from drop down '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__email'), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.ENTER, 'employee', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Selected User role from commbo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__email'), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.ENTER, 'english', Keys.ENTER))

WebUI.waitForPageLoad(5)

'Selected Language from commbo box '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__email'), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.ENTER, 'employees monitor ', Keys.ENTER))

WebUI.waitForPageLoad(5)

'clicked save with Selected Default Module from commbo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and display the confirmation message for password sent to email ....'
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok button from information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_records per page_form-control'), 
    'paniendra')

WebUI.waitForPageLoad(5)

'searched using username , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/img_Employee_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked Copy image link , it will open in coppied date in page  '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__email'), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.ENTER, 'employee', Keys.ENTER))

WebUI.waitForPageLoad(5)

'given user roles '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__email'), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.ENTER, 'english', Keys.ENTER))

WebUI.waitForPageLoad(5)

'given language info'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__email'), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.ENTER, 'employees monitor ', Keys.ENTER))

WebUI.waitForPageLoad(5)

'given defailt module '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will display duplicate record found . ..'
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok button in pop up info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel , it will auto redirect to users page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_records per page_form-control'), 
    'paniendra')

WebUI.waitForPageLoad(5)

'searched using username , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/img_Employee_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open in new page to edit '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Change Password'))

WebUI.waitForPageLoad(5)

'clicked change password button '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_New Password_newpwd'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'given confirm password info '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_Confirm Password_conpwd'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.waitForPageLoad(5)

'given confirm password info '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Change Password_1'))

WebUI.waitForPageLoad(5)

'clicked change password link from pop '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok button from confirmation pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_records per page_form-control'), 
    'paniendra')

WebUI.waitForPageLoad(5)

'searched using username , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/img_Employee_tableActionButton_3'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation in pop up tp delete the record \r\n'
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation . it will delete the record and auto redirected to users page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_records per page_form-control'), 
    'paniendra')

WebUI.waitForPageLoad(5)

'searched using username , it will display info " no matched records found" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_Users_2'))

WebUI.waitForPageLoad(5)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_Users_2'))

WebUI.waitForPageLoad(5)

'clicked users link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_ID'))

'clicked ID in table , it will arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_ID'))

'clicked ID in table , it will arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_User Name'))

'clicked name in table , it will arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_User Name'))

'clicked name in table , it will arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_Authentication Email'))

'clicked Authentication email in table , it will arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_Authentication Email'))

'clicked Authentication email in table , it will arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_Employee'))

'clicked Employee in table , it will arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_Employee'))

'clicked Employee in table , it will arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_User Level'))

'clicked User Level in table , it will arrange in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_User Level'))

'clicked User Level in table , it will arrange in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_2'))

WebUI.waitForPageLoad(5)

'clicked second page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_User Roles'))

WebUI.waitForPageLoad(5)

'clicked user roles link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Add New_user_roles'))

WebUI.waitForPageLoad(5)

'clicked Add new button from  user roles page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__name'), 'Floor_Manager')

'click saave with given msme '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Save_UR'))

WebUI.waitForPageLoad(5)

'it will save the data and auto redirect to to users page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_records per page_form-control_UR'), 'Floor')

WebUI.waitForPageLoad(5)

'searched using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/img_Floor_Manager_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will open the page with coppied info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Save_UR'))

WebUI.waitForPageLoad(5)

'clicked save , it will display info message " Dupllicate entry ... " '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Ok'))

WebUI.waitForPageLoad(5)

'clicked ok button ,'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Cancel_UR'))

WebUI.waitForPageLoad(5)

'clicked cancel button , '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_records per page_form-control_UR'), 'Floor')

WebUI.waitForPageLoad(5)

'searched using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/img_Floor_Manager_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open the page to edit '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/input__name'), 'Floor_Manager_edit')

WebUI.waitForPageLoad(5)

'click save with given changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Save_UR'))

WebUI.waitForPageLoad(5)

'it will save the record, and auto redirect to User roles page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_records per page_form-control_UR'), 'Floor')

WebUI.waitForPageLoad(5)

'searched using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/img_Floor_Manager_edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation in pop up tp delete the record '
WebUI.takeScreenshot()

WebUI.waitForAlert(3)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation . it will delete the record and auto redirected to user Roles page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/input_records per page_form-control_UR'), 'floor')

WebUI.waitForPageLoad(5)

'searched using name , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_User Roles'))

'clicked user roles link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_Name'))

'clicked Name in table , it will arrange in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/th_Name'))

'clicked Name in table , it will arrange in dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_2_UR'))

WebUI.waitForPageLoad(5)

'clicked second page using page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_admin (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked admin name to find the sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/S_Users_OR/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked sign out '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

