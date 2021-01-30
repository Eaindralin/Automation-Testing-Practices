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

WebUI.setText(findTestObject('HRMS_Web/Company_Location/input_HRMS_username'), 'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('HRMS_Web/Company_Location/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.sendKeys(findTestObject('HRMS_Web/Company_Location/input_HRMS_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('HRMS_Web/Company_Location/p_Company locations'))

WebUI.delay(3)

WebUI.click(findTestObject('HRMS_Web/Company_Location/button_New Location'))

WebUI.delay(3)

WebUI.setText(findTestObject('HRMS_Web/Company_Location/input_Name_locationName'), 'Ahtar Oo')

WebUI.delay(3)

WebUI.click(findTestObject('HRMS_Web/Company_Location/button_Find Me'))

WebUI.delay(3)

WebUI.click(findTestObject('HRMS_Web/Company_Location/button_Save'))

