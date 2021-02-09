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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.automationtesting.in/Register.html')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7'), 
    'Htoo')

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7_1'), 
    'Eaindra')

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/textarea_Address_form-control ng-untouched _b1abf7'), 
    'Mandalay')

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Email address_form-control ng-untouch_b58296'), 
    'htooeaindralin1@gmail.com')

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Phone_form-control ng-untouched ng-in_c98163'), 
    '09797395140')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_FeMale_radiooptions'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Hobbies_checkbox1'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Cricket_checkbox2'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/div_Languages_msdd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/select_Select Skills                       _fcf818'), 
    'Certifications', true)

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/select_Select Country                      _cc64b6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/select_Select Country                      _cc64b6'), 
    'Bahrain', true)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('AutomationDemoSite/DemoSites/testing/Page_Register/span_Select Country _select2-selection select2-selection--single'))

WebUI.click(findTestObject('AutomationDemoSite/testing/Page_Register/li_Bangladesh'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/select_year                             191_0e56cb'), 
    '1931', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/select_Month                               _920c21'), 
    'August', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/select_Day                                 _6d848d'), 
    '18', true)

WebUI.setEncryptedText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Password_firstpassword'), 
    'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Confirm Password_secondpassword'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/button_Submit'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Phone_form-control ng-untouched ng-in_c98163'), 
    '0997395140')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/button_Submit'))

WebUI.setEncryptedText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Password_firstpassword'), 
    'KxqY27UmbQ36/NumK5aydw==')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/div_Confirm Password                       _96038b'))

WebUI.setEncryptedText(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Confirm Password_secondpassword'), 
    'KxqY27UmbQ36/NumK5aydw==')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/button_Submit'))

WebUI.uploadFile(findTestObject('Object Repository/AutomationDemoSite/DemoSites/Page_Register/input_Photo_imagesrc'), 'D:\\Users\\Dell\\Pictures\\photo\\20190203_1301\\IMG_20160404_125716.jpg')

