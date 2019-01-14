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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/')

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/button_Sign In'))

'Pasti Admin Dash Board'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/a_Vehicle Management'))

'Click Vehicle management menu '
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/a_Vehicle Maintenance'))

'vehicle maintenance page (Click Vehicle maintenance sub menu)  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/a_3'))

'selected third page in pagination '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/select_102550100'), 
    '50', true)

'selected list of vehicles per page from 10 to 50 from drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_Download Report_form-con'), 
    'qatest')

'search for required vehicle '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/a_Edit'))

'vehicle maintenance page ( click edit for required vehicle ) '
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/img'))

not_run: WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/a_QATEST_20181005.gz'))

'selected download hardware error '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/a_QATEST_20181005.gz_1'))

'selected download error log '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/select_NO                     _1'), 
    '1', true)

'selected error upload drop down to yes '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/select_NO                     _2'), 
    '0', true)

'selected Restart car PC drop down to NO'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/select_NO'), 
    '1', true)

'selected Back Log drop down to NO '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/select_NO                     _3'), 
    '0', true)

'selected Hardware error Log upload drop down to yes '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_From_from'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_From_from'), 
    '21-10-2018')

'given file upload date from value'
WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_To_to'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_To_to'), 
    '22-10-2018')

'given file upload date to value'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_App Error_fileUpload'))

'click check box of App error '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_Hardware Error_fileUploa'))

'click check box of Hardware error '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_App Event_fileUpload'))

'click check box of App event'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_Hardware Event_fileUploa'))

'click check box of Hardware event'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/button_Update'))

'click Update button ( successfully updated ) '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_Download Report_form-con'), 
    'qatest')

'search for require vehicle for delete log file '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/a_Edit'))

'vehicle  maintenance page '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_From_fdFrom'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_From_fdFrom'), 
    '18-10-2018')

'given file Delete from date value'
WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_To_fdTo'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/input_To_fdTo'), 
    '19-10-2018')

'given file Delete to date value'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_App Error_fileDelete'))

'click check box of App error'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_Hardware Error_fileDelet'))

'click check box of Hardware error'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_App Event_fileDelete'))

'click check box of App event'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_Hardware Event_fileDelet'))

'click check box of Hardware event'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/button_Update'))

'click Update button ( successfully updated ) '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MyEG/a_Vehicle Maintenance'))

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/input_Download Report_form-con'), 
    'qatest')

'search for required vehicle to verify the update'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/a_Edit'))

'vehicle maintenance page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OR/Pasti_Admin_VM_Vehicle_Maintanence_OB/Page_PASTI by MYEG/a_Logout'))

'Logout from admin '
WebUI.takeScreenshot()

WebUI.closeBrowser()

