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

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/img_Pay merchants anytime anywhere_City Government of Davao'))

WebUI.waitForPageLoad(5)

'selected landnankoop merchant '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_Choose your transaction type_Business Tax'))

WebUI.waitForPageLoad(5)

'selected transaction type as " Paid-up Share Capital " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Paid-up Share Capital_merchant-form-n_910b9b'))

WebUI.waitForPageLoad(5)

'clicked next '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Payment Amount_amount'), '₱00.99')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_name_of_owner'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Payment Amount_amount'), '₱50,000.03')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_name_of_owner'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Payment Amount_amount'), '₱100.00')

WebUI.waitForPageLoad(5)

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_name_of_owner'), 'City Government of Davao')

WebUI.waitForPageLoad(5)

'given name of owner '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_reference_number'), 'refE123678!#!^$%&!$)(%&@(|{}{}":<>?')

WebUI.waitForPageLoad(5)

'given Referance nuumber with special characters no restriction '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Email Address_email_address'), 'test')

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Contact Number_contact_number'), '01234')

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'it will display message "This value should be a valid email."'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Email Address_email_address'), 'test@gm')

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'it will display message "This value should be a valid email."'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Email Address_email_address'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_reference_number'), 'ref-12345678')

'given Referance nuumber '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Contact Number_contact_number'), '0123456789')

WebUI.waitForPageLoad(5)

'given contact number \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_enter-details-button'))

WebUI.waitForPageLoad(5)

'clicked \'enter details\' button ,it will display given details summary '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input__edit-details-button'))

WebUI.waitForPageLoad(5)

'clicked \'Edit Details\' link , it will give opction to edit '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_name_of_owner'), 'Land.edit-.,')

WebUI.waitForPageLoad(5)

'edited name of owner '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/Landbankoop/input_reference_number'), 'Ref-1234567890')

WebUI.waitForPageLoad(5)

'edited Referance number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Email Address_email_address'), 'testedit@gmail.com')

'edited email address '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Contact Number_contact_number'), '01234567890')

WebUI.waitForPageLoad(5)

'edited contact number '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/Landbankoop/input_Contact Number_enter-details-button'))

WebUI.waitForPageLoad(5)

'clicked \'enter details\' button ,it will display given details summary '
WebUI.takeScreenshot()

WebUI.scrollToPosition(80, 70)

'scroll down to view opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/input_Total_form-control button button-primary'))

WebUI.delay(5)

'clicked \'confirm & pay\' button , it will foreword to \'choose payment method\' '
WebUI.takeScreenshot()

WebUI.scrollToPosition(95, 110)

'scroll down to view opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/Landbankoop/img_Choose a payment method_sm_bill'))

WebUI.waitForPageLoad(5)

'choosed SM-bill payment type '
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

