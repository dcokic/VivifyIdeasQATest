package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateGalleryTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
		allGalleriesPage.clickLoginButton();
		Thread.sleep(1000);
	}
	
	@Test(priority=1)
	public void createGalleryWithOneImage() throws InterruptedException {
		String title = excelReader.returnStringDataFromExcel("CreateGallery", 6, 2);
		String description = excelReader.returnStringDataFromExcel("CreateGallery", 7, 2);
		String url = excelReader.returnStringDataFromExcel("CreateGallery", 8, 2);
		
		
		super.logInValidCredentials();
		Thread.sleep(1000);
		allGalleriesPage.clickCreateGalleryButton();
		Thread.sleep(1000);
		createGalleryPage.insertTextInTitleField(title);
		Thread.sleep(1000);
		createGalleryPage.insertTextInDescriptionField(description);
		Thread.sleep(1000);
		createGalleryPage.insertImageUrl(url);
		Thread.sleep(1000);
		createGalleryPage.clickSubmitButton();
		Thread.sleep(1000);
		
	}
	
	@Test(priority=0)
	public void createGalleryWithTwoImages() throws InterruptedException {
		String title = excelReader.returnStringDataFromExcel("CreateGallery", 18, 2);
		String description = excelReader.returnStringDataFromExcel("CreateGallery", 19, 2);
		String url = excelReader.returnStringDataFromExcel("CreateGallery", 20, 2);
		String url2 = excelReader.returnStringDataFromExcel("CreateGallery", 22, 2);
		
		super.logInValidCredentials();
		allGalleriesPage.clickCreateGalleryButton();
		Thread.sleep(1000);
		createGalleryPage.insertTextInTitleField(title);
		Thread.sleep(1000);
		createGalleryPage.insertTextInDescriptionField(description);
		Thread.sleep(1000);
		createGalleryPage.insertImageUrl(url);
		Thread.sleep(1000);
		createGalleryPage.clickAddImageButton();
		Thread.sleep(1000);
		createGalleryPage.insertImageUrl2(url2);
		Thread.sleep(1000);
		createGalleryPage.clickSubmitButton();
		Thread.sleep(2000);
		allGalleriesPage.clickLogoutButton();




		
		
	}
}
