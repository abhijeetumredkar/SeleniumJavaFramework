package com.demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginObjects {
	
	WebDriver ldriver;

public loginObjects(WebDriver driver) {
		
		ldriver = driver;
		PageFactory.initElements(ldriver, this);
				
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPass;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement submitButton;
	
	public void getUserName(String uname) {
		
		txtUserName.sendKeys(uname);
	}
	
	public void getPassword(String pass) {
		
		txtPass.sendKeys(pass);
	}
	
	public void clickLogin() {
		
		submitButton.click();
	}
}
