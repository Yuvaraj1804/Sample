package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver ;
	
	// 1.Launch Browser
	public static WebDriver browserLaunch(String browserName) {
		switch (browserName) {
		
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break ;
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break ;
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break ;
		default:
			System.err.println("Invalid browser");
		}	
		return driver;
	}
	
	// 2.url Launch
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	// 3.Get title
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	// 4.Get Current url
	public static String getCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	// 5.quit
	public static void quit() {
		driver.quit();
	}
	
	//6. find Element
	public static WebElement findElement(String locatorName,String locatorValue) {
		WebElement value=null;
		if(locatorName.equals("id")) {
			 value = driver.findElement(By.id(locatorValue));
		}else if (locatorName.equals("name")) {
			value = driver.findElement(By.name(locatorValue));
		}else if (locatorName.equals("xpath")) {
			value = driver.findElement(By.xpath(locatorValue));
	}
		return value;
	}
	
	// 7.sendKeys 
	public static void sendKeys(WebElement e,String user) {
		e.sendKeys(user);
	}
	
	// 8.getAttribute
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
	
	// 9.getText
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	
	// 10.click
	public static void click(WebElement e) {
		e.click();
	}
	
	// 11.dynamic Wait
	 public static void Wait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	// 12.Static wait
	 public static void Threadsleep(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	
	 //Actions
	 // 13.moveToElement
	 public static void moveToElement(WebElement e) {
		 Actions a=new Actions(driver);
		 a.moveToElement(e).perform();
	}
	 
	//14.drag And Drop
	 public static void dragAndDrop(WebElement scr,WebElement des) {
		 Actions a=new Actions(driver);
		 a.dragAndDrop(scr, des).perform();
	}
	 
	 //15.click And Hold
	 public static void clickAndHold(WebElement scr,WebElement des) {
		 Actions a=new Actions(driver);
		 a.clickAndHold(scr).release(des).perform();
	}
	
	 //16.rightClick
	 public static void rightClick(WebElement e) {
		 Actions a=new Actions(driver);
		 a.contextClick(e).perform();
	}
	 
	 //17.doubleClick
	 public static void doubleClick(WebElement e) {
		 Actions a=new Actions(driver);
		 a.doubleClick(e).perform();
	}
	 
	 //18.clear
	 public static void clear(WebElement e) {
		 e.clear();
	 }
	 
	 //19.copy text
	 public static void copytext(WebElement e) throws AWTException {
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_C);
	 }
	 
	//20.paste text
	public static void pastetext(WebElement e) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		 }
		
	//21.select by Index
	public static void selectByIndex(WebElement e,int index) {
			 Select s=new Select(e);
			 s.selectByIndex(index);
		}
	 
    // 22.select By Value
	public static void selectByValue(WebElement e,String Value) {
		 Select s=new Select(e);
		 s.selectByValue(Value);
	}
	
	//23.Select By text
	public static void selectByVisibleText(WebElement e,String Value) {
		 Select s=new Select(e);
		 s.selectByVisibleText(Value);
	}
	
	//24.First Selected Option
	public static void firstSelectedOption(WebElement e) {
		Select s=new Select(e);
		s.getFirstSelectedOption();
	}
	
	//25.deSelected by index
	public static void deselectbyindex(WebElement e,int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);
	}
	
	//26.deSelected by value
	public static void deselectbyvalue(WebElement e,String Value) {
		Select s=new Select(e);
		s.deselectByValue(Value);
	}
	
	//27.deSelected by text
	public static void deselectbyVisibleText(WebElement e,String Value) {
		Select s=new Select(e);
		s.deselectByVisibleText(Value);
	}
	
	//28.deSelectAll
	public static void deselectAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
	}
	
	//29.takeScreenShot
	public static void takeScreenShot(String url) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr= tk.getScreenshotAs(OutputType.FILE);
		File des=new File(url);
		FileUtils.copyFile(scr, des);
	}
	
	//30.Java Script Executor Send keys
	public static void jsSendkeys(WebElement e,String user) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+user+"')", e );
	}
	
	//31.Java Script Executor using Click
	public static void jsClick(WebElement e) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	
	//32.Scroll up
	public static void scrollUp(WebElement e) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("argumants[0].scroolIntoView(true)", e);
	}
	
	//33.Scroll down
		public static void scrollDown(WebElement e) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("argumants[0].scroolIntoView(flase)", e);
		}
	
	//34.Switch to Frame index
		public static void frameindex(int index) {
			driver.switchTo().frame(index);
			
		}
	
	//34.Switch to Frame index
		public static void frame(WebElement e) {
			driver.switchTo().frame(e);		
		}
	
	//35.Switch out from Frame
		public static void frameOut() {
			driver.switchTo().defaultContent();
		}
			
	//36.Switch out from Frame one by one
		public static void parentFrame() {
			driver.switchTo().parentFrame();
		}
	
	//37.Window Handle 
		public static String parentId() {
			String LocatorName = driver.getWindowHandle();
			return LocatorName;
		}
	
	//38.Window Handles
		public static Set<String> allIds() {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
		}
		
	//39.Navigate Back
		public static void navigateBack() {
			driver.navigate().back();
		}
		
	//39.Navigate Forward
		public static void navigateForward() {
			driver.navigate().forward();
		}	
		
	//40.Navigate Refresh
		public static void navigaterefresh() {
			driver.navigate().refresh();
		}	
		
	//41.Alert
		public static Alert alert() {
			Alert alert = driver.switchTo().alert();
			return alert;
		}
		
	//41.Alert Accept
		public static Alert alertAccept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			return alert;	
		}
	
	//42.Alert Reject
		public static Alert alertReject() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			return alert;
		}
		
	//43.Excel value
		public static String getExcelValue(String name,String sheetName,int rowNo,int cellNo) throws IOException {
			File loc=new File("D:\\Users\\Yuvaraj\\eclipse-workspace\\MavenProject\\src\\test\\resources\\"+name+".xlsx");
			FileInputStream fi=new FileInputStream(loc);
			Workbook w=new XSSFWorkbook(fi);
			Sheet s = w.getSheet(sheetName);
			Row r = s.getRow(rowNo);
			Cell cell = r.getCell(cellNo);
			int type = cell.getCellType();
			String value=null;
			if(type==1) {
				 value = cell.getStringCellValue();
			}
			else {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date d = cell.getDateCellValue();
					SimpleDateFormat si=new SimpleDateFormat("dd-MMM-yyyy");
					value =si.format(d);
				}
				else {
					double db = cell.getNumericCellValue();
					long ln=(long)db;
					value = String.valueOf(ln);
				}
			}
			return value;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	
	 
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

