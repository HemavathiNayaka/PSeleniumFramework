package Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Baseclass;
import Locators.LoginPageLocators;


public class LoginPageActions 
{
	
	LoginPageLocators LoginLocators= new LoginPageLocators();
	
	public  void Warn1click(WebDriver driver) 
	{
		driver.findElement(LoginLocators.warn1).click();
	}

	public void Warn2click(WebDriver driver) 
	{
		driver.findElement(LoginLocators.warn2).click();
	}

	public void EnterUsername(String name,WebDriver driver) 
	{
		driver.findElement(LoginLocators.Username).sendKeys(name);
	}

	public void EnterPassword(String pass,WebDriver driver) 
	{
		driver.findElement(LoginLocators.Password).sendKeys(pass);
	}

	public void loginBtn(WebDriver driver) 
	{
		driver.findElement(LoginLocators.LgnBtn).click();
		
	}
	
	public String LoginPageName(WebDriver driver)
	{
		return driver.findElement(LoginLocators.LogonName).getText();
	
	}


}


