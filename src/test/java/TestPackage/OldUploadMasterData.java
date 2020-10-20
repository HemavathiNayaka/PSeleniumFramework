package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Actions.UploadMasterDataActions;
import Base.Baseclass;
import Locators.UploadMasterDataLocators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OldUploadMasterData extends Baseclass {
	
	UploadMasterDataActions MD_Actions = new UploadMasterDataActions();
	UploadMasterDataLocators MasterUploadLocators= new UploadMasterDataLocators();
	
	@Test

	public void UploadMasterData() throws InterruptedException
	{
		Thread.sleep(200);
		MD_Actions.AdminOption(driver);
		Thread.sleep(200);
		MD_Actions.UploadOption(driver);
		Thread.sleep(200);
		MD_Actions.DdwnBtn(driver);
		Thread.sleep(200);
		WebElement ddwncount=driver.findElement(MasterUploadLocators.DdwnOptions);
		Thread.sleep(200);
		  int count = ddwncount.findElements(MasterUploadLocators.DdwnOptionslist).size();
		  System.out.println(count);
		  
		  MD_Actions.OptionSelector(driver);
			for (int i = 0; i <= count ; i++)
			{
				MD_Actions.DdwnBtn(driver);
				WebElement countrydropdown=driver.findElement(By.xpath("//div[@id='mCSB_1_container']/ul"));
				List<WebElement> links = countrydropdown.findElements(MasterUploadLocators.DdwnOptionslist);
				System.out.println(links.get(i).getText());
				
				int Modality = i;
				switch(Modality)
				{
				case 0:
		    		if (links.get(i).getText().equals("Priority"))
		    		{
		    			Thread.sleep(400);
		    			links.get(i).click();
		    			Thread.sleep(500);
		    			MD_Actions.UploadFile(driver);
		    			Thread.sleep(500);
		    			MD_Actions.InputFile(driver);
		    			Thread.sleep(500);		    			
		    			MD_Actions.ConfirmButton(driver);
		    			Thread.sleep(2000);
		    			MD_Actions.OkButton(driver);
		    			break;
		    		}
				case 1:
					if (links.get(i).getText().equals("Modality"))
		    		{
		    			Thread.sleep(400);
		    			links.get(i).click();
		    			MD_Actions.UploadFile(driver);
		    			Thread.sleep(500);
		    			MD_Actions.InputFile(driver);
		    			Thread.sleep(500);
		    			MD_Actions.ConfirmButton(driver);
		    			Thread.sleep(2000);
		    			MD_Actions.OkButton(driver);
		    			break;
				     }
				}
			}
	}

}
