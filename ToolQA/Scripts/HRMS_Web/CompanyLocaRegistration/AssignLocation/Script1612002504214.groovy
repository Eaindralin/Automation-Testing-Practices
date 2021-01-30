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

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/input_HRMS_username'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/input_HRMS_username'), 'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/p_Company locations'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/div_Primary Location Assignment'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/div_Unassigned Employees_mat-checkbox-inner_3c96d6'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/div_AssignChange Selected_mat-checkbox-inne_f55fb7'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/div_Change Location_mat-checkbox-inner-cont_556226'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/a_AssignChange Selected'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/span_(All)_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/div_Office 2'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/button_Save'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/div_Display Options_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PrimaryLocationAssignment/Page_HRMS/div_Unassigned Employees_mat-checkbox-inner_3c96d6'))

