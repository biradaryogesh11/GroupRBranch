package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class FindPatientRecordPage extends TestBase
{
	public FindPatientRecordPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='patient-search']")
	private WebElement search_patient_result;
	public void clickOnFindPatientRecords(String id)
	{
		search_patient_result.sendKeys(id);
	}
	
	@FindBy(xpath="//tr[@class='odd']")
	private WebElement select_patient_record;
	public void clickOnPatientRecors()
	{
		select_patient_record.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'100JWH')]")
	private WebElement id;
	public String expectedResult()
	{
		String expected = id.getText();
		return expected;
	}
	
	
	
	
	
	
}
