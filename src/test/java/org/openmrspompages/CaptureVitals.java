package org.openmrspompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaptureVitals extends BaseClass{
	
	public CaptureVitals() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="(//a[@type='button'])[4]")
	private WebElement capture; 
	
	@FindBy(id="patient-search")
	private WebElement Search;

	public WebElement getCapture() {
		return capture;
	}

	public WebElement getSearch() {
		return Search;
	}
	
	public void CaptureVital() {
		click(getCapture());
		click(getSearch());
	}
	
}
