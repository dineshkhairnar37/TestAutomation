package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPagTest extends TestBase{

	LoginPage loginPage;
	public LoginPagTest() {
		super();
		
	}

	@BeforeMethod
	public void setUp() {
		
		initiaization();
		loginPage = new LoginPage();
		
	}
	
	@Test
	public void LoginPageTitle() {
		
		
	}
	
}
	

