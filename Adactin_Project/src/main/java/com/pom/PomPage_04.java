package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage_04 {
	
public static WebDriver driver;
	
	@FindBy (id="username")
	private WebElement userName;
	
	@FindBy (id="password")
	private WebElement passWord;
	
	@FindBy (id="login")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public PomPage_04(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

}
