package Locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	
	public By warn1=By.id("details-button");
	public By warn2=By.id("proceed-link");
	public By Username = By.xpath("//div[@id='text-box']/input[@placeholder='Username']");
	public By Password= By.xpath("//div[@id='text-box']/input[@placeholder='Password']");
	public By LgnBtn=By.xpath("//button[@id='button']");
	public By LogonName = By.cssSelector(".logOn-label");

}

