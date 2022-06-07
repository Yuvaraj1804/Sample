package org.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	public static WebDriver driver;
	
	@BeforeClass
	private void beforeClass() {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Before Class");
	}
	@AfterClass
	private void afterClass() {
		driver.quit();
		System.out.println("After Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("Start Time" +d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("End Time" +d);
	}
	@Test
	private void test1() {
		WebElement textUsername = driver.findElement(By.id("email"));
		textUsername.sendKeys("yuvaraj");
		WebElement textPassword = driver.findElement(By.id("pass"));
		textPassword.sendKeys("1234");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
