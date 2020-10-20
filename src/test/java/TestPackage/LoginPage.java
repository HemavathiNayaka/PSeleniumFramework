
package TestPackage;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Actions.LoginPageActions;
import Base.Baseclass;
import TestPackage.EditPatient;
import org.openqa.selenium.Keys;


public class LoginPage extends Baseclass {
	
	LoginPageActions Login_Actions = new LoginPageActions();

	Baseclass Baseobj = new Baseclass(); 
	EditPatient E = new EditPatient();
	PatientRegistration Patientreg = new PatientRegistration();
	
	UnschORLtChecklist Unschorder = new UnschORLtChecklist();
	WaitLtChecklist Waitlist = new WaitLtChecklist();
	UploadMasterData Uploadmaster= new UploadMasterData();
	EditPatient Editpat = new EditPatient();
	

		@Test

		public void ApplicationLaunch() throws InterruptedException
		{
		
			driver.get(url);
			Thread.sleep(200);
			Login_Actions.Warn1click(driver);
			Thread.sleep(200);
			Login_Actions.Warn2click(driver);

		}
		
/*		@Test

		public void LoginTest_Orders() throws InterruptedException
		{

						
			driver.findElement(By.xpath("//form[@name='loginForm']/div[1]//input[2]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Kingdom of Saudi Arabia" + "\n");   
			        
			driver.findElement(By.xpath("//div[@id='usernane-input-text-box']/input")).sendKeys("310268165");
			        
			driver.findElement(By.xpath("//div[@id='text-box']/input")).sendKeys("Philips@M0");
	        driver.findElement(By.xpath("//button[@id='button']")).click();
			Thread.sleep(500);

			//Patientreg.PatientRegistration();
			Editpat.EditPatient();
			driver.findElement(By.xpath("//img[@id='dropdownMenu']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("Log off")).click();
		    Thread.sleep(3000);
				
		}*/
		
/*		@Test

		public void LoginTest_Checklist() throws InterruptedException
		{

			
			
			driver.findElement(By.xpath("//form[@name='loginForm']/div[1]//input[2]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Kingdom of Saudi Arabia" + "\n"); 
			
			driver.findElement(By.xpath("//div[@id='usernane-input-text-box']/input")).sendKeys("310268165");
			        
			driver.findElement(By.xpath("//div[@id='text-box']/input")).sendKeys("Philips@M0");
	        driver.findElement(By.xpath("//button[@id='button']")).click();
			Thread.sleep(500);
			Unschorder.UnschORLtChecklist();
			Waitlist.WaitLtChecklist();
			driver.findElement(By.xpath("//img[@id='dropdownMenu']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("Log off")).click();
		    Thread.sleep(3000);
			
		}*/
		
/*		@Test

		public void LoginTest_FacilityAdmin() throws InterruptedException
		{

			driver.findElement(By.xpath("//form[@name='loginForm']/div[1]//input[2]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"TEST new" + "\n");
			
			driver.findElement(By.xpath("//div[@id='usernane-input-text-box']/input")).sendKeys("310268165");
			        
			driver.findElement(By.xpath("//div[@id='text-box']/input")).sendKeys("Philips@M0");
	        driver.findElement(By.xpath("//button[@id='button']")).click();
			Thread.sleep(500);
			Uploadmaster.UploadMasterData_Facility();
			driver.findElement(By.xpath("//img[@id='dropdownMenu']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("Log off")).click();
		    Thread.sleep(3000);

		}*/
		
		
/*		@Test

		public void LoginTest_EnterpriseAdmin() throws InterruptedException
		{
   
			driver.findElement(By.xpath("//form[@name='loginForm']/div[1]//input[2]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Enterprise Organization" + "\n");
	        
			driver.findElement(By.xpath("//div[@id='usernane-input-text-box']/input")).sendKeys("310268165");
			        
			driver.findElement(By.xpath("//div[@id='text-box']/input")).sendKeys("Philips@M0");
	        driver.findElement(By.xpath("//button[@id='button']")).click();
			Thread.sleep(500);
			Uploadmaster.UploadMasterData_Enterprise();
			driver.findElement(By.xpath("//img[@id='dropdownMenu']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("Log off")).click();
		    Thread.sleep(3000);

		}*/
}
