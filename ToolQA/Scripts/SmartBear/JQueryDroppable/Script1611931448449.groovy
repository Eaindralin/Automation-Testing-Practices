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

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/span_Select Country _select2-selection sele_4ca78e'))

WebUI.click(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/li_Bangladesh'))

WebUI.click(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/input_Select State _select2-search__field'))

WebUI.setText(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/input_Select State _select2-search__field'), 
    'a')

WebUI.click(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/li_Arizona'))

WebUI.scrollToPosition(999999, 999999)

WebUI.click(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/span_American Samoa'))

WebUI.click(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/li_Northern Mariana Islands'))

WebUI.click(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/select_PythonPHPRuby        CJava.Net    Un_7a02d6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SmartBear/DropDown_Select/Page_Selenium Easy - JQuery Select and Mult_2005c1/select_PythonPHPRuby        CJava.Net    Un_7a02d6'), 
    'jqueryui', true)

