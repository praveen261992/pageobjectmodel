package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify IRCTC Hotal booking with OTP";
		author="Praveen";
		category="Smoke";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void irctcBoolHotelsOtpValidation() {
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.clickOnHotelIcon()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmail("praveen26.cse@gmail.com")
		.enterMobileNumber("8940142349")
		.clickLogin()
		
		.enterCityorHotelName("Goa")
		.clickOnCity()
		.clickInDate()
		.clickOnInData("27")
		.clickOutDate()
		.clickOnOutData("29")
		.clickOnRoom_Guests()
		.selectRooms("1")
		.selectAdults("3")
		.clickOnDone()
		.clicFindHotel()
		.clickHotelName()
		.getHoteName()
		.clickContinueToBook() 
		.selectTitle("Mr")
		.enterFirstName("Praveen")
		.enterLastName("kumar")
		.selectState("TAMIL NADU")
		.clickOnContinue()
		.clickOnAgree()
		.clickMakePayment()
		.clickOnVerify()
		.getMessage()
		.validateOtp()
	
		
		
		
		;
	}
}
