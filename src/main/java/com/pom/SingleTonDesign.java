package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesign {

	public static WebDriver driver;

	public SingleTonDesign(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public LoginPage getLoginPage() {
		LoginPage l = new LoginPage(driver);
		return l;
	}

	public SignupPage getSignupPage() {
		SignupPage sp = new SignupPage(driver);
		return sp;
	}

}
