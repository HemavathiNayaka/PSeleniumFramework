package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeleteWaitListLocators {

	public By elipses_icon= By.xpath("//div[@id='orderDetails']/div[@class='pt-expander-contentcontainer']/div/div/div[@class='pt-content-panel']/div[2]//table[@class='otherAppointmentDetails-table table table-striped']/tbody/tr[1]/td[5]/div//i[@class='fa fa-ellipsis-v']");
	public By Del_Btn=By.linkText("Delete");
	public By Item_Del=By.xpath("//div[@id='deleteChecklistDialog']/div[@class='pt-dialog-content-placeholder']/div/div[2]/button[1]//span[@class='pt-text']");
	
}
