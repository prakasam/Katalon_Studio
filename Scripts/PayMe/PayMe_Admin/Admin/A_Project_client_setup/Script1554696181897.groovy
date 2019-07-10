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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/login.php')

'Payme Sign in Page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_Remember me_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_Remember me_password'), 
    'RAIVpflpDOg=')

'Click Sign In with given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Sign in'))

WebUI.waitForPageLoad(5)

'it will display dash board '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_ProjectsClient Setup'))

WebUI.waitForPageLoad(5)

'clicked Project client setup '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Add New'))

WebUI.waitForPageLoad(5)

'clicked add new button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input__name'), 'D-Link ')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/textarea_Details_details'), 
    'network cable and routers ')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/textarea_Address_address'), 
    'KL')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_Contact Number_contact_number'), 
    '0123456789')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_Contact Email_contact_email'), 
    'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_Company Url_company_url'), 
    'https://www.dlink.com.my/')

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/i_First Contact Date_fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/span_2019'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/span_Mar'))

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/td_1'))

'click save with given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and auto redirect to client page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control'), 
    'link')

WebUI.waitForPageLoad(5)

'Search Using name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_KL_tableActionButton'))

WebUI.waitForPageLoad(5)

'Clicked Copy image link , it will copy data and open in page to save '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will save the record .'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control'), 
    'link')

WebUI.waitForPageLoad(5)

'Search Using name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_KL_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open in page to edit '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input__name'), 'D-Link  edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/textarea_Details_details'), 
    'network cable and routers edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/textarea_Address_address'), 
    'KL edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_Contact Number_contact_number'), 
    '01234567899')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_Contact Email_contact_email'), 
    'testedit@gmail.com')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_Company Url_company_url'), 
    'https://www.dlink.com.my/contact-us-my/')

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_First Contact Date_first_contact_date'), 
    '2019-04-01')

WebUI.waitForPageLoad(5)

'click save with given changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the record and auto redirect to client page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control'), 
    'link')

WebUI.waitForPageLoad(5)

'Search Using name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_KL edit_tableActionButton'))

WebUI.waitForPageLoad(5)

'click delete image link , it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , it will delete record and auto redirect to client page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control'), 
    'link')

WebUI.waitForPageLoad(5)

'Search Using name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_KL_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'click delete image link , it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , it will delete record and auto redirect to client page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control'), 
    'PDX')

WebUI.waitForPageLoad(5)

'Search Using Name ,it will display matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control'), 
    'management')

WebUI.waitForPageLoad(5)

'Search Using Details, it will display matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control'), 
    'address99')

WebUI.waitForPageLoad(5)

'Search Using Address , it will display matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control'), 
    '03776868')

WebUI.waitForPageLoad(5)

'Search Using mobile no, it will display matched records '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Name'))

'clicked name in table , it will change recods in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Name'))

'clicked name in table , it will change recods in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Details'))

'clicked Details in table , it will change recods in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Details'))

'clicked Details in table , it will change recods in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Address'))

'clicked Address in table , it will change recods in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Address'))

'clicked Address in table , it will change recods in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Contact Number'))

'clicked Contact number in table , it will change recods in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Contact Number'))

WebUI.waitForPageLoad(5)

'clicked Contact number in table , it will change recods in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_2'))

WebUI.waitForPageLoad(5)

'clicked second page using pagination opctions '
WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_ProjectsClient Setup'))

WebUI.waitForPageLoad(5)

'clicked client or project setup sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_Projects'))

WebUI.waitForPageLoad(5)

'clicked project link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Add New_project'))

WebUI.waitForPageLoad(5)

'clicked add new button '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input__name'), 'TNB Online')

WebUI.sendKeys(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input__name'), Keys.chord(Keys.TAB, Keys.ENTER, 
        'PDX', Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/textarea_Details_details'), 
    ' pay your bill online, anytime, anywhere.')

'click save with given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the records and auto redirect to project page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control_project'), 
    'tnb')

WebUI.waitForPageLoad(5)

'Search Using Name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_PDX ASE - Application Lifecycle_tableActionButton'))

WebUI.waitForPageLoad(5)

'clicked copy image link , it will open the copy date in new page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save button , it will save data and auto redirect to project page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control_project'), 
    'tnb')

WebUI.waitForPageLoad(5)

