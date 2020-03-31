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

WebUI.scrollToPosition(110, 125)

'Scroll down to view merchants '
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/img_Pay merchants anytime anywhere_UPLB'))

WebUI.waitForPageLoad(5)

'selected University of the Philippines Los Banos'
WebUI.takeScreenshot()

WebUI.click(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Choose your transaction type_Room Occupancy UPLB'))

WebUI.waitForPageLoad(5)

'selected transaction type as " Room Occupancy " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Real Property Tax Payment_merchant-fo_7b69b5'))

WebUI.waitForPageLoad(5)

'clicked next '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱00.10')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Occupant UPLB'), 'l')

'it will display message " Amount should be atleast PHP 1.00" '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱50300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Occupant UPLB'), 'l')

'it will display the message " Amount should be less than PHP 50,000.00 only." '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/LINKBIZ_PH/City Government of San Pedro Laguna/input_Payment Amount_amount'), 
    '₱300.00')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Occupant UPLB'), 'l')

'given valid Payment amount'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Occupant UPLB'), 'PH University')

WebUI.waitForPageLoad(5)

'given name_of_occupant'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_City Province UPLB'), 'Taguig City')

WebUI.waitForPageLoad(5)

'given city_province'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Days Occupied UPLB'), '15 days')

WebUI.waitForPageLoad(5)

'given days_occupied '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Room No UPLB'), 'Room_101')

WebUI.waitForPageLoad(5)

'given room_no'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address UPLB'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Contact number UPLB'), '9358268538749')

WebUI.waitForPageLoad(5)

'given Contact number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Location of Accomodation UPLB'), '364 Apo Street')

WebUI.waitForPageLoad(5)

'given location of accomidation'
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
    '₱555.55')

WebUI.waitForPageLoad(5)

'edited Payment amount'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Name of Occupant UPLB'), 'PH University edit')

WebUI.waitForPageLoad(5)

'edited  name_of_occupant'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_City Province UPLB'), 'Taguig City edited ')

WebUI.waitForPageLoad(5)

'edited city_province'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Days Occupied UPLB'), '30 days')

WebUI.waitForPageLoad(5)

'edited days_occupied '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Room No UPLB'), 'Room_909')

WebUI.waitForPageLoad(5)

'edited room_no'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Email Address UPLB'), 'testedited@gmail.com')

WebUI.waitForPageLoad(5)

'edited email address. '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Contact number UPLB'), '935826859876')

WebUI.waitForPageLoad(5)

'edited Contact number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LINKBIZ_PH/City Government of San Pedro Laguna/input_Location of Accomodation UPLB'), '364 Apo Street edited ')

WebUI.waitForPageLoad(5)

'edited location of accomidation'
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

