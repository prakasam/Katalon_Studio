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

WebUI.navigateToUrl('http://dev3.myeg.com.my/AIGSales/login.do')

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__password'), 'aeHFOx8jV/A=')

WebUI.waitForPageLoad(5)

'Given Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__actionloginaction'))

WebUI.waitForPageLoad(5)

'clicked login , it will redirect to dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/a_New Leads'))

WebUI.waitForPageLoad(5)

'clicked new leads , it will open new leads page.'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__person'), 'Test NEW Policy')

WebUI.waitForPageLoad(5)

' given person name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__icno'), '400712099999')

WebUI.waitForPageLoad(5)

' given IC Number info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__contact1'), '0123456789')

WebUI.waitForPageLoad(5)

'given Contact number 1'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__contact2'), '9876543219')

WebUI.waitForPageLoad(5)

'given Contact number 2'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__address1'), 'Address1')

WebUI.waitForPageLoad(5)

'given Address1'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__address2'), 'address2')

WebUI.waitForPageLoad(5)

'given Address 2'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__address3'), 'address3')

WebUI.waitForPageLoad(5)

'given Address 3'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__areaname'), 'jalan masid')

WebUI.waitForPageLoad(5)

'click submit with given area'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__city'), 'city')

WebUI.waitForPageLoad(5)

'click submit with given city'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__postcode'), '47400')

WebUI.waitForPageLoad(5)

'click submit with given Pincode'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/select_------ State ------'), 
    'SELANGOR DARUL EHSAN', true)

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/img__ui-datepicker-trigger'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/a_9'))

WebUI.waitForPageLoad(5)

'given from date '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/select_- Select TM Name -'), 
    '18', true)

WebUI.waitForPageLoad(5)

'Selected TM Name from list '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'New Lead Created successfully'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/a_Leads'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__oname'), 'Test NEW Policy')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_New_Leads/input__Search width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked QA Check list image link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/img'))

WebUI.waitForPageLoad(5)

WebUI.switchToWindowIndex('1')

'it will open in new tab status message as " No Records Found "'
WebUI.takeScreenshot()

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.waitForPageLoad(5)

'closed new tab and retuened to first tab '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

'leads page '
WebUI.takeScreenshot()

WebUI.navigateToUrl('http://dev3.myeg.com.my/AIGSales/logoutaction.do')

WebUI.waitForPageLoad(5)

'logged out '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__username'), 'user')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__password'), 'aeHFOx8jV/A=')

WebUI.waitForPageLoad(5)

'click Login with given username and password'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('AIG_Sales/TM/Leads_New/input__password'), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__actionloginaction'))

WebUI.waitForPageLoad(5)

'Dash board page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/a_Leads'))

WebUI.waitForPageLoad(5)

'clicked leads heading'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__icno'), '400712099999')

WebUI.waitForPageLoad(5)

'given IC Number for search '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with given IC Number,it will display matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/img'))

WebUI.waitForPageLoad(5)

'clicked Editing ticket status '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_-- Please Select -- Effective Contact In-Effective In-Progress'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_--- Select Reason ---'), '1', 
    true)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/textarea__addremark'), 'proceeding for insurance details ')

WebUI.waitForPageLoad(5)

'Selected QA check details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__width150px pointer (1)'))

WebUI.waitForPageLoad(5)

'QA check details Updated and foreworded to insurance information details page '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_------Please Select ------Accident Hospital Guard- (Self)'), 
    '9', true)

WebUI.waitForPageLoad(5)

'Selected Product Name '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------Please Select ------Plan 100 (RM 30) - New Policy'), 
    '213', true)

WebUI.waitForPageLoad(5)

'given Product details '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_------ Title ------MrMrsMsDATODATUKDATIN'), 
    'Mr', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_------ Marital Status------DivorcedMarriedSingleWidowWidower'), 
    'M', true)

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__passport'), 'A12345678')

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__dob'), '1940/07/12')

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__age'), '79')

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_------ Gender ------MaleFemale'), 
    'M', true)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Occupation------ - new_policy'), 'A04-ENGINEER/LAWYER/ACCOUNTANT/CONSULTANT', 
    true)

WebUI.waitForPageLoad(5)

'given Policy Holder details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__mobile'), '0123456789')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__work'), '9876543219')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__home'), '6576587543')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__fax'), '4534657676')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__email'), 'test@gmail.com')

WebUI.waitForPageLoad(5)

'given Contact details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__address1'), 'Address 12345679')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__address2'), 'Address 12345679')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__address3'), 'Address 12345679')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__city'), 'petaling jaya')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__postcode'), '47400')

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_------ State ------'), 'SELANGOR DARUL EHSAN', 
    true)

WebUI.waitForPageLoad(5)

'given Address details '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

'selected date picker '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/TM/Leads_New/img__ui-datepicker-trigger_enrolment_date'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.click(findTestObject('AIG_Sales/TM/Leads_New/a_11 - new_policy'))

WebUI.waitForPageLoad(5)

'choosen date'
WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_Credit CardDebit Card'), 'CRED', 
    true)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__paymode'), 'Monthly')

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_------ Relationship------POLICYHOLDERSPOUSEPARENTSCHILDREN'), 
    'S', true)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__cardno'), '4386750000274205')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__chname'), 'testing card')

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/select_------ Card Type ------MASTERVISA'), 
    'VISA', true)

WebUI.waitForPageLoad(5)

'selected date picker '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/TM/Leads_New/img__ui-datepicker-trigger_card_expiry_date'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_JanFebMarAprMayJunJulAugSepOctNov'), 
    '11', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/select_20092010201120122013201420152016201720182019'), 
    '2028', true, FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/a_30'))

WebUI.waitForPageLoad(5)

'choosen date'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/textarea__addcalldisremark'), 'completed policy holder details ')

WebUI.waitForPageLoad(5)

'given Payment Card details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/TM/Leads_New/input__width150px pointer (1)'))

not_run: WebUI.waitForPageLoad(1)

'Customer details updated '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/a_Leads'))

WebUI.waitForPageLoad(5)

'clicked leads heading'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__icno'), '400712015431')

WebUI.waitForPageLoad(5)

'given IC Number '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/TM/Leads_New/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with given IC Number,it will display matched result '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('AIG_Sales/TM/Leads_New/img - CD'))

WebUI.waitForPageLoad(5)

WebUI.closeWindowIndex(0)

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

'it will open customer details page - product and policy holder details '
WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'it will open customer details page - insurance person information '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'it will open customer details page - contacr and address information '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'it will open customer details page - payment information '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'it will open customer details page - Qa Selection  information '
WebUI.takeScreenshot()

WebUI.navigateToUrl('http://dev3.myeg.com.my/AIGSales/logoutaction.do')

WebUI.waitForPageLoad(5)

'clicked logged out '
WebUI.takeScreenshot()

WebUI.closeBrowser()

