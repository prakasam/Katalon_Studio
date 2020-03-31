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

'scroll down to view Merchants'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/img_Pay merchants anytime anywhere_CGT'))

WebUI.waitForPageLoad(5)

'selected City Government of Tanauan'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Choose your transaction type_CGT_BT'))

WebUI.waitForPageLoad(5)

'selected transaction type as " Business Tax " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Real Property Tax Payment_merchant-fo_7b69b5'))

WebUI.waitForPageLoad(5)

'clicked next '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱00.10')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Tax Payer'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱50300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Tax Payer'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Tax Payer'), 'l')

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Tax Payer'), 'JGR')

WebUI.waitForPageLoad(5)

'given name of tax payer'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address_CGT'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Contact number CGT'), '9358268538749')

WebUI.waitForPageLoad(5)

'given Contact number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Business_CGT'), 'Joyalukkas')

WebUI.waitForPageLoad(5)

'given Name of business'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Business ID CGT'), 'BUID3927528')

WebUI.waitForPageLoad(5)

'given Business ID'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Business Address_business_address'), 
    'lot :501, level 5, ABC Building, area, city,philippines12345')

WebUI.waitForPageLoad(5)

'given Address '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment_Period'), '30 days')

WebUI.waitForPageLoad(5)

'given Payment period'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address of Tax Payer_enter-deta_9da8f4'))

not_run: WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Total_form-control button button-primary'))

WebUI.waitForPageLoad(5)

'clicked \'enter details\' button ,it will display given details summary '
WebUI.takeScreenshot()

WebUI.scrollToPosition(80, 70)

'scroll down to view opctions'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Change_Selection'))

WebUI.delay(5)

'clicked \' Change Selection \' button , it will give opction to choose opction radio button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Choose your transaction type_CGT_Real Property Tax'))

WebUI.waitForPageLoad(5)

'selected transaction type as " Real Property Tax " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Real Property Tax Payment_merchant-fo_7b69b5'))

WebUI.waitForPageLoad(5)

'clicked next '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱00.10')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Real Property Tax Payment_merchant-fo_7b69b5'))

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Tax Payer'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱50300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Tax Payer'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Tax Payer'), 'l')

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Tax Payer'), 'JGR')

WebUI.waitForPageLoad(5)

'given name of tax payer'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address_CGT'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Contact number CGT'), '9358268538749')

WebUI.waitForPageLoad(5)

'given Contact number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Address CGT'), 'level 5, ABC Building, area, city,philippines12345')

WebUI.waitForPageLoad(5)

'given Address'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Tax Declaration CGT'), 'declaration tax ')

WebUI.waitForPageLoad(5)

'given Tax Declaration '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Location of Property CGT'), ' 30th Floor, Arthaland Century Pacific Tower, 4th Avenue, corner 1634 30th St, Taguig, Metro Manila, Philippines')

WebUI.waitForPageLoad(5)

'Given Location of property '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Title No CGT'), 'TitN578457')

WebUI.waitForPageLoad(5)

'given Title No'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Lot Number CGA'), 'LotN578457')

WebUI.waitForPageLoad(5)

'given Lot No'
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

