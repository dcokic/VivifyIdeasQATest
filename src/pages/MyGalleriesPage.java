package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyGalleriesPage {
	WebDriver driver;
	WebElement searchField;
	WebElement filterButton;
	WebElement galleryNameButton;
	
	
	public MyGalleriesPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchField() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/input"));
	}

	public WebElement getFilterButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/button"));
	}

	public WebElement getGalleryNameButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/h2/a"));
	}
	
	public void insertTextInSearchField(String title) {
		this.getSearchField().sendKeys(title);
		
	}
	
	public String getGalleryNameText() {
		return this.getGalleryNameButton().getText();
	}
	
	public void clickFilterButton() {
		this.getFilterButton().click();
	}

}
