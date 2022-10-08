package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	public static WebDriver driver;

	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement firstname;

	public WebElement getfirstname() {
		return firstname;
	}

	@FindBy(xpath = "(//*[@type='text'])[3]")
	private WebElement lastname;

	public WebElement getlastname() {
		return lastname;
	}

	@FindBy(xpath = "(//*[@type='text'])[4]")
	private WebElement email;

	public WebElement getemail() {
		return email;
	}

	@FindBy(xpath = "(//*[@type='text'])[5]")
	private WebElement reenteremail;

	public WebElement getreenteremail() {
		return reenteremail;
	}

	@FindBy(xpath = "(//*[@type='password'])[2]")
	private WebElement passwrd;

	public WebElement getpasswrd() {
		return passwrd;
		
	}
	@FindBy(id = "day")
	private WebElement day ;

	public WebElement getday() {
		return day;
	}
	
	@FindBy(id = "month")
	private WebElement month;

	public WebElement getmonth() {
		return month;
	}	
	@FindBy(id= "year")
	private WebElement year;

	public WebElement getyear() {
		return year;
	}	
	@FindBy(xpath = "//*[text()='Male']")
	private WebElement gender;

	public WebElement getgender() {
		return gender;
	}	
	@FindBy(xpath = "(//*[@type='submit'])[2]")
	private WebElement submit;

	public WebElement getsubmit() {
		return submit;
	}	
	
	
	
	
	public SignupPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
}
