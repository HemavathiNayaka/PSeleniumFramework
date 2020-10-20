package extentreport;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.Baseclass;
import TestPackage.LoginPage;
import TestPackage.PatientRegistration;

import org.testng.ITestResult;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExtentReportsClass  extends Baseclass{

	ExtentReports extent;
	ExtentTest logger; 
	LoginPage Loginobj = new LoginPage();
	Baseclass Baseobj = new Baseclass();
	PatientRegistration Patientobj = new PatientRegistration();
		
	@BeforeTest
	public void startTest(){
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/STMExtentReport.html",true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}
	
	
	
	
/*	@Test
	public void LaunchBrowser() 
	{
		
		logger = extent.startTest("LaunchBrowser");
		Baseobj.LaunchBrowser();
		logger.log(LogStatus.PASS, "Test case passed is LaunchBrowser");
	
		
		
	}*/
	

	@Test
	public void ApplicationLaunch() throws InterruptedException
	{
		
		
		logger = extent.startTest("ApplicationLaunch");
		
		LaunchBrowser();
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://130.147.136.118/#/home");
		
	
		/*
		
		driver.get("https://130.147.136.118/#/home");
		Thread.sleep(200);
	
		driver.findElement(By.id("details-button")).click();
		
		Thread.sleep(200);		
		
		driver.findElement(By.id("proceed-link")).click();*/
		
		//Loginobj.ApplicationLaunch();
		//assert for application title.
		logger.log(LogStatus.PASS, "Test case passed is ApplicationLaunch");
	}	
	
	/*
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		logger = extent.startTest("LoginTest");
		Loginobj.LoginTest();
		//assert for application title.
		logger.log(LogStatus.PASS, "Test case passed is LoginTest");
	}
	
	@Test
	public void PatientRegistration() throws InterruptedException
	{
		logger = extent.startTest("PatientRegistration");
		Patientobj.PatientRegistration();
		//assert for application title.
		logger.log(LogStatus.PASS, "Test case passed is PatientRegistration");
	}

*/
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "Test case failed is: "+result.getName());
			logger.log(LogStatus.FAIL, "Test case failed is: "+result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.SKIP)
		{
			logger.log(LogStatus.SKIP, "Test case skipped is: "+result.getName());
		}
		extent.endTest(logger);		
	}
	
	@AfterTest
	public void endReport(){
		extent.flush();
		extent.close();
	}
}
