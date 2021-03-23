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

WebUI.navigateToUrl('http://the-internet.herokuapp.com/upload')

CustomKeywords.'uploadfile_Create.testing.uploadFile'(findTestObject('TheInternet/FileUploader_03/Page_The Internet/div_File Uploader_drag-drop-upload'), 
    'D:\\Users\\Dell\\Desktop\\Issue_Photo\\28-Feb-2021\\PieChart.png', 'D:\\Users\\Dell\\Desktop\\Issue_Photo\\28-Feb-2021\\PayrollSummaryRpt_Date.png', 
    'D:\\Users\\Dell\\Desktop\\Issue_Photo\\28-Feb-2021\\PayrollSummaryRpt.png', 'D:\\Users\\Dell\\Desktop\\Issue_Photo\\28-Feb-2021\\Charts.png', 
    'D:\\Users\\Dell\\Desktop\\Issue_Photo\\28-Feb-2021\\CalculationResults_Total_Zero.png')

