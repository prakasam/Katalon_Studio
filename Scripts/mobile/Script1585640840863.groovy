import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('D:\\Today\\Pasti\\APK files\\PASTI_v1.6.7_apkpure.com.apk', true)

Mobile.setText(findTestObject('Pasti/Pasti_Mobile/android.widget.EditText0 - Username'), '505639-K', 0)

Mobile.setText(findTestObject('Pasti/Pasti_Mobile/android.widget.EditText0 - Password'), '12345678', 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.Button0 - LOGIN'), 0)

Mobile.setText(findTestObject('Pasti/Pasti_Mobile/android.widget.EditText0 - e.g 0123456789'), '01111719799', 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.Button0 - DONE'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageView0 (1)'), 0)

Mobile.setText(findTestObject('Pasti/Pasti_Mobile/android.widget.EditText0'), 'qatest', 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.RelativeLayout0'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.CheckedTextView0 - 30 Days ago'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.LinearLayout0'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.RelativeLayout0 (1)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.RelativeLayout0'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.CheckedTextView0 - 30 Days ago'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.LinearLayout0 (1)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.RelativeLayout0 (2)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.RelativeLayout0'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.CheckedTextView0 - 30 Days ago'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.LinearLayout0 (2)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - GPS Coord 03 08.78169N101 37.09569E'), 0)

Mobile.tapAndHold(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - GPS Coord 03 08.78169N101 37.09569E'), 0, 
    0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.CheckedTextView0 - Map'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - Notification'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageButton0 (2)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.RelativeLayout0 (3)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - Today (1)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.CheckedTextView0 - 30 Days ago (1)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.LinearLayout0 (3)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - Refresh'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Pasti/Pasti_Mobile/android.widget.TextView0 - Logout'), 0)

Mobile.closeApplication()

