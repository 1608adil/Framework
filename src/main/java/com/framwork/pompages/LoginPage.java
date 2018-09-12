package com.framwork.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	@FindBy(id="user_login")
	WebElement Un;

	@FindBy(id="user_pass")
	WebElement ps;

	@FindBy(id="wp-submit")
	WebElement loginbutton;
	
//	@FindBy(xpath="//h2[text()='Welcome to WordPress!']")
//	WebElement welcometext;
//	
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void login_hrm(String uid, String pass) {
		Un.sendKeys(uid);
		ps.sendKeys(pass);
		loginbutton.click();
	}
	
//	public void setUserName() {
//		
//	}
//	public void setpassword() {
//		
//	}
//	public void setloginbutton() {
//		
//	}
	

}
