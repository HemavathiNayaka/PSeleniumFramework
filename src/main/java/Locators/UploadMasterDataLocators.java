package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadMasterDataLocators {
	
	//public By AdminOption=By.xpath("//h3[.='Administration']");
	public By AdminOption=By.linkText("Upload Master Data");
	//public By UploadOption=By.xpath("\"//div[4]/ul/li[1]/a\"");
	public By UploadOption=By.xpath("//div[@class='lookupListDiv text-center']/div/button[@type='button']");


	//public By DdwnBtn=By.cssSelector("[p-source] button");
	//public By DdwnOptions=By.xpath("\"//div[@id='mCSB_1_container']/ul\"");
	public By DdwnOptions=By.xpath("//div[@id='mCSB_1_container']/ul");
	public By DdwnOptionslist = By.tagName("li");
	public By OptionSelector = By.cssSelector("[p-source] div");
	public By UploadFile = By.xpath("//button[@id='uploadButton']");
	public By InputFile = By.xpath("//input[@id='fileName']");
	public By ConfirmButton = By.xpath("//button[@id='confirmButton']");
	public By OkButton = By.cssSelector(".custom-dialog-button-width.margin-right-5.ng-scope.pt-bordered.pt-button.pt-buttonbase.pt-has-tooltip.pull-right  .pt-text");

	
	

}
