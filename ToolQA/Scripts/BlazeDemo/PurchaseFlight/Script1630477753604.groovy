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

WebUI.navigateToUrl('https://www.blazedemo.com/')

WebUI.click(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo/select_Paris            Philadelphia       _54ada8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo/select_Paris            Philadelphia       _54ada8'), 
    'Mexico City', true)

WebUI.click(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo/select_Buenos Aires            Rome        _b23956'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo/select_Buenos Aires            Rome        _b23956'), 
    'Dublin', true)

WebUI.click(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo/input_Choose your destination city_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo - reserve/input_Price_btn btn-small'))

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_Name_inputName'), 
    'FName')

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_Address_address'), 
    '123')

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_City_city'), 'City')

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_State_state'), 'State')

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_Zip Code_zipCode'), 
    '12345')

WebUI.click(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/select_Visa                American Express_d3f7e8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/select_Visa                American Express_d3f7e8'), 
    'amex', true)

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_Credit Card Number_creditCardNumber'), 
    '12092938283')

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_Month_creditCardMonth'), 
    '12')

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_Year_creditCardYear'), 
    '2018')

WebUI.setText(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_Name on Card_nameOnCard'), 
    'John Smith')

WebUI.click(findTestObject('Object Repository/BlazeDemo/PurchaseFlight/Page_BlazeDemo Purchase/input_Remember me_btn btn-primary'))

