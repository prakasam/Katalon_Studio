import com.kms.katalon.core.testdata.InternalData 
InternalData data = findTestData(“data”) 
for (def index : (0..data.getRowNumbers() — 1)) {
 WebUI.openBrowser(‘’) 
WebUI.navigateToUrl(‘http://demoaut.katalon.com/profile.php') 	
WebUI.setText(findTestObject(‘Page_Login/txt_UserName’), data.internallyGetValue(“user_name”, index)) 
WebUI.setText(findTestObject(‘Page_Login/txt_Password’), data.internallyGetValue(“password”, index)) 
WebUI.click(findTestObject(‘Page_Login/btn_Login’)) 
WebUI.verifyElementPresent(findTestObject(‘Page_CuraHomepage/btn_MakeAppointment’), 0) 
WebUI.closeBrowser()}