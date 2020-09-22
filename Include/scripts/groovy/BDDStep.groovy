import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class BDDStep {
	@Given ("I navigates to login page")
	def navigateToUrl(){
		WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
	}
	@When("I input (.*) and (.*)")
	def inputValidUsernamePassword(String username, String password){
		println ("\n Saya di dalam inputValidUsernamePassword")
		println ("Username: "+username)
		println ("Password: "+password)
		WebUI.setText(findTestObject('Orange HRM Demo/Txt_Username'), username)
		WebUI.setEncryptedText(findTestObject('Orange HRM Demo/Txt_Password'), password)
	}
	@And ("I click login button")
	def clickLoginButton(){
		WebUI.click(findTestObject('Orange HRM Demo/Btn_Login'))
	}
	@Then ("I click admin button")
	def clickAdminButton(){
		WebUI.click(findTestObject('Orange HRM Demo/Btn_Admin'))
	}
	@When ("I click nationalities button")
	def clickNationalitiesButton(){
		WebUI.click(findTestObject('Orange HRM Demo/Btn_Nationalities'))
	}
	@And ("I click add button")
	def clickAddButton(){
		WebUI.click(findTestObject('Orange HRM Demo/Btn_Add_Nationalities'))
	}
	@And ("I write text nationality aaa")
	def writeTextNationality(){
		WebUI.setText(findTestObject('Orange HRM Demo/Txt_Name_Nationalities'), 'aaa')
	}
	@Then ("I click save button")
	def clickSaveButton(){
		WebUI.click(findTestObject('Orange HRM Demo/Btn_Save_Add'))
	}
	@When ("I check the column aaa")
	def checkTheColumn(){
		WebUI.click(findTestObject('Orange HRM Demo/Chk_aaa'))
	}
	@Then ("I click delete button")
	def clickDeleteButton(){
		WebUI.click(findTestObject('Orange HRM Demo/Btn_Delete'))
	}
	@And ("I click ok for delete button")
	def clickOkDeleteButton(){
		WebUI.click(findTestObject('Orange HRM Demo/Btn_Ok_Delete'))
	}
	@Then ("I should be navigated to home page")
	def navigateToHomepage(){
		WebUI.verifyElementPresent(findTestObject('Orange HRM Demo/Ttl_Welcome'), 0)
		WebUI.closeBrowser()
	}
}


/*@Given ("User navigates to login page")
 def navigateToUrl(){
 println("\n Navigate to Url")
 }
 @When ("User input email and password")
 def inputCredential (){
 println("\n User input Credential")
 }
 @And ("Click on login button")
 def clickLoginButton(){
 println("\n Click Login Button")
 }
 @Then ("User is navigated to homepage")
 def successLogin(){
 println("\n User success Login")
 }*/
