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

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

WebUI.maximizeWindow()

'Payme login page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'click sign in with given username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'Admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_Qualifications Setup'))

WebUI.waitForPageLoad(5)

'Clicked Qualitication setup sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked Add new button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out given data , it will display required field name in red color '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input__name'), 'Wiring')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description'), 
    'Building wiring ')

'Click save with given data '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect back to skills page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control'), 
    'wiring')

WebUI.waitForPageLoad(5)

'Search using name , it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_Building wiring_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked edit image link '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input__name'), 'Wiring edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description'), 
    'Building wiring edit')

'click save with given required change details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the edited information and auto redirect to skirlls page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control'), 
    'building')

WebUI.waitForPageLoad(5)

'Search using Description, it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_Building wiring edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked Copy image link , '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will save the copied data in new reocrd and auto redirect to skirls page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control'), 
    'wiring')

WebUI.waitForPageLoad(5)

'Search using name , it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_Building wiring edit_tableActionButton_1'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'Clicked delete image link . it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete for confirmation , record deleted and auto redirect to skirlls page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control'), 
    'building')

WebUI.waitForPageLoad(5)

WebUI.delay(2)

'Search using description, it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_Building wiring edit_tableActionButton_2'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'Clicked delete image link . it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete for confirmation , record deleted and auto redirect to skirlls page '
WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name'), FailureHandling.OPTIONAL)

'clicked name , it will arrange the records in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name'))

'clicked name again , it will arrange the records in Dessending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description'))

'clicked Description  , it will arrange the records in Assending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description'))

WebUI.waitForPageLoad(5)

'clicked description again , it will arrange the records in Dessending Order '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_2'))

WebUI.waitForPageLoad(5)

'clicked second page using page navigation , it will open second page info \r\n'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_Qualifications Setup'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.CONTINUE_ON_FAILURE)

'clicked qualification setup submenu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_Education'))

WebUI.waitForPageLoad(5)

WebUI.delay(3)

'Clicked Eaducation link , '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Add New_education'))

WebUI.waitForPageLoad(5)

'clicked Add new button \r\nclicked save with out given data , it will display required field name in red color\r\nClick save with given data \r\nit will save the record and auto redirect back to eaducation page  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out given data , it will display required field name in red color\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input__name'), 'Electronic wiring')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description'), 
    'electrical engineering wiring')

'Click save with given data \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect back to eaducation page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_eaducation'), 
    'electronic')

WebUI.waitForPageLoad(5)

'Search using name , it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_electrical engineering wiring_tableActionButton'))

WebUI.waitForPageLoad(5)

'Click Edit Image Link. \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input__name'), 'Electronic wiring edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description'), 
    'electrical engineering wiring edit')

'click save with given required change details \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the edited information and auto redirect to eaducation  page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_eaducation'), 
    'electrical')

WebUI.waitForPageLoad(5)

'Search using Description, it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_electrical engineering wiring edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked Copy Image Link .\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description'), 
    'electrical engineering wiring edit')

WebUI.waitForPageLoad(5)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will save the copied data in new reocrd and auto redirect to eaducation  page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_eaducation'), 
    'electrical')

WebUI.waitForPageLoad(5)

'Search using name , it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_electrical engineering wiring edit_tableActionButton_1'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'Clicked delete image link . it will ask confirmation in pop up \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , record deleted and auto redirect to eaducation page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_eaducation'), 
    'electrical')

WebUI.waitForPageLoad(5)

'Search using name , it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_electrical engineering wiring edit_tableActionButton_2'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'Clicked delete image link . it will ask confirmation in pop up \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , record deleted and auto redirect to eaducation page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name_education'))

'clicked name , it will arrange the records in Assending Order \r\n'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name_education'), FailureHandling.OPTIONAL)

'clicked name again , it will arrange the records in Dessending Order \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description_eaducation'))

'clicked Description  , it will arrange the records in Assending Order \r\n'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description_eaducation'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked description again , it will arrange the records in Dessending Order \r\n'
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_2_eaducation'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_2_eaducation'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked second page using page navigation , it will open second page info \r\n'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_Qualifications Setup'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked qualification setup submenu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_Certifications'))

WebUI.waitForPageLoad(5)

