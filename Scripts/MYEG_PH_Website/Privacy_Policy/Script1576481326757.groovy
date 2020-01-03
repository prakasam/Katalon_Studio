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

'MyEG PH Home Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Privacy Policy'))

WebUI.waitForPageLoad(5)

'Clicked Privacy Policy link from footer, it will open site policies page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Overview'))

WebUI.waitForPageLoad(5)

'Clicked overview link , it will navigate to required info'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Personal Data That We Collect'))

WebUI.waitForPageLoad(5)

'Clicked "Personal Data That We Collect" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Retention Of Data'))

WebUI.waitForPageLoad(5)

'Clicked "Retention Of Data " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Processing Of Personal Data'))

WebUI.waitForPageLoad(5)

'Clicked "Processing Of Personal Data " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Sharing Of Personal Data'))

WebUI.waitForPageLoad(5)

'Clicked "Sharing Of Personal Data" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Working with Other Services and Platforms'))

WebUI.waitForPageLoad(5)

'Clicked "Working with Other Services and Platforms" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Use of Cookies and Tracking Technologies'))

WebUI.waitForPageLoad(5)

'Clicked "Use of Cookies and Tracking Technologies" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Privacy Choices That Are Available'))

WebUI.waitForPageLoad(5)

'Clicked "Privacy Choices That Are Available " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Protection Of Personal Data'))

WebUI.waitForPageLoad(5)

'Clicked "Protection Of Personal Data " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Underage Access Restrictions'))

WebUI.waitForPageLoad(5)

'Clicked "Underage Access Restrictions " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Miscellaneous'))

WebUI.waitForPageLoad(5)

'Clicked "Miscellaneous " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Terms  Conditions'))

WebUI.waitForPageLoad(5)

'Clicked Privacy Policy link from footer, it will open site policies page and selected as terms & conditions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Data Protection Notice'))

WebUI.waitForPageLoad(5)

'Clicked "Data Protection Notice " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Personal Data'))

WebUI.waitForPageLoad(5)

'Clicked "Personal Data " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Collection Use And Disclosure Of Personal Data'))

WebUI.waitForPageLoad(5)

'Clicked "Collection, Use And Disclosure Of Personal Data  " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Withdrawing Your Consent'))

WebUI.waitForPageLoad(5)

'Clicked " Withdrawing Your Consent" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Access To And Correction Of Personal Data'))

WebUI.waitForPageLoad(5)

'Clicked " Access To And Correction Of Personal Data" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Protection Of Personal Data_1'))

WebUI.waitForPageLoad(5)

'Clicked "Protection Of Personal Data " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Accuracy Of Personal Data'))

WebUI.waitForPageLoad(5)

'Clicked "Accuracy Of Personal Data " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Retention Of Personal Data'))

WebUI.waitForPageLoad(5)

'Clicked " Retention Of Personal Data" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Transfers Of Personal Data Outside Of Phi_d47b99'))

WebUI.waitForPageLoad(5)

'Clicked " Transfers Of Personal Data Outside Of Philippines" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Effect Of Notice And Changes To Notice'))

WebUI.waitForPageLoad(5)

'Clicked " Effect Of Notice And Changes To Notice" link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Acknowledgement And Consent'))

WebUI.waitForPageLoad(5)

'Clicked "Acknowledgement And Consent " link , it will navigate to info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Privacy Policy'))

WebUI.waitForPageLoad(5)

'Clicked "Privacy Policy" link , it will navigate to site policies page and opened privacy policy as default page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_Terms  Conditions'))

WebUI.waitForPageLoad(5)

'Clicked " Terms & Conditions" link , it will open Terms & Conditions page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_About Us'))

WebUI.waitForPageLoad(5)

'Clicked About link from footer, it will open About us page '
WebUI.takeScreenshot()

WebUI.back()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_View Map'))

WebUI.waitForPageLoad(5)

'Clicked View Map Link from Corporate Office in footer, it will open google map location in new tab for direction '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(5)

'google map location info for corporate office '
WebUI.takeScreenshot()

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_View Map_1'))

WebUI.waitForPageLoad(5)

'Clicked View Map Link from satellite Office in footer, it will open google map location in new tab for direction '
WebUI.takeScreenshot()

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(5)

'google map location info for satellite office '
WebUI.takeScreenshot()

WebUI.closeWindowIndex('1')

WebUI.delay(1)

WebUI.switchToWindowIndex('0')

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_inquirymyegph'))

not_run: WebUI.waitForPageLoad(5)

'clicked inquiry@myeg.ph email link , it will navigate to new compose email ( if user login any email service ) '
not_run: WebUI.takeScreenshot()

not_run: WebUI.back()

not_run: WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/a_63 (02) 250 6121'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/img'))

WebUI.waitForPageLoad(5)

'clicked facebook  \'F\' image link , it will navigate to myeg philippines facebook page '
WebUI.takeScreenshot()

WebUI.back()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/img_1'))

WebUI.waitForPageLoad(5)

'click home image , it will navigate to myeg_ph home page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyEG_PH/Site_Policy_Footer/img_1_2'))

WebUI.waitForPageLoad(5)

'clicked myeg image , it will navigate to myeg_ph home page '
WebUI.takeScreenshot()

WebUI.closeBrowser()

