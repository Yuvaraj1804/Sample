package org.pompages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class PHPFlight extends BaseClass {
	
	@FindBy(xpath="//a[text()='flights']")
	private WebElement flightClick ;
	
	@FindBy(id="autocomplete")
	private WebElement fromPlace ;
	
	@FindBy(id="autocomplete")
	private WebElement toPlace ;
	
	@FindBy(id="departure")
	private WebElement departure ;
	
	@FindBy(id="flights-search")
	private WebElement Search ;

	public WebElement getFlightClick() {
		return flightClick;
	}

	public WebElement getFromPlace() {
		return fromPlace;
	}

	public WebElement getToPlace() {
		return toPlace;
	}

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getSearch() {
		return Search;
	}
	
	public void Flight() {
		
		driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		List<String> li=new ArrayList<>();
		li.addAll(allIds);
		driver.switchTo().window(li.get(1));
		click(getFlightClick());
		sendKeys(getFromPlace(), "chennai");
		sendKeys(getToPlace(), "goa");
		clear(getDeparture());
		sendKeys(getDeparture(), "30-06-2022");
		click(getSearch());
	}

}
