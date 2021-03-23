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

WebUI.setText(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/input_HRMS_username'), 'winthein')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/p_My leave'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/button_View log'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/svg_Start_mat-datepicker-toggle-default-ico_7747d5'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/div_JAN'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/svg_End_mat-datepicker-toggle-default-icon _35cfa0'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/div_MAR'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/div_End_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/button_Back'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/div_Me_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/div_concat(Show , , Pending, ,  approval)_m_7b6d4a'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/div_Me_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Leave_ViewLog/Page_HRMS/div_concat(Show , , Pending, ,  approval)_m_7b6d4a'))

