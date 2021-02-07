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

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Test Pages/a_Calculator'))

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/input_Simple Calculator_number1'), 
    '2')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/input_Simple Calculator_number2'), 
    '1')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/input_Simple Calculator_calculate'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/select_plustimesminusdivide'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/select_plustimesminusdivide'), 
    'times', true)

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/select_plustimesminusdivide'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/select_plustimesminusdivide'), 
    'minus', true)

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/input_Simple Calculator_calculate'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/input_Simple Calculator_number1'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/select_plustimesminusdivide'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/select_plustimesminusdivide'), 
    'divide', true)

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/SimpleCalculator/Page_Selenium Simplified Calculator/input_Simple Calculator_calculate'))

