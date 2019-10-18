package TestngTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExampleQuikrClassifiedAdsonline {

	 
	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://www.quikr.com");
		
	//	driver.findElement(By.xpath("//*[@id='chpBoxCloseButton']")).click();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		List<WebElement> link_boxes=driver.findElements(By.xpath("//*[@id='cats']"));
		System.out.println("Number of boxes "+link_boxes.size() );
		
		
		
		for(int j=0;j<link_boxes.size();j++){
			
			WebElement box = link_boxes.get(j);
			List<WebElement> links = box.findElements(By.tagName("a"));
			System.out.println("Total links for---"+link_boxes.get(j+1)+"---are--- "+links.size() );
			System.out.println("====================================="+j);
			for(int i=0 ; i<links.size();i++){
				System.out.println("*********************************************");
				System.out.println(links.get(i).getText());
				System.out.println(links.get(i).getAttribute("href"));
				
			}
		}

		driver.quit();

	}

}