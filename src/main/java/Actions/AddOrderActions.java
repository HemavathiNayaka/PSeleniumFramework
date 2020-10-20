package Actions;

import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Baseclass;
import Locators.AddOrderLocators;;

public class AddOrderActions {
	 DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	 Date date = new Date();
	 String date1= dateFormat.format(date);

	AddOrderLocators AddOrderLocators= new AddOrderLocators();
	
	public  void AddOrderclick(WebDriver driver) 
	{
		driver.findElement(AddOrderLocators.AddOrder1).click();
		driver.findElement(AddOrderLocators.MRN).sendKeys("B23456");
		System.out.print("Inside order actions");
	}
	
	public  void MRNSearch(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.MRN).sendKeys("34074421");
		
	}
	public  void PatientSearch(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.PatientSearch).click();
		
	}
	public  void VisitID(WebDriver driver, String visit) 
	{		
		driver.findElement(AddOrderLocators.VisitID).sendKeys(visit);
		
	}
	public  void VisitType(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.VisitType).click();
	
	}
	public  void VisitTypeList(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.VisitTypeList).click();	
	}
	public  void AdmitDate(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.AdmitDate).sendKeys(date1);	
	}
	public  void Vip(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.Vip).click();	
	}
	public  void Pregnant(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.Pregnant).click();	
	}
	public  void Referrer(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.Referrer).click();	
	}
	public  void ReferrerList(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.ReferrerList).click();	
	}
	public  void Priority(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.Priority).click();	
	}
	public  void PriorityList(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.PriorityList).click();	
	}
	public  void Reason(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.Reason).sendKeys("Automate");	
	}
	public  void Modality(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.Modality).click();	
	}
	public  void ModalityList(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.ModalityList).click();	
	}
	public  void Procedure(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.Procedure).click();	
	}
	public  void ProcedureList(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.ProcedureList).click();	
	}
	public  void ClinicalInfo(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.ClinicalInfo).sendKeys("This is an automated clinical info");	
	}
	public  void Notes(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.Notes).sendKeys("This is a automed notes");	
	}
	public  void SaveOrder(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.SaveOrder).click();	
	}
	public  void SuccessMessage(WebDriver driver) 
	{		
		driver.findElement(AddOrderLocators.SuccessMessage).getText();	
	}

}
