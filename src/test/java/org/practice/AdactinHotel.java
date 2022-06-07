package org.practice;

import java.util.Date;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AdactinHotel extends BaseClass{ 
	
	SoftAssert s=new SoftAssert();
	
	@BeforeClass
	private void beforeClass() throws InterruptedException {
		browserLaunch("chrome");
		urlLaunch("http://adactinhotelapp.com/");
		
	}
	@AfterClass
	private void afterClass() {
		driver.quit();
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("Before start time "+d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("After End time "+d);
	}
    @Parameters({"username","password"})
	@Test
	private void test1() {
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("Yuvaraj98");
		String atuser = getAttribute(txtUsername);
		s.assertEquals("verify username","Yuvaraj98", atuser);
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Inaraht@04");
		String atPass = getAttribute(txtUsername);
		s.assertEquals("verify username","Inaraht@04", atPass);
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
	@Test
	private void test2() {
		WebElement location = driver.findElement(By.id("location"));
		Select l=new Select(location);
		l.selectByVisibleText("Paris");
		String atLocation = getAttribute(location);
		s.assertEquals("verify location","Paris", atLocation);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select h=new Select(hotels);
		h.selectByVisibleText("Hotel Sunshine");
		String athotels = getAttribute(hotels);
		s.assertEquals("verify hotels","Hotel Sunshine", athotels);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select r=new Select(roomType);
		r.selectByVisibleText("Double");
		String atroomType = getAttribute(roomType);
		s.assertEquals("verify room type","Double", atroomType);
		
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select rn=new Select(roomNos);
		rn.selectByVisibleText("2 - Two");
		String atroomNos = getAttribute(roomNos);
		s.assertEquals("verify room nos","2", atroomNos);
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		checkIn.sendKeys("29/05/2022");
		String atcheckIn = getAttribute(checkIn);
		s.assertEquals("verify datepick in","29/05/2022", atcheckIn);
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();
		checkOut.sendKeys("30/05/2022");
		String atcheckOut = getAttribute(checkOut);
		s.assertEquals("verify datepick out","30/05/2022", atcheckOut);
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select ar=new Select(adultRoom);
		ar.selectByVisibleText("2 - Two");
		String atadultRoom = getAttribute(adultRoom);
		s.assertEquals("verify adultRoom","2", atadultRoom);
		
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select cr=new Select(childRoom);
		cr.selectByVisibleText("0 - None");
		String atchildRoom = getAttribute(childRoom);
		s.assertEquals("verify childRoom","0", atchildRoom);
		
		WebElement Submit = driver.findElement(By.id("Submit"));
		Submit.click();
	}
	@Test
	private void test3() {
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		
		WebElement btncontinue = driver.findElement(By.id("continue"));
		btncontinue.click();
	}
	@Parameters()
	@Test
	private void test4() throws InterruptedException {
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Yuvaraj");
		String atfirstName = getAttribute(firstName);
		s.assertEquals("verify firstName","Yuvaraj", atfirstName);
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("Varatharajan");
		String atlastName = getAttribute(lastName);
		s.assertEquals("verify lastName","Varatharajan", atlastName);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("No.23,Anna Nagar,Uthiramerur,Kancheepuram.603406");
		String ataddress = getAttribute(address);
		s.assertEquals("verify address","No.23,Anna Nagar,Uthiramerur,Kancheepuram.603406", ataddress);
		
		WebElement ccNo = driver.findElement(By.id("cc_num"));
		ccNo.sendKeys("1234567891234567");
		String atccNo = getAttribute(ccNo);
		s.assertEquals("verify ccNo","1234567891234567", atccNo);
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select cc=new Select(ccType);
		cc.selectByVisibleText("Master Card");
		String atccType = getAttribute(ccType);
		s.assertEquals("verify ccType","MAST", atccType);
		
		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select ccm=new Select(ccExpMonth);
		ccm.selectByVisibleText("December");
		String atccExpMonth = getAttribute(ccExpMonth);
		s.assertEquals("verify ccExpMonth","12", atccExpMonth);
		
		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		Select ccy=new Select(ccExpYear);
		ccy.selectByVisibleText("2022");
		String atccExpYear = getAttribute(ccExpYear);
		s.assertEquals("verify ccExpYear","2022", atccExpYear);
		
		WebElement ccCVV = driver.findElement(By.id("cc_cvv"));
		ccCVV.sendKeys("123");
		String atccCVV = getAttribute(ccCVV);
		s.assertEquals("verify ccCVV","123", atccCVV);
		
		WebElement btnBooknow = driver.findElement(By.id("book_now"));
		btnBooknow.click();
		Threadsleep(5000);
	}
	@Test
	private void test5() {
		WebElement orderNo = driver.findElement(By.id("order_no"));
		System.out.println("Order Number = "+orderNo.getAttribute("value"));
	}
}