'clicked certification link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Add New_certification'))

WebUI.waitForPageLoad(5)

'clicked Add new button \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out given data , it will display required field name in red color\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input__name'), 'Building Wiring')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description'), 
    'EEE')

'Click save with given data \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect back to Certification page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_certification'), 
    'eee')

WebUI.waitForPageLoad(5)

'Search using description, it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_EEE_tableActionButton'))

WebUI.waitForPageLoad(5)

'Click Edit Image Link. \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input__name'), 'Building Wiring edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description'), 
    'EEE edit')

'click save with given required change details \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the edited information and auto redirect to Certification page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_certification'), 
    'building')

WebUI.waitForPageLoad(5)

'Search using name it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_EEE edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked Copy Image Link .\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will save the copied data in new reocrd and auto redirect to Certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_certification'), 
    'eee')

WebUI.waitForPageLoad(5)

'Search using description, it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_EEE edit_tableActionButton_1'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'Clicked delete image link . it will ask confirmation in pop up \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , record deleted and auto redirect to Certification page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_certification'), 
    'eee')

WebUI.waitForPageLoad(5)

'Search using description, it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_EEE edit_tableActionButton_2'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'Clicked delete image link . it will ask confirmation in pop up \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , record deleted and auto redirect to Certification page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name_Certification'))

'clicked name , it will arrange the records in Assending Order \r\n'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name_Certification'), FailureHandling.OPTIONAL)

'clicked name again , it will arrange the records in Dessending Order \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description_Certification'), FailureHandling.OPTIONAL)

'clicked Description  , it will arrange the records in Assending Order \r\n'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description_Certification'), 
    5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description_Certification'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked description again , it will arrange the records in Dessending Order \r\n'
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_2_Certification'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_2_Certification'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked second page using page navigation , it will open second page info \r\n'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_Qualifications Setup'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked qualification setup submenu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_Languages'))

WebUI.waitForPageLoad(5)

'Clicked Laguage Link'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Add New_Languages'))

WebUI.waitForPageLoad(5)

'clicked Add new button \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save with out given data , it will display required field name in red color\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input__name__Language'), 'Mandarian')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description__Language'), 'Chinese1')

'Click save with given data \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect back to eaducation page  '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_Languages'), 
    'Chinese1')

WebUI.waitForPageLoad(5)

'Search using description, it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_Chinese1_tableActionButton'))

WebUI.waitForPageLoad(5)

'Click Edit Image Link. \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input__name__Language'), 'Mandarian edit')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/textarea__description__Language'), 'Chinese1 edit')

'click save with given required change details \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the edited information and auto redirect to Language page \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_Languages'), 
    'mandarian')

WebUI.waitForPageLoad(5)

'Search using name , it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_Chinese1 edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked Copy Image Link .\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will save the copied data in new reocrd and auto redirect to Language page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_Languages'), 
    'mandarian')

WebUI.waitForPageLoad(5)

'Search using name, it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_Chinese1 edit_tableActionButton_1'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

'clicked delete button for confirmation , record deleted and auto redirect to skirlls page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , record deleted and auto redirect to skirlls page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/input_records per page_form-control_Languages'), 
    'mandarian')

WebUI.waitForPageLoad(5)

'Search using name,it will display the available matced records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/img_Chinese1 edit_tableActionButton_2'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(0)

'Clicked delete image link . it will ask confirmation in pop up \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , record deleted and auto redirect to skirlls page '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name_Language'), 5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name_Language'))

'clicked name , it will arrange the records in Assending Order \r\n'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Name_Language'), FailureHandling.OPTIONAL)

'clicked name again , it will arrange the records in Dessending Order \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description_Language'))

'clicked Description  , it will arrange the records in Assending Order \r\n'
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/th_Description_Language'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked description again , it will arrange the records in Dessending Order \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_3_Language'))

WebUI.waitForPageLoad(5)

'clicked second page using page navigation , it will open second page info \r\n'
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_Dashboard'))

WebUI.waitForPageLoad(5)

'Clicked dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_Qualification_Setup_OR/a_admin'))

WebUI.waitForPageLoad(5)

'clicked logged in user name , it will show sigout opction '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php', FailureHandling.OPTIONAL)

