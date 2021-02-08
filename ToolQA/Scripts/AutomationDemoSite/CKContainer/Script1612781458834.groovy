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

WebUI.navigateToUrl('http://demo.automationtesting.in/CKEditor.html')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/html_Rich Text Editor, editor1htmlcursortex_676b91'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/p'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/body_html1bodyclasscke_editable cke_editabl_299370'), 
    '<p style="outline: rgb(255, 0, 0) solid 2px;"><br></p><div id="katalon" style="top: 185px;"><div id="katalon-rec_elementInfoDiv" style="display: block;">/html[1]/body[@class="cke_editable cke_editable_themed cke_contents_ltr cke_show_borders"]/p[1]</div></div>')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/p'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/html_Rich Text Editor, editor1htmlcursortex_676b91_1'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/span_'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/span_'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/span_'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/span_Normal_cke_combo_open'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/body_testing'), '<p style=""><s><em><strong>testing</strong></em></s></p><div id="katalon" style="top: 185px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/h1_Heading 1'))

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/span_Styles'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/body_testing'), '<h1 style=""><s><em><strong>testing</strong></em></s></h1><div id="katalon" style="top: 185px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/h2_Italic Title'))

WebUI.setText(findTestObject('Object Repository/AutomationDemoSite/CKEditor/Page_CKEditor/body_testing'), '<h2 style="font-style: italic;"><s><em><strong>testing</strong></em></s></h2><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

