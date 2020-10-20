package TestPackage;

import Actions.UploadMasterDataActions;
import Base.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Actions.UnschORLtChecklistActions;

public class UnschORLtChecklist extends Baseclass {
	
	Edit_Orderschecklist Edit_order = new Edit_Orderschecklist();
	DeleteUnSchORLtChecklist Delete_order = new DeleteUnSchORLtChecklist();
	
	@Test
	public void UnschORLtChecklist() throws InterruptedException
	{
		try {

            driver.findElement(By.xpath("//thead[@id='unsched-orders-thead']/tr[@class='reset-filters']/th[2]/div[2]/button[@type='button']")).click();
            Thread.sleep(3000);
            System.out.println("click checklist filter");
            Thread.sleep(500);
            //driver.findElement(By.xpath("//div[@id='mCSB_1_container']/ul/li[5]/div[@class='pt-listbox-item-layout-container']")).click();
            driver.findElement(By.xpath("//thead[@id='unsched-orders-thead']/tr[@class='reset-filters']/th[2]/div[2]/input[2]")).sendKeys("None\n");
            Thread.sleep(3000);
            System.out.println("choose checklist filter");
            driver.findElement(By.xpath("//table[@id='unscheduledOrdersTable']/tbody/tr[3]/td[@class='padding-left-8 w-120px']")).click();
            Thread.sleep(3000);
            System.out.println("click on first order in list");
            driver.findElement(By.xpath("//div[@id='orderDetails']//ul[@class='pt-tabpanel']/li[2]/a")).click();
            Thread.sleep(3000);
            System.out.println("Navigated to checklist tab in order details section");
            
            WebElement slider = driver.findElement(By.xpath("//div[@id='schedulerHomePage']/div/div/div/div[3]/div[@class='gutter gutter-vertical']"));
            Thread.sleep(3000); 

            Actions moveSlider = new Actions(driver);
            moveSlider.clickAndHold(slider).moveToElement(driver.findElement(By.xpath("//div[@id='orderDetails']//ul[@class='pt-tabpanel']/li[3]/a"))).release().build().perform();
      
            
            driver.findElement(By.xpath("//form[@name='checklistItemForm']/span")).click();
            Thread.sleep(3000);
            System.out.println("clicked Add new checklist");
            driver.findElement(By.xpath("//div[@id='newChecklistItemElement']/input")).sendKeys("Checklist_item1");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//form[@name='checklistItemForm']/div[@class='ng-scope']/button[2]")).click();
            Thread.sleep(3000);
            System.out.println("click on Save");
            System.out.println("Added new checklist item");
            Thread.sleep(6000);    
            Edit_order.Edit_Orderschecklist();
            Delete_order.DeleteUnSchORLtChecklist();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("Couldn't find element");
        }
	}


}
