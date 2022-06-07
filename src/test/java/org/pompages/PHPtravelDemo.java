package org.pompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class PHPtravelDemo extends BaseClass {
	
	public PHPtravelDemo() {
		PageFactory.initElements(driver, this);
	}
	//Link Select
	@FindBy(xpath="(//a[@target='_blank'])[5]")
	private WebElement CustomerLogin ;

	public WebElement getCustomerLogin() {
		return CustomerLogin;
	}
	
	public void Demosite() throws InterruptedException {
		click(getCustomerLogin());
		Threadsleep(2000);
		
		
	}

}
