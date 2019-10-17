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

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/a_Languages'))

WebUI.waitForPageLoad(5)

'clicked language link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'telugu', Keys.ENTER))

WebUI.waitForPageLoad(5)

'choosen Language information from combo box '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_r'), 
    'Full Professional Proficiency', true)

WebUI.waitForPageLoad(5)

'selected reading info from drop down '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_s'), 
    'Native or Bilingual Proficiency', true)

WebUI.waitForPageLoad(5)

'selected speaking info from drop down '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_w'), 
    'Full Professional Proficiency', true)

WebUI.waitForPageLoad(5)

'selected writing info from drop down '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_u'), 
    'Native or Bilingual Proficiency', true)

WebUI.waitForPageLoad(5)

'click save with selected understanding info from drop down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to Language page '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/input_records per page_form-control'), 'Telugu')

WebUI.waitForPageLoad(5)

WebUI.waitForPageLoad(5)

'search using Language info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/sample/img_Native or Bilingual Proficiency_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open the details in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirected to Language page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/input_records per page_form-control'), 'Telugu')

WebUI.waitForPageLoad(5)

'search using Language info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/sample/img_Native or Bilingual Proficiency_tableActionButton_copy'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will open the details in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'it will display the error info in pop up " A duplicate entry found" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/button_Ok'))

WebUI.waitForPageLoad(5)

'Clicked ok in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel button , it will auto redirected to Language page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/input_records per page_form-control'), 'Telugu')

WebUI.waitForPageLoad(5)

'search using Language info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/sample/img_Native or Bilingual Proficiency_tableActionButton_delete'))

WebUI.waitForPageLoad(5)

'clicked delete image link , it will ask confirmation in pop up to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to Language page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/input_records per page_form-control'), 'Elementary Proficiency')

WebUI.waitForPageLoad(5)

'search using text info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/input_records per page_form-control'), 'Limited Working Proficiency')

WebUI.waitForPageLoad(5)

'search using text info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/input_records per page_form-control'), 'Professional Working Proficiency')

WebUI.waitForPageLoad(5)

'search using text info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/input_records per page_form-control'), 'Full Professional Proficiency')

WebUI.waitForPageLoad(5)

'search using text info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/input_records per page_form-control'), 'Native or Bilingual Proficiency')

WebUI.waitForPageLoad(5)

'search using text info , it will display the matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/a_Languages'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/a_Languages'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked Language link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Language_a'))

WebUI.waitForPageLoad(5)

'clicked language in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Language_a'))

WebUI.waitForPageLoad(5)

'clicked Language in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Reading_a'))

WebUI.waitForPageLoad(5)

'clicked reading in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Reading_a'))

WebUI.waitForPageLoad(5)

'clicked reading in able , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Speaking_a'))

WebUI.waitForPageLoad(5)

'clicked speaking in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Speaking_a'))

WebUI.waitForPageLoad(5)

'clicked speaking in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Writing_a'))

WebUI.waitForPageLoad(5)

'clicked writing in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Writing_a'))

WebUI.waitForPageLoad(5)

'clicked writing in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Understanding_a'))

WebUI.waitForPageLoad(5)

'clicked understanding in table , it will make records in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/th_Understanding_a'))

WebUI.waitForPageLoad(5)

'clicked understanding in table , it will make records in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_User_OR/PI_Qualifications/Language/a_2'), FailureHandling.OPTIONAL)

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

