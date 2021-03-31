package bloodBank.Web.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class userEditTest {
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
			
			driver.get("http://localhost:3000/login");
			testFunction();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void testFunction() {
		try {
			 driver.get("http://localhost:3000/login");
			 driver.findElement(By.id("mailid")).click();
			    driver.findElement(By.id("mailid")).sendKeys("Midhunvprasad@gmail.com");
			    driver.findElement(By.id("password")).click();
			    driver.findElement(By.id("password")).sendKeys("pass");
			    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
			    driver.findElement(By.id("one")).click();
			    driver.findElement(By.id("city")).sendKeys("pala");
			    driver.findElement(By.id("countries")).click();
			    {
			      WebElement dropdown = driver.findElement(By.id("countries"));
			      dropdown.findElement(By.xpath("//option[. = 'India']")).click();
			    }
			    driver.findElement(By.id("countries")).click();
			    driver.findElement(By.cssSelector("button:nth-child(35)")).click();
			    driver.findElement(By.id("donationDate")).click();
			    driver.findElement(By.id("donationDate")).sendKeys("1998-12-07");
			    driver.findElement(By.cssSelector("button:nth-child(35)")).click();
			   
			    Thread.sleep(10000);
			;

		    driver.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		userEditTest t1=new userEditTest();
		t1.invokeBrowser();

	}

}
