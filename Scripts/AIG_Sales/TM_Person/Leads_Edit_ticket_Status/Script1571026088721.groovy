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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://dev3.myeg.com.my/AIGSales/login.do')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__username'), 'user')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__actionloginaction'))

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/a_Leads'))

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__icno'), '400712015431')

WebUI.waitForPageLoad(5)

'given IC Number '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with given IC Number,it will display matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/img'))

WebUI.waitForPageLoad(5)

'it will open Customer details Page '
WebUI.takeScreenshot()

WebUI.closeWindowIndex(0)

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(5)

'it will open Customer details Page '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------Please Select ------Accident Hospital Guard- (Self) - Copy'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------Please Select ------Plan 100 (RM 30) - Copy'), 
    '30', true)

WebUI.waitForPageLoad(5)

'given Product details '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Title ------MrMrsMsDATODATUKDATIN - Copy'), 
    'Mr', true)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Marital Status------DivorcedMarriedSingleWidowWidower - Copy'), 
    'M', true)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__passport'), 'A12345678')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__dob'), '1940/07/12')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__age'), '79')

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Gender ------MaleFemale - Copy'), 'M', true)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Occupation------ (1) - Copy'), 'A04-ENGINEER/LAWYER/ACCOUNTANT/CONSULTANT', 
    true)

WebUI.waitForPageLoad(5)

'given Policy Holder details '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__asname'), 'spouse name')

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Title ------MrMrsMsDATODATUKDATIN_1 - Copy'), 
    'Mr', true)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Marital Status------DivorcedMarriedSingleWidowWidower_1 - Copy'), 
    'M', true)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__asicno'), '861213653489')

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__aspassport'), 'A7654321')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__asdob'), '1986/12/13')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__asage'), '32')

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Gender ------MaleFemale_2 - Copy'), 'F', 
    true)

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Occupation------ (1) - Copy'), 'A13-TECHNICIAN', 
    true)

WebUI.waitForPageLoad(5)

'given Spouse details '
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

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ State ------ - Copy'), 'SELANGOR DARUL EHSAN', 
    true)

WebUI.waitForPageLoad(5)

'given Address details '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_Credit CardDebit Card - Copy'), 'CRED', true)

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__paymode'), 'Monthly')

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Relationship------POLICYHOLDERSPOUSEPARENTSCHILDREN - Copy'), 
    'S', true)

not_run: WebUI.setText(findTestObject('AIG_Sales/TM/Leads_New/input__cardno - Copy'), '4386750000274205')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__chname'), 'testing card')

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Card Type ------MASTERVISA - Copy'), 'VISA', 
    true)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__cexpdate'), '10/2021')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/textarea__addcalldisremark'), 'completed policy holder details ')

WebUI.waitForPageLoad(5)

'given Payment Card details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/TM/Leads_New/input__CDwidth150px pointer'))

WebUI.waitForPageLoad(2)

'clicked submit with out given QA Section , it will display the validation info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('AIG_Sales/TM/Leads_New/input__expfirstdate_QA_UD'), '2019/10/14')

WebUI.selectOptionByValue(findTestObject('AIG_Sales/TM/Leads_New/select_------ Please Select------Resubmit_QA_RS - Copy'), 
    'Resubmit', true)

WebUI.setText(findTestObject('AIG_Sales/TM/Leads_New/textarea__addqaremarks_QA'), 'Selected as Resubmit ')

WebUI.waitForPageLoad(5)

'given QA Section details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/TM/Leads_New/input__CDwidth150px pointer'))

not_run: WebUI.waitForPageLoad(1)

'Customer details updated '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__icno'), '400712015431')

WebUI.waitForPageLoad(5)

'given IC Number '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with given IC Number,it will display matched result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/TM/Leads_New/img'))

WebUI.waitForPageLoad(5)

WebUI.closeWindowIndex(0)

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'to check the latest remark .'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Log Out'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

