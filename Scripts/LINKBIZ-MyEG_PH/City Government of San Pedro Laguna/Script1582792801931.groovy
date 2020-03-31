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

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/img_Pay merchants anytime anywhere_landbank_4c51d8'))

WebUI.waitForPageLoad(5)

'selected City Government of San Pedro Laguna'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Choose your transaction type_transact_5fd9f8'))

WebUI.waitForPageLoad(5)

'selected transaction type as " Business Tax Payment " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Real Property Tax Payment_merchant-fo_7b69b5'))

WebUI.waitForPageLoad(5)

'clicked next '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱00.10')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Owner_name_of_owner1'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱50300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Owner_name_of_owner1'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Owner_name_of_owner1'), 'l')

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Business ID Number_business_id_number'), 
    'BU-753289759')

WebUI.waitForPageLoad(5)

'given Business ID number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Owner_name_of_owner1'), 
    'cgspl')

WebUI.waitForPageLoad(5)

'given owner name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Business Address_business_address'), 
    'lot :501, level 5, ABC Building, area, city,philippines12345')

WebUI.waitForPageLoad(5)

'given Address '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Employee ID Number_employee_id_number'), 
    'EMP3927528')

WebUI.waitForPageLoad(5)

'given Employee ID number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address_email_address1'), 
    'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Payor_name_of_payor1'), 
    'sddisb dshdsuifhus sdjsdihf ')

WebUI.waitForPageLoad(5)

'given Payer Name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Telephone Mobile Number_telephone_mob_2211e1'), 
    '9358268538749')

WebUI.waitForPageLoad(5)

'given Telephone number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Date of Tax Order_date_of_tax_order'), 
    '03/28/2021')

WebUI.waitForPageLoad(5)

'given Date of tax order '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address of Tax Payer_email_addr_ea5c69'), 
    'test1@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
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

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Choose your transaction type_Real Property Tax Payment'))

WebUI.waitForPageLoad(5)

'selected transaction type as " Real Property Tax Payment " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Real Property Tax Payment_merchant-fo_7b69b5'))

WebUI.waitForPageLoad(5)

'clicked next '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱00.10')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Owner01'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱50300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Owner01'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Owner01'), 'l')

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_PIN'), 'PIN-753289759')

WebUI.waitForPageLoad(5)

'given PIN (Property ID Number)'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Owner01'), 'cgspl')

WebUI.waitForPageLoad(5)

'given owner name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address01'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Payor01'), 'sddisb dshdsuifhus sdjsdihf ')

WebUI.waitForPageLoad(5)

'given Payer Name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Telephone Mobile Number01'), '9358268538749')

WebUI.waitForPageLoad(5)

'given Telephone number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_SOA Number'), 'SOA578457')

WebUI.waitForPageLoad(5)

'given SOA Number'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Location of Property'), ' 30th Floor, Arthaland Century Pacific Tower, 4th Avenue, corner 1634 30th St, Taguig, Metro Manila, Philippines')

WebUI.waitForPageLoad(5)

'Location of property '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address of Tax Payer01'), 'test1@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
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

