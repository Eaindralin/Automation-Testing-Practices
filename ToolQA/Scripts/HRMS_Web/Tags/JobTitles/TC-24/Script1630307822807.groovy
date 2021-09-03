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

WebUI.navigateToUrl('https://test.ahtaroo.com/#/Tags')

WebUI.maximizeWindow()

WebUI.delay(50)

WebUI.click(findTestObject('Object Repository/HRMS_Web/Tags/JobTitles/TC-24/Page_HRMS/bdi_Create'))

WebUI.setText(findTestObject('Object Repository/HRMS_Web/Tags/JobTitles/TC-24/Page_HRMS/input_Create Job Title___input0-inner'), 
    'CHRO')

WebUI.click(findTestObject('Object Repository/HRMS_Web/Tags/JobTitles/TC-24/Page_HRMS/bdi_Create_1'))

WebUI.click(findTestObject('Object Repository/HRMS_Web/Tags/JobTitles/TC-24/Page_HRMS/bdi_Cancel'))

