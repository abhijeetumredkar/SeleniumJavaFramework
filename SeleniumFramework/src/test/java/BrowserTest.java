import java.util.List;
import java.util.Set;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath + "/Drivers/ChromeDriver/chromedriver.exe");

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

	}

}
