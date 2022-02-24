package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllGalleriesPage {
	WebDriver driver;
	WebElement loginButton;
	WebElement createGalleryButton;
	WebElement searchField;
	WebElement filterButton;
	WebElement galleryNameButton;
	WebElement logoutButton;
	WebElement loadMoreButton;
	WebElement myGalleriesButton;
	WebElement myGalleriesText;
	
	
	public AllGalleriesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getMyGalleriesButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a"));
	}


	public WebElement getLoginButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[1]/a"));
	}
	
    
	public WebElement getCreateGalleryButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[3]/a"));
	}



	public WebElement getSearchField() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/input"));
	}

	public WebElement getFilterButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/button"));
	}

	public WebElement getGalleryNameButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div[1]/div/div[1]/h2/a"));	}

	public WebElement getLogoutButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]/a"));
	}

	public WebElement getLoadMoreButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div[2]/button"));
	}
	
	
	
	public WebElement getMyGalleriesText() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a"));
	}


	public void clickMyGalleriesButton() {
		this.getMyGalleriesButton().click();
	}
	
	public void clickLoginButton() throws InterruptedException {
		this.getLoginButton().click();
		Thread.sleep(1000);
	}
	
	public void clickCreateGalleryButton() throws InterruptedException {
		this.getCreateGalleryButton().click();
		Thread.sleep(1000);
	}
	public void insertSearchField(String search) throws InterruptedException {
		this.getSearchField().sendKeys(search);
		Thread.sleep(1000);
	}
	
	public void clickFilterButton() throws InterruptedException {
		this.getFilterButton().click();
		Thread.sleep(1000);
		
	}
	
	public void clickGalleryNameButton() throws InterruptedException {
		this.getGalleryNameButton().click();
		Thread.sleep(1000);
		
	}
	
	public void clickLoadMoreButton() throws InterruptedException {
		this.getLoadMoreButton().click();
		Thread.sleep(1000);
	}
	
	public void clickLogoutButton() throws InterruptedException {
		this.getLogoutButton().click();
		Thread.sleep(1000);
	}
	
	public String myGalleriesText() {
		return this.getMyGalleriesText().getText();
	}
	

}
