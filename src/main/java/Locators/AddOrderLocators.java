package Locators;

import org.openqa.selenium.By;

public class AddOrderLocators {
	
	public By AddOrder1=By.xpath("//tr[@class='reset-filters']/th[1]/button[@type='button']//span[@class='pt-text']");
	public By MRN = By.xpath("//body[@id='schedulerBodyElement']/div[1]/div//div//div/div[1]/div[1]/add-order/div/div/div[1]//patient-search//form/div[1]/input[@placeholder='MRN']");
	public By PatientSearch = By.id("addOrderPatientSearchButton");
	public By VisitID = By.xpath("//input[@placeholder='Visit ID']");
	public By VisitType = By.cssSelector("[ng-model='addOrderForm\\.visit\\.visitType\\.patientClass'] button");
	public By VisitTypeList = By.cssSelector("[data-id='1'] .pt-listbox-item-label");
	public By AdmitDate = By.cssSelector(".ng-isolate-scope.ng-invalid-required [ng-show]");
	public By Vip = By.xpath("//div[@class='col-xs-1 vip']");
	public By Pregnant = By.xpath("//div[@class='col-xs-1 pregnant']");
	public By Referrer = By.cssSelector("[ng-class] [class='col-xs-2']:nth-of-type(1) .icon-arrow-down");
	public By ReferrerList = By.cssSelector("[data-id='1'] .pt-listbox-item-label");
	public By Priority = By.cssSelector("[ng-class] .row:nth-of-type(2) [class='col-xs-2']:nth-of-type(2) button");
	public By PriorityList = By.cssSelector("[data-id='8'] .pt-listbox-item-label");
	public By Reason = By.xpath("//input[@placeholder='Reason']");
	public By Modality = By.cssSelector("[ng-model='addOrderForm\\.modalityConfig\\.selectedModality'] div");
	public By ModalityList = By.cssSelector("[data-id='3'] .pt-listbox-item-label");
	public By Procedure = By.cssSelector("[ng-class] [class='col-xs-2']:nth-of-type(5) .icon-arrow-down");
	public By ProcedureList = By.cssSelector("[data-id='17'] .pt-listbox-item-label");
	public By ClinicalInfo = By.xpath("//textarea[@name='clinicalInformation']"); 
	public By Notes = By.xpath("//textarea[@name='notes']");
	public By SaveOrder = By.cssSelector(".back-button.pull-right>button:nth-of-type(2).pt-text");
	public By SuccessMessage = By.cssSelector(".success-msg-div .ng-binding");
}
