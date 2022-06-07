
package org.openmrspompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends BaseClass{
	public login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName ;
	
	@FindBy(id="password")
	private WebElement password ;
	
	@FindBy(id="Inpatient Ward")
	private WebElement InpatientWard ;
	
	@FindBy(id="loginButton")
	private WebElement loginButton ;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getInpatientWard() {
		return InpatientWard;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void LoginOpenMrs(String user,String pass) {
	sendKeys(getUserName(), user);
	sendKeys(getPassword(), pass);
	click(getInpatientWard());
	click(getLoginButton());
	}

}

