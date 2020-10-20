package Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Baseclass;

import Locators.DeleteUnSchORLtLocators;


public class DeleteUnSchORLtActions {

	DeleteUnSchORLtLocators DelUnSchORLtLocators= new DeleteUnSchORLtLocators();
	
	public  void elipses_icon(WebDriver driver) 
	{
		driver.findElement(DelUnSchORLtLocators.elipses_icon).click();
	}

	public  void Del_Btn(WebDriver driver) 
	{
		driver.findElement(DelUnSchORLtLocators.Del_Btn).click();
	}
	public  void Item_Del(WebDriver driver) 
	{
		driver.findElement(DelUnSchORLtLocators.Item_Del).click();
	}
	
}
