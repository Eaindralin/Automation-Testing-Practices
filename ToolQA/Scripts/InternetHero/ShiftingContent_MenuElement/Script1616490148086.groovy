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

WebUI.navigateToUrl('http://the-internet.herokuapp.com/shifting_content')

WebUI.click(findTestObject('Object Repository/TheInternet/ShiftingContent_MenuContent/Page_The Internet/a_Example 1 Menu Element'))

WebUI.click(findTestObject('Object Repository/TheInternet/ShiftingContent_MenuContent/Page_The Internet/a_About'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/TheInternet/ShiftingContent_MenuContent/Page_The Internet/a_Contact Us'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/TheInternet/ShiftingContent_MenuContent/Page_The Internet/a_Portfolio'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/TheInternet/ShiftingContent_MenuContent/Page_The Internet/a_Gallery'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/TheInternet/ShiftingContent_MenuContent/Page_The Internet/a_Home'))

