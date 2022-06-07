package org.openmrspompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPatientRecord extends BaseClass {
	
	public ViewPatientRecord() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="patient-search-results-table")
	private WebElement patientResult;

	public WebElement getPatientResult() {
		return patientResult;
	}
	
	public void ViewPatient() {
		WebElement allData = patientResult.findElement(By.tagName("td"));
		if(allData.equals("Yuvaraj")) {
			click(getPatientResult());
		}
	}
	
	
	
	
}
