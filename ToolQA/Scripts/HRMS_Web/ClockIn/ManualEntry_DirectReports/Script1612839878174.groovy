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

WebUI.setText(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/input_HRMS_username'), 'sma')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.sendKeys(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/input_HRMS_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/p_Time log'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/button_Add new manual entries'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/span_Employees'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/div_Htun Lu Khant - 1008'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/div_Thaw Dar Lwin - 1019'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/footer_Version 0.1.1Copyright  2020 Ahtar O_8633c0'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/button_Add time entry'))

WebUI.click(findTestObject('HRMS_Web/Timelog/Page_HRMS/svg_Date_mat-datepicker-toggle-default-icon ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/div_8'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/span_11'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/input_Time_mat-input-6'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/span'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/button_PM'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/button_AM'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/button_Ok'))

CustomKeywords.'click_radio.clickUsingJS.click_radio_button'(findTestObject('HRMS_Web/Timelog/Page_HRMS/div_In_mat-radio-outer-circle'), 
    30)

WebUI.click(findTestObject('HRMS_Web/Timelog/Page_HRMS/div_Location'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/div_Out of office'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/textarea_Reason_reason'), 'testing')

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/button_Save'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/button_Save_1'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Timelog/Page_HRMS/path'))

