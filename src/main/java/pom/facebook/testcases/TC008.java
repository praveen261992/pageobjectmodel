package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify facebook registration for the new user sign up";
		author="Praveen";
		category="Smoke";
		url="https:www.facebook.com";
	}
	

	
	
	@Test
	public void facebookSignUp() {
		
		new HomePage()
		
	    .clickOnCreateNewAccount()
	    .enterFirstName("Praveen")
	    .enterLastName("Kumar")
		.enterMobileNumberOrEmailAddress("praveen26.cse@gmail.com")
		.enterReEnterEmailAddress("praveen26.cse@gmail.com")
		.enterNewPassword("123456789po")
		.selectDay("26")
		.selectMonth("9")
		.selectYear("1992")
		.clickOnGender("Male")
		.clickOnSignUp()
		
		;
	}
}
