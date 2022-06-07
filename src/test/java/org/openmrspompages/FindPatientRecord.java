package org.openmrspompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindPatientRecord extends BaseClass{
	
	public FindPatientRecord() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@type='button'])[1]")
	private WebElement patientRecord;

	@FindBy(id="patient-search")
	private WebElement searchId;

	public WebElement getPatientRecord() {
		return patientRecord;
	}

	public WebElement getSearchId() {
		return searchId;
	}
	
	public void findPatient() {
		click(getPatientRecord());
		sendKeys(getSearchId(), "Yuvaraj");
	}
	
	
	
}
