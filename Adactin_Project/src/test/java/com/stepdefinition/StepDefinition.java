package com.stepdefinition;

import java.io.IOException;

import com.baseclass.Base_Class;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;
import com.pom.PomPage_01;
import com.pom.PomPage_02;
import com.pom.PomPage_03;
import com.pom.PomPage_04;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("user launch the url")
	public void user_launch_the_url() throws IOException {
	 String url = File_Reader_Manager.getCr().getUrl();
	 getUrl(url);
	}

	@When("User click the new user register link")
	public void user_click_the_new_user_register_link() {
	   pom.getP1().getNewUserRegister().click();
	}
	
	@When("User send the minimum eight character with username")
	public void user_send_the_minimum_eight_character_with_username() {
		pom.getP2().getUserName().sendKeys("RaviNandhini24");
	    
	}

	@When("User send the minimum five character with password")
	public void user_send_the_minimum_five_character_with_password() {
		pom.getP2().getPassWord().sendKeys("123456");
	}

	@When("User send the confirm password")
	public void user_send_the_confirm_password() {
		pom.getP2().getConfirmPassWord().sendKeys("123456");
	   
	}

	@When("User send the full name")
	public void user_send_the_full_name() {
		pom.getP2().getFullName().sendKeys("Raveendran");
	    
	}

	@When("User send the email address")
	public void user_send_the_email_address() {
		pom.getP2().getEmailId().sendKeys("jpravi6@gmail.com");
	}

	@When("User enter the captcha")
	public void user_enter_the_captcha() {
		captcha(pom.getP2().getCaptchaText());
	    
	}

	@When("User click the agree checkbox")
	public void user_click_the_agree_checkbox() {
		pom.getP2().getCheckBox().click();
	    
	}

	@When("User click the register button")
	public void user_click_the_register_button() {
		pom.getP2().getSubmitButton().click();
	   
	}

	@Then("see the next page")
	public void see_the_next_page() {
		System.out.println("Next Page");
	 
	}
	
	@When("user click the click here to login link")
	public void user_click_the_click_here_to_login_link() {
		pom.getP3().getClickHereToLogin().click();
	}
	
	@When("user send the username")
	public void user_send_the_username() {
		pom.getP4().getUserName().sendKeys("RaviNandhini24");
	}

	@When("User send the password")
	public void user_send_the_password() {
		pom.getP4().getPassWord().sendKeys("123456");
	    
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		pom.getP4().getLoginButton().click();
	   
	}



}
