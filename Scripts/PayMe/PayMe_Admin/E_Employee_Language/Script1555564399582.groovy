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

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/input_Remember me_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sigin with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/button_Sign in'))

WebUI.waitForPageLoad(5)

'Payme login Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Admin'))

WebUI.waitForPageLoad(5)

'clicked payme Admin main memu to minimize it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Employees'))

WebUI.waitForPageLoad(5)

'clicked Employee main memu to maximise it '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Employees_1'))

WebUI.waitForPageLoad(5)

'clicked employee sub menu . it will open employee page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/a_Languages'))

WebUI.waitForPageLoad(5)

'clicked Language link it will open Language page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button , it will open page to add '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/span_Kabir Hussin'))

WebUI.delay(3)

'clicked employee combo box to view '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_EmployeeEmployee_s2id_autogen4_search'), 
    'tia abdul')

WebUI.delay(3)

'searched employee to select '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, 'tia abdul', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required employee from combo box  '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/span_en'))

WebUI.delay(3)

'clicked Language combo box to view '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_LanguageLanguage_s2id_autogen5_search'), 
    'my')

WebUI.delay(3)

'searched required Language to select '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER, 'my', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required Language from combo box  '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_resding'), 
    'Limited Working Proficiency', true)

WebUI.delay(2)

'selected reading category from drop down '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_speaking'), 
    'Limited Working Proficiency', true)

WebUI.delay(2)

'selected Speaking category from drop down '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative or Bilingual Proficiency_writing'), 
    'Limited Working Proficiency', true)

WebUI.delay(2)

'selected writing category from drop down '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/select_Elementary ProficiencyLimited Working ProficiencyProfessional Working ProficiencyFull Professional ProficiencyNative_understanding'), 
    'Limited Working Proficiency', true)

WebUI.delay(2)

'selected understanding category from drop down '
WebUI.takeScreenshot()

'click save with given  information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Language page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_records per page_form-control'), 'tia')

WebUI.waitForPageLoad(5)

'search using employee name  , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/img_Limited Working Proficiency_tableActionButton_edit'))

WebUI.waitForPageLoad(5)

'clicked image edit link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to Language page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_records per page_form-control'), 'tia')

WebUI.waitForPageLoad(5)

'search using employee name  , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/img_Limited Working Proficiency_tableActionButton_copy'))

WebUI.waitForPageLoad(5)

'clicked image copy link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the duplicate record '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Ok'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked ok button in pop up info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Cancel'))

WebUI.waitForPageLoad(5)

'clicked cancel button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_records per page_form-control'), 'tia')

WebUI.waitForPageLoad(5)

'search using employee name  , it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/img_Limited Working Proficiency_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked image delete link , it will open in pop up for confirmation to delete '
WebUI.takeScreenshot()

WebUI.waitForAlert(0)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button, it will delete the record and auto redirected to Language page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_records per page_form-control'), 'zh')

WebUI.waitForPageLoad(5)

'search using Language info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_records per page_form-control'), 'limited working')

WebUI.waitForPageLoad(5)

'search using Reading info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_records per page_form-control'), 'professional')

WebUI.waitForPageLoad(5)

'search using Spaking info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_records per page_form-control'), 'full professional')

WebUI.waitForPageLoad(5)

'search using Writing info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/input_records per page_form-control'), 'bilingual')

WebUI.waitForPageLoad(5)

'search using Understanding info, it will display the matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Employee'))

'clicked employee namein table  to sort in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Employee'))

'clicked employee namein table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Language'))

'clicked Language in table  to sort in assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Language'))

'clicked Language in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Reading'))

'clicked Reading in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Reading'))

'clicked Reading in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Speaking'))

'clicked Speaking on date in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Speaking'))

'clicked Speaking On date in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Writing'))

'clicked Writing in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Writing'))

'clicked Writing in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Understanding'))

'clicked Understanding in table  to sort in Assending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/th_Understanding'))

'clicked Understanding in table  to sort in Dessending order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/a_2'), FailureHandling.OPTIONAL)

'clicked second page unsing page navigation '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/a_Languages'))

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/a_Languages'))

WebUI.waitForPageLoad(5)

'clicked Language link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, 'aplus', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required employee from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up with filter opction '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, 'as', Keys.ENTER))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

'selected required Language from combo box '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/E_skills/E_Language/button_Filter_popup'))

WebUI.waitForPageLoad(5)

'clicked filter in after slection opctions , it will display the result based on the selection '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_admin (1)'))

WebUI.waitForPageLoad(5)

'clicked logged in user name to view sign out opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/E_skills/a_Sign out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

'clicked sign out '
WebUI.takeScreenshot(FailureHandling.OPTIONAL)

