package pom.irctc.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify IRCTC Enquiry form";
		author="Praveen";
		category="Smoke";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void irctcEnquiryForm() {
		
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.clicOnMenu()
		.clickCharter()
		.clickEnquiryForm()
		.enterNameOfApplicant("Praveen")
		.enterNameOfOrganisation("Green Aqua")
		.enterAddress("49, Vasanthapuri, Poonamallee, Chennai")
		.enterMobile("89401423")
		.enterEmail("praveen26.cse@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginatingStation("Chennai")
		.enterDestinationStation("Pondicherry")
		.clickDateOfDeparture()
		.clickCheckInDate("14")
		.clickDateOfArrivalBack()
		.clickCheckOutDateCharter("16")
		.enterDurationOfTour("3")
		.enterNumberAndTypeOfCoachesRequired("Three-Tier")
		.enterNumberOfPassenger("4")
		.enterPurposeOfCharter("Official trip")
		.enterAdditionalServicesRequired("Not required")
		
		.clickSubmit()
		
		;
	}

}
