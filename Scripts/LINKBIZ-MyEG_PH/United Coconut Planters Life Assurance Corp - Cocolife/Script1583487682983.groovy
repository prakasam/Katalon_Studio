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

WebUI.scrollToPosition(1000, 1200)

'scroll down to view merchants '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/img_Pay merchants anytime anywhere_cocolife'))

WebUI.waitForPageLoad(5)

'selected United Coconut Planters Life Assurance Corp - Cocolife'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Choose your transaction type_Insurance Premium Cooca'))

WebUI.waitForPageLoad(5)

'selected transaction type as "Insurance Premium" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Real Property Tax Payment_merchant-fo_7b69b5'))

WebUI.waitForPageLoad(5)

'clicked next '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱00.10')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Policy Name cooca'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱50300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Policy Name cooca'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Policy Name cooca'), 'l')

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Policy Number cooca'), 'POY-420')

WebUI.waitForPageLoad(5)

'given Policy Number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Policy Name cooca'), 'Akmal')

WebUI.waitForPageLoad(5)

'given Policy Name'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address_CGT'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Contact number CGT'), '9358268538749')

WebUI.waitForPageLoad(5)

'given Contact number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Payee Name CEC'), 'Kishore')

WebUI.waitForPageLoad(5)

'given Payee Name'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address of Tax Payer_enter-deta_9da8f4'))

not_run: WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Total_form-control button button-primary'))

WebUI.waitForPageLoad(5)

'clicked \'enter details\' button ,it will display given details summary '
WebUI.takeScreenshot()

WebUI.scrollToPosition(80, 70)

'scroll down to view opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Edit_details'))

WebUI.delay(5)

'clicked \' Edit Details \' button, it will give opction to change given details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱777.77')

WebUI.waitForPageLoad(5)

'edited Payment amount'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Policy Number cooca'), 'POY-202e')

WebUI.waitForPageLoad(5)

'edited Policy Number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Policy Name cooca'), 'Akmal edit')

WebUI.waitForPageLoad(5)

'edited Policy Name'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address_CGT'), 'testedit@gmail.com')

WebUI.waitForPageLoad(5)

'edited email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Contact number CGT'), '935826859876')

WebUI.waitForPageLoad(5)

'edited Contact number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Payee Name CEC'), 'Varaprasad edit')

WebUI.waitForPageLoad(5)

'edited Payee Name'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address of Tax Payer_enter-deta_9da8f4'))

not_run: WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Total_form-control button button-primary'))

WebUI.waitForPageLoad(5)

'clicked \'enter details\' button ,it will display given details summary '
WebUI.takeScreenshot()

WebUI.scrollToPosition(80, 70)

'scroll down to view opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Confirm_and_Pay'))

WebUI.delay(5)

'clicked \'confirm & pay\' button , it will foreword to \'choose payment method\' '
WebUI.takeScreenshot()

WebUI.scrollToPosition(95, 110)

'scroll down to view opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/img_Choose a payment method_bpi'))

WebUI.waitForPageLoad(5)

'choosed BPI payment type '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/button_Proceed'))

WebUI.delay(2)

'clicked \'Proceed\' button , it will ask for confirmation. clicked ok in confirmation , '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(5)

'payment responce page, with payment status. '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/a_Back to Home'))

WebUI.waitForPageLoad(5)

'Land Bank Home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/img_Toggle navigation_myeg-logo'))

WebUI.waitForPageLoad(5)

'clicked myeg logo , it will open Land Bank Home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/a_PHILIPPINES'))

WebUI.waitForPageLoad(5)

'clicked Philippience link , it will open Land Bank Home page '
WebUI.takeScreenshot()

WebUI.closeBrowser()

