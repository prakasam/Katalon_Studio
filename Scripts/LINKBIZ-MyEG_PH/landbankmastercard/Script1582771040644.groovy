import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://linkbiz-staging.myeg.ph/')

WebUI.waitForPageLoad(5)

'Land Bank Home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/img_Pay merchants anytime anywhere_landbankmastercard-logo'))

WebUI.waitForPageLoad(5)

'selected landnankoop merchant '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_credit_card_number -'), '123456')

WebUI.waitForPageLoad(5)

'given master card number as less than 7 numbers '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Payment Amount_amount'), '₱00.99')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_First Name_first_name'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Payment Amount_amount'), '₱50,000.03')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_First Name_first_name'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Payment Amount_amount'), '₱100.00')

WebUI.waitForPageLoad(5)

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_First Name_first_name'), 'Land')

WebUI.waitForPageLoad(5)

'given first name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Middle Name_middle_name'), 'bank')

WebUI.waitForPageLoad(5)

'given middle name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Last Name_last_name'), 'Oop')

WebUI.waitForPageLoad(5)

'given last name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_Email _'), 'test')

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'it will display message "This value should be a valid email."'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_Email _'), 'test@gm')

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'it will display message "This value should be a valid email."'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_Email _'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_credit_card_number -'), '2652786543908472')

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'it will display message " Invalid credit card number" '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_credit_card_number -'), '4652786543908472')

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'it will display message " Invalid credit card number"  and info " This service does not support payment of Visa cards."'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_credit_card_number -'), '5124627452458234')

WebUI.waitForPageLoad(5)

'given valid master card number'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'clicked \'enter details\' button ,it will display given details summary '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input__edit-details-button'))

WebUI.waitForPageLoad(5)

'clicked \'Edit Details\' link , it will give opction to edit '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_credit_card_number -'), '5432198765431234')

WebUI.waitForPageLoad(5)

'given master card number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Payment Amount_amount'), '₱999.99')

WebUI.waitForPageLoad(5)

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_First Name_first_name'), 'Land.edit-.,')

WebUI.waitForPageLoad(5)

'edited first name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Middle Name_middle_name'), 'bank.edit-.,')

WebUI.waitForPageLoad(5)

'edited middle name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Last Name_last_name'), 'Oop.edit-.,')

WebUI.waitForPageLoad(5)

'edited last name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_Email _'), 'testedit@gmail.com')

'edited email address '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'clicked \'enter details\' button ,it will display given details summary '
WebUI.takeScreenshot()

WebUI.scrollToPosition(70, 75)

'page down to view opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_Confirm and Pay button button-primary'))

WebUI.delay(5)

'clicked \'confirm & pay\' button , it will foreword to \'choose payment method\' '
WebUI.takeScreenshot()

WebUI.scrollToPosition(95, 110)

'page down to view opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/img_Choose a payment method_bpi'))

WebUI.waitForPageLoad(5)

'choosed BDO payment type '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/button_Proceed'))

WebUI.delay(2)

'clicked \'Proceed\' button , it will ask for confirmation. clicked ok in confirmation , '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(5)

'payment responce page, with payment status. '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/a_Back to Home'))

WebUI.waitForPageLoad(5)

'Land Bank Home page '
WebUI.takeScreenshot()

WebUI.closeBrowser()

