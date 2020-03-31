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

WebUI.scrollToPosition(370, 420)

'scroll down to view merchants '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/img_Pay merchants anytime anywhere_PNPHPG'))

WebUI.waitForPageLoad(5)

'selected Philippine National Police - Highway Patrol Group'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Choose your transaction type_Transfer of Ownership PNPHPG'))

WebUI.waitForPageLoad(5)

'selected transaction type as " Transfer of Ownership " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Real Property Tax Payment_merchant-fo_7b69b5'))

WebUI.waitForPageLoad(5)

'clicked next '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱00.10')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Order of Payment Number PNPHPG'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱50300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Order of Payment Number PNPHPG'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Order of Payment Number PNPHPG'), 'l')

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Order of Payment Number PNPHPG'), 'ORPN-38425782')

WebUI.waitForPageLoad(5)

'given Order of Payment Number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Order of Payment Number Date PNPHPG'), 
    '03/31/2021')

WebUI.waitForPageLoad(5)

'given Order of Payment Number Date'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Applicants Name PNPHPG'), 'Alan ')

WebUI.waitForPageLoad(5)

'given Applicant\'s Name'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Applicants Address PNPHPG'), '30th Floor, Common Ground Works Philippines, Arthaland Century Pacific Tower, 4th Avenue, Bonifacio ')

WebUI.waitForPageLoad(5)

'given Applicants Address'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Tax Identification Number PNPHPG'), 'TAXNO-3826723')

WebUI.waitForPageLoad(5)

'given Tax Identification Number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Assessors Name PNPHPG'), 'Jain')

WebUI.waitForPageLoad(5)

'given Assessor\'s Name'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Clearance Station PNPHPG'), 'Taguig City 1634 Metro Manila,')

WebUI.waitForPageLoad(5)

'given Clearance Station'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Regional HPU PNPHPG'), 'RGHPUNO-987654')

WebUI.waitForPageLoad(5)

'given Regional HPU'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address_CGT'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Contact number CGT'), '9358268538749')

WebUI.waitForPageLoad(5)

'given Contact number '
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

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Order of Payment Number PNPHPG'), 'ORPN-38425782e')

WebUI.waitForPageLoad(5)

'Edited Order of Payment Number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Order of Payment Number Date PNPHPG'), 
    '10/21/2021')

WebUI.waitForPageLoad(5)

'Edited Order of Payment Number Date'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Applicants Name PNPHPG'), 'Alan edit')

WebUI.waitForPageLoad(5)

'Edited Applicant\'s Name'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Applicants Address PNPHPG'), 'edit 30th Floor, Common Ground Philippines, Arthaland Century Pacific Tower, 4th Avenue, edit')

WebUI.waitForPageLoad(5)

'Edited Applicants Address'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Tax Identification Number PNPHPG'), 'TAXNO-3826723e')

WebUI.waitForPageLoad(5)

'Edited Tax Identification Number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Assessors Name PNPHPG'), 'Jain edit')

WebUI.waitForPageLoad(5)

'Edited Assessor\'s Name'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Clearance Station PNPHPG'), 'edit Taguig City 1634 Metro Manila,')

WebUI.waitForPageLoad(5)

'Edited Clearance Station'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Regional HPU PNPHPG'), 'RGHPUNO-987654e')

WebUI.waitForPageLoad(5)

'Edited Regional HPU'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address_CGT'), 'testedit@gmail.com')

WebUI.waitForPageLoad(5)

'Edited email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Contact number CGT'), '9358268539876')

WebUI.waitForPageLoad(5)

'Edited Contact number '
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

