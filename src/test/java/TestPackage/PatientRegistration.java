package TestPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.junit.Assert;

import Base.Baseclass;
import TestPackage.AddOrder;


public class PatientRegistration extends Baseclass {

	AddOrder A = new AddOrder();
	Baseclass Baseobj = new Baseclass(); 
	
	

	@Test
	
		public void PatientRegistration() throws InterruptedException {
	
			//driver.findElement(By.xpath("//div[@id='patientMenu']/a[.='Patients']")).click();
			driver.findElement(By.xpath("//div[@id='patientMenu']/a[.='Patient Administration']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='add-new-patient-mrn-textbox']/input[@placeholder='MRN']")).sendKeys(Baseobj.num);
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@name='patientInstitution']/button[@type='button']")).click();
			Thread.sleep(500);
			driver.findElement(By.cssSelector("[data-id='1'] .pt-listbox-item-label")).click();
			driver.findElement(By.xpath("//div[@name='newPatientAlternateID']/input[@placeholder='Alternate ID']")).sendKeys("5876543442"); //random generate for 10 digit.
			driver.findElement(By.xpath("//div[@name='patientMPI']/input[@placeholder='MPI']")).sendKeys("9876543332");
			driver.findElement(By.xpath("//div[@id='add-new-patient-firstName-textbox']/input[@placeholder='First Name']")).sendKeys("Harry");
			driver.findElement(By.xpath("//div[@name='patientMiddleName']/input[@placeholder='Middle Name']")).sendKeys("Kinney");
			driver.findElement(By.xpath("//div[@name='patientMaidenName']/input[@placeholder='Third Name']")).sendKeys("Randal");
			driver.findElement(By.xpath("//div[@name='patientLastName']/input[@placeholder='Last Name']")).sendKeys("Jose");
			
			driver.findElement(By.xpath("//form[@name='patientForm']/div[1]/div[3]/div[1]/div[@required='required']/button[@type='button']")).click();
			driver.findElement(By.cssSelector("[data-id='2'] .pt-listbox-item-layout-container")).click();
			
			//driver.findElement(By.xpath("//form[@name='patientForm']/div[1]/div[3]/div[2]/div[2]/button[@type='button']")).click();
			//driver.findElement(By.cssSelector("[data-id='2'] .pt-listbox-item-label")).click();
			
			//driver.findElement(By.xpath("//form[@name='patientForm']/div[1]/div[3]/div[3]/div[2]/button[@type='button']")).click();
			//driver.findElement(By.cssSelector("[data-id='2'] .pt-listbox-item-label")).click();
			
			driver.findElement(By.xpath("//tasy-wdatetimepicker[@id='datepickerAddNewPatient2']/div/div//input")).sendKeys("12.02.1992");
			
			driver.findElement(By.xpath("//form[@name='patientForm']/div[1]/div[5]/div[3]/div[2]/button[@type='button']")).click();
			driver.findElement(By.cssSelector("[data-id='1'] .pt-listbox-item-label")).click();
			
		
			
		/*	driver.findElement(By.xpath("//form[@name='patientForm']/div[1]/div[5]/div[4]/div[2]/button[@type='button']")).click();
			driver.findElement(By.cssSelector("[data-id='1'] .pt-listbox-item-label")).click(); */
			
		
			
			driver.findElement(By.xpath("//div[@name='patientMobileNumner']/input[@placeholder='Mobile Number']")).sendKeys("9186567811");
			driver.findElement(By.xpath("//div[@name='patientPhoneHome']/input[@placeholder='Phone Home']")).sendKeys("12865678");
			driver.findElement(By.xpath("//div[@name='patientPhoneBusiness']/input[@placeholder='Phone Business']")).sendKeys("23365678");
			driver.findElement(By.xpath("//div[@name='patientEmail']/input[@placeholder='Email']")).sendKeys("Auto@test.com");
			
			driver.findElement(By.xpath("//button[@id='add-patient']")).click();
			
			String sucess = driver.findElement(By.xpath("//body[@id='schedulerBodyElement']/div[@id='successDialog']//div[@class='ng-binding ng-scope']")).getText();
			
			Assert.assertEquals(sucess, "Patient is created successfully.");
			
			driver.findElement(By.cssSelector(".primary-button .pt-button")).click();
			
			driver.findElement(By.xpath("//form[@name='patientForm']/div[3]/button[1]")).click();	
			
			A.OrderEntry();
			//create appointment can also be called.
			//put patient registartion in one function so that it can be called no.of times but make sure order entry is called once. Edit patient also should be done in same way.
			
		
	}
	
	


}
