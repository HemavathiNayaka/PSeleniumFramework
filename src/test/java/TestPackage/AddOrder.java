package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import Base.Baseclass;

public class AddOrder extends Baseclass {

	Baseclass Baseobj = new Baseclass();
	
	@Test

	public void AddOrder() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@id='orderMenu']/a[.='Patients']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//form[@name='patientAppointmentSearch']/div[1]/input[@placeholder='MRN']")).sendKeys("22171836" + "\n");
		Thread.sleep(600);
		
		driver.findElement(By.cssSelector("[p-identifier] [data-id='viewOrders'] .pt-tab-title")).click();
		driver.findElement(By.xpath("//div[@class='add-new-item-div ng-binding ng-scope']")).click();
				
		Thread.sleep(600);				
		OrderEntry();
	}
	
	public void OrderEntry() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder='Visit ID']")).sendKeys(Baseobj.num); //random generate, pick last five digits. 
		Thread.sleep(600);

		driver.findElement(By.xpath("//form[@name='addOrderPatientDetails']/div[1]/div[2]//input[2]")).sendKeys("Inpatient" + "\n");
		Thread.sleep(600);

		//driver.findElement(By.xpath("//tasy-wdatetimepicker[@id='datepickerAdmitDate']/div/div//input")).sendKeys("12/02/1992" + "\n");		

		driver.findElement(By.xpath("//form[@name='addOrderPatientDetails']/div[2]/div[1]//input[2]")).sendKeys("Paddy" + "\n");

		driver.findElement(By.xpath("//form[@name='addOrderPatientDetails']/div[2]/div[2]//input[2]")).sendKeys("HIGH" + "\n");

		//driver.findElement(By.xpath("//div[@id='visitId']/input[@placeholder='Reason']")).sendKeys("Test");
		driver.findElement(By.xpath("//form[@name='addOrderPatientDetails']/div[2]/div[3]/div[@required='required']/input[2]")).sendKeys("heart attack"+ "\n");

		driver.findElement(By.xpath("//form[@name='addOrderPatientDetails']/div[2]/div[4]//input[2]")).sendKeys("Computed" + "\n");
		Thread.sleep(600);

		driver.findElement(By.xpath("//form[@name='addOrderPatientDetails']/div[2]/div[5]//input[2]")).sendKeys("ct-chest" + "\n");

		driver.findElement(By.xpath("//textarea[@name='clinicalInformation']")).sendKeys("test");

		driver.findElement(By.xpath("//textarea[@name='notes']")).sendKeys("test");

		driver.findElement(By.xpath("//div[@class='back-button pull-right']/button[2]")).click();
		Thread.sleep(1000);
		
		String SuMessage = driver.findElement(By.xpath("//div[@class='view-order-container']/div//p[@class='ng-binding']")).getText();
		
		System.out.println("successful message is: "+SuMessage);
		
		 Thread.sleep(2000);


		 int OrderEntry = Integer.parseInt(SuMessage.replaceAll("[^0-9]", ""));
		 
		 String OrderID = "VHISName" + OrderEntry;	
        
        System.out.println(OrderID);
        
        driver.findElement(By.xpath("//div[@id='viewOrderOrderId']/input[@placeholder='Order ID']")).sendKeys(OrderID + "\n");
      
        Assert.assertEquals(driver.findElement(By.xpath("//table//p[@class='ng-binding']")).getText(), OrderID);
		System.out.print("order successfull");
        
        
        
		// Search newly created order in above order table
	/*	String SuMessage = driver.findElement(By.xpath("//div[@class='view-order-container']/div//p[@class='ng-binding']")).getText();
		Thread.sleep(500);
		System.out.println("Success MSG= "+SuMessage);*/
	    /*driver.findElement(By.xpath("//div[@id='viewOrderOrderId']/input[@placeholder='Order ID']")).sendKeys(SuMessage + "\n");
		Assert.assertEquals(driver.findElement(By.xpath("//table//p[@class='ng-binding']")).getText(), SuMessage);
		System.out.print("order successfull");*/
	}

}
