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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input_Login_username'), '505639-K')

WebUI.setEncryptedText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input_Login_password'), 
    'BR4+6ebIRw/89ruX5hJDag==')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/button_Sign In'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/span_Fleet Management'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/button_Create'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input_Schedule Name_name'), 
    'New Route ', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/button_Create'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/i_Vehicle List_search fa fa-se'))

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input_Add_search-vehicle'), 
    'qates')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/div_QATEST'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/i_Add_close-search fa fa-windo_1'), 
    FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/i_Route List_search fa fa-sear'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input_Add_search-route'), 'lan')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/div_pwtc to Langkawi'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/i_Add_close-search fa fa-windo_2'), 
    FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/i_Driver List_search fa fa-sea'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/input_Add_search-driver'), 'prakas')

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/div_prakasam'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/i_Add_close-search fa fa-windo'), 
    FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/div_Add'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/div_Driver List'))

WebUI.takeScreenshot()

WebUI.refresh()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/button_View list of schedule_d'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_RouteReplay_OB/Page_Pasti by MyEG/div_Hi MYEG Services'))

WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_FleetManagement_OR/Page_Pasti by MyEG/a_Logout'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Pasti/Pasti_Business_User_OB/Pasti_RouteReplay_OB/Page_Pasti by MyEG/div_Hi'))

not_run: WebUI.navigateToUrl('https://pasti.myeg.com.my/auth/logout')

WebUI.closeBrowser()

