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

WebUI.navigateToUrl('http://the-internet.herokuapp.com/download')

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_mozhno-nenado.jpeg'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_text.txt'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_Python_programs.txt'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_xls-sample1.xls'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_interiew.txt'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_Alert.js'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_photo-1542317854-0a03f0e0c000.jpg'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_kkh.txt'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_some-file.txt'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_url.txt'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_chromedriver.exe'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_2daymail.png'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_VRX_1402.png'))

WebUI.click(findTestObject('Object Repository/TheInternet/FileDownloader/Page_The Internet/a_example.json'))

