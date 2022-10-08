package com.data;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Data_Driven.Xls_Reader_Facebook;



public class Data_Driven_facebook {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shakt\\eclipse-workspace\\ipt_Zohoproject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		driver.navigate().to("https://www.zoho.com/login.html");
		
		WebElement signup = driver.findElement(By.xpath("//*[text()='Sign Up Now']"));
		signup.click();
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("emailfield"));
		String value=Xls_Reader_Facebook.particulardata("zoho", 1, 0);
		
	username.sendKeys(value);
	
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.id("password"));
	String value1=Xls_Reader_Facebook.particulardata("zoho", 1, 1);
	
	password.sendKeys(value1);
	Thread.sleep(2000);
	
	WebElement radiobutton = driver.findElement(By.xpath("//*[@class='sign_agree']/span[@id='signup-termservice']"));

	radiobutton.click();
	
	Thread.sleep(2000);
	
	WebElement login = driver.findElement(By.id("signupbtn"));
	login.click();
	
		
	
		
		
	}

}
