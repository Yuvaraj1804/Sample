package org.practice;

import java.util.Date;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAsserttttt extends BaseClass{
	
	SoftAssert s=new SoftAssert();
	@BeforeClass
	private void beforeClass() {
		WebDriverManager.firefoxdriver().setup();
		browserLaunch("firefox");
		urlLaunch("https://www.facebook.com/");
		String url = getCurrenturl();
		boolean con = url.contains("1234book");
		s.assertFalse(con,"verify url");
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
		sendKeys(textUsername, "yuva");
		String Username = getAttribute(textUsername);
		Assert.assertNotEquals(Username, "Yuva","verify username");
		
		WebElement textPassword = driver.findElement(By.id("pass"));
		textPassword.sendKeys("1234");
		String Password = getAttribute(textPassword);
		s.assertEquals(Password,"1234", "verify password");
		
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
