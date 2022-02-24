package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
		allGalleriesPage.clickLoginButton();
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void logInValidCredentials() throws InterruptedException {
		String email = excelReader.returnStringDataFromExcel("Login", 5, 2);
		String password = excelReader.returnStringDataFromExcel("Login", 6, 2);
		String expectedText = excelReader.returnStringDataFromExcel("Login", 10, 3);
		String actualText;
		
		loginPage.insertEmail(email);
		Thread.sleep(1000);
		loginPage.insertPassword(password);
		Thread.sleep(1000);
		loginPage.clickSubmitButton();
		Thread.sleep(1000);
		
		actualText = allGalleriesPage.myGalleriesText();
		assertEquals(actualText, expectedText);
	}
	
	@Test(priority=0)
	public void logInInvalidCredentials() throws InterruptedException {
		String email = excelReader.returnStringDataFromExcel("Login", 16, 2);
		String password = excelReader.returnStringDataFromExcel("Login", 17, 2);
		String expectedText = excelReader.returnStringDataFromExcel("Login", 21, 3);
		String actualText;
		
		loginPage.insertEmail(email);
		Thread.sleep(1000);
		loginPage.insertPassword(password);
		Thread.sleep(1000);
		loginPage.clickSubmitButton();
		Thread.sleep(1000);
		
		actualText = loginPage.getCredentialsErrorTosterMessageText();
		assertEquals(actualText, expectedText);
	}
	
	@Test(priority=1)
	public void loginWithInvalidPassword() throws InterruptedException{
		String email = excelReader.returnStringDataFromExcel("Login", 27, 2);
		String password = excelReader.returnStringDataFromExcel("Login", 28, 2);
		String expectedText = excelReader.returnStringDataFromExcel("Login", 32, 3);
		String actualText;
		
		loginPage.insertEmail(email);
		Thread.sleep(1000);
		loginPage.insertPassword(password);
		Thread.sleep(1000);
		loginPage.clickSubmitButton();
		Thread.sleep(1000);
		
		actualText = loginPage.getCredentialsErrorTosterMessageText();
		assertEquals(actualText, expectedText);
		

		
	}
	
	@Test(priority=2)
	public void loginWithInvalidEmail() throws InterruptedException{
		String email = excelReader.returnStringDataFromExcel("Login", 38, 2);
		String password = excelReader.returnStringDataFromExcel("Login", 39, 2);
		String expectedText = excelReader.returnStringDataFromExcel("Login", 43, 3);
		String actualText;
		
		loginPage.insertEmail(email);
		Thread.sleep(1000);
		loginPage.insertPassword(password);
		Thread.sleep(1000);
		loginPage.clickSubmitButton();
		Thread.sleep(1000);
		
		actualText = loginPage.getCredentialsErrorTosterMessageText();
		assertEquals(actualText, expectedText);
		

		
	}

}
