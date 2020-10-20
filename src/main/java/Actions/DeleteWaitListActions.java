package Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Baseclass;

import Locators.DeleteWaitListLocators;


public class DeleteWaitListActions {

	DeleteWaitListLocators DelWaitLtLocators= new DeleteWaitListLocators();
	
	public  void elipses_icon(WebDriver driver) 
	{
		driver.findElement(DelWaitLtLocators.elipses_icon).click();
	}

	public  void Del_Btn(WebDriver driver) 
	{
		driver.findElement(DelWaitLtLocators.Del_Btn).click();
	}
	public  void Item_Del(WebDriver driver) 
	{
		driver.findElement(DelWaitLtLocators.Item_Del).click();
	}
	
}
