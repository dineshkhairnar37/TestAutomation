package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

 public static  WebDriver driver;
    public static Properties prop;
	
	public TestBase(){
	
		try {
			
			prop= new Properties();
			FileInputStream ip = new FileInputStream("D:\\Selenium files\\Workplace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		
		}catch(IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void initiaization() {
		
		String BrowserName= prop.getProperty("browser");
	   if(BrowserName.equals("chrome")) {
	System.getProperty("webdriver.chrome.driver", "D:\\Selenium files\\Drivers\\ChromeBrowser\\chromedriver_win32\\");
	  driver= new ChromeDriver();
	  driver.get(prop.getProperty("url"));
	  
	  
	   }
	
	}

	
}
