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

WebUI.setText(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/input_HRMS_username'), 'winthein')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/p_Clock in'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/button_Manual'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/svg_Date_mat-datepicker-toggle-default-icon_ec3484'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/div_13'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/input_Time_mat-input-2'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/span_9'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/div_PM_clock-face__number clock-face__numbe_8764a5'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/button_PM'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/span_Ok'))

CustomKeywords.'click_radio.clickUsingJS.click_radio_button'(findTestObject('HRMS_Web/ClockOut_Manal/ClockOut/Page_HRMS/div_In_mat-radio-outer-circle'), 
    30)

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/span_Out of office'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/div_Out of office_mat-checkbox-inner-container'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/textarea_Reason_reason'), 'WFH')

WebUI.click(findTestObject('Object Repository/HRMS_Web/ClockOut_Manual/Page_HRMS/button_Submit'))

