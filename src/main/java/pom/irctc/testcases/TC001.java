package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify IRCTC Registration";
		author="Praveen";
		category="Smoke";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	
	@Test
	public void irctcRegistration() {
	
		
		new CovidAlertPage() 
		.clickOnOK()
		.clickOnRegister()
		
		.enterUserName("Neevarp123")
		.enterPassword("Secret123")
		.enterConfirmPassword("Secret123")
		.clickOnPregerredLanguage()
		.clickPreferredLanguage()
		.clickOnSelectQuestion()
		.selectTheQuestion()
		.enterSecurityAnswer("TATA")
		.clickOnContinue()
		
		.enterFirstName("Praveen")
		.enterMiddleName(" ")
		.enterLastName("Kumar")
		.clickSelectOccupation()
		.clickOnProfessional("PROFESSIONAL")
		.clickDateOfBirth()
		.selectMonth("September")
		.selectYear("1992")
		.clickDate("26")
		.clickOnMaritalStatus("married")
		.clickOnGender("Male")
		.enterEmail("praveen26.cse@gmail.com")
		.enterMobile("8940142349")
		.selectNationality("India")
		.clickOnContinue()
		
		.enterFlatDoorBlockNo("49B")
		.enterStreet("Vasanthapuri Nagar")
		.enterAreaLocality("Poonamallee")
		.enterPinCode("600049")
		.enterState("Tamil Nadu")
		.selectCity("Tiruvallur")
		.selectPostOffice("Tirumangalam Road S.O")
		.enterPhone("8940142349")
		.clickRadioButtonNo()
		.enterOfficeFlatDootBlocNo("96A")
		.enterOfficeStreetLane("Vasanthapuri Nagar")
		.enterOfficeAreaLocation("Poonamallee")
		.clickCountry()
		.clickOnCountry("India")
		.enterOfficePin("600049")
		.enterOfficeState("Tamil Nadu")
		.enterCity1("Tiruvallur")
		.enterOfficePostOffice("Tirumangalam Road S.O")
		.enterOfficePhone("9944538962") 
	
		;
		
		
	}

}
