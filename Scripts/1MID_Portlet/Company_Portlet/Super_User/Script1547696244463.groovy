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
//Added for use with "uploadFiles"
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('http://uat5.myeg.com.my/portlet/')

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email Address__58_login'), 'superuser@liferay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), 
    'h1bZaoNZrXJGImBBMGIoZQ==')

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Password__58_password'), Keys.chord(Keys.TAB, Keys.TAB, 
        Keys.ENTER))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'Apex Global new company sdn bhd')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select Company Type'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__regNo'), 'ap78wr76-78')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Is Corporate Sales_corpS'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Is Immi_fworker'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Is Dealer_dealer'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Is Finance_finance'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__incorpDate'), '1986-07-01')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__address1'), 'address1')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'address2')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'address3')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__city'), 'petaling jaya')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__postcode'), '47400')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), 
    '11', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '01111719799')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), '0123456789')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contactNo'), '0123456789')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_email'), 'test@gmail.com')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_None Collected Verified'), 
    '2', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 1'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdForm9.1'))

WebUI.delay(10)

WebUI.takeScreenshot()

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\Form9.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

//WebUI.uploadFile(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdForm9.1'), '‪C:\\Users\\Owner\\Desktop\\Validation Rule.pdf')
WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 2'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdForm13.2'))

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\Form13.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 3'))

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdAuthLetter.24'))

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\Form24.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 5'))

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdForm49.5'))

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\Form49.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 7'))

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdDirector.7'))

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\DRM.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 8'))

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdAppLetter.8'))

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\APL.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 24'))

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdAuthLetter.24'))

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\AUL.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 32'))

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdCancelAp.32'))

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\CAPL.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg 33'))

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Note Please upload jpeg bhdSection58.33'))

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'D:\\workspace\\KSW\\UF\\Section58.exe'

Runtime.getRuntime().exec(autoit_prj)

WebUI.delay(2)

Thread.sleep(2000)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Remarks_remark'), 'Documents collected')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Create'))

WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Edit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__companyName'), 'Apex Global new company sdn bhd edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__regNo'), 'ap78wr76-78e')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Is corpSalesAccountChk'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Is financeChk'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 5)

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'address1 edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'address2 edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'address3 edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), 'petaling jaya edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '47800')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), '13', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__contactNo'), '01234567899')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Fax Number_faxNo'), '01234567899')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Email_email'), 'test9@gmail.com')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Remarks_remark'), 5)

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Remarks_remark'), 'Documents collected edited')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update'))

WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Delete'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.dismissAlert()

WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Branch'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Branch'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'Apex Branch')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'Apex branch person')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '0123456789')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '0123456789')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'test@gmail.com')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'address 1')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'Address 2')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'Address 3')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__city'), 'Petaling Jaya')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '47800')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), '11', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_IsActive_is_active'))

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.ENTER))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input View Branch'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View Branch'))

WebUI.takeScreenshot()

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Edit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__co_branch_name'), 'Apex Branch edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_name'), 'Apex branch person edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__contact_no'), '01234567899')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Fax Number_fax_no'), '01234567899')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Email_branchEmail'), 'test9@gmail.com')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__address1'), 'Address 1 edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 2_address2'), 'Address 2 edit')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), 'Address 3 edit')

WebUI.sendKeys(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Address 3_address3'), Keys.chord(Keys.TAB, 'Petaling Jaya Edit '))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__postcode'), '47400')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('1MID_Portlet/Super_User_Company-OR/select_-- Select State -- Joho'), '13', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_IsActive_is_activeChk'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update Branch'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Delete'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Branch Delete'))

WebUI.dismissAlert()

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToPosition(400, 500)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Person'), 0, FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Add Person'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__name'), 'apex person one')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input__id'), '980701543278')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), '0123456789')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'test@gmail.com')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Is Director_directorRadi'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Director Representative_'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Non-Director_directorRad'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Secure OTP_secureotp'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), 'non Director')

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), Keys.chord(Keys.TAB, 
        Keys.TAB, Keys.ENTER))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input View AP Details'), 0)

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View AP Details'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Back to view Company Details'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.navigateToUrl('https://uat5.myeg.com.my/portlet/web/guest/company-portlet')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/select_-- Select -- Registrati'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__Search Value'), 'Apex Global')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Search'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input View'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Person Edit'), 5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Person Edit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input__name'), 'apex person one edit')

WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/td_Select Branch'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_AP Contact Number_contac'), '01234567899')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_AP Email_email'), 'testedit@gmail.com')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/input_Director Representative_'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('1MID_Portlet/Super_User_Company-OR/input_Designation_designation'), 'Director Representative')

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Update AP'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.scrollToPosition(600, 700)

WebUI.scrollToElement(findTestObject('1MID_Portlet/Super_User_Company-OR/input Delete Person'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('1MID_Portlet/Super_User_Company-OR/input Delete Person'))

WebUI.delay(5)

not_run: WebUI.takeScreenshot()

WebUI.dismissAlert()

WebUI.takeScreenshot()

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/1MID_Portlet/Super_User_Company-OR/a_Sign Out'))

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.F4))

