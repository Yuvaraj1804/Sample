package org.practice;

import org.baseclass.BaseClass;
import org.dataprovider.datas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class dataProvider extends BaseClass {
	
	@Test(dataProvider="Register",dataProviderClass=datas.class)
	private void test1(String User,String pass) {
		browserLaunch("chrome");
		urlLaunch("http://adactinhotelapp.com/");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(User);
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(pass);
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
	@AfterMethod
	private void afterMethod() {
		quit();
	}

}
