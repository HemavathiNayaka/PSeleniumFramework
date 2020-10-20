package TestPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Baseclass;

public class Edit_Orderschecklist extends Baseclass{

	@Test
	public void Edit_Orderschecklist()  throws InterruptedException
	{
		 try {
	            driver.findElement(By.xpath("/html//div[@id='orderDetails']/div[@class='content order-detail-container']/div/div[@class='pt-content-panel']/div[2]//table[@class='otherAppointmentDetails-table table table-striped']//tr[@class='ng-scope']/td[5]/div//i[@class='fa fa-ellipsis-v']")).click();
	            Thread.sleep(3000);
	            System.out.println("Click on elipses icon");
	            driver.findElement(By.linkText("Edit")).click();
	            Thread.sleep(3000);
	            System.out.println("Click on edit button");
	            String a = driver.findElement(By.xpath("//div[@id='editChecklistItemElement']/input")).getText();
	            String b = a + "_updated";
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//div[@id='editChecklistItemElement']/input")).sendKeys(b);
	            Thread.sleep(3000);
	            System.out.println("Update checklist item");
	            driver.findElement(By.xpath("//form[@name='editChecklistItemForm']/button[1]//span[@class='pt-text']")).click();
	            Thread.sleep(3000);
	            System.out.println("cancelled");
	           
	            driver.findElement(By.xpath("/html//div[@id='orderDetails']/div[@class='content order-detail-container']/div/div[@class='pt-content-panel']/div[2]//table[@class='otherAppointmentDetails-table table table-striped']//tr[@class='ng-scope']/td[5]/div//i[@class='fa fa-ellipsis-v']")).click();
	            Thread.sleep(3000);
	            System.out.println("Click on elipses icon");
	            driver.findElement(By.linkText("Edit")).click();
	            Thread.sleep(3000);
	            System.out.println("Click on edit button");
	            a = driver.findElement(By.xpath("//div[@id='editChecklistItemElement']/input")).getText();
	            a = a + "_updated";
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//div[@id='editChecklistItemElement']/input")).sendKeys(a);
	            Thread.sleep(3000);
	            System.out.println("Update checklist item");
	            driver.findElement(By.xpath("//form[@name='editChecklistItemForm']/button[2]//span[@class='pt-text']")).click();
	            Thread.sleep(3000);
	            System.out.println("Updated");
	           
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

}
