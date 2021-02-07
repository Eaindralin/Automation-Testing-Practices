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

WebUI.setText(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/input_HRMS_username'), 'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/p_Pending leave approvals'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/button_Approve'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/div_Casual(3.5 days available, 2.5 days use_ecae80'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/span_Earned(9 days available, 1 day used)'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/div_Leave type_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/button_Confirm'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/button_Deny'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/textarea_concat(id(, , mat-input-4, , ))_ma_0fefc7'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/HRMS_Web/PendingLeaveApproval/Page_HRMS/button_Confirm'))

