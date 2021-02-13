package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//we have to define page factory or Object repository
	
	@FindBy(name="email")
	WebElement useremail;
	
	@FindBy(name="password")
	WebElement password;

	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement SignupButton;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		}
	public void login(String un, String pwd) {
		useremail.sendKeys(un);
		password.sendKeys(pwd);
		SignupButton.click();
	}
     

}
