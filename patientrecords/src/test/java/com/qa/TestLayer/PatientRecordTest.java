package com.qa.TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class PatientRecordTest extends TestBase
{
    @Test
	public void verifyPatientRecordPage() throws InterruptedException
	{
		Thread.sleep(6000);
		
	    home.clickOnFindPatientRecords();
	    logger.info("patient record page is open");
	    record.clickOnFindPatientRecords("100JWH");
	    logger.info("id is entered");
	    Thread.sleep(2000);
	    record.clickOnPatientRecors();
	    Thread.sleep(2000);
	    logger.info("Patient record is selected");
	    String expected = record.expectedResult();
	    String actual = driver.findElement(By.xpath("//span[contains(text(),'100JWH')]")).getText();
	    Assert.assertEquals(actual, expected);
	    
	}
}
