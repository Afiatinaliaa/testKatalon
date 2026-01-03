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

WebUI.callTestCase(findTestCase('Test Cases/Cart/Cart_AddSingleProduct_Success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/ProductPage/menu_cart'))

WebUI.click(findTestObject('Pages/Checkout/btn_placeporder'))

WebUI.setText(findTestObject('Pages/Checkout/txt_name'), 'daisy')

WebUI.setText(findTestObject('Pages/Checkout/txt_country'), 'singapore')

WebUI.setText(findTestObject('Pages/Checkout/txt_city'), 'singapore')

WebUI.setText(findTestObject('Pages/Checkout/txt_creditcard'), 'AE12345')

WebUI.setText(findTestObject('Pages/Checkout/txt_month'), '11')

WebUI.setText(findTestObject('Pages/Checkout/txt_year'), '2026')

WebUI.click(findTestObject('Pages/Checkout/btn_puchase'))

WebUI.click(findTestObject('Object Repository/Pages/Checkout/btn_ok'))

