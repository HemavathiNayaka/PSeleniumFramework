package TestPackage;

import Actions.UploadMasterDataActions;
import Base.Baseclass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Actions.DeleteWaitListActions;

public class DeleteWaitLtChecklist extends Baseclass {
	

	
	@Test
	public void DeleteWaitLtChecklist() throws InterruptedException
	{
		try {
            driver.findElement(By.xpath("//div[@id='orderDetails']/div[@class='content order-detail-container']/div/div[@class='pt-content-panel']/div[2]//table[@class='otherAppointmentDetails-table table table-striped']//tr[@class='ng-scope']/td[5]/div//i[@class='fa fa-ellipsis-v']")).click();
            Thread.sleep(3000);
            System.out.println("Click on elipses icon");
            driver.findElement(By.linkText("Delete")).click();
            Thread.sleep(3000);
            System.out.println("Click on delete button");
            driver.findElement(By.xpath("//div[@id='deleteChecklistDialog']/div[@class='pt-dialog-content-placeholder']/div/div[2]/button[1]//span[@class='pt-text']")).click();
            Thread.sleep(3000);
            System.out.println("Checklist item not deleted");
            
            
            
            driver.findElement(By.xpath("//div[@id='orderDetails']/div[@class='content order-detail-container']/div/div[@class='pt-content-panel']/div[2]//table[@class='otherAppointmentDetails-table table table-striped']//tr[@class='ng-scope']/td[5]/div//i[@class='fa fa-ellipsis-v']")).click();
            Thread.sleep(3000);
            System.out.println("Click on elipses icon");
            driver.findElement(By.linkText("Delete")).click();
            Thread.sleep(3000);
            System.out.println("Click on delete button");
            driver.findElement(By.xpath("//div[@id='deleteChecklistDialog']/div[@class='pt-dialog-content-placeholder']/div/div[2]/button[2]")).click();
            Thread.sleep(3000);
            System.out.println("Checklist item deleted");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
