package bloodBank.Web.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class donorRegistrationTest {

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
			
			driver.get("http://localhost:3000/registration");
			testFunction();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void testFunction() {
		try {
		    driver.get("http://localhost:3000/registration");
		  
		    driver.findElement(By.id("fname")).click();
		    driver.findElement(By.id("fname")).sendKeys("Midhun");
		    driver.findElement(By.id("lname")).click();
		    driver.findElement(By.id("lname")).sendKeys("prasad");
		    driver.findElement(By.id("mailid")).click();
		    driver.findElement(By.id("mailid")).sendKeys("Midhunvprasad@gmail.com");
		    driver.findElement(By.id("mobile1")).click();
		    driver.findElement(By.id("mobile1")).sendKeys("5149437746");
		    driver.findElement(By.id("mobile2")).click();
		    driver.findElement(By.id("mobile2")).sendKeys("1234567890");
		    driver.findElement(By.id("city")).click();
		    driver.findElement(By.id("city")).click();
		    driver.findElement(By.id("countries")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("countries"));
		      dropdown.findElement(By.xpath("//option[. = 'Usa']")).click();
		    }
		    driver.findElement(By.id("countries")).click();
		    driver.findElement(By.id("group")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("group"));
		      dropdown.findElement(By.xpath("//option[. = 'O-']")).click();
		    }
		    driver.findElement(By.id("group")).click();
		    driver.findElement(By.id("birthday")).click();
		    driver.findElement(By.id("birthday")).sendKeys("1998-12-09");
		    driver.findElement(By.cssSelector("fieldset")).click();
		    driver.findElement(By.id("lastdate")).click();
		    driver.findElement(By.id("lastdate")).sendKeys("2021-03-11");
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).sendKeys("pass");
		    driver.findElement(By.id("confirmpassword")).click();
		    driver.findElement(By.id("confirmpassword")).sendKeys("pass");
		
		    Thread.sleep(10000);
		    driver.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		donorRegistrationTest t1=new donorRegistrationTest();
		t1.invokeBrowser();

	}

}
