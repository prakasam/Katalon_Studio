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

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'MyEG Philippines home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/img_1'))

WebUI.waitForPageLoad(5)

'clicked myeg logo '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/img'))

WebUI.waitForPageLoad(5)

'clicked home icon '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_Landbank Linkbiz'))

WebUI.waitForPageLoad(5)

'clicked  Landbank Linkbiz service card image link , it will open page '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/button_Visit MYEG LinkBiz Portal'))

not_run: WebUI.waitForPageLoad(5)

'clicked  Visit MYEG LinkBiz Portal button link , it will open page '
not_run: WebUI.takeScreenshot()

not_run: WebUI.back()

not_run: WebUI.waitForPageLoad(5)

'clicked back to MYEG LinkBiz Portal page.'
not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/img_Servicing Key Government Institutions_g_e27e8e'))

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/img_Servicing Key Government Institutions_g_e27e8e_1'))

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/img_Servicing Key Government Institutions_g_e27e8e_1_2'))

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/img_Servicing Key Government Institutions_g_e27e8e_1_2_3'))

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/img_Servicing Key Government Institutions_g_e27e8e_1_2_3_4'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(5)

'scrolled down to view Servicing Key Government Institutions images'
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'clicked back to home page.'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_Loan'))

WebUI.waitForPageLoad(5)

'clicked  Personal Loans service card image link , it will open page '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/span_Personal Loan'))

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/button_Apply for MYEG Personal Loan'))

WebUI.waitForPageLoad(5)

'clicked  Apply for MYEG Personal Loan button link , it will open page '
WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

'clicked back to MYEG Personal Loan page.'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_Key Features'))

WebUI.waitForPageLoad(5)

'Clicked Keyfeatures link from Scrool to menu , it will navigate to key features information in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_Loan Requirements'))

WebUI.waitForPageLoad(5)

'Clicked Loan Requirements link from Scrool to menu , it will navigate to  Loan Requirements information in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_FAQ'))

WebUI.waitForPageLoad(5)

'Clicked Loan FAQ link from Scrool to menu , it will navigate to Frequently Asked Questions (FAQ)  information in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How much can I borrow'))

WebUI.waitForPageLoad(5)

'Clicked " How much can I borrow? " to expand the information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How much can I borrow'))

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_What are the CIMB Bank Personal Loan Re_fa0277'))

WebUI.waitForPageLoad(5)

'Clicked " What are the CIMB Bank Personal Loan Requirements? " to expand the information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_What are the CIMB Bank Personal Loan Re_fa0277'))

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How does the CIMB Bank Personal Loan Ca_3ce75e'))

WebUI.waitForPageLoad(5)

'Clicked " How does the CIMB Bank Personal Loan Calculator work? " to expand the information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How does the CIMB Bank Personal Loan Ca_3ce75e'))

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_Is CIMB Bank Personal Loan the right on_05a87f'))

WebUI.waitForPageLoad(5)

'Clicked " Is CIMB Bank Personal Loan the right one for me? " to expand the information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_Is CIMB Bank Personal Loan the right on_05a87f'))

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How to Apply for a CIMB Personal Loan'))

WebUI.waitForPageLoad(5)

'Clicked " How to Apply for a CIMB Personal Loan? " to expand the information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How to Apply for a CIMB Personal Loan'))

WebUI.waitForPageLoad(5)

'closed the expanded information '
WebUI.takeScreenshot()

not_run: WebUI.back()

WebUI.navigateToUrl('https://ph-portal-uat.myegdev.com/')

WebUI.waitForPageLoad(5)

'Clicked back to home page link . it will reirect to home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_Insurance'))

WebUI.delay(2)

'Clicked insurance Service card Link , it will open myeg insurance page '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex('1')

WebUI.waitForPageLoad(5)

'new web tab opned from myeg insurance page '
WebUI.takeScreenshot()

WebUI.closeWindowIndex('1')

WebUI.delay(1)

WebUI.switchToWindowIndex('0')

WebUI.delay(3)

'swigtched to opened page insurance page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_NBI'))

WebUI.waitForPageLoad(5)

'clicked  NBI service card image link , it will open page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/button_Apply for NBI Clearance'))

WebUI.waitForPageLoad(5)

'clicked  Apply for NBI Clearance card image link , it will open page '
WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

'clicked back to NBI Clearance page.'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_Key Services'))

WebUI.waitForPageLoad(5)

'clicked key features from Scrool to menu , it will navigate to key features info'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_FAQ'))

WebUI.waitForPageLoad(5)

'clicked FAQ from Scrool to menu , it will navigate to  Frequently Asked Questions (FAQ)  info'
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How to apply using the Online System'))

WebUI.waitForPageLoad(5)

'Clicked "  How to apply using the Online System?  " to expand the information '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/span_How to apply using the Online System_a_f6a6ed'))

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How to apply using the Online System'))

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How much will it cost me to apply online'))

WebUI.waitForPageLoad(5)

'Clicked "  How much will it cost me to apply online?  " to expand the information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How much will it cost me to apply online'))

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_I got a hit on my application can you help me'))

WebUI.waitForPageLoad(5)

'Clicked "   I got a hit on my application, can you help me?   " to expand the information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_I got a hit on my application can you help me'))

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How can I avail of the quick renewal service'))

WebUI.waitForPageLoad(5)

'Clicked "  How can I avail of the quick renewal service?   " to expand the information '
WebUI.takeScreenshot()

WebUI.click(findTestObject('MyEG_PH/Service_card_pages/div_How can I avail of the quick renewal service'))

WebUI.waitForPageLoad(5)

'clicked again to closed the opened FAQ info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/img_1'))

WebUI.waitForPageLoad(5)

'Clicked Myeg image link. it will redirect to home page '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/p_NBI'))

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/span_Ilagan Isabela'))

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/span_Baler Aurora'))

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Service_card_pages/span_Insurance'))

WebUI.closeBrowser()

