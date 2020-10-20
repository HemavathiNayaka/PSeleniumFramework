package Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Baseclass;

import Locators.WaitLtChecklistLocators;


public class WaitLtChecklistActions {

	WaitLtChecklistLocators WaitltChkLtLocators= new WaitLtChecklistLocators();
	
	public  void Waitlist(WebDriver driver) 
	{
		driver.findElement(WaitltChkLtLocators.Waitlist).click();
	}

	public  void Checklist(WebDriver driver) 
	{
		driver.findElement(WaitltChkLtLocators.Checklist).click();
	}
	public  void Checklistfilter(WebDriver driver) 
	{
		driver.findElement(WaitltChkLtLocators.Checklistfilter).click();
	}
	public  void First_OR(WebDriver driver) 
	{
		driver.findElement(WaitltChkLtLocators.First_OR).click();
	}
	public  void ChkltTab(WebDriver driver) 
	{
		driver.findElement(WaitltChkLtLocators.ChkltTab).click();
	}
	public  void AddNewChklt(WebDriver driver) 
	{
		driver.findElement(WaitltChkLtLocators.AddNewChklt).click();
	}
	public  void ChkltItem(WebDriver driver) 
	{
		driver.findElement(WaitltChkLtLocators.ChkltItem).sendKeys("Checklist_item1");
	}
	public  void AddItem(WebDriver driver) 
	{
		driver.findElement(WaitltChkLtLocators.AddItem).click();
	}
}
