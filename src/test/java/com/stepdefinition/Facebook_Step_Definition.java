package com.stepdefinition;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pom.SingleTonDesign;
import com.property.ConfigurationHelper;
import com.runner.Facebook_Test_Runner;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import Baseclass.Base_class_A;
import Data_Driven.Xls_Reader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Facebook_Step_Definition extends Base_class_A {
	public static WebDriver driver = Facebook_Test_Runner.driver;
	public static SingleTonDesign std = new SingleTonDesign(driver);
	
	
	@Given("^enter the url$")
	public void enter_the_url() throws Throwable {	
		
		String url=ConfigurationHelper.getinstance().geturl();
		geturl(url);
		maxi();
		// driver.get("https://www.facebook.com");
		// driver.manage().window().maximize();
	}
	@When("^user can get the text in the home page$")
	public void user_can_get_the_text_in_the_home_page() throws Throwable {	
		get_text(std.getLoginPage().getUser());
		// WebElement text = driver.findElement(By.tagName("h2"));
		// get_text(text);
		// System.out.println(text.getText());
	}
	@When("^user enter the username$")
	public void user_enter_the_username() throws Throwable {
//		String username= ConfigurationHelper.getinstance().getusername();
//		sendkey(std.getLoginPage().getUsername(), username);
		
		
//		sendkey(std.getLoginPage().getUsername(), "mail2nandha@gmail.com");

		WebElement username = driver.findElement(By.id("email"));
//		String value= Xls_Reader.particulardata("facebook", 1, 0);
//		sendkey(username, value);
		username.sendKeys("mailnandhaa@gmail.com");
		sleep();
	}
	@When("^user enter the passwrd$")
	public void user_enter_the_passwrd() throws Throwable {
		String passwrd= ConfigurationHelper.getinstance().getpass();
		sendkey(std.getLoginPage().getPassword(),passwrd);
//		 WebElement password = driver.findElement(By.id("pass"));
//		 sendkey(password, "nandha");
		// enable(password);
//password.sendKeys("nandha");
	}
	@Then("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		click(std.getLoginPage().getLogin());
//		WebElement login = driver.findElement(By.name("login"));
//		click(login);
//		login.click();
		Thread.sleep(5000);
	}
	@When("^user take a screenshot of the page$")
	public void user_take_a_screenshot_of_the_page() throws Throwable {

		screenshot("loginpage");

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\shakt\\eclipse-workspace\\Seleniumm\\Screenshot \\" +screen+ "  .png");
//		File destination = new File("C:\\Users\\shakt\\eclipse-workspace\\ipt_Facebook\\screenshot\\fb.png");

//		FileUtils.copyFile(source, destination);
		Thread.sleep(2000);
	}

	@Then("^user click the back button to go to main page$")
	public void user_click_the_back_button_to_go_to_main_page() throws Throwable {
		back();
//		driver.navigate().back();
	}

	@Given("^user click the create account button$")
	public void user_click_the_create_account_button() throws Throwable {
click(std.getLoginPage().getcreateaccount());
//		WebElement creataccnt = driver.findElement(By.xpath("(//*[@role='button'])[2]"));
//		click(creataccnt);
//		creataccnt.click();
		Thread.sleep(2000);
	}

	@When("^user enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		sendkey(std.getSignupPage().getfirstname(), "nandhu");
//		WebElement firstname = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
//		sendkey(firstname, "nan");
//		firstname.sendKeys("nan");
		Thread.sleep(2000);
	}

	@When("^user enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		sendkey(std.getSignupPage().getlastname(), "s");
//		WebElement lastname = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
//		sendkey(lastname, "s");
//		lastname.sendKeys("n");
		Thread.sleep(2000);
	}

	@When("^user enter the mailid$")
	public void user_enter_the_mailid() throws Throwable {
		sendkey(std.getSignupPage().getemail(),"mail@gmail.com");
//		WebElement mailid = driver.findElement(By.xpath("(//*[@type='text'])[4]"));
//		sendkey(mailid, "mail@gmail.com");
//		mailid.sendKeys("nan@gmail.com");
		Thread.sleep(2000);
	}

	@When("^user enter the re-entry emailid$")
	public void user_enter_the_re_entry_emailid() throws Throwable {
		sendkey(std.getSignupPage().getreenteremail(), "mail@gmail.com");
//		WebElement remailid = driver.findElement(By.xpath("(//*[@type='text'])[5]"));
//		sendkey(remailid, "mail@gmail.com");
//		mailid.sendKeys("nan@gmail.com");
		Thread.sleep(2000);
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
		sendkey(std.getSignupPage().getpasswrd(), "nan@123");
//		WebElement passwrd = driver.findElement(By.xpath("(//*[@type='password'])[2]"));
//		sendkey(passwrd, "nan@123");
//		passwrd.sendKeys("nan@123");
		Thread.sleep(2000);
	}

	@When("^user select the date in day$")
	public void user_select_the_date_in_day() throws Throwable {
		
		selectbyvalue(std.getSignupPage().getday(), "5");
//		WebElement date = driver.findElement(By.id("day"));
//		click(date);
//		selectbyvalue(date, "5");

//		date.click();
//		Select s = new Select(date);
//		s.selectByValue("5");
		Thread.sleep(2000);

	}

	@When("^user select the month$")
	public void user_select_the_month() throws Throwable {
		WebElement month = driver.findElement(By.id("month"));
//		click(month);
		selectbyvalue(month, "5");

//		month.click();
//		Select s1 = new Select(month);
//		s1.selectByValue("5");
		sleep();
	}

	@When("^user select the year$")
	public void user_select_the_year() throws Throwable {
		selectbyvalue(std.getSignupPage().getyear(), "1994");
//		WebElement year = driver.findElement(By.id("year"));
//		click(year);
//		selectbyvalue(year, "1994");

//		year.click();
//		Select s2 = new Select(year);
//		s2.selectByValue("1994");
		Thread.sleep(2000);
	}

	@When("^user select the gender$")
	public void user_select_the_gender() throws Throwable {
		click(std.getSignupPage().getgender());
//		WebElement gender = driver.findElement(By.xpath("//*[text()='Male']"));
//		click(gender);
//		gender.click();
		Thread.sleep(2000);
	}

	@When("^user click the signup button$")
	public void user_click_the_signup_button() throws Throwable {
		click(std.getSignupPage().getsubmit());
//		WebElement signin = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
//		click(signin);
//		signin.click();
		Thread.sleep(15000);
	}

	@Then("^user take a screenshots of the page$")
	public void user_take_a_screenshots_of_the_page() throws Throwable {
		screenshot("signup page");

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
		// File destination = new
		// File("C:\\Users\\shakt\\eclipse-workspace\\ipt_Facebook\\screenshot\\fb1
		// .png");

//		File destination = new File("C:\\Users\\shakt\\eclipse-workspace\\Seleniumm\\Screenshot\\ " +screen+ "  .png");
//		FileUtils.copyFile(source, destination);
		Thread.sleep(1000);

	}

}
