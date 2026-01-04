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

//Precondition
WebUI.callTestCase(findTestCase('Test Cases/Login/Login_ValidCredential_Success'), [:], FailureHandling.STOP_ON_FAILURE)


//Step to reproduce
WebUI.click(findTestObject('Pages/HomePage/txt_producttitle'))

WebUI.click(findTestObject('Pages/ProductPage/btn_addtocart'))

// Tunggu alert muncul
WebUI.waitForAlert(5)

// Ambil text alert
String alertText = WebUI.getAlertText()

// Validasi text alert
WebUI.verifyMatch(alertText, 'Product added.', false)

// Klik OK di alert
WebUI.acceptAlert()

WebUI.navigateToUrl('https://www.demoblaze.com')

WebUI.click(findTestObject('Object Repository/Pages/HomePage/txt_laptop'))

WebUI.click(findTestObject('Object Repository/Pages/HomePage/txt_productname2'))
//
WebUI.click(findTestObject('Object Repository/Pages/ProductPage/btn_addtocart2'))
//
WebUI.waitForAlert(5)
//
String alertText2 = WebUI.getAlertText()
//
WebUI.verifyMatch(alertText2, 'Product added.', false)
//
WebUI.acceptAlert()
//
WebUI.navigateToUrl('https://www.demoblaze.com/')
//
WebUI.click(findTestObject('Object Repository/Pages/HomePage/txt_monitor'))
//
WebUI.click(findTestObject('Object Repository/Pages/HomePage/txt_productname3'))
//
WebUI.click(findTestObject('Object Repository/Pages/ProductPage/btn_addtocart3'))
//
WebUI.waitForAlert(5)
//
String alertText3 = WebUI.getAlertText()
//
WebUI.verifyMatch(alertText3, 'Product added.', false)
//
WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Pages/ProductPage/menu_cart'))

// Expected Result

WebUI.verifyTextPresent('Samsung galaxy s6', false)

WebUI.verifyTextPresent('MacBook air', false)

WebUI.verifyTextPresent('Apple monitor 24', false)


