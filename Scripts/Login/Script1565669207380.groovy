import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'MyEG PH Home Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/img'))

WebUI.waitForPageLoad(5)

'Clicked myeg Image link'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/img_1'))

WebUI.waitForPageLoad(5)

'clicked home image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Services'))

WebUI.waitForPageLoad(5)

'clicked services menu , it will expand the available services '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_NBI Clearance'))

WebUI.waitForPageLoad(5)

'clicked NBI Clearance opction , it will redirect to NBI Clearance online services page.'
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Services'))

WebUI.waitForPageLoad(5)

'clicked services menu , it will expand the available services '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_MyEG LinkBiz Portal'))

WebUI.waitForPageLoad(5)

'clicked MyEG LinkBiz Portal opction , it will redirect to MYEG LINKBIZ PORTAL page.'
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Services'))

WebUI.waitForPageLoad(5)

'clicked services menu , it will expand the available services '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Personal Loan'))

WebUI.waitForPageLoad(5)

'clicked Personal Loan opction , it will redirect to MYEG Personal Loan page.'
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Services'))

WebUI.waitForPageLoad(5)

'clicked services menu , it will expand the available services '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Insurance'))

WebUI.waitForPageLoad(5)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(5)

'clicked Insurance opction , it will redirect to MYEG Insurance  page.'
WebUI.takeScreenshot()

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to home page '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Products'))

not_run: WebUI.navigateToUrl('https://myeg.ph/payment-gateway-services/')

WebUI.waitForPageLoad(5)

'clicked Products menu opction , it will redirect to Payment Gateway Services page.'
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_News'))

not_run: WebUI.navigateToUrl('https://myeg.ph/news/')

WebUI.delay(5)

WebUI.waitForPageLoad(5)

'clicked News menu opction , it will redirect to News (Our Latest News) page.'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'News feeds info page '
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_About Us'))

WebUI.waitForPageLoad(5)

'clicked About Us menu opction , it will redirect to About Us  page.'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked page down to view Corporate and Satellite Office Address information  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_inquirymyegph'))

not_run: WebUI.back()

not_run: WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_VIEW MAP'))

WebUI.waitForPageLoad(5)

WebUI.delay(5)

'Clicked View Map Link from satellite Office , it will open google map location in new tab for direction '
WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_inquirymyegph'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.back()

not_run: WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Address'))

WebUI.waitForPageLoad(5)

'clicked Addrees link from Jump to ( easy navigation ) '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/div_Arthaland Corporation'))

not_run: WebUI.switchToWindowTitle('Myeg PH Portal')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Main_Menu_Opctions/div_Directions'))

WebUI.waitForPageLoad(5)

'Clicked Direction Link from Corporate Office Location in Address, it will open google map Navigation in new tab for directions '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(5)

'google map directions for corporate office '
WebUI.takeScreenshot()

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

'clicked page up to view the Feedback Form link opction '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Feedback Form'))

WebUI.waitForPageLoad(5)

'clicked feedback form . it will navigate to feedback form page . '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('MyEG_PH/Main_Menu_Opctions/select_Product Inquiry Payment Gateway Ser'), 'Others', 
    true)

WebUI.waitForPageLoad(5)

'selected others from subject dropdown opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/textarea_Message_form-control ng-untouched _563a61'), 
    'I-Pay M PH) xfbdgnf')

WebUI.clearText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/textarea_Message_form-control ng-untouched _563a61'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Email Address_form-control ng-untouch_61b618'), 
    'ab')

WebUI.clearText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Email Address_form-control ng-untouch_61b618'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Phone number (optional)_form-control _9ef8f0'), 
    '01')

WebUI.waitForPageLoad(5)

'with out entering text in message ,email and invalid values in phone number columns'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/textarea_Message_form-control ng-untouched _563a61'), 
    'I-Pay MYEG Philippines, Inc. (MYEG PH) or also known as MYEG is a one-stop provider of e-government solutions and payment services which allow Filipinos to transact with government agencies at the comfort of their own homes.')

WebUI.waitForPageLoad(5)

'entered message as Sample Text '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Email Address_form-control ng-untouch_61b618'), 
    'ab')

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Phone number (optional)_form-control _9ef8f0'), 
    '01')

WebUI.waitForPageLoad(5)

'given wrong email address '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Email Address_form-control ng-untouch_61b618'), 
    'abcd@')

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Phone number (optional)_form-control _9ef8f0'), 
    '01')

WebUI.waitForPageLoad(5)

'given wrong01 email address '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Phone number (optional)_form-control _9ef8f0'), 
    'vdcvb')

