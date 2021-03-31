package bloodBank.Web.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hospitalRegistration {

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
			
			driver.get("http://localhost:3000/hospitalregistration");
			testFunction();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void testFunction() {
		try {
			   driver.get("http://localhost:3000/hospitalregistration");
			   
			    driver.findElement(By.id("hname")).click();
			    driver.findElement(By.id("hname")).sendKeys("lissy");
			    driver.findElement(By.id("address")).click();
			    driver.findElement(By.id("address")).sendKeys("2323 avenue");
			    driver.findElement(By.id("mailid")).click();
			    driver.findElement(By.id("mailid")).sendKeys("lissy@gmail.com");
			    driver.findElement(By.id("phone")).click();
			    driver.findElement(By.id("phone")).sendKeys("121213143456");
			    driver.findElement(By.id("usermobile")).click();
			    driver.findElement(By.id("usermobile")).sendKeys("1234567890");
			    driver.findElement(By.id("countries")).click();
			    {
			      WebElement dropdown = driver.findElement(By.id("countries"));
			      dropdown.findElement(By.xpath("//option[. = 'India']")).click();
			    }
			    driver.findElement(By.id("countries")).click();
			    driver.findElement(By.id("usercity")).click();
			    driver.findElement(By.id("usercity")).sendKeys("eklm");
			    driver.findElement(By.id("password")).click();
			    driver.findElement(By.id("password")).sendKeys("pass");
			    driver.findElement(By.id("cpassword")).click();
			    driver.findElement(By.id("cpassword")).sendKeys("pass");
			    Thread.sleep(30000);
			    driver.findElement(By.cssSelector("input:nth-child(34)")).click();
		
		    
		    driver.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		hospitalRegistration t1=new hospitalRegistration();
		t1.invokeBrowser();

	}

}
