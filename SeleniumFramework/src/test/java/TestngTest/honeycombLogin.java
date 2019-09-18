package TestngTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.newAdminLogin;
import POM.newHoneycombLogin;
import config.propertileFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ExcelDataProvider;

public class honeycombLogin {

	static WebDriver driver;
	static newHoneycombLogin newlogin;
	static newAdminLogin newadminlogin;
	public Logger logger; 
	public static String url = null;
	propertileFile propfile = new propertileFile();
	
	String projectPath;
	
	@BeforeTest
	public void setupTest() throws Exception {

		logger= LogManager.getLogger(honeycombLogin.class);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		newlogin = new newHoneycombLogin(driver);
		newadminlogin = new newAdminLogin(driver);
		propertileFile.getProperty();
		projectPath = System.getProperty("user.dir");
		logger.info("Setup done successfully");
	}
	
	@DataProvider(name = "honeycomblogin")
	public Object[][] dataSetup() throws Exception {
		
		ExcelDataProvider data = new ExcelDataProvider();
		Object excelldata [][] = data.testData(projectPath+"/Excel/data.xlsx", "Sheet1");
		return excelldata; 
	}
	
	@Test(dataProvider = "honeycomblogin")
	public void login(String username, String password) {
		
		driver.get(url);
		newlogin.setUsername(username);
		newlogin.setPassword(password);
		newlogin.signIn();
		newadminlogin.clickyes();
		logger.info("Login successful into Honeycomb");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		logger.info("Test Completed successfully");
	}

}
