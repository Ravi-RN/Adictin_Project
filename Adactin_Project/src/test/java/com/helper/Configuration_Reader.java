package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	Properties pro;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\J.P.Ravi\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\helper\\adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
	}
	
	public String getBrowser() {
		
		String browser = pro.getProperty("browser");
		
		return browser;

	}
	
	public String getUrl() {
		
		String url = pro.getProperty("url");
		
		return url;

	}

}
