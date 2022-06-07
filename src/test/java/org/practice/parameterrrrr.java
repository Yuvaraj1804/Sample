package org.practice;

import java.util.Date;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class parameterrrrr extends BaseClass{
	
	SoftAssert s=new SoftAssert();
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("firefox");
		urlLaunch("https://www.facebook.com/");
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
	@Test(dataProvider="Login",dataProviderClass=Dataaaaa.class)
	private void test1(String user,String pass) throws InterruptedException {
		
		
		WebElement textUsername = driver.findElement(By.id("email"));
		sendKeys(textUsername, user);
		String Username = getAttribute(textUsername);
		s.assertNotEquals(Username, "Yuva","verify username");
		
		WebElement textPassword = driver.findElement(By.id("pass"));
		textPassword.sendKeys(pass);
		String Password = getAttribute(textPassword);
		s.assertEquals(Password,"1234", "verify password");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