'Search Using Name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_PDX ASE - Application Lifecycle_tableActionButton_1'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open the details to edit '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input__name'), 'TNB\'s online edit')

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/textarea_Details_details'), 
    ' pay your bill online, anytime, anywhere. edit')

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it save the data and auto redirect to project page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control_project'), 
    'tnb')

WebUI.waitForPageLoad(5)

'Search Using Name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_PDX ASE - Application Lifecycle_tableActionButton_2'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , it will delete record and auto redirect to client page \r\n'
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete image link , it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control_project'), 
    'tnb')

WebUI.waitForPageLoad(5)

'Search Using Name , it will display matched records '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_PDX ASE - Application Lifecycle_tableActionButton_3'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation , it will delete record and auto redirect to client page \r\n'
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'click delete image link , it will ask confirmation in pop up '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control_project'), 
    'barometric')

WebUI.waitForPageLoad(5)

'Search Using Client , it will display matched records '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control_project'), 
    'no data ')

WebUI.waitForPageLoad(5)

'Search Using Client , it will display result " No matching records found"  '
WebUI.takeScreenshot()

WebUI.doubleClick(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_Projects'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Name_project - Copy'))

'clicked Name in table , it will change recods in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Name_project - Copy'))

'clicked Name in table , it will change recods in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Client'))

'clicked Client in table , it will change recods in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Client'))

'clicked client in table , it will change recods in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_2_project - Copy'))

WebUI.waitForPageLoad(5)

'clicked page two using page navigation opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_ProjectsClient Setup'))

WebUI.waitForPageLoad(5)

'clicked client or project seetup sub menu '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_Employee Projects'))

WebUI.waitForPageLoad(5)

'clicked employ link '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Add New_employee'))

WebUI.waitForPageLoad(5)

'clicked add new button, it will open add new page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/textarea_Details_details'), 
    'Online ')

'click save with given details '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and auto redirect to project page '
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/input_records per page_form-control_employee'), 
    'PDX')

WebUI.waitForPageLoad(5)

'search using employ / project , it will disply the match records '
WebUI.takeScreenshot()

WebUI.doubleClick(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_Employee Projects'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Filter'))

WebUI.waitForPageLoad(5)

'clicked filter button , it will open in pop up to filter '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Filter_1'))

WebUI.waitForPageLoad(5)

'clicked filter confirmation , it will display the filtered result based on the selected employ '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_PDX HP ASE - Application_tableActionButton_employe_Copy'))

WebUI.waitForPageLoad(5)

'click copy image link , it will open the coppied details in page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'clicked save , it will display message " Employee already added to this project" '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Ok - Copy'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked ok confirmation button '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Cancel'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.refresh()

WebUI.doubleClick(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_Employee Projects'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Filter'))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Filter_1'))

WebUI.waitForPageLoad(5)

WebUI.waitForPageLoad(5)

'clicked Cancel button , it will reverted back to project page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_PDX HP ASE - Application_tableActionButton_employe_edit'))

WebUI.waitForPageLoad(5)

'clicked edit image link , it will open details in page'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/textarea_Details_details_project'), 'Online edit  ', 
    FailureHandling.OPTIONAL)

'click save with given required changes '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Save'))

WebUI.waitForPageLoad(5)

'it will save the details and redirect to filtered page '
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/img_PDX HP ASE - Application_tableActionButton_employe_Delete'))

WebUI.waitForPageLoad(5)

'click delete image link , it wwill open confirmation message in pop up '
WebUI.takeScreenshot()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/button_Delete'))

WebUI.waitForPageLoad(5)

'clicked delete button for confirmation, it will delete record and redirect to project page '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_ProjectsClient Setup'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_Employee Projects'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Employee'))

'clicked Employ in table , it will change recods in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Employee'))

'clicked Employ in table , it will change recods in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Project'))

'clicked Project in table , it will change recods in Assending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/th_Project'))

'clicked Project in table , it will change recods in Dessending order'
WebUI.takeScreenshot()

WebUI.click(findTestObject('PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_2_employee - Copy'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'clicked page two using navigation opctions '
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/PayMe_OR/PayMe_Admin_OR/A_project_client_OR/a_admin'))

WebUI.waitForPageLoad(5)

'clicked addmin to view sign out opction '
WebUI.takeScreenshot()

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://payme-uat.myegdev.com/app/logout.php', FailureHandling.OPTIONAL)

