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

WebUI.setText(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/input_HRMS_username'), 'winthein')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.sendKeys(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/input_HRMS_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/p_My leave'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/button_Request leave'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/div_Full day_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/span_Full day'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/div_Full day_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/span_Earned(9.5 days available)'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/svg_Leave type_mat-datepicker-toggle-defaul_4c1e26'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/div_8'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/div_9'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/input_Second half_mat-input-3'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/span_Saw Mya Aye'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/textarea_Optional_leaveReason'), 'Sick Leave')

CustomKeywords.'uploadfile_Create.testing.uploadFile'(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/div_Click or drag images here to upload'), 
    'D:\\Users\\Dell\\Desktop\\Issue_Photo\\4-Feb-2021\\Att_Daily_Summary.png', 'D:\\Users\\Dell\\Desktop\\Issue_Photo\\4-Feb-2021\\Att_MonthlySummary.png', 
    'D:\\Users\\Dell\\Desktop\\Issue_Photo\\4-Feb-2021\\earned_female.png', 'D:\\Users\\Dell\\Desktop\\Issue_Photo\\4-Feb-2021\\LeaveCase.png', 
    'D:\\Users\\Dell\\Desktop\\Issue_Photo\\4-Feb-2021\\LeaveReport_monthly_round.png')

WebUI.click(findTestObject('Object Repository/HRMS_Web/LeaveRequest_Full/Page_HRMS/button_Submit'))

