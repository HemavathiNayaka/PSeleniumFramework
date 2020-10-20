package TestPackage;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.testng.annotations.Test;
import Base.Baseclass;

public class EditPatient extends Baseclass{
	
	@Test
	
	public void EditPatient() throws InterruptedException
	{

		Baseclass Baseobj = new Baseclass();
		 
		 driver.findElement(By.xpath("//div[@id='patientMenu']/a[.='Patients']")).click();
		 
		 driver.findElement(By.xpath("//div[@id='editPatientMenu']")).click();
		 driver.findElement(By.xpath("//form[@class='patient-search-form ng-pristine ng-valid']//input[@placeholder='MRN']")).sendKeys(Baseobj.num + "\n");
		 Thread.sleep(200);
		  
		  if(!driver.findElement(By.xpath("//div[@name='patientMobileNumner']/input")).getAttribute("value").isEmpty())
		  {
			  driver.findElement(By.xpath("//div[@name='patientMobileNumner']/input")).clear();
			  driver.findElement(By.xpath("//div[@name='patientMobileNumner']/input")).sendKeys("76543212");
		  }
		  else
		  {
			  driver.findElement(By.xpath("//div[@name='patientMobileNumner']/input")).sendKeys("76543212");
		  }
		  
		  if(!driver.findElement(By.xpath("//div[@name='patientPhoneHome']/input")).getAttribute("value").isEmpty())
		  {
			  driver.findElement(By.xpath("//div[@name='patientPhoneHome']/input")).clear();
			  driver.findElement(By.xpath("//div[@name='patientPhoneHome']/input")).sendKeys("76543212");
		  }
		  else
		  {
			  driver.findElement(By.xpath("//div[@name='patientPhoneHome']/input")).sendKeys("76543212");
		  }
		  
		  if(!driver.findElement(By.xpath("//div[@name='patientPhoneBusiness']/input")).getAttribute("value").isEmpty())
		  {
			  driver.findElement(By.xpath("//div[@name='patientPhoneBusiness']/input")).clear();
			  driver.findElement(By.xpath("//div[@name='patientPhoneBusiness']/input")).sendKeys("76543212");
		  }
		  else
		  {
			  driver.findElement(By.xpath("//div[@name='patientPhoneBusiness']/input")).sendKeys("76543212");
		  }
		  
		  if(!driver.findElement(By.xpath("//div[@name='patientEmail']/input")).getAttribute("value").isEmpty())
		  {
			  driver.findElement(By.xpath("//div[@name='patientEmail']/input")).clear();
			  driver.findElement(By.xpath("//div[@name='patientEmail']/input")).sendKeys("Auto@test.com");
		  }
		  else
		  {
			  driver.findElement(By.xpath("//div[@name='patientEmail']/input")).sendKeys("Auto@test.com");
		  }
		  
		  
		  driver.findElement(By.xpath("//form[@name='patientForm']/div[1]/div[5]/div[3]/div[2]/button[@type='button']")).click();
		  driver.findElement(By.cssSelector("[data-id='5'] .pt-listbox-item-label")).click();
		
		  
		  driver.findElement(By.xpath("//form[@name='patientForm']/div[1]/div[5]/div[4]/div[2]/button[@type='button']")).click();
		  driver.findElement(By.cssSelector(" [data-id='2'] .pt-listbox-item-label")).click();
		
		  driver.findElement(By.xpath("//button[@id='add-patient']//span[@class='pt-text']")).click();
		 
		 Assert.assertEquals(driver.findElement(By.xpath("//body[@id='schedulerBodyElement']/div[@id='successDialog']//div[@class='ng-binding ng-scope']")).getText(), "Patient details are updated successfully.");
		 
		driver.findElement(By.cssSelector(".primary-button .pt-button")).click();
		CreateAppointment();
}
	
	public void CreateAppointment() throws InterruptedException{
		
		driver.findElement(By.cssSelector("[p-label='labelLocalization\\(\\'Create Appointment\\'\\)'] .pt-text")).click();
		
		driver.findElement(By.xpath("//form[@name='appointmentForm']/div/div[1]/div[5]/div[2]/input[2]")).sendKeys("Samhitha" + "\n");
		
		driver.findElement(By.xpath("//form[@name='appointmentForm']/div/div[2]/div[1]/div/input[2]")).sendKeys("Computed Tomography" + "\n");
		
		driver.findElement(By.xpath("//form[@name='appointmentForm']/div/div[2]/div[3]/div/input[2]")).sendKeys("CT-chest" + "\n");
		
		driver.findElement(By.xpath("//form[@name='appointmentForm']/div/div[2]/div[4]/div/input[2]")).sendKeys("HIGH" + "\n");
		
		driver.findElement(By.xpath("//form[@name='appointmentForm']/div/div[2]/div[5]/div/input[2]")).sendKeys("Nurse" + "\n");
		
		driver.findElement(By.xpath("//form[@name='appointmentForm']/div/div[2]/div[6]/div/input[2]")).sendKeys("Goutham" + "\n");
		
		driver.findElement(By.xpath("//form[@name='appointmentForm']//button[@id='save-appointment']")).click();
		
		Thread.sleep(600);
		
		if ( driver.findElement(By.xpath("//div[@id='customErrorDialog']//div[.='Performer is not available. Do you want to continue?']")).isDisplayed())
		{
			Thread.sleep(600);
			driver.findElement(By.xpath("//div[@id='customErrorDialog']/div[@class='pt-dialog-content-placeholder']//button[1]")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//div[@id='scheduleSuccessDialog']/div[2]//div[2]/button[1]")).click();
		}
		else
		{
			driver.findElement(By.xpath("//div[@id='scheduleSuccessDialog']/div[2]//div[2]/button[1]")).click();
		}
	}
}
