package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newAdminLogin {

	WebDriver driver;
	By admin_yes = By.id("sas-admin");

	public newAdminLogin(WebDriver driver) {

		this.driver = driver;

	}

	public void clickyes() {

		driver.findElement(admin_yes).click();

	}

}
