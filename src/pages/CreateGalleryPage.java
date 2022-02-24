package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateGalleryPage {
	WebDriver driver;
	WebElement titleInputField;
	WebElement descriptionInputField;
	WebElement imageInputField;
	WebElement imageInput2Field;
	WebElement submitButton;
	WebElement addImageButton;
	WebElement arrowUpButton;
	WebElement arrowDownButton;
	WebElement cancelButton;
	
	public CreateGalleryPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTitleInputField() {
		return this.driver.findElement(By.id("title"));
	}

	public WebElement getDescriptionInputField() {
		return this.driver.findElement(By.id("description"));
	}

	public WebElement getImageInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div/div/input"));
	}
	
	

	public WebElement getImageInput2Field() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div[2]/div/input"));
	}

	public WebElement getSubmitButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/button[1]"));
	}

	public WebElement getAddImageButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/button"));
	}

	public WebElement getArrowUpButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div/div/div/button[1]/i"));
	}

	public WebElement getArrowDownButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div/div/div/button[2]/i"));
	}

	public WebElement getCancelButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/button[2]"));
	}
	
	public void insertTextInTitleField(String title) {
		this.getTitleInputField().sendKeys(title);
	}
	
	public void insertTextInDescriptionField(String description) {
		this.getDescriptionInputField().sendKeys(description);
	}
	
	public void insertImageUrl(String url) {
		this.getImageInputField().sendKeys(url);
	}
	
	public void insertImageUrl2(String url) {
		this.getImageInput2Field().sendKeys(url);
	}
	
	public void clickSubmitButton() {
		this.getSubmitButton().click();
	}
	
	public void clickCancelButton() {
		this.getCancelButton().click();
	}
	
	public void clickAddImageButton() {
		this.getAddImageButton().click();
		
	}
	
	public void clickArrowUpButton() {
		this.getArrowUpButton().click();
		
	}
	
	public void clickArrowDownButton() {
		this.getArrowDownButton().click();
	}

}
