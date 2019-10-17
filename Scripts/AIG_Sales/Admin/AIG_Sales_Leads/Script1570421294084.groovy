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

'Opened AIG Sales Login Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__actionloginaction_new'))

WebUI.waitForPageLoad(5)

'Clicked Submit with out given username and password '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__username'), 'fakhrul')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__actionloginaction_new'))

WebUI.waitForPageLoad(5)

'Clicked submit with given Username only'
WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__username'), 'wrong')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__password'), '2qS9tAbCXDDRMEFDdKhcMA==')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__actionloginaction_new'))

not_run: WebUI.waitForPageLoad(5)

'Clicked submit with given wrong Username and password '
not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__username'), 'fakhrul')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__password'), 'o6CDTymj93o=')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__actionloginaction_new'))

not_run: WebUI.waitForPageLoad(5)

'Clicked submit with given Username and wrong password '
not_run: WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__username'), 'fakhrul')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__password'), '2qS9tAbCXDDRMEFDdKhcMA==')

WebUI.waitForPageLoad(5)

'Clicked submit with given Username and password '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__actionloginaction_new'))

WebUI.sendKeys(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__password'), Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.waitForPageLoad(5)

'it will open admin dash board page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Leads'))

WebUI.waitForPageLoad(5)

'clicked leads menu . it will open the leads page to filter '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/img__ui-datepicker-trigger'))

WebUI.waitForPageLoad(5)

'clicked date picket to choose required date '
WebUI.takeScreenshot()

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '8', true, FailureHandling.OPTIONAL)

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_1'))

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__fromdate'), '2019/10/01')

WebUI.waitForPageLoad(5)

'given from date '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/img__ui-datepicker-trigger'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '8', true)

not_run: WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_30'))

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked search with given from date only '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__todate'), '2019/10/08')

WebUI.waitForPageLoad(5)

'given to date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked search with given from and to date , it will display result '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Leads (1)'))

WebUI.waitForPageLoad(5)

'selected leads menu '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__icno'), '670607715081')

WebUI.waitForPageLoad(5)

'given IC Number '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with given IC Number,it will display matched result '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Leads (1)'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_------ Status ------'), 
    '0', true)

WebUI.waitForPageLoad(5)

'selected required status from list '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with selected status from list , it will display matched result '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/img__ui-datepicker-trigger'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '8', true)

not_run: WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_30'))

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__updatedate'), '2019/10/02')

WebUI.waitForPageLoad(5)

'given updated date '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with Given Updated date , it will display matched result '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_- Select TM Name -'), 
    '16', true)

WebUI.waitForPageLoad(5)

'selected required TM name from list'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with selected TM name from list , it will display matched result '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__oname'), 'test one')

WebUI.waitForPageLoad(5)

'Given Name'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with Given Name, it will display matched result '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__contactno'), '123456789')

WebUI.waitForPageLoad(5)

'Given Contact Number'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'clicked search with Given Contact Number, it will display matched result '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Leads (1)'))

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__fromdate'), '2019/10/01')

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__todate'), '2019/10/08')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__icno'), '770601045329')

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_------ Status ------'), 
    '1', true)

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__updatedate'), '2019/10/02')

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_- Select TM Name -'), 
    '16', true)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__oname'), 'ALVIN TEOH')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__contactno'), '01126236286')

WebUI.waitForPageLoad(5)

'Given all types of filters data to search '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__width150px pointer'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'it will display the available result '
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Leads (1)'))

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__fromdate'), '2019/10/01')

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__todate'), '2019/10/08')

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_------ Status ------'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__icno'), 'gefgsegesg')

WebUI.setText(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__updatedate'), '2019/10/02')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__oname'), 'dgvsdfgsdf')

WebUI.setText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__contactno'), 'dsgvgsdfhgbx')

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_- Select TM Name -'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/select_------ Status ------'), 
    '0', true)

WebUI.waitForPageLoad(5)

'Given all types of filters data to reset '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__Reset_width150px pointer'))

WebUI.waitForPageLoad(5)

'it will clear given data . and set as default '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Change Password'))

WebUI.waitForPageLoad(5)

'clicked change password page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__cp_submit_width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked submit with out given date '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__cpassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__cp_submit_width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked submit with given old password, with out new password and retype new password '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__cpassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__npassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__cp_submit_width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked submit with given old and new password, with out retype new password '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__cpassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__npassword'), 'o6CDTymj93o=')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__rnpassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

'given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__cp_submit_width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked submit with given wrong details , it will display message " Please enter new password and retype new password as same. " '
WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__cpassword'), 'o6CDTymj93o=')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__npassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__rnpassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

'given invalid details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__cp_submit_width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked submit with given invalid old password , it will display message "Password not Changed Successfully. Please try again."'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Change Password'))

WebUI.waitForPageLoad(5)

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__cpassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__npassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/input__rnpassword'), '2qS9tAbCXDDRMEFDdKhcMA==')

'given valid details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('AIG_Sales/Admin/AIG_Sales_Leads/input__cp_submit_width150px pointer'))

WebUI.waitForPageLoad(5)

'clicked submit with given required details , it will display message " Password successfully Updated " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/AIG_Sales/Admin/AIG_Sales_Leads/a_Log Out'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

