package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

	public RegistrationPage clickOnRegister() {
		clickByXpath("//a[text()=' REGISTER ']");
		return new RegistrationPage();
	}
	
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath("//a[text()=' HOLIDAYS ']");
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath("//span[text()='Stays']");
		return this;
	}
	
	
	public AccommodationPage clickOnLounge() {
		clickByXpathNoSnap("(//span[text()='Lounge'])[1]");
		switchToLastWindow();
		return new AccommodationPage();
	}
	
	
}
