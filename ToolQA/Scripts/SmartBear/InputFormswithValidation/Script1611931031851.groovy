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

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/input-form-demo.html')

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/input_First Name_first_name'), 
    'Htoo')

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/input_Last Name_last_name'), 
    'Eaindra')

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/input_E-Mail_email'), 
    'htooeaindra1@gmail.com')

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/input_Phone _phone'), 
    '09-709876543')

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/input_Address_address'), 
    'No,2 thazin road')

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/input_City_city'), 
    'yangon')

WebUI.selectOptionByValue(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/select_Please select your state            _1e1704'), 
    'Iowa', true)

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/input_Zip Code_zip'), 
    '95')

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/input_Website or domain name_website'), 
    'seleniumeasy')

WebUI.click(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/label_No'))

WebUI.setText(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/textarea_Project Description_comment'), 
    'I love testing.')

WebUI.click(findTestObject('Object Repository/SmartBear/InputForm_Validation/Page_Selenium Easy - Input Form Demo with V_de6743/button_Send'))

