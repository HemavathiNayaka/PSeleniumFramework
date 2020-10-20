package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WaitLtChecklistLocators {

	public By Waitlist= By.xpath("//li[@data-id = 'wait-list']");
	public By Checklist=By.xpath("//thead[@id='waitlist-orders-thead']/tr[2]/th[7]/div[2]/button[@type='button']");
	public By Checklistfilter=By.xpath("//div[@id='mCSB_2_container']/ul/li[5]/div[@class='pt-listbox-item-layout-container']/div[@class='pt-truncation-wrapper']/div[@class='pt-listbox-item-label']");
	public By First_OR=By.xpath("//table[@id='waitlistOrderTable']/tbody/tr[1]/td[1]");
	public By ChkltTab = By.xpath("/html//div[@id='orderDetails']/div[@class='pt-expander-contentcontainer']/div//ul[@class='pt-tabpanel']/li[2]");
	public By AddNewChklt=By.xpath("//form[@name='checklistItemForm']/span[@class='add-new-item-div ng-binding ng-scope']");
	public By ChkltItem = By.xpath("//div[@id='newChecklistItemElement']/input[@placeholder='Enter new checklist item and click add button to save']");
	public By AddItem = By.xpath("//table[@class='otherAppointmentDetails-table table table-striped']//form[@name='checklistItemForm']/div[@class='ng-scope']/button[1]/span[@class='pt-layout-container']");
	
}
