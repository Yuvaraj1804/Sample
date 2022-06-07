package org.practice;

import java.util.Date;
import org.baseclass.BaseClass;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataaaaa extends BaseClass{
	
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
	@DataProvider(name="Login",indices= {0,2},parallel=true)
	private Object[][] Data() {
		
	Object[][] obj=new Object[][] {
		{"yuvaraj","12345"},
		{"varathan","125879"},
		{"divya","48569"}
	};
	return obj;

	}
}
