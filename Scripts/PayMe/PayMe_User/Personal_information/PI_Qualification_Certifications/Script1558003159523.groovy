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

'clicked certification link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'certified public', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen Qualification information from combo box '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input__institute'), 'Malayu University')

'given institute information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input_Granted On_date_start'), '2010-06-07')

'given graduated on date information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input_Valid Thru_date_end'), '2013-03-05')

'click save with given valid thru date information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to certification page '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input_records per page_form-control'), 
    'Malayu')

WebUI.waitForPageLoad(5)

WebUI.waitForPageLoad(5)

'search using institute info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/img_Malayu University_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open the details in page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input__institute'), 'Malayu University edit ')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input_records per page_form-control'), 
    'Malayu')

WebUI.waitForPageLoad(5)

'search using institute info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/img_Malayu University edit_tableActionButton_copy'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will open the details in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'it will display the error info in pop up " A duplicate entry found" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/button_Ok'))

WebUI.waitForPageLoad(5)

'Clicked ok in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will auto redirected to certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input_records per page_form-control'), 
    'Malayu')

WebUI.waitForPageLoad(5)

'search using institute info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/img_Malayu University edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation in pop up to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to certifications page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input_records per page_form-control'), 
    'Cisco Certified ')

WebUI.waitForPageLoad(5)

'search using certification info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input_records per page_form-control'), 
    '2018-04-01')

WebUI.waitForPageLoad(5)

'search using graduated on date info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/input_records per page_form-control'), 
    '2010-01-01')

WebUI.waitForPageLoad(5)

'search using valid thru  info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/a_Certifications'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/a_Certifications'))

WebUI.waitForPageLoad(5)

'clicked certifications link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/th_Certification_a'))

WebUI.waitForPageLoad(5)

'clicked certifications in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/th_Certification'))

WebUI.waitForPageLoad(5)

'clicked certifications in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/th_Institute_a'))

WebUI.waitForPageLoad(5)

'clicked institute in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/th_Institute'))

WebUI.waitForPageLoad(5)

'clicked institute in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/th_Granted On_a'))

WebUI.waitForPageLoad(5)

'clicked Graduated on date in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/th_Granted On'))

WebUI.waitForPageLoad(5)

'clicked Graduated on date in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/th_Valid Thru_a'))

WebUI.waitForPageLoad(5)

'clicked Valid thru date on  in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/th_Valid Thru'))

WebUI.waitForPageLoad(5)

'clicked Valid thru date on in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Certifications/a_2'), FailureHandling.OPTIONAL)

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

