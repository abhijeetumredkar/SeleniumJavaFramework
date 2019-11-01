package com.demo.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

import com.demo.pageObjects.loginObjects;

import junit.framework.Assert;

public class LoginTC_001 extends baseClass {

	loginObjects lp;
	
	
	@Test
	public void LoginTest() throws Exception{

		driver.get(url);
		logger.info("Url is Launched");
		
		lp = new loginObjects(driver);
		
		lp.getUserName(username);
		logger.info("Entered user name");
		
		lp.getPassword(password);
		logger.info("Entered password");
		
		lp.clickLogin();
			
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
		{
			
			Assert.assertTrue(true);
			logger.info("Login successful");
			
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Unseccessful Login");
		}
	}

}