WebUI.waitForPageLoad(5)

'given character as Phone number '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Phone number (optional)_form-control _9ef8f0'), 
    '12345678')

WebUI.waitForPageLoad(5)

'given Phone number value as less than 10 numbers '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Email Address_form-control ng-untouch_61b618'), 
    'prakasam.myeg@gmail.com')

WebUI.waitForPageLoad(5)

'given valid email address '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Phone number (optional)_form-control _9ef8f0'), 
    '0123456789')

WebUI.waitForPageLoad(5)

'given Phone number '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/input_Phone number (optional)_defaultCheck1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForPageLoad(5)

'selected privacy policy check box '
not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Privacy Policy'))

WebUI.waitForPageLoad(5)

'clicked privacy policy link for more info , it will open privacy policy info in new tab '
not_run: WebUI.takeScreenshot()

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(5)

'Privacy Policy info from site policies page '
WebUI.takeScreenshot()

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/div_ERROR for site ownerInvalid domain for site key'))

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/button_Submit'))

WebUI.waitForPageLoad(5)

'closed privacy policy info page and navigated to feedback form '
WebUI.takeScreenshot()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked myeg image , to open home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Main_Menu_Opctions/a_Learn More'))

WebUI.waitForPageLoad(5)

'clicked learn more from home page in banner first slide  , it will redirect to respectibe pages'
WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/img_1_2'))

WebUI.waitForPageLoad(5)

'clicked next page in banner  , it will forword to next slipde \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Learn More'))

WebUI.waitForPageLoad(5)

'clicked learn more from home page in banner second slide  , it will redirect to respectibe pages'
WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked page down to view the Highlight services info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/img_Permit  Licence_myeg-product__img'))

WebUI.waitForPageLoad(5)

'clicked MyEG Payment Gateway image link .. it will open myg Payment Gateway Services page '
WebUI.takeScreenshot()

not_run: WebUI.back()

not_run: WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Main_Menu_Opctions/a_Get In Touch With Us'))

WebUI.waitForPageLoad(5)

'clicked Get in Touch with us button  , it will open feed back form in about us page  '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Learn More (1)'))

not_run: WebUI.waitForPageLoad(5)

'clicked learn more hyperlink , it will open Payment Gateway Services page  '
not_run: WebUI.takeScreenshot()

WebUI.navigateToUrl('https://ph-portal-dev.myegdev.com/products/payment-gateway-services')

WebUI.waitForPageLoad(5)

'clicked back , returned to PGW page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Main_Menu_Opctions/a_Key Services'))

WebUI.waitForPageLoad(5)

'clicked Key services in PGW Page  , it will navigate to key services page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Main_Menu_Opctions/a_Payment Partners'))

WebUI.waitForPageLoad(5)

'clicked Payment Partners link  , it will navigate to payment partners info  '
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/img_Learn More _myeg-product__img'))

WebUI.waitForPageLoad(5)

'clicked Land Bank of the Philippines  image link .. it will open Land Bank of the Philippines page '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/button_Visit MYEG LinkBiz Portal'))

not_run: WebUI.waitForPageLoad(5)

'clicked Visit MYEG LinkBiz Portal  button .. it will open Visit MYEG LinkBiz Portal page  '
not_run: WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_View More'))

not_run: WebUI.waitForPageLoad(5)

'clicked View More hypelink text .. it will open Landbank - MYEG LinkBiz Portal page  '
not_run: WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'from home page to scroll down to view News & Updates  info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_View more (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked view more from news & updates info, it will open news page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'Scroll down to view news feeds '
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to Home page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'from home page to scroll down to view News & Updates  info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Read more'))

WebUI.waitForPageLoad(5)

'clicked Read more first link from news & updates info, it will open " Philippine Smart City Summit 2018 " page '
WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'from home page to scroll down to view News & Updates  info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Read more _1'))

WebUI.waitForPageLoad(5)

'clicked Read more second link from news & updates info, it will open "  MYEG, DBP, and Cavinti LGU Contract Signing" page '
WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'from home page to scroll down to view News & Updates  info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_Read more _1_2'))

WebUI.waitForPageLoad(5)

'clicked Read more third link from news & updates info, it will open "  MYEG PH, Land Bank, and Paete EBPLS Launch" page '
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'from home page to scroll down to View Services and  Agencies logo info'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Main_Menu_Opctions/a_View Services'))

WebUI.waitForPageLoad(5)

'clicked view services , it sill open services page '
WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

'clicked back , returned to about us page '
WebUI.takeScreenshot()

WebUI.closeBrowser()

