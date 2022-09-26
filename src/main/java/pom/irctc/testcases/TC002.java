package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify IRCTC FTR service";
		author="Praveen";
		category="Smoke";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void irctcFtrService() {
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()		
		.clicOnMenu()
		.clickBlookYourCoach()
		.clickOnNewUser()
		.enterUserId("Praveen_123")
		.enterPassword("Nee@1234")
		.enterConfirmPassword("Nee@1234")
		.selectSecurityQuestion("What is your all time favorite sports team?")
		.enterSecurityAnswer("CSK")
		.clickOnDateOfBirth()
		.selectMonth("Sep")
		.selectYear("1992")
		.enterDate("26")
		.clickOnGender("gender0")
		.clickOnMaritalStatus("maritalStatus0")
		.enterEmailID("praveen26.cse@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("Praveen")
		.enterLastName("Kumar")
		.selectNationality("Indian")
		.enterFlatDoorBlockNo("96")
		.enterStreetLane("Vasanthapuri Nagar")
		.enterAreaLocation("Poonamallee")
		.selectCountry("India")
		.enterMobileNumber("8940142349")
		.enterPinCode("600049")
		.selectCityTown("Tiruvallur")
		.selectState("TAMIL NADU")
		.selectPostOffice("Villivakkam S.O")
		.clickCommAddressSameAsResidential()
		.enterOfficeFlatDoorBlockNo("36")
		.enterOfficeStreetLane("Vasanthapuri")
		.enterOfficeAreaLocation("Poonamallee")
		.selectOfficeCountry("India")
		.enterOfficeMobile("8940142349")
		.enterOfficePinCode("600049")
		.selectOfficeCity("Tiruvallur")
		.selectOfficeState("TAMIL NADU")
		.selectOfficePostOffice("Tirumangalam Road S.O")
		

		
		
		;
	}

}
