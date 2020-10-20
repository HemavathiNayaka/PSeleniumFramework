package TestPackage;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Baseclass;
import TestPackage.LoginPage;

	public class UploadMasterData extends Baseclass{
			
		@Test
		
		public void UploadMasterData_Facility() throws InterruptedException{
			try {
			driver.findElement(By.linkText("Upload Master Data")).click();
		int Flag = 0,i=0,j=0;	
			driver.findElement(By.xpath("//div[@class='lookupListDiv text-center']/div/button[@type='button']")).click();
		        List<WebElement> alllinks = driver.findElements(By.tagName("li"));
		        String h1 [] = new String[15];
		        for(WebElement link : alllinks)
		        {
		            h1[i] = link.getText();	            
		            if((h1[i].isEmpty()))
		            {
		            	;
		            }
		            else
		            {
		            i++;  
		            }
		        }  
		      h1[i++]="Referrer";
		      h1[i++]="Room";
		      h1[i++]="UnscheduledOrderCheckList";
		      h1[i++]="WaitlistOrderCheckList";		      
		      System.out.println("Value of I"+i);	       
		        driver.findElement(By.xpath("//div[@class='lookupListDiv text-center']/div/button[@type='button']")).click();	       
		        for(String masterfile : h1)
		        {
		        	if (!(masterfile.equals(null)) || masterfile.isEmpty())
		        	{
		        	Flag++;
		        	if(Flag >10)
		        	{
		        		driver.findElement(By.xpath("//div[@class='lookupListDiv text-center']/div/button[@type='button']")).click();
		            	Thread.sleep(1000);
		            	goto_EOL(Flag);
		            	driver.findElement(By.xpath("//ul/li["+Flag+"]/div[@class='pt-listbox-item-layout-container']/div[@class='pt-truncation-wrapper']/div[@class='pt-listbox-item-label']")).click();
		            	Thread.sleep(1000);
		            	driver.findElement(By.xpath("//button[@id='uploadButton']")).click();
				        Thread.sleep(100);
				        driver.findElement(By.xpath("//input[@id='fileName']")).sendKeys("C:/Users/320035634/OneDrive - Philips/Desktop/All Folders/Java Framework/Goutham/Scheduler/MasterData/Upload Master Data/"+masterfile+".xls");
				        Thread.sleep(5000);
				        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
				        Thread.sleep(5000);
		        	}
		        	else
		        	{
		        driver.findElement(By.xpath("//div[@class='lookupListDiv text-center']/div/button[@type='button']")).click();
		       
		        driver.findElement(By.xpath("//div[@class='pt-listbox-item-label'][contains(text(),'"+masterfile+"')]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//button[@id='uploadButton']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//input[@id='fileName']")).sendKeys("C:/Users/320035634/OneDrive - Philips/Desktop/All Folders/Java Framework/Goutham/Scheduler/MasterData/Upload Master Data/"+masterfile+".xls");
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		        Thread.sleep(5000);
		        	}
		        	}
		        }
		        } catch (Exception e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		        }
		}	

		@Test
		
		public void UploadMasterData_Enterprise() throws InterruptedException{
			try {
			driver.findElement(By.linkText("Upload Master Data")).click();
		int Flag = 0,i=0,j=0;	
			driver.findElement(By.xpath("//div[@class='lookupListDiv text-center']/div/button[@type='button']")).click();
		        List<WebElement> alllinks = driver.findElements(By.tagName("li"));
		        String h1 [] = new String[7];
		        for(WebElement link : alllinks)
		        {
		            h1[i] = link.getText();	            
		            if((h1[i].isEmpty()))
		            {
		            	;
		            }
		            else
		            {
		            i++;  
		            }
		        }  
	      	       
		        driver.findElement(By.xpath("//div[@class='lookupListDiv text-center']/div/button[@type='button']")).click();	       
		        for(String masterfile : h1)
		        {
		        	if (!(masterfile.equals(null)) || masterfile.isEmpty())      	{
		        	
		        	
		        driver.findElement(By.xpath("//div[@class='lookupListDiv text-center']/div/button[@type='button']")).click();
		       
		        driver.findElement(By.xpath("//div[@class='pt-listbox-item-label'][contains(text(),'"+masterfile+"')]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//button[@id='uploadButton']")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//input[@id='fileName']")).sendKeys("C:/Users/320035634/OneDrive - Philips/Desktop/All Folders/Java Framework/Goutham/Scheduler/MasterData/Upload Master Data/"+masterfile+".xls");
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		        Thread.sleep(5000);
		        
		        	}
		        }
		        } catch (Exception e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		        }
		}			
		
		
		
		 public void goto_EOL(int i)
		    {
		        try {
		            String temp="//ul/li["+i+"]/div[@class='pt-listbox-item-layout-container']/div[@class='pt-truncation-wrapper']/div[@class='pt-listbox-item-label']";
		            By test= By.xpath(temp);
		            JavascriptExecutor je = (JavascriptExecutor) driver;
		            WebElement element = driver.findElement(test);
		            je.executeScript("arguments[0].scrollIntoView(true);",element);
		            je.executeScript("arguments[0].scrollIntoView(false);",element);
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		            //tearDown();
		        }
		           
		    }
	}
					

