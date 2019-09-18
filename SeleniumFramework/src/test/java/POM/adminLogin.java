package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class adminLogin {

	static WebElement element=null;

	public static WebElement clickYes(WebDriver driver) {

		element = driver.findElement(By.id("sas-admin"));
		return element;

	}

}
