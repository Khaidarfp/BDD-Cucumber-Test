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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Orange HRM Demo/Txt_Username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Orange HRM Demo/Txt_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Orange HRM Demo/Btn_Login'))

WebUI.verifyElementPresent(findTestObject('Orange HRM Demo/Ttl_Welcome'), 0)

WebUI.click(findTestObject('Orange HRM Demo/Btn_Welcome'))

WebUI.verifyElementPresent(findTestObject('Orange HRM Demo/Ttl_About'), 0)

WebUI.click(findTestObject('Orange HRM Demo/Btn_Admin'))

WebUI.click(findTestObject('Orange HRM Demo/Btn_Nationalities'))

WebUI.click(findTestObject('Orange HRM Demo/Btn_Add_Nationalities'))

WebUI.setText(findTestObject('Orange HRM Demo/Txt_Name_Nationalities'), 'aaa')

WebUI.click(findTestObject('Orange HRM Demo/Btn_Save_Add'))

WebUI.click(findTestObject('Orange HRM Demo/Chk_aaa'))

WebUI.click(findTestObject('Orange HRM Demo/Btn_Delete'))

WebUI.click(findTestObject('Orange HRM Demo/Btn_Ok_Delete'))

WebUI.verifyElementPresent(findTestObject('Orange HRM Demo/Ttl_Welcome'), 0)

WebUI.closeBrowser()
