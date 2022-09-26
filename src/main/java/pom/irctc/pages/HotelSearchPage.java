package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelSearchPage extends GenericWrappers{

	
	public HotelsDetailsPage clickHotelName() {
		clickByXpath("//div[@class='row no-gutters']");
		switchToLastWindow();
		return new HotelsDetailsPage();
	}
}
