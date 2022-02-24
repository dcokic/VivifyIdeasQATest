package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyGalleriesTests extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
		allGalleriesPage.clickLoginButton();
		Thread.sleep(1000);
	}
	@Test
	public void findMyGallery() throws InterruptedException {
		String title = excelReader.returnStringDataFromExcel("MyGalleriesPage", 7, 2);
		String expectedText = excelReader.returnStringDataFromExcel("MyGalleriesPage", 12, 3);
		String actualText;
		
		super.logInValidCredentials();
		allGalleriesPage.clickMyGalleriesButton();
		Thread.sleep(1000);
		myGalleriesPage.insertTextInSearchField(title);
		Thread.sleep(1000);
		myGalleriesPage.clickFilterButton();
		Thread.sleep(1000);
		actualText = myGalleriesPage.getGalleryNameText();
		assertEquals(actualText, expectedText);
	}

}
