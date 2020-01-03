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

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__username'), 'fakhrul')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__password'), '2qS9tAbCXDDRMEFDdKhcMA==')

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

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given information '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__person'), 'Test One 20-11-2019')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given person name '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__icno'), '861213146789')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given IC Number info '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__contact1'), '0123456789')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given Contact number 1'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__contact2'), '9876543219')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given Contact number 2'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__address1'), 'Address1')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given Address1'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__address2'), 'address2')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given Address 2'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__address3'), 'address3')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given Address 3'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__areaname'), 'jalan masid')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given area'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__city'), 'city')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given city'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__postcode'), '47400')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with given Pincode'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/select_------ State ------'), 
    'SELANGOR DARUL EHSAN', true)

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__country'), 'Malaysia')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with selected state from drop down, country will default value " Malaysia" '
WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__incdate'), '2019/10/09')

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/img__ui-datepicker-trigger'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Report/date/a_1'))

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/a_9'))

WebUI.waitForPageLoad(5)

'given from date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'click submit with selected date '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/select_- Select TM Name -'), 
    '16', true)

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

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__oname'), 'Test One 20-11-2019')

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

WebUI.sendKeys(findTestObject('AIG_Sales/Admin/AIG_Sales_New_Leads/input__contactno'), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(5)

WebUI.switchToWindowIndex('1')

'clicked customer details page , it will open new tab with message " No Records Found" '
WebUI.takeScreenshot()

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.waitForPageLoad(5)

'closed new tab and returned to main tab '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

'leads page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/a_Log Out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'logged out '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

'now login as un_assigned user , it dont display the record created '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__username'), 'user')

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

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_New_Leads/input__icno'), '861213146789')

WebUI.waitForPageLoad(5)

'clicked search with given IC Number'
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_New_Leads/input__Search width150px pointer'))

WebUI.waitForPageLoad(5)

'it display message " No Records Found" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/a_Log Out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'logged out '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

'now login as assigned user , it will display record '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/input__username'), 'venkatesh')

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

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_New_Leads/input__icno'), '861213146789')

WebUI.waitForPageLoad(5)

'clicked search with given IC Number'
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_New_Leads/input__Search width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

'it will searvh the record and display info in down '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_New_Leads/a_Log Out'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'logged out '
WebUI.takeScreenshot()

WebUI.closeBrowser()

