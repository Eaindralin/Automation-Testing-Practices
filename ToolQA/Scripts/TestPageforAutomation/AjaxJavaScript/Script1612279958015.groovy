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

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/AjaxJavaScript/Page_Selenium Test Pages/a_Ajax JavaScript Examples'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/AjaxJavaScript/Page_Test Page For Basic Ajax Example/select_Web                    Desktop      _ff931d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/AjaxJavaScript/Page_Test Page For Basic Ajax Example/select_Web                    Desktop      _ff931d'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/AjaxJavaScript/Page_Test Page For Basic Ajax Example/select_CAssemblerCVisual Basic'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/AjaxJavaScript/Page_Test Page For Basic Ajax Example/select_CAssemblerCVisual Basic'), 
    '12', true)

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/AjaxJavaScript/Page_Test Page For Basic Ajax Example/input_Language_submitbutton'))

