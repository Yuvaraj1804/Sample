package org.openmrspompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAnAppointment extends BaseClass {
	
	public BookAnAppointment() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@type='button'])[5]")
	private WebElement Appointment;
	
	@FindBy(xpath="(//a[@type='button'])[5]")
	private WebElement AppointmentRequest;

	public WebElement getAppointment() {
		return Appointment;
	}

	public WebElement getAppointmentRequest() {
		return AppointmentRequest;
	}
	public void BookAppointment() {
		click(getAppointment());
		click(getAppointmentRequest());
	}
	
}
