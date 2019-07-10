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

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/login.zul')

WebUI.maximizeWindow()

'BO Support Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click Submit with given Username and Password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Submit'))

'BO Support Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Immigration'))

'Click Immigration Button '
WebUI.takeScreenshot()

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/a_Foreign Worker'))

not_run: WebUI.delay(2)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/a_im_transaction'))

not_run: WebUI.delay(2)

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/Imm-im_Transaction.zul')

'Foreign worker ->  transaction page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

'Click Combo Box to choose the opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/td_ByID'))

WebUI.delay(2)

'Selected By ID from Opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Id_tb_id'), 
    '3MIMIS201710240900038470')

'Click Go with Given ID '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/td_ByPassportNo'))

WebUI.delay(2)

'select Passport number from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Passport No_tb_id'), 'PHL140099_')

'Click Go with given Passport number'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Go'))

WebUI.delay(2)

'it will display the available result '
WebUI.takeScreenshot()

not_run: WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/td_ByMerchantId'))

'selected merchant id from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Passport No_tb_id (1)'), 
    'OTH1710240830029146', FailureHandling.OPTIONAL)

'click go with given merchant id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Go'))

WebUI.delay(2)

'it will display the result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/td_UpdateMerchantId'))

WebUI.delay(2)

'selecte update by mechant id from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Passport No_tb_id'), 'PHL16547')

WebUI.delay(2)

'click go with given invalid passport no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Go'))

WebUI.delay(2)

'it will display the message " Reocord not found " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_OK'))

WebUI.delay(2)

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Passport No_tb_id'), 'PHL140099_')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'click go with given valid passport no '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Go'))

WebUI.delay(2)

'it will display the result in text box to change the mechant id '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Set merchant_id_tb_merch'), 
    'OTH1703052345014085')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'click Update with given merchant id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Update'))

WebUI.delay(2)

'it will display the message " record updated successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Select the Query_cb_repr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/td_Updatejms_flag'))

WebUI.delay(2)

'select update JMS Flag from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Passport No_tb_id'), 
    'AT430328')

'Click Go with given passport number '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Go'))

WebUI.delay(2)

'it will display the JMS Flag info in text box to change  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/input_Set jms_flag_tb_jmsflag'), 
    'Y')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

'click update with given JMS flag '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_Update'))

WebUI.delay(2)

'it will diplay the message " Record Updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Immigration/Foreign Worker/Im_Transactions-OR/button_LogOut'))

'Logout from BO Support '
WebUI.takeScreenshot()

WebUI.closeBrowser()

