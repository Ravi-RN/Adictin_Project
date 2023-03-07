package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage_02 {
	
	public static WebDriver driver;
	
	@FindBy (id="username")
	private WebElement userName;
	
	@FindBy (id="password")
	private WebElement passWord;
	
	@FindBy (id="re_password")
	private WebElement confirmPassWord;
	
	@FindBy (id="full_name")
	private WebElement fullName;
	
	@FindBy (id="email_add")
	private WebElement emailId;
	
	@FindBy (id="captcha-form")
	private WebElement captchaText;
	
	@FindBy (id="tnc_box")
	private WebElement checkBox;
	
	public PomPage_02(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getConfirmPassWord() {
		return confirmPassWord;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getCaptchaText() {
		return captchaText;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	@FindBy (id="Submit")
	private WebElement submitButton;

}
