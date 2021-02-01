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

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/input_Need a user name and password_username'), 
    'j2ee')

WebUI.setEncryptedText(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/input_Need a user name and password_password'), 
    'qPDWtMYEx+8=')

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/input_Need a user name and password_signon'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_FI-SW-01'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/img_1'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_K9-BD-01'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Add to Cart_1'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/img_1_2'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_RP-SN-01'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_FL-DSH-01'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Add to Cart_1_2'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/img_1_2'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_RP-LI-02'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Add to Cart_1_2_3'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/img_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_AV-CB-01'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Add to Cart_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Remove'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_FI-FW-01'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Add to Cart_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/input_Sub Total 307.50_updateCartQuantities'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/input_Ship to different address..._newOrder'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Confirm'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Return to Main Menu'))

WebUI.click(findTestObject('Object Repository/JPetStore/ShoppingPet/Page_JPetStore Demo/a_Sign Out'))

