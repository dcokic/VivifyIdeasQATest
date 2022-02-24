package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AllGalleriesPage;
import pages.CreateGalleryPage;

import pages.LoginPage;
import pages.MyGalleriesPage;

public class BaseTest {
	
	WebDriver driver;
	LoginPage loginPage;
	AllGalleriesPage allGalleriesPage;
	MyGalleriesPage myGalleriesPage;
	CreateGalleryPage createGalleryPage;
	ExcelReader excelReader;
	String webSiteUrl;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		excelReader = new ExcelReader(new File("data/TestPlan.xlsx"));
		loginPage = new LoginPage(driver);
		allGalleriesPage = new AllGalleriesPage(driver);
		createGalleryPage = new CreateGalleryPage(driver);
		myGalleriesPage = new MyGalleriesPage(driver);
		driver.manage().window().maximize();
		webSiteUrl = excelReader.returnStringDataFromExcel("Login", 4, 2);
		
	}
	
	@AfterClass
	public void afterClass() {
		this.driver.close();
	}
	
	public void logInValidCredentials() throws InterruptedException {
		String email = excelReader.returnStringDataFromExcel("Login", 5, 2);
		String password = excelReader.returnStringDataFromExcel("Login", 6, 2);
		
		
		loginPage.insertEmail(email);
		loginPage.insertPassword(password);
		loginPage.clickSubmitButton();
		
		
	}
}
