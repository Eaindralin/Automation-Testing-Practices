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

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('HRMS_Web/ClockIn_1/input_HRMS_username'), 'winthein')

WebUI.setEncryptedText(findTestObject('HRMS_Web/ClockIn_1/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('HRMS_Web/ClockIn_1/button_Sign in'))

WebUI.click(findTestObject('HRMS_Web/ClockIn_1/p_Clock in'))

WebUI.click(findTestObject('HRMS_Web/ClockIn_1/Page_HRMS/button_Clock in'))

WebUI.setText(findTestObject('HRMS_Web/ClockIn_1/textarea_You appear to be out of office_for_4dbe77'), 'WFH')

WebUI.click(findTestObject('HRMS_Web/ClockIn_1/button_Try again'))

WebUI.setText(findTestObject('HRMS_Web/ClockIn_1/textarea_You appear to be out of office_for_4dbe77'), 'WFH')

WebUI.click(findTestObject('HRMS_Web/ClockIn_1/button_Cancel'))

WebUI.click(findTestObject('HRMS_Web/ClockIn_1/Page_HRMS/button_Clock in'))

WebUI.setText(findTestObject('HRMS_Web/ClockIn_1/textarea_You appear to be out of office_for_4dbe77'), 'WFH')

WebUI.click(findTestObject('HRMS_Web/ClockIn_1/button_Confirm'))

