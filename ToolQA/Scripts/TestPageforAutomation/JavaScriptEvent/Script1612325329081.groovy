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

WebUI.navigateToUrl('https://testpages.herokuapp.com/styled/events/javascript-events.html')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnBlur'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnBlur'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/div_function triggeredEvent(thang)         _720937'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnClick'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnContextMenu'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnContextMenu'))

WebUI.doubleClick(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnDoubleClick'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnContextMenu'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/div_function triggeredEvent(thang)         _720937_1'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnContextMenu'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnContextMenu'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnFocus'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnKeyDown'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnKeyUp'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/button_OnKeyPress'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/JavaScriptEvent/Page_JavaScript Events/html_JavaScript Events        katalonfont-f_766822'))

