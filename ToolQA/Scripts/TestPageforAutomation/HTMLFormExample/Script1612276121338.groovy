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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testpages.herokuapp.com/styled/index.html')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_Selenium Test Pages/a_iFrames Test Page'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_iFrames Example/a_Index'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_Selenium Test Pages/a_HTML Form Example'))

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/input_Username_username'), 
    'Htoo Eaindra Lin')

WebUI.setEncryptedText(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/input_Password_password'), 
    'KxqY27UmbQ36/NumK5aydw==')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/textarea_Comments'), 
    'Comments...I love testing')

WebUI.uploadFile(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/input_Filename_filename'), 
    'D:\\Users\\Dell\\Pictures\\New folder\\img_girl.jpg')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/input_Checkbox Items Checkbox 1Checkbox 2Ch_0b30c2'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/input_Checkbox Items Checkbox 1Checkbox 2Ch_0b30c2'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/input_Radio Items radio 1radio 2radio 3_radioval'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/select_Selection Item 1                    _75e27b'), 
    'ms2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/select_Selection Item 1                    _75e27b'), 
    'ms2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/select_Selection Item 1                    _75e27b'), 
    'ms3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/select_Selection Item 1                    _75e27b'), 
    'ms3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/select_Drop Down Item 1                    _c39d8e'), 
    'dd2', true)

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_HTML Form Elements/input_Dropdown_submitbutton'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/FormTestExample/Page_Processed Form Details/a_Go back to the form'))

