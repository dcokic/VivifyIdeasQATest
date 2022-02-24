package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTests extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
		allGalleriesPage.clickLoginButton();
		Thread.sleep(1000);
	}
	@Test
	public void logoutTest() throws InterruptedException {
		
		String expectedText = excelReader.returnStringDataFromExcel("Logout", 8, 3 );
		String actualText;
		
		super.logInValidCredentials();
		Thread.sleep(1000);
		allGalleriesPage.clickLogoutButton();
		Thread.sleep(1000);
		actualText = loginPage.LoginTosterMessageText();
		assertEquals(actualText, expectedText);
		
	
	}

}
