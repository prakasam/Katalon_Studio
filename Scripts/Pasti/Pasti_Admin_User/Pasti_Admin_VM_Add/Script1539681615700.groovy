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

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Sign In_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/input_Sign In_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Vehicle Management'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MyEG/a_Vehicle List'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Add New Vehicle'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_ChooseAB Express Sdn. B'), 
    '505639-K', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Reg No _vehicle_id'), 
    'a')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    'b')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Bus'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    'c')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Model _model'), 
    'd')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    'e')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Capacity _capacity'), 
    '5')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    'f')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    'g')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Please Select Year19801'), 
    '2011', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Vehicle Supervis'), 
    '236', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    'h')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Maxis'), 
    'Maxis', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_SIM Serial _simSerial'), 
    'i')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Modem IMEI _modemImei'), 
    'j')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Express'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Total Mileage _total_mil'), 
    '100')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose To be Installed'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose Vehicle Supervis_1'), 
    '245', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Reg No _vehicle_id'), 
    'aplus-1')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    '#@(%*%')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    'sck cvedf')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Code _code'), 
    'sck cvedf 2435')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Active'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    '*@#%*(@^#*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    'vdvdfdfg')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    'protan')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Model _model'), 
    '(*#@%%6')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Model _model'), 
    'inspira')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    '*&%*#(#(^')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Color _color'), 
    'white')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    '(#@*^$*#@%')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    'nionfcjsn-')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Engine No. _engineNo'), 
    'Engine-34653489-7954')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    '&@%$*()(&*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    'chasis')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Chassis No. _chassisNo'), 
    'chasis-5248629-28367')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/img'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    '%$#$&*^(*')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    'car -sear-no : 83904598')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_CarPC Serial Number _car'), 
    'car -sear-no 83904598')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_SIM Serial _simSerial'), 
    '@%$#^*^*@(&*)')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_SIM Serial _simSerial'), 
    'Sim No -72893653289')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Modem IMEI _modemImei'), 
    '(*^@%)&(*(')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Modem IMEI _modemImei'), 
    'Modem-8934436')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/img'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose To be Installed'), 
    'Choose', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Manufacturer _manufactur'), 
    'protan')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Policy No_policy_no'), 
    '*$@&^$&@^$*(')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/select_Choose To be Installed'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Register'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_All vehicles_form-contro'), 
    'aplus')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/a_Edit_1'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Update'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_Policy No_policy_no_14'), 
    'nsvdjhv56876')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Update'))

WebUI.setText(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/input_All vehicles_form-contro'), 
    'aplus')

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/a_Delete'))

WebUI.click(findTestObject('Object Repository/Pasti/Pasti_Admin_OB/Pasti_Admin_VM_Add/Page_PASTI by MYEG/button_Confirm'))

