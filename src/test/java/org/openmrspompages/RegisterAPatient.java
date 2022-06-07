package org.openmrspompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterAPatient extends BaseClass{
	
	public RegisterAPatient() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@type='button'])[4]")
	private WebElement register ;

	@FindBy(name="givenName")
	private WebElement givenName ;

	@FindBy(name="familyName")
	private WebElement familyName ;

	@FindBy(id="next-button")
	private WebElement nextButton ;

	@FindBy(id="gender-field")
	private WebElement genderField ;

	@FindBy(id="birthdateDay-field")
	private WebElement birthdateDayField ;

	@FindBy(id="birthdateMonth-field")
	private WebElement birthdateMonthField ;

	@FindBy(id="birthdateYear-field")
	private WebElement birthdateYearField ;
	
	@FindBy(id="address1")
	private WebElement address1 ;

	@FindBy(id="cityVillage")
	private WebElement cityVillage ;
	
	@FindBy(id="stateProvince")
	private WebElement stateProvince ;
	
	@FindBy(id="country")
	private WebElement country ;
	
	@FindBy(id="postalCode")
	private WebElement postalCode ;
	
	@FindBy(name="phoneNumber")
	private WebElement phoneNumber ;
	
	@FindBy(id="relationship_type")
	private WebElement relationshipType ;
	
	@FindBy(xpath="(//input[@type='text'])[15]")
	private WebElement personName ;
	
	@FindBy(id="submit")
	private WebElement submit ;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getGivenName() {
		return givenName;
	}

	public WebElement getFamilyName() {
		return familyName;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getGenderField() {
		return genderField;
	}

	public WebElement getBirthdateDayField() {
		return birthdateDayField;
	}

	public WebElement getBirthdateMonthField() {
		return birthdateMonthField;
	}

	public WebElement getBirthdateYearField() {
		return birthdateYearField;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getCityVillage() {
		return cityVillage;
	}

	public WebElement getStateProvince() {
		return stateProvince;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getRelationshipType() {
		return relationshipType;
	}

	public WebElement getPersonName() {
		return personName;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public void Register() {
		click(getRegister());
		
		sendKeys(getGivenName(), "Yuvaraj");
		sendKeys(getFamilyName(), "Varatharajan");
		click(getNextButton());
		
		Select s=new Select(genderField);
		s.selectByVisibleText("Male");
		click(getNextButton());
		
		sendKeys(getBirthdateDayField(), "18");
		Select s1=new Select(birthdateMonthField);
		s1.selectByVisibleText("December");
		sendKeys(getBirthdateYearField(), "1998");
		click(getNextButton());
		
		sendKeys(getAddress1(), "Kancheepuram");
		sendKeys(getCityVillage(), "Kancheepuram");
		sendKeys(getStateProvince(), "Tamil Nadu");
		sendKeys(getCountry(), "India");
		sendKeys(getPostalCode(), "603406");
		click(getNextButton());
		
		Wait(20);
		sendKeys(getPhoneNumber(), "8682838456");
		click(getNextButton());
		
		Select s2=new Select(relationshipType);
		s2.selectByValue("8d91a210-c2cc-11de-8d13-0010c6dffd0f-A");
		sendKeys(getPersonName(), "Varatharajan");
		click(getNextButton());
		
		click(getSubmit());
	}
	
	
	
}
