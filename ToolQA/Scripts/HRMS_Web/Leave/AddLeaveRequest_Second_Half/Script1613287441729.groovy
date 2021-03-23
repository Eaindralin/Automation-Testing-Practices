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

WebUI.setText(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/input_HRMS_username'), 'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/p_Leave log'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/button_Add new request'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/input_Employee_mat-input-4'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/span_Cynthia Win'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/button_Continue'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/div_Full day_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/span_Half day'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/div_Casual(2 days available, 4 days used)_m_0e14cf'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/span_Medical(29 days available, 1 day used)'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/div_Leave type_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/svg_Start  End_mat-datepicker-toggle-defaul_9f8a9b'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/div_14'))

CustomKeywords.'click_radio.clickUsingJS.click_radio_button'(findTestObject('HRMS_Web/AddLeaveRequest_Half/Page_HRMS/div_First half_mat-radio-outer-circle'), 
    30)

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/input_Second half_mat-input-7'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/span_May Myat Noe'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/textarea_Optional_leaveReason'), 
    'testing')

//WebUI.rightClick(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/div_Click or drag images here to upload'))
CustomKeywords.'uploadfile_Create.testing.uploadFile'(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/div_Click or drag images here to upload'),
	'D:\\Users\\Dell\\Desktop\\Issue_Photo\\29-Jan-2021\\Issue (Agile) #3720_01.png', 'D:\\Users\\Dell\\Desktop\\Issue_Photo\\29-Jan-2021\\DB_SalarySetting.png',
	'D:\\Users\\Dell\\Desktop\\Issue_Photo\\29-Jan-2021\\Issue (Agile) #3721_01.png', 'D:\\Users\\Dell\\Desktop\\Issue_Photo\\29-Jan-2021\\Issue (Agile) #3721_02.png',
	'D:\\Users\\Dell\\Desktop\\Issue_Photo\\29-Jan-2021\\RuleAssigntoPosition.png')

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/button_Add leave'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/AddLeaveRequest_Half/Page_HRMS/button_Confirm'))

