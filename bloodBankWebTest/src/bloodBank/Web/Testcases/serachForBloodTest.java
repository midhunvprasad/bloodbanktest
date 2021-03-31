package bloodBank.Web.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class serachForBloodTest {

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
		    driver.findElement(By.cssSelector("input:nth-child(6)")).click();
		    Thread.sleep(500);
		    driver.findElement(By.linkText("Menu")).click();
		    driver.findElement(By.cssSelector(".links > li:nth-child(1) > a")).click();
		    driver.findElement(By.id("group")).click();
		    driver.findElement(By.id("group")).click();
		    driver.findElement(By.id("bgroup")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("bgroup"));
		      dropdown.findElement(By.xpath("//option[. = 'O-']")).click();
		    }
		    driver.findElement(By.id("bgroup")).click();
		    driver.findElement(By.cssSelector("input:nth-child(15)")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector("input:nth-child(15)"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }

		
		    Thread.sleep(10000);
		    driver.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		serachForBloodTest t1=new serachForBloodTest();
		t1.invokeBrowser();

	}
}
