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

WebUI.navigateToUrl('https://testpages.herokuapp.com/styled/validation/input-validation.html')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/input_First name_firstname'), 
    'Htoo')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/input_Last name_surname'), 
    'Eaindra')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/input_Age_age'), 
    '18')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/select_Afghanistan                Albania  _4d3b55'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/select_Afghanistan                Albania  _4d3b55'), 
    'Barbados', true)

WebUI.scrollToPosition(8888888, 8888888)

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/textarea_Notes_notes'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/input'))

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/input_Last name_surname'), 
    'Eaindra Lin')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation/input'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/InputValidationExample/Page_Input Validation Page/a_Back to Input Form'))

