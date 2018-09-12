package com.framework.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.framework.generics.IAutoConstrant;

public class BaseClass implements IAutoConstrant {
	
	public static WebDriver driver;

	static {
		
		System.setProperty(GECKO_KEY, GECKO_PATH);
		System.setProperty(CHROME_PATH, CHROME_PATH);

	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demosite.center/wordpress/wp-login.php");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		driver.quit();
	}

}
