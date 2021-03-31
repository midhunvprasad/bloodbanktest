package bloodBank.Web.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eventTest {
	WebDriver driver;
	JavascriptExecutor jse; 
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\seleniumtest\\\\libs\\\\chromedriver.exe");	
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://localhost:3000/index");
			testFunction();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void testFunction() {
		try {
			 driver.get("http://localhost:3000/index");
			
			 	driver.findElement(By.linkText("Menu")).click();
			    driver.findElement(By.cssSelector("li:nth-child(6) > a")).click();
			   
			    Thread.sleep(10000);
			;

		    driver.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		eventTest t1=new eventTest();
		t1.invokeBrowser();

	}

}
