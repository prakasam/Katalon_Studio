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

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/login.zul')

WebUI.maximizeWindow()

'Bo Support Login Screen . '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click submit with given username annd password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Submit'))

'BO Support Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Kiosk'))

'click Kiosk Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/a_Road Tax'))

'Click RoadTax Sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/a_tb_roadtax_kioskinfo'))

'Click roadtax Kiosk info link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/a_Create Kiosk'))

'click create kiosk link \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input__tb_kioskid'), 
    'EMPIRECITY')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input__tb_address'), 
    'Level 37,Tower N ,Empire city, Jalan Damansara ,PJU 8,Petaling Jaya, Selongor,47820 ')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input__tb_location'), 
    'MyNiss Entrance ')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input__tb_password'), 
    'TIX5OH6LPiU6OYJgbL6dGg==')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Account Flag_tb_flag'), 
    'N')

'Given required info with wrong password and existing kiosk ID'
WebUI.takeScreenshot()

WebUI.focus(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input__tb_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input__tb_password'), 
    'TIX5OH6LPiW/OwiKHHJEUQ==')

'given different password'
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input__tb_password'), 'jyIV9S0JItsXqJTkpjAb4w==')

'Given password as same as kiosk id '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.sendKeys(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Account Flag_tb_flag'), Keys.chord(
        Keys.TAB, Keys.ENTER))

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Submit'), FailureHandling.OPTIONAL)

WebUI.delay(2)

'confirmation message '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Kiosk'))

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/a_Road Tax'))

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/a_tb_roadtax_kioskinfo'))

'click Update kiosk info link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/a_Update Kiosk'))

'update kiosk info page '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Select the Query_cb_kios'))

'click combo box to choose opctions '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/td_Selecttb_roadtax_kioskinfo'))

WebUI.delay(2)

'Selected kiosk info from opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Please enter the KioskID'), 
    'noid')

'click go with given kiosk id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Select the Query_cb_kios'))

'click combo box to choose opctions '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/td_Selecttb_roadtax_kioskinfo'))

WebUI.delay(2)

'Selected kiosk info from opctions'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Please enter the KioskID'), 
    'EMPIRECITY')

'click go with given kiosk id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Select the Query_cb_kios'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/td_UpdateAddress'))

WebUI.delay(2)

'selected update Adrress from opction \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Please enter the KioskID'), 
    'EMPIRECITY')

'click go with given kiosk ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box to change the address and location \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Set Kiosk Location_tb_ad'), 
    'Level 37,Tower N ,Empire city, PJU 8, Jalan Damansara ,Petaling Jaya, Selongor,47820 ')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Set Kiosk Location_tb_lo'), 
    'MyNiss Main Entrance ')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'Given required info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Record Updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Select the Query_cb_kios'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/td_UpdateAccountFlag'))

WebUI.delay(2)

'Select Update Flag from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Please enter the KioskID'), 
    'EMPIRECITY')

'Click Go with given kiosk Id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box to change the flag and location '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Kiosk_IOC_tb_acctflag'), 
    'Y')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Kiosk_IOC_tb_kiosk_loc'), 
    'MyNiss ICE Scating Entrance ')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'given required information \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " Record Successfully Updated " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Select the Query_cb_kios'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/td_UpdateKioskIdandPassword'))

WebUI.delay(2)

'selected update password from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Please enter the KioskID'), 
    'EMPIRECITY')

'click Ok buttion with given userid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box id and password '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Set Password_tb_id'), 
    'EMPIRECITY')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Set Password_tb_password'), 
    'jyIV9S0JItsXqJTkpjAb4w==')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'Given required information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " record updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Select the Query_cb_kios'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/td_UpdatePaperVersion'))

WebUI.delay(2)

'select Update Paper Version from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Please enter the KioskID'), 
    'EMPIRECITY')

'click go with given kiosk id \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box paper version '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/input_Set PaperVersion_tb_pape'), 
    '2')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'click Update with Given required paper version '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_Update'))

WebUI.delay(2)

'it will display the confirmation message " record updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Kiosk_Info_OR/button_LogOut'))

'Log out from BO Support '
WebUI.takeScreenshot()

WebUI.closeBrowser()

