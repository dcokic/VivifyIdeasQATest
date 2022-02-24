package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	WebElement emailInputField;
	WebElement passwordInputField;
	WebElement submitButton;
	WebElement credentialsErrorTosterMessage;
	WebElement loginTosterMessage;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmailInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"email\"]"));
	}

	public WebElement getPasswordInputField() {
		return this.driver.findElement(By.id("password"));
	}

	public WebElement getSubmitButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/button"));
	}

	public WebElement getCredentialsErrorTosterMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/p"));
	}
	
	
	public WebElement getLoginTosterMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/h1"));
	}

	public void insertEmail(String email) throws InterruptedException {
		this.getEmailInputField().sendKeys(email);
		Thread.sleep(1000);
		
	}
	
	public void insertPassword(String password) throws InterruptedException {
		this.getPasswordInputField().sendKeys(password);
		Thread.sleep(1000);
	}	
	
	public void clickSubmitButton() throws InterruptedException {
		this.getSubmitButton().click();
		Thread.sleep(1000);
	}	
	
	public String LoginTosterMessageText() {
		return this.getLoginTosterMessage().getText();
	}
	
	public String getCredentialsErrorTosterMessageText() {
		return this.getCredentialsErrorTosterMessage().getText();
	}

}
