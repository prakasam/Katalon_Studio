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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.121.37/auth/login')

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Login_username'), 
    '505639-K')

WebUI.maximizeWindow()

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Login_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Sign In'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/a_Fleet Management'))

WebUI.takeScreenshot()

WebUI.doubleClick(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Add'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Export_input'), 
    'prakasam')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Export'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/select_CSV PDF'), 
    'pdf', true)

WebUI.takeScreenshot()

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Export'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Cancel'))

WebUI.refresh()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Add New Driver'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Driver Name_fullname'), 
    'a')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/select_Male'), 
    'Female', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Staff ID_staffid'), 
    'a')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Driver Name_fullname'), 
    'aplus')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/select_Male'), 
    'Male', true)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Driver Name_fullname'), 
    'aaplus')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_IC Number_ic'), 
    '645634-36-4364')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Mobile Number_mobileno'), 
    'dsdfgsdagsdasfds')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Mobile Number_mobileno'), 
    '@$#^$&**$&^%')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Mobile Number_mobileno'), 
    'sfds')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Mobile Number_mobileno'), 
    '234235')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Mobile Number_mobileno'), 
    '0111163453')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/textarea_Address_address'), 
    'a')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/textarea_Address_address'), 
    '#$%$&@^*#&()*_')

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/textarea_Address_address'), 
    'Level 43A, MYEG Tower, No 8, Jalan Damansara, Empire City, PJU 8, 47820 Petaling Jaya, Selangor')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_License Number_licenceno'), 
    'J')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_License Number_licenceno'), 
    '@#$@!^%(*^#@')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_License Number_licenceno'), 
    'J3441765')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_License Type_licencetype'), 
    '@#$')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_License Type_licencetype'), 
    'B2')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_License Expiry Date_lice'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_License Expiry Date_lice'), 
    '01/11/2019')

WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.doubleClick(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Submit'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Export_input'), 
    'aaplus')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Edit'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Driver Name_fullname'), 
    5)

WebUI.clearText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Driver Name_fullname'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Driver Name_fullname'), 
    'Aaplus edit')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/select_Male'), 
    'Female', true)

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Staff ID_staffid'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Staff ID_staffid'), 
    'aedit')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_IC Number_ic'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_IC Number_ic'), 
    '645634-36-4399')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Mobile Number_mobileno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_Mobile Number_mobileno'), 
    '0111163499')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/textarea_Address_address'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/textarea_Address_address'), 
    'Level 43A, MYEG Tower, Jalan Damansara, Empire City, PJU 8, 47820 Petaling Jaya, Selangor, malaysia')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_License Number_licenceno'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_License Number_licenceno'), 
    'L8657375889238')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_License Type_licencetype'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_License Type_licencetype'), 
    'DA')

WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_License Expiry Date_lice'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/input_License Expiry Date_lice'), 
    '01/06/2020')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Submit'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/input_Export_input'), 
    'aaplus')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/button_Delete'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/Page_Pasti by MyEG/Page_Pasti by MyEG/button_Delete'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/div_Hi MYEG Services'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OR/Pasti_BU_FM_Driver_Add_OR/Page_Pasti by MyEG/a_Logout'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

