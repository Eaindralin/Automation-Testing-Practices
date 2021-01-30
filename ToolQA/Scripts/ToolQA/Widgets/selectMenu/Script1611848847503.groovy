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

WebUI.navigateToUrl('https://demoqa.com/select-menu')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/svg_Select Option_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/div_Group 1, option 1'))

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/svg_Select Title_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/div_Mr'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/div_ option Blue focused, 2 of 4. 4 results_1ab9c2'))

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/div_Green'))

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/div_Black'))

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/div_Red'))

WebUI.click(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/div_Standard multi selectVolvoSaabOpelAudi'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/select_VolvoSaabOpelAudi'), 
    'saab', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/select_VolvoSaabOpelAudi'), 
    'opel', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/select_VolvoSaabOpelAudi'), 
    'opel', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/select_VolvoSaabOpelAudi'), 
    'audi', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ToolQA/Element/SelectMenu/Page_ToolsQA/select_VolvoSaabOpelAudi'), 
    'audi', true)

