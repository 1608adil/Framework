package com.framework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.framework.generics.Lib;
import com.framwork.pompages.LoginPage;

public class ValidLogin extends BaseClass {
	 Logger logger = Logger.getLogger(ValidLogin.class);

	@Test
	public void LoginApp() throws InterruptedException {

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		String username = Lib.getCellValue("Valid", 1, 0);
		String password = Lib.getCellValue("Valid", 1, 1);
		
		loginPage.login_hrm(username, password);
		logger.info("Successfully login");

		boolean displayed = driver.findElement(By.xpath("//h2[text()='Welcome to WordPress!']")).isDisplayed();
		Assert.assertTrue(displayed);
		logger.info("login page varified");
	}

}
