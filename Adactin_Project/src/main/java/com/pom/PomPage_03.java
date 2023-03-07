package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage_03 {

	public static WebDriver driver;
	
	@FindBy (xpath="//a[text()='Click here to login']")
	private WebElement clickHereToLogin;

	public PomPage_03(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getClickHereToLogin() {
		return clickHereToLogin;
	}
}
