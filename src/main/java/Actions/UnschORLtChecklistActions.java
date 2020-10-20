package Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Baseclass;

import Locators.UnschORLtChecklistLocators;


public class UnschORLtChecklistActions {

	UnschORLtChecklistLocators UnSchOrChkLtLocators= new UnschORLtChecklistLocators();

	public  void Chklist(WebDriver driver) 
	{
		driver.findElement(UnSchOrChkLtLocators.Checklist).click();
	}
	public  void Checklistfilter(WebDriver driver) 
	{
		driver.findElement(UnSchOrChkLtLocators.Checklistfilter).click();
	}
	public  void First_OR(WebDriver driver) 
	{
		driver.findElement(UnSchOrChkLtLocators.First_OR).click();
	}
	public  void ChkltTab(WebDriver driver) 
	{
		driver.findElement(UnSchOrChkLtLocators.ChkltTab).click();
	}
	public  void AddNewChklt(WebDriver driver) 
	{
		driver.findElement(UnSchOrChkLtLocators.AddNewChklt).click();
	}
	public  void ChkltItem(WebDriver driver) 
	{
		driver.findElement(UnSchOrChkLtLocators.ChkltItem).sendKeys("Checklist_item1");
	}
	public  void AddItem(WebDriver driver) 
	{
		driver.findElement(UnSchOrChkLtLocators.AddItem).click();
	}
}
