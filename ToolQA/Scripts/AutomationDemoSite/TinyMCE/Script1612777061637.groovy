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

WebUI.navigateToUrl('http://demo.automationtesting.in/TinyMCE.html')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/button_'))

WebUI.click(findTestObject('AutomationDemoSite/TimIMC/testing/Page_TinyMCE/p_I love testing'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/button_Format'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/div_BoldCtrlB'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/button_Format'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/span_Italic'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/button_Format'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/span_Underline'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/i_Format_mce-caret'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/div_Strikethrough'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/button_Format'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/span_Superscript'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/i_Format_mce-caret'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/span_Subscript'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/button_Insert'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/span_Insertedit video'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/TimIMC/Page_TinyMCE/span_Ok'))

