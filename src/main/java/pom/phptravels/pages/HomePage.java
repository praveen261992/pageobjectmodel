package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public HomePage enterFirstName(String data) {
		enterByXpath(prop.getProperty("HomePage.FirstName.XPath"), data);
		return this;
	}
	
	public HomePage enterLastName(String data) {
		enterByXpath(prop.getProperty("HomePage.LastName.XPath"), data);
		return this;
	}
	
	public HomePage enterEmailAddress(String data) {
		enterByXpath(prop.getProperty("HomePage.EmailAddress.XPath"), data);
		return this;
	}
	
	public HomePage clickDialCode(String data) {
		clickByXpath(prop.getProperty("HomePage.DialCode.XPath"));
		return this;
	}
	
	public HomePage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("HomePage.PhoneNumber.XPath"), data);
		return this;
	}
	
	public HomePage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("HomePage.CompanyName.XPath"), data);
		return this;
	}
	
	public HomePage enterStreetAddress(String data) {
		enterByXpath(prop.getProperty("HomePage.StreetAddress.XPath"), data);
		return this;
	}
	
	public HomePage enterStreetAddress2(String data) {
		enterByXpath(prop.getProperty("HomePage.StreetAddress2.XPath"), data);
		return this;
	}
	
	public HomePage enterCity(String data) {
		enterByXpath(prop.getProperty("HomePage.City.XPath"), data);
		return this;
	}
	
	public HomePage enterState(String data) {
		enterByXpath(prop.getProperty("HomePage.State.XPath"), data);
		return this;
	}
	
	public HomePage enterPostCode(String data) {
		enterByXpath(prop.getProperty("HomePage.PostCode.XPath"), data);
		return this;
	}
	
	public HomePage selectCountry(String value) {
		selectVisibileTextByXpath(prop.getProperty("HomePage.Country.XPath"), value);
		return this;
	}
	
	public HomePage enterMobile(String data) {
		enterByXpath(prop.getProperty("HomePage.Mobile.XPath"), data);
		return this;
	}
	
	public HomePage enterPassword(String data) {
		enterByXpath(prop.getProperty("HomePage.Password.XPath"), data);
		return this;
	}
	public HomePage enterConfirmPassord(String data) {
		enterByXpath(prop.getProperty("HomePage.ConfirmPassord.XPath"), data);
		return this;
	}
	
	
}
