package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	@FindBy(tagName = "h2")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}

	@FindBy(id = "email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "(//*[@role='button'])[2]")
	private WebElement createaccount;

	public WebElement getcreateaccount() {
		return createaccount;
	}

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
