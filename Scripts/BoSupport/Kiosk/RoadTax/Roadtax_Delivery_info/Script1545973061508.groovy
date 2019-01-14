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

WebUI.navigateToUrl('https://uat4.myeg.com.my/BOSupport/login.zul')

WebUI.maximizeWindow()

'BO Support Login Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/input_User_j_username'), 
    'prakasam')

WebUI.setEncryptedText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/input_Password_j_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'click submit with given Username and password '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/button_Submit'))

'BO Support DashBoard \r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/button_Kiosk'))

'click Kiosk Main Menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/a_Road Tax'))

'click Roadtax Sub Menu  '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/a_tb_roadtax_delivaryinfo'))

'Select Roadtax Delivery info '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/a_update_delivaryinfo'))

'Delivery info Page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/input_Select the Query_tb_rtxd'))

WebUI.delay(2)

'select combo box to choose the opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/td_GetVehicleInfo'))

WebUI.delay(2)

'selected Get Vehicle info from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/textarea_vehicle_no_tb_vehno'), 
    'noinfo')

'click Go with given Vehicle No '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/button_Go'))

WebUI.delay(2)

'it will display the message " Record not found" '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/button_OK'), FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/input_Select the Query_tb_rtxd'))

WebUI.delay(2)

'select combo box to choose the opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/td_GetVehicleInfo'))

WebUI.delay(2)

'selected Get Vehicle info from opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/textarea_vehicle_no_tb_vehno'), 
    'WYW878')

'click Go with given Vehicle No '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/button_Go'))

WebUI.delay(2)

'it will display the available result '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.click(findTestObject('BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/input_Select the Query_tb_rtxd'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/td_updatestatus'))

WebUI.delay(2)

'Selected Update Status from Opctions '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/textarea_vehicle_no_tb_vehno'), 
    'WYW878')

WebUI.setText(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/input_request_id_tb_reqid'), 
    '2S201812271528016005')

'Click go with given vehicle no and request id '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/button_Go'))

WebUI.delay(2)

'it will display the confirmation message " Record Updated Successfully " '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/BO_Support-OR/Kiosk-OR/Roadtax/Roadtax_Delivery_info-OR/button_LogOut'))

'Logout from Bo Support '
WebUI.takeScreenshot()

WebUI.closeBrowser()

