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

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/button_Sign In'))

'Pasti Admin Dash Board \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/a_Company Management'))

'Selected Company management Menu\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/a_Company List'))

'Company List Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Add New Company'))

'Click Add New Company Button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'with out given value click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Company Name _companyNam'), 
    'a')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given company name as single character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Company Reg. No. _compan'), 
    'b')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given company registration no as single character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Address _address'), 
    'c')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given company Address as single character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_City _city'), 
    'd')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given company City as single character and click register button '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/select_Choose StateJohorKedahK'), 
    'Selangor', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'Selected state from drop down and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Postcode _postcode'), 
    'e')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given post code as single character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Postcode _postcode'), 
    '47400')

'given post code as valid and click register button '
WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone _mobileno'), 
    'f')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given mobile no as single character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone _mobileno'), 
    '1234556768')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given mobile no  as valid and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Fax_fax'), 
    '2423151136436')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given FAX no as Valid and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Email _email'), 
    'test@gmail.com')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Email as valid  and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Company Name _companyNam'), 
    'ab')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given company name as two character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Company Name _companyNam'), 
    '#$%@^&(()*@#')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given company name as Special character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Company Name _companyNam'), 
    'aplus ')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given company name as character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/input_Company Name _companyNam'), 
    'aplus % \' ` / ( ) - & .  @ * , ! ')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given company name as character & valid symbols  and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Company Reg. No. _compan'), 
    'ab')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given registration no as two character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Company Reg. No. _compan'), 
    '$@%@&##^**(!')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given registration no as special character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Company Reg. No. _compan'), 
    '201810-12')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given registration no as valid and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Address _address'), 
    'cdfgfdjhfgb')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Address as few character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Address _address'), 
    '%@$^%E^&!@#(^E*)#(&$*@#^')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Address as Special character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Address _address'), 
    'address 1234 &()-\',./@:')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Address as valid character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_City _city'), 
    '#@%$^%&')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given City as Special character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_City _city'), 
    '234352463')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given City as numbers and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_City _city'), 
    'Petaling Jaya')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given City as valid character and click register button '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/select_Choose StateJohorKedahK'), 
    'W.P. Putrajaya', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'Choosen state from dropdown and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Postcode _postcode'), 
    'dscub')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given postcode as character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Postcode _postcode'), 
    '#@!$%')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given postcode as special character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Postcode _postcode'), 
    '47500')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given postcode as valid and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone _mobileno'), 
    'vkbjsdfbvkjs')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Phone no as character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone _mobileno'), 
    '$%@#%&&*(@&$(')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Phone  no as Special character and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/input_Phone _mobileno'), '52')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Phone no as two numbers and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone _mobileno'), 
    '5254364575')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Phone no as valid numbers and click register button ( between 8 to 11) '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone 2_mobileno2'), 
    'fbdfxngffhg')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Phone no 2 as Special charaxters and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone 2_mobileno2'), 
    '@%$^@&^*()')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Phone no as special Chaaracters and click register button'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone 2_mobileno2'), 
    '98')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Phone no2 as two numbers and click register button'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Phone 2_mobileno2'), 
    '9887457884')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Phone2 no as valid numbers and click register button ( between 8 to 11) '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Fax_fax'), 
    'sbjdkhcbsdhjv')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Fax no as characters and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Fax_fax'), 
    '*@#$%&@#(^@)#')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Fax no as SPECIAL characters and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Fax_fax'), 
    '324')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Fax no as lessthan 7 Numbers and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Fax_fax'), 
    '29632618712')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Fax no as Valid and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Email _email'), 
    '#@%#^#%#@')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Email as special characters  and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Email _email'), 
    'csdvdfsdfgvs')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Email as characters only and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Email _email'), 
    'csdvdfsdfgvs@')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Email character with @ and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Email _email'), 
    'csdvdfsdfgvs@csdc')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Email character without domain and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Email _email'), 
    'csdvdfsdfgvs@csdc.com')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'given Email as valid and click register button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_Remarks_remarks'), 
    'sivndnv5862628 #*%&(#')

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/select_Choose Company Contact'), 
    '244', true)

'given remarck & contact person'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Register'))

'Company Created Successfully '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/a_Company Management (1)'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/a_Company List (1)'))

'Company List Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/input_List of All Registered C'), 
    '926963-P')

'Search required required company '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/a_edit test auto Company perso'))

'view company contact person '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/a_Edit'))

'edited company contact person '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/button_Update'))

'click update with out changing details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/a_Company Management'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MyEG/a_Company List'))

'Company List page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/input_List of All Registered C'), 
    'aplus')

'Search Required company '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_CM_Add_OB/Page_PASTI by MYEG/a_Logout'))

'Logout from company '
WebUI.takeScreenshot()

WebUI.closeBrowser()

