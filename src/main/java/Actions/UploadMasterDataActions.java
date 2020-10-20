package Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Baseclass;
import Locators.LoginPageLocators;
import Locators.UploadMasterDataLocators;


public class UploadMasterDataActions 
{
	
	UploadMasterDataLocators MasterUploadLocators= new UploadMasterDataLocators();
	
	public  void AdminOption(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.AdminOption).click();
	}

	public void UploadOption(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.UploadOption).click();
	}

/*	public void DdwnBtn(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.DdwnBtn).click();
	}*/
	
	public void DdwnOptions(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.DdwnOptions).click();
	}
	
	public void OptionSelector(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.OptionSelector).click();
	}
	public void UploadFile(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.UploadFile).click();
	}
	public void ConfirmButton(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.ConfirmButton).click();
	}
	public void OkButton(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.OkButton).click();
	}
	public void InputFile(WebDriver driver) 
	{
		driver.findElement(MasterUploadLocators.InputFile).sendKeys("C:/Users/320025634/Desktop/Scheduler/MasterData/Priority.xls");
	}

	public void DdwnBtn(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


		


}


