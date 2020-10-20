package extentreport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Browserlaunch {	
		
		public static WebDriver driver;
	
		public ExtentHtmlReporter htmlReporter;
		public ExtentReports extent;
		public ExtentTest test;
		public int i = 0;
		
		@BeforeTest
		public void setExtent()
		{
			
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myreport.html");
			htmlReporter.config().setDocumentTitle("Automation Report");
			htmlReporter.config().setReportName("Functional Report");
			
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			extent.setSystemInfo("Hostname", "Localhost");
			extent.setSystemInfo("OS", "Windows10");
			extent.setSystemInfo("tester Name", "Hema");
			extent.setSystemInfo("Browser", "Chrome");			
			
			//test = extent.createTest("title test1");
		}
		
		@BeforeMethod
		public void launchbrowser() throws IOException
		{
			System.out.println("i value: "+i);			
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "/Drivers/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
			
		}
		
		@Test
		public void title_test()
		{
			test = extent.createTest("title test");
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "google");
			
		}
		
		@Test
		public void title_test1()
		{
			test = extent.createTest("title test1");
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google");
			
		}

		
	
		@AfterTest // after all the test case execution
		public void endReport()
		{
			
			extent.flush();
			
		}	
		
		@AfterMethod
		public void tearDown(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				test.log(Status.FAIL, "TEST CASE FAILED IS  "+result.getName());
				test.log(Status.FAIL, "TEST CASE FAILED IS  "+ result.getThrowable());
				String screenshotpath = Browserlaunch.getScreenshot(driver, result.getName());
				test.addScreenCaptureFromPath(screenshotpath);
				
			}else if (result.getStatus()==ITestResult.SKIP){
				test.log(Status.SKIP, "Test Case SKIPPED IS  " +result.getName());
				
			}else if (result.getStatus()==ITestResult.SUCCESS){
				test.log(Status.PASS, "Test Case PASSED IS  " +result.getName());
				
			}
			driver.quit();
		}
		
		public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException
		{
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destination = System.getenv("user.dir")+ "/screenshots/"+ screenshotName+dateName +".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
		}

}
