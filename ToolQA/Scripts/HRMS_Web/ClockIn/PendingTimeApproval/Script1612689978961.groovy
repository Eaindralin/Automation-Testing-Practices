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

WebUI.setText(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/input_HRMS_username'), 'haymarkyawwwin')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/div_Sign in to start your session Sign in'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/input_HRMS_username'), 'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/i_HRMS_fa fa-eye-slash'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/i_HRMS_fa fa-eye'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/p_Pending time approvals'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/div_Approve_mat-checkbox-inner-container ma_39b72c'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/div_Bypass supvr. approval_mat-checkbox-inn_10d3e3'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/button_Approve 2'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/div_Ahtar Oo Co., Ltd_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingTime_Approval/Page_HRMS/button_Confirm'))

