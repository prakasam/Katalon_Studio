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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

'payme login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_Remember me_username'), 'employee')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/input_Remember me_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/button_Sign in'))

WebUI.waitForPageLoad(5)

'payme employee dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Qualifications'))

WebUI.waitForPageLoad(5)

'clicked qualification sub menu , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/a_Certifications'))

WebUI.waitForPageLoad(5)

'clicked eaducation link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'masters', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen Qualification information from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input__institute'), 'Malayu University')

'given institute information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_Start Date_date_start'), '2010-06-07')

'given start date information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_Completed On_date_end'), '2013-03-05')

'click save with given end date information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to skills page '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_records per page_form-control'), 
    'Malayu')

WebUI.waitForPageLoad(5)

WebUI.waitForPageLoad(5)

'search using institute info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/img_Malayu University_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open the details in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input__institute'), 'Malayu University edit ')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to eaducation page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_records per page_form-control'), 
    'Malayu')

WebUI.waitForPageLoad(5)

'search using institute info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/img_Malayu University edit_tableActionButton_copy'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will open the details in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to eaducation page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_records per page_form-control'), 
    'Malayu')

WebUI.waitForPageLoad(5)

'search using institute info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/img_Malayu University edit_tableActionButton_delete'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation in pop up to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to eaducation page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_records per page_form-control'), 
    'Malayu')

WebUI.waitForPageLoad(5)

'search using institute info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/img_Malayu University edit_tableActionButton_delete'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation in pop up to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to eaducation page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_records per page_form-control'), 
    'Bachelors Degree')

WebUI.waitForPageLoad(5)

'search using Qualification info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_records per page_form-control'), 
    '2014-01-01')

WebUI.waitForPageLoad(5)

'search using start date info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/input_records per page_form-control'), 
    '2010-12-31')

WebUI.waitForPageLoad(5)

'search using Completed on info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Education'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/a_Education'))

WebUI.waitForPageLoad(5)

'clicked eaducation link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/th_Qualification_a'))

WebUI.waitForPageLoad(5)

'clicked Qualification in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/th_Qualification'))

WebUI.waitForPageLoad(5)

'clicked Qualification in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/th_Institute_a'))

WebUI.waitForPageLoad(5)

'clicked institute in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/th_Institute'))

WebUI.waitForPageLoad(5)

'clicked institute in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/th_Start Date_a'))

WebUI.waitForPageLoad(5)

'clicked start date in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/th_Start Date'))

WebUI.waitForPageLoad(5)

'clicked start date in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/th_Completed On_a'))

WebUI.waitForPageLoad(5)

'clicked Completed date on  in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/th_Completed On'))

WebUI.waitForPageLoad(5)

'clicked Completed date on in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Eaducation/a_2'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked second page usingg page navigation '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

'Click username from right side top to sign out '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php')

'Clicked sign out '
WebUI.takeScreenshot()

WebUI.closeBrowser()

