
package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers{
	
	public HotelsPage clickOnLogin() {
		clickByXpath("//a[@class='nav-link']");
		return this;
	}
	
	public IrctcLoginPage clickOnGuestUserLogin() {
		clickByXpathNoSnap("//a[contains(text(),'Guest User Login')]");
		return new IrctcLoginPage();
	}
	
	public HotelsPage enterCityorHotelName(String data) {
		enterByXpath("//input[@placeholder='Enter City or Hotel Name']", data);
		waitProperty(5000);
		return this;
	}
	
	public HotelsPage clickOnCity() {
		clickByXpathNoSnap("(//strong[text()='City'])[1]");
		return this;
	}
	
	public HotelsPage clickInDate() {
		clickByXpathNoSnap("//input[@placeholder='Check-in Date']");
		return this;
	}
	
	
	public HotelsPage clickOnInData(String data) {
		clickByXpathNoSnap("//span[text()='" +data+ "']");
		return this;
	}
	
	public HotelsPage clickOutDate() {
		clickByXpathNoSnap("//input[@placeholder='Check-out Date']");
		return this;
	}
	
	public HotelsPage clickOnOutData(String data) {
		clickByXpathNoSnap("(//span[text()='" +data+ "'])[2]");
		return this;
	}
	
	public HotelsPage clickOnRoom_Guests() {
		clickByXpathNoSnap("//input[@name='guest']");
		return this;
	}
	
	public HotelsPage selectRooms(String value) {
		selectVisibileTextByXpathNoSnap("//select[@name='hotelRoom']", value);
		return this;
	}
	
	public HotelsPage selectAdults(String value) {
		selectVisibileTextByXpathNoSnap("//select[@name='hotelAdult']", value);
		return this;
	}
	
	public HotelsPage slectChildren(String value) {
		selectVisibileTextByXpathNoSnap("//select[@name='hotelChild']", value);
		return this;
	}
	public HotelsPage clickOnDone() {
		clickByXpath("//button[text()='Done']");
		return this;
	}
	
	public HotelSearchPage clicFindHotel() {
		clickByXpath("//button[contains(text(),'Find Hotel')]");
		switchToLastWindow();
		return new HotelSearchPage();
	}
	
		

}
