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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Precondition
WebUI.callTestCase(findTestCase('Test Cases/Cart/Cart_AddSingleProduct_Success'), null, FailureHandling.STOP_ON_FAILURE)


//Step to Reproduce
WebUI.click(findTestObject('Object Repository/Pages/ProductPage/menu_cart'))

WebUI.click(findTestObject('Object Repository/Pages/Checkout/btn_placeporder'))

WebUI.setText(findTestObject('Object Repository/Pages/Checkout/txt_name'), 'daisykim')

WebUI.setText(findTestObject('Object Repository/Pages/Checkout/txt_country'), 'Korea')

WebUI.setText(findTestObject('Object Repository/Pages/Checkout/txt_city'), 'Seoul')

WebUI.setText(findTestObject('Object Repository/Pages/Checkout/txt_creditcard'), 'KOR12345')

WebUI.setText(findTestObject('Object Repository/Pages/Checkout/txt_month'), 'December')

WebUI.setText(findTestObject('Object Repository/Pages/Checkout/txt_year'), '2026')

WebUI.click(findTestObject('Pages/Checkout/btn_close'))


//Expected Result

WebUI.verifyTextPresent('Samsung galaxy s6', false)

String urlLink = WebUI.getUrl()

WebUI.verifyMatch(urlLink, 'https://www.demoblaze.com/cart.html', false)

