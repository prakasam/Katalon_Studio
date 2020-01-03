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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat4.myeg.com.my/eservices/login.jsp')


WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/sample/Eservice_login/input__username'), findTestData('login_data/data').getValue(
		1, 1))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/sample/Eservice_login/input__password'), findTestData('login_data/data').getValue(
		2, 1))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/sample/Eservice_login/input_Forgot Password_login_submission'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/sample/Eservice_login/a_Logout'))
WebUI.waitForPageLoad(5)
WebUI.takeScreenshot()

WebUI.closeBrowser()



not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/a_Polis Diraja Malaysia'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/b_CHECK  PAY PDRM SUMMONS'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/div_Search Summons                         _c95f6d'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/a_Home'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/a_Jabatan Pengangkutan Jalan'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/span_'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/a_CHECK  PAY RTD SUMMONS      SEMAK  BAYAR _d8192c'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/sample/Eservice_login/input__id_no'), 'S0568667')

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/sample/Eservice_login/select_Please Select - Sila Pilih          _2f5ded'), 
    '9', true)

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/input__Submit1'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/input_------_ckbox'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/input__Submit1'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/input__Submit1'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/button_CREDIT CARD'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/input_Users can securely transact using the_5cf53c'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/button_Credit Card (MasterVisa)'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/sample/Eservice_login/select_-- Select --    Visa    Mastercard'), 
    'Visa', true)

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/input__cardNo1'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/input__cancelPayment'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/sample/Eservice_login/a_Logout'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

