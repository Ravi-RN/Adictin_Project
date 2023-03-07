package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public static WebDriver driver;
	
	private PomPage_01 p1;
	
	private PomPage_02 p2;
	
	private PomPage_03 p3;
	
	private PomPage_04 p4;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public PomPage_01 getP1() {
		
		p1=new PomPage_01(driver);
		return p1;
	}

	public PomPage_02 getP2() {
		p2=new PomPage_02(driver);
		return p2;
	}

	public PomPage_03 getP3() {
		p3=new PomPage_03(driver);
		return p3;
	}

	public PomPage_04 getP4() {
		p4=new PomPage_04(driver);
		return p4;
	}
	
}
