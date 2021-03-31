package bloodBank.Web.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactUsTest {
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
			
			driver.get("http://localhost:3000/contactus");
			testFunction();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void testFunction() {
		try {
			  driver.get("http://localhost:3000/contactus");
			    driver.findElement(By.id("name")).click();
			    driver.findElement(By.id("name")).sendKeys("Check");
			    driver.findElement(By.id("mail")).click();
			    driver.findElement(By.id("mail")).sendKeys("midhunprasad@gmail.com");
			    driver.findElement(By.id("phone")).click();
			    driver.findElement(By.id("phone")).sendKeys("1234567890");
			    driver.findElement(By.id("message")).click();
			    driver.findElement(By.id("message")).sendKeys("hiii");
			    Thread.sleep(10000);
			    driver.findElement(By.cssSelector("input:nth-child(16)")).click();

		    driver.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		contactUsTest t1=new contactUsTest();
		t1.invokeBrowser();

	}

}
