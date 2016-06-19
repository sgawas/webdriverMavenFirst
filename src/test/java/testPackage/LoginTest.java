package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	//public WebDriver driver; 
	
	@BeforeSuite
	public void setUp(){
		
		System.out.println("this is before suite");
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new FirefoxDriver();
	}

	@Test
	public void doLogin(){
		System.out.println("this is test method");
//		driver.get("https://gmail.com");
//		driver.findElement(By.xpath("//*[@id='gmail-sign-in']")).click();
//		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("suraj@gmail.com");
//		driver.findElement(By.xpath("//*[@id='next']")).click();
	}
	
	@AfterSuite
	public void tearDown(){
		System.out.println("this is after suite method");
//		driver.close();
//		driver.quit();
	}
}
