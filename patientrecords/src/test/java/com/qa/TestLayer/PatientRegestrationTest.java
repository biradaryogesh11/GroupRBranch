package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.PetientRegestrationPage;

public class PatientRegestrationTest extends TestBase
{
    @Test
	public void verifyPatientRegestration() throws InterruptedException
	{
		Thread.sleep(2000);
		HomePage home= new HomePage();
		home.clickonRegisterAPatient();
		logger.info("Enter into Registation page");
		Thread.sleep(6000);
		PetientRegestrationPage reg=new PetientRegestrationPage();
		reg.enterPatientName("Sharad");
		reg.enterPatientMiddleName("Sanjay");
		reg.enterPatientlastName("Wagh");
		logger.info("Name is ented");
		reg.clickOnNextButton();
		Thread.sleep(2000);
		reg.clickOnMaleGender();
		logger.info("Gender is selected");
		reg.clickOnNextButton();
		Thread.sleep(2000);
		reg.enterDate("30");
		reg.enterMonth("June");
		reg.enteryear("1974");
		logger.info("Birthdate is entered");
		reg.clickOnNextButton();
		Thread.sleep(2000);
		reg.enterAddress("Pnue,Maharashtra");
		reg.clickOnNextButton();
		Thread.sleep(2000);
		reg.enterPhoneNumber("9421366666");
		reg.clickOnNextButton();
		Thread.sleep(1000);
		reg.clickOnNextButton();
		Thread.sleep(1000);
		reg.clickOnSubmitButton();
	}
}
