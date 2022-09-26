package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify PhpTravels registration page";
		author="Praveen";
		category="Smoke";
		url="https://www.phptravels.org/register.php";
	}
	
	@Test
	public void phpTravels() {
		
		new HomePage()
		.enterFirstName("Praveen")
		.enterLastName("Kumar")
		.enterEmailAddress("praveen26.cse@gmail.com")
	
		.enterPhoneNumber("8940142349")
		.enterCompanyName("PK")
		.enterStreetAddress("49, Vasanthapuri")
		.enterStreetAddress2("Poonamallee")
		.enterCity("Chennai")
		.enterState("Tamilnadu")
		.enterPostCode("600056")
		.selectCountry("India")
		.enterMobile("8940142349")
		.enterPassword("Neev1234")
		.enterConfirmPassord("Neev1234") 
		
		;
	}
}
