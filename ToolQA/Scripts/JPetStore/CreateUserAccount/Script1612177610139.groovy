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

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Account.action?newAccountForm=')

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_User ID_username'), 
    '1')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_New password_password'), 
    'admin123')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Repeat password_repeatedPassword'), 
    'admin123')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_First name_account.firstName'), 
    'Htoo')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Last name_account.lastName'), 
    'Eaindra')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Email_account.email'), 
    'htooeaindra1@gmail.com')

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Phone_account.phone'), 
    '09-797395140')

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Address 1_account.address1'), 
    'Mandalay')

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Address 2_account.address2'), 
    'Yangon')

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_City_account.city'), 
    'Bahan')

WebUI.click(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_State_account.state'))

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_State_account.state'), 
    'Mon')

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Zip_account.zip'), 
    '95')

WebUI.click(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/td'))

WebUI.setText(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Country_account.country'), 
    'Myanmar')

WebUI.click(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Enable MyList_account.listOption'))

WebUI.click(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Enable MyBanner_account.bannerOption'))

WebUI.click(findTestObject('Object Repository/JPetStore/CreateUserAccount/Page_JPetStore Demo/input_Enable MyBanner_newAccount'))

