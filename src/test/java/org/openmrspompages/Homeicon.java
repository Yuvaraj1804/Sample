package org.openmrspompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeicon extends BaseClass{
	
	public Homeicon() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='icon-home small']")
	private WebElement home;

	public WebElement getHome() {
		return home;
	}
	
	public void home() {
		click(getHome());
	}
}
