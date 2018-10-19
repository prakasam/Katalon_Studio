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

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/button_Sign In'))

'Pasti Admin Dash Board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Vehicle Management'))

'Clicked Vehicle Management menu'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Vehicle List'))

'Vehicle Management page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Add New Vehicle'))

'Selected Add new Vehicle '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'with out given values clicked register button '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_ChooseAB Express Sdn. B'), 
    '505639-K', true)

'Click register with selected company name from drop down '
WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Reg No _vehicle_id'), 
    'a')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Reg No as single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    'b')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Code No as single character '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Bus'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with choosen vehicle type from drop down'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    'c')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Manufacturer as single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Model _model'), 
    'd')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Model as single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    'e')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Color as single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Capacity _capacity'), 
    '5')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Capcity as single Numaric \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    'f')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Engine No as single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    'g')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Chassis No as single character '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Please Select Year19801'), 
    '2011', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with choosen Manufacturing year from drop down'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Vehicle Supervis'), 
    '236', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with choosen Supervisor 1 from drop down'
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Vehicle Supervis_1'), 
    '245', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with choosen Supervisor 2 from drop down'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    'h')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given car serial no as single character '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Maxis'), 
    'Maxis', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with choosen Telco Provider from drop down'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_SIM Serial _simSerial'), 
    'i')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Sim Serial no as single character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Modem IMEI _modemImei'), 
    'j')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given IMEI no as single character '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Express'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with choosen vehicle Category from drop down'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Total Mileage _total_mil'), 
    '100')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Toatal Mileage as numbers '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose To be Installed'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with choosen vehicle Status from drop down'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Reg No _vehicle_id'), 
    '$%#^*@%%@()')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle No as special character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Reg No _vehicle_id'), 
    'aplus-1')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle No as Valid '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    '#@(%*%')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Code No as special character '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    'sck cvedf')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Code No as Character only '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    'sck cvedf 2435')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Code No as special character '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Active'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with choosen vehicle Active status from drop down '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    '*@#%*(@^#*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Manufacturer No as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    'vdvdfdfg 234525')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Manufacturer No as alphanumaric '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    'protan')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Manufacturer No as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Model _model'), 
    '(*#@%%6')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Model as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Model _model'), 
    'inspira')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Model as Valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    '*&%*#(#(^')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Color as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Color as Numbers '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    'white')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given vehicle Color as valid'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    '(#@*^$*#@%')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Engine No as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    'nionfcjsn-')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Engine No as Character only \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    'Engine-34653489-7954')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Engine No as valid \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    '&@%$*()(&*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Chassis No as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    'chasis')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Chassis No as Character only \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    'chasis-5248629-28367')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Chassis No as valid'
WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/img'))

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

not_run: WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    '%$#$&*^(*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Car Pc Serial No as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    'car -sear-no')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Car Pc Serial No as Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    'car -sear-no 83904598')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Car Pc Serial No as Valid\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_SIM Serial _simSerial'), 
    '@%$#^*^*@(&*)')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Sim Serial No as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_SIM Serial _simSerial'), 
    'Sim No -72893653289')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Sim Serial No as valid \r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Modem IMEI _modemImei'), 
    '(*^@%)&(*(')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Modem Imei  No as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Modem IMEI _modemImei'), 
    'IMEI No -856927823895')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Modem Imei  No as valid\r\n'
WebUI.takeScreenshot()

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Reg No _vehicle_id'), 
    'aplus-1')

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    'sck cvedf 2435')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Bus'), 
    '5', true)

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    'protan')

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Model _model'), 
    'inspira')

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    'white')

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Capacity _capacity'), 
    '5')

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    'Engine-34653489-7954')

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    'chasis-5248629-28367')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Please Select Year19801'), 
    '2011', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Vehicle Supervis'), 
    '236', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Vehicle Supervis_1'), 
    '245', true)

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    'car -sear-no 83904598')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Maxis'), 
    'Maxis', true)

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_SIM Serial _simSerial'), 
    'Sim No -72893653289')

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Modem IMEI _modemImei'), 
    'Modem-8934436')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose To be Installed'), 
    '1', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Express'), 
    '6', true)

not_run: WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Total Mileage _total_mil'), 
    '100')

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/img'))

not_run: WebUI.switchToWindowTitle('DateTime Picker')

not_run: WebUI.takeScreenshot()

not_run: WebUI.closeWindowTitle('DateTime Picker')

not_run: WebUI.switchToWindowTitle('PASTI by MyEG')

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Vehicle Registration Dat'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Vehicle Registration Dat'), 
    '1-9-2018')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Vehicle Registration Date '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Policy No_policy_no'), 
    '*$@&^$&@^$*(')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'Click register with Given Policy  No as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Policy No_policy_no'), 'nsvdjhv56876')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/button_Register'))

'Click register with Given Policy  No as valid\r\n'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_BD PIC_bd_pic'), '#$@%&^#%@&*$(*^089')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/button_Register'))

'Click register with Given Business Users Person In Caharge as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_BD PIC_bd_pic'), 'Business development Person In charge ')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/button_Register'))

'Click register with Given Business Users Person In Caharge as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Operations PIC_operation'), 
    '*$@&%$*@$^&@(*)')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/button_Register'))

'Click register with Given Operations Users Person In Caharge as Special  Character'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Operations PIC_operation'), 
    'Peration person in charge ')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/button_Register'))

'Click register with Given Operations Users Person In Caharge as Valid '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Remarks_remarks'), 'new vehicle adding ')

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/button_Register'))

'Click register with Given Remark as Valid '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Date Of Policy Issue_pol'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Date Of Policy Issue_pol'), 
    '1-10-2018')

'Click register with Given Date of Policy Issue '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Policy Expiry_policy_exp'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Policy Expiry_policy_exp'), 
    '31-10-2019')

'Click register with Given Policy Expiry date '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Date Of Subscription_sub'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Date Of Subscription_sub'), 
    '2-10-2018')

'Click register with Given Date of Subscription '
WebUI.takeScreenshot()

WebUI.focus(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Installation Date_instal'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Installation Date_instal'), 
    '2-10-2018')

'Click register with Given Instalation Date '
WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose To be Installed'), 
    '1', true)

'Given All Required Details as Valid '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

'new vehicle successfully created .'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Vehicle List'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_All vehicles_form-contro'), 
    'aplus')

'seach for vehicle from list to choose edit '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Edit'))

'vehicle edit page \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Update'))

'Successfully Updated vehicle '
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Vehicle List'))

WebUI.waitForElementNotPresent(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_All vehicles_form-contro'), 
    5)

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_All vehicles_form-contro'), 
    'aplus')

'seach for vehicle from list to choose delete '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Delete'))

'Delete confirmation page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Confirm'))

'Successfully Deleted Vehicle'
WebUI.takeScreenshot()

WebUI.navigateToUrl('http://uat5.myeg.com.my/pasti/logout.php')

'Logout from admin User '
WebUI.takeScreenshot()

WebUI.closeBrowser()

