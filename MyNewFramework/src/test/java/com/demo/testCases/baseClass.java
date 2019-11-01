package com.demo.testCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class baseClass {
	
	public String url="http://demo.guru99.com/v4/";
	public String username="mngr230137";
	public String password="Emyqeru";
	WebDriver driver;
	public org.apache.logging.log4j.Logger logger;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		logger = LogManager.getLogger(baseClass.class);
		
				
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}
