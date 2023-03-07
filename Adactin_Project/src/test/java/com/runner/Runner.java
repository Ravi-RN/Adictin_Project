package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\J.P.Ravi\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\feature\\adactin.feature",
glue="com.stepdefinition")

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass	
	public static void setUp() throws IOException {	
		String browser = File_Reader_Manager.getCr().getBrowser();
		driver=Base_Class.getDriver(browser);

	}

}
