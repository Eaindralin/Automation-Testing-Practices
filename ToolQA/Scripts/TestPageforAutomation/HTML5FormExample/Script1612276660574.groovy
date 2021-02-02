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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testpages.herokuapp.com/styled/index.html')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_Selenium Test Pages/a_HTML5 Element Form Test Page'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/div_Date'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/div_Colour'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/input_Colour_colour'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/div_Date'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/div_Local date time'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/div_Email'))

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/input_Email_email'), 
    'htooeaindralin1@gmail.com')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/input_Number_number'), 
    '43')

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_HTML5 Form Elements Test Page/input_Number_submitbutton'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/HTML5FormTest/Page_Processed Form Details/a_Go back'))

