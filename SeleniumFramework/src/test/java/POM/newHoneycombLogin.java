package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newHoneycombLogin {

	WebDriver driver;
	By honey_username = By.id("username");
	By honey_password = By.id("password");
	By signIn = By.id("submitBtn");

	public newHoneycombLogin(WebDriver driver) {

		this.driver = driver;
	}

	public void setUsername(String text) {

		driver.findElement(honey_username).sendKeys(text);

	}

	public void setPassword(String text) {

		driver.findElement(honey_password).sendKeys(text);
	}

	public void signIn() {

		driver.findElement(signIn).click();
	}
}
