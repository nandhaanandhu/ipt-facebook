package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.property.ConfigurationHelper;

import Baseclass.Base_class_A;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/feature/Facebook.feature",
glue = "com.stepdefinition",
monochrome = true,
dryRun=false
//strict=true,
//plugin= {"html:Report/HtmlReport.html",
//		"pretty",
//		"json:Report/jsonReport.json",
//		"junit:Report/xmlReport.xml"
//	//	"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"
//		
//}
)
public class Facebook_Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void stepup() throws IOException {
		String browser= ConfigurationHelper.getinstance().getbrowser();
		
		driver=Base_class_A.setpro(browser);
		driver=Base_class_A.maxi();
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\shakt\\eclipse-workspace\\ipt_Facebook\\driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();

	}

	@AfterClass
	public static void teardown() {
		driver=Base_class_A.close();
		
//		driver.close();

	}

}
