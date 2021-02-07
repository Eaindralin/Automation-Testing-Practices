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

WebUI.navigateToUrl('https://testpages.herokuapp.com/styled/canvas-javascript-test.html')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/input_X_xnum'), 
    '10')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/input_Y_ynum'), 
    '60')

WebUI.setText(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/input_Size_shapesize'), 
    '10')

WebUI.rightClick(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/select_Black                    Red        _e82681'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/select_Black                    Red        _e82681'), 
    '#FF0000', true)

WebUI.rightClick(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/select_Circle                    Square'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/select_Circle                    Square'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/input_Shape_gobutton'))

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/input_Shape_clearbutton'))

WebUI.rightClick(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/select_Black                    Red        _e82681'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/select_Black                    Red        _e82681'), 
    '#0000FF', true)

WebUI.click(findTestObject('Object Repository/TestPagesforAutomation/CanvasJavaScript/Page_Javascript Canvas Example/input_Shape_gobutton'))

