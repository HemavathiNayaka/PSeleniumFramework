package TestPackage;

import Actions.UploadMasterDataActions;
import Base.Baseclass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Actions.WaitLtChecklistActions;

public class WaitLtChecklist extends Baseclass {
	
	Edit_WaitList_checklist Edit_Waitlist= new Edit_WaitList_checklist();
	DeleteWaitLtChecklist Delete_Waitlist= new DeleteWaitLtChecklist();
	
	
	@Test
	public void WaitLtChecklist() throws InterruptedException
	{
		try {
	           
            driver.findElement(By.xpath("//li[@data-id = 'wait-list']")).click();
            Thread.sleep(3000);
            System.out.println("click on waitlist tab");
            driver.findElement(By.xpath("//thead[@id='waitlist-orders-thead']/tr[@class='reset-filters']/th[2]/div[2]/button[@type='button']")).click();
            Thread.sleep(3000);
            System.out.println("click checklist filter");
            driver.findElement(By.xpath("//thead[@id='waitlist-orders-thead']/tr[@class='reset-filters']/th[2]/div[2]/input[2]")).sendKeys("None\n");
            Thread.sleep(3000);
            System.out.println("checklist filter select");
            driver.findElement(By.xpath("//table[@id='waitlistOrderTable']/tbody/tr[1]")).click();
            Thread.sleep(3000);
            System.out.println("click on an order in list");
            driver.findElement(By.xpath("//div[@id='orderDetails']/div[@class='content order-detail-container']//ul[@class='pt-tabpanel']/li[2]")).click();
            Thread.sleep(3000);
            System.out.println("Navigate to checklist tab in order details section");
            driver.findElement(By.xpath("//form[@name='checklistItemForm']/span")).click();
            Thread.sleep(3000);
            System.out.println("click Add new checklist");
            driver.findElement(By.xpath("//div[@id='newChecklistItemElement']/input")).sendKeys("Checklist_item1");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//form[@name='checklistItemForm']/div[@class='ng-scope']/button[2]")).click();
            Thread.sleep(3000);
            System.out.println("Added new checklist item");
            Thread.sleep(6000);   
            Edit_Waitlist.Edit_WaitList_checklist();
            Delete_Waitlist.DeleteWaitLtChecklist();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("Couldn't find element");
        }

	}
}
