package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage_01 {

	public static WebDriver driver;
	
	@FindBy (xpath="//a[text()='New User Register Here']")
	private WebElement newUserRegister;

	public PomPage_01(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getNewUserRegister() {
		return newUserRegister;
	}
	
}
