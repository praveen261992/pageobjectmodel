package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage clicOnMenu() {
		clickByXpathNoSnap("//a[@id='sidebarCollapse']");
		return this;
	}
	
	 public IrctcFtrServicePage clickBlookYourCoach() {
		 clickByXpathNoSnap("//*[contains(text(),'Book Your Coach/Train')]");
		 switchToLastWindow();
		 return new IrctcFtrServicePage();
	 }
	 
	 public CharterPage clickCharter() {
		 clickByXpath("//a[text()='Charter']");
		 return new CharterPage();
	 }
	 
	 public HotelsPage clickOnHotelIcon() {
			clickByXpathNoSnap("//a[@rel='noopener']/div[@class='Nav-icons IRCTCHotels']");
			switchToLastWindow();
			return new HotelsPage();
	 }
	 
}
