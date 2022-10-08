package com.facebook_project;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.analysis.function.Sin;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.SingleTonDesign;
import com.property.ConfigurationHelper;

import Baseclass.Base_class_A;

public class Facebook extends Base_class_A{
 public static WebDriver driver;
public static SingleTonDesign std;
	public static void main(String[] args) throws Throwable {
		String browser= ConfigurationHelper.getinstance().getbrowser();
		driver=setpro(browser);
	 std= new SingleTonDesign(driver);
				String url=ConfigurationHelper.getinstance().geturl();
				geturl(url);
				maxi();
				String username= ConfigurationHelper.getinstance().getusername();
				sendkey(std.getLoginPage().getUsername(), username);

				String pass= ConfigurationHelper.getinstance().getpass();
				sendkey(std.getLoginPage().getPassword(), pass);
				
				click(std.getLoginPage().getLogin());
				
			sleep();
		
		
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\shakt\\eclipse-workspace\\Nandhaa_Project\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.google.co.in/");
//		driver.manage().window().maximize();
//
//		driver.navigate().to("https://www.facebook.com");
//
//		WebElement text = driver.findElement(By.tagName("h2"));
//		System.out.println(text.getText());
//
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("mailnandhaa@gmail.com");
//
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("nandha");
//
//		WebElement login = driver.findElement(By.name("login"));
//		login.click();
//		Thread.sleep(5000);

			/*
			 * TakesScreenshot ts = (TakesScreenshot) driver; File source =
			 * ts.getScreenshotAs(OutputType.FILE); String screen = null; File destination =
			 * new File("C:\\Users\\shakt\\eclipse-workspace\\Seleniumm\\Screenshot "
			 * +screen+ "  .png"); FileUtils.copyFile(source, destination);
			 * Thread.sleep(2000);
			 * 
			 * driver.navigate().back();
			 * 
			 * WebElement creataccnt =
			 * driver.findElement(By.xpath("(//*[@role='button'])[2]")); creataccnt.click();
			 * Thread.sleep(2000);
			 * 
			 * WebElement firstname =
			 * driver.findElement(By.xpath("(//*[@type='text'])[2]"));
			 * firstname.sendKeys("nan"); Thread.sleep(2000);
			 * 
			 * WebElement lastname = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
			 * lastname.sendKeys("n"); Thread.sleep(2000);
			 * 
			 * WebElement mailid = driver.findElement(By.xpath("(//*[@type='text'])[4]"));
			 * mailid.sendKeys("nan@gmail.com"); Thread.sleep(2000);
			 * 
			 * WebElement confrmailid =
			 * driver.findElement(By.xpath("(//*[@type='text'])[5]"));
			 * confrmailid.sendKeys("nan@gmail.com"); Thread.sleep(2000);
			 * 
			 * WebElement passwrd =
			 * driver.findElement(By.xpath("(//*[@type='password'])[2]"));
			 * passwrd.sendKeys("nan@123"); Thread.sleep(2000);
			 * 
			 * WebElement date = driver.findElement(By.id("day")); date.click(); Select s =
			 * new Select(date); s.selectByValue("5"); Thread.sleep(2000);
			 * 
			 * WebElement month = driver.findElement(By.id("month")); month.click(); Select
			 * s1 = new Select(month); s1.selectByValue("5"); Thread.sleep(2000);
			 * 
			 * WebElement year = driver.findElement(By.id("year")); year.click(); Select s2
			 * = new Select(year); s2.selectByValue("1994"); Thread.sleep(2000);
			 * 
			 * WebElement gender = driver.findElement(By.xpath("//*[text()='Male']"));
			 * gender.click(); Thread.sleep(2000);
			 * 
			 * WebElement signin = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
			 * signin.click(); Thread.sleep(2000);
			 * 
			 * TakesScreenshot ts1 = (TakesScreenshot) driver; File sources =
			 * ts1.getScreenshotAs(OutputType.FILE); String screens = null; File
			 * destinations = new
			 * File("C:\\Users\\shakt\\eclipse-workspace\\Seleniumm\\Screenshot " +screens+
			 * "  .png"); FileUtils.copyFile(sources, destinations); Thread.sleep(2000);
			 */
	}
}
