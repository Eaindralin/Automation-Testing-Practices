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

'This test case has error.'
WebUI.navigateToUrl('https://testpages.herokuapp.com/styled/basic-javascript-validation-test.html')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/Basic_JavaScript_Val/Page_Test Page For Basic JavaScript Validat_671058/input_Values Less Than 30 please _value'), 
    '11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111222222222222222222222222222222222222222222222222222222222')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/Basic_JavaScript_Val/Page_Test Page For Basic JavaScript Validat_671058/input_Values Less Than 30 please _submitbutton'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/Basic_JavaScript_Val/Page_Processed Form Details/a_Go back to the form'))

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/Basic_JavaScript_Val/Page_Test Page For Basic JavaScript Validat_671058/input_Values Less Than 30 please _value'), 
    '123')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/Basic_JavaScript_Val/Page_Test Page For Basic JavaScript Validat_671058/input_Values Less Than 30 please _submitbutton'))

