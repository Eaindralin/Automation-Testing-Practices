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

WebUI.setText(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/input_HRMS_username'), 'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/p_Time log'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/button_Add new manual entries'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/div_My direct reports_mat-radio-inner-circle'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/input_Filter available_mat-input-4'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span_ATO Subsidiary'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span_Department_dropdown-down'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/input_Subsidiary_mat-input-5'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span_ATO Branch'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/div_Account'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/div_Select directlyEmployeesSelect AllAung _e59674'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/label_Shally May'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/button_Add'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/button_Add time entry'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/svg_Date_mat-datepicker-toggle-default-icon_ec3484'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/div_8'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/input_Time_mat-input-8'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span_9'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span_1'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span_1_2'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span_Ok'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/span_Out of office'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/textarea_Reason_reason'), 
    'test')

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/button_Save'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/button_Save_1'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/a_Welcome Hay Mar Kyaw Win'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ManualTimeEntry_AnyEmployee/Page_HRMS/a_Sign out'))

