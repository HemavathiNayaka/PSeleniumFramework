package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.util.Random;




public class Baseclass {
	
	 public static WebDriver driver;
	 public static Properties prop;
	 public static String Browser;
	 public static String url;
	 public static String username;	
	 public static String pwd;	
	 public static String num;	
	 //public static String Organization = "Enterprise Organization";
	 ExtentReports extent;
		ExtentTest logger;
	 	 
	@BeforeSuite
	public void LaunchBrowser()

	{
			 prop=new Properties();
		
		try 
		{
			InputStream input=new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Config/config.properties");   
			prop.load(input);
			Browser = prop.getProperty("browser");
			url=prop.getProperty("testsiteurl");
			username = prop.getProperty("username");			
			pwd = prop.getProperty("pwd");
			RandomNumGenerator();
			
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		} 
		

		if (Browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
			System.getProperty("user.dir") + "/Drivers/GeckoDriver/geckodriver.exe");
			driver = new FirefoxDriver();

		}

		if (Browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "/Drivers/ChromeDriver/chromedriver.exe");
			System.out.println(System.getProperty("user.dir") + "/Drivers/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();

		}

		if (Browser.contains("IE")) {
			System.setProperty("webdriver.ie.driver",
			System.getProperty("user.dir") + "/Drivers/IEDriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	
	}	
	
	
	public void RandomNumGenerator()
	{
		
		Random rand = new Random();
		num = String.valueOf(rand.nextInt(900000000)+1000000000); 
		System.out.println("Random number is: " +num);
		
	}
	
}
