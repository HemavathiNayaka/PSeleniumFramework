package Actions;

import org.openqa.selenium.WebDriver;

import Locators.SearchPageLocators;

public class SearchPageActions {
	
	SearchPageLocators SearchLocators = new SearchPageLocators();
	
	
	public void SearchByName(String ID, WebDriver driver)
	{
		driver.findElement(SearchLocators.NHI).sendKeys(ID);
	}
	
	public void SearcBtn(WebDriver driver)
	{
		driver.findElement(SearchLocators.SrcBtn).click();
	}

}
