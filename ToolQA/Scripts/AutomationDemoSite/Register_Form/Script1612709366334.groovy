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

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Full Name_form-control'), 
    'Htoo')

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Full Name_form-control_1'), 
    'Eaindra')

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/textarea_Address_form-control'), 
    ' Mandalay')

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Email address_form-control'), 
    'htooeaindralin123@gmail.com')

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Phone_form-control'), 
    '09-7987653432')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_FeMale_radiooptions'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Hobbies_checkbox1'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Cricket_checkbox2'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/div_Languages_msdd'))

WebUI.doubleClick(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/div_Languages_msdd'))

WebUI.rightClick(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/select_Select Skills'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/select_Month                               _920c21'), 
    'January', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/select_Day                                 _6d848d'), 
    '4', true)

WebUI.setEncryptedText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Password_firstpassword'), 
    'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Confirm Password_secondpassword'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/button_Submit'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Phone_form-control'), 
    '09-79876534')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/button_Submit'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Phone_form-control'), 
    '09-798765341')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/button_Submit'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Phone_form-control'), 
    '09798765341')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/button_Submit'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/input_Phone_form-control'), 
    '0798765341')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/RegisterForm/Page_Register/button_Submit'))

