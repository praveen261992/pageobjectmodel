package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcFtrCreateNewUserProfilePage extends GenericWrappers{

	public IrctcFtrCreateNewUserProfilePage enterUserId(String data) {
		enterByXpath("//input[@name='userId']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterPassword(String data) {
		enterByXpath("//input[@name='password']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterConfirmPassword(String data) {
		enterByXpath("//input[@name='cnfPassword']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectSecurityQuestion(String value) {
		selectVisibileTextByXpath("//select[@name='secQstn']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterSecurityAnswer(String data) {
		enterByXpath("//input[@name='secAnswer']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage clickOnDateOfBirth() {
		clickByXpath("//input[@name='dateOfBirth']");
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectMonth(String value) {
		selectVisibileTextByXpath("//select[@class='ui-datepicker-month']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectYear(String value) {
		selectVisibileTextByXpath("//select[@class='ui-datepicker-year']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterDate(String data) {
		clickByXpathNoSnap("//a[@data-date='" + data + "']");
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage clickOnGender(String Value) {
		clickByXpathNoSnap("//input[@id='" + Value + "']");
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage clickOnMaritalStatus(String value) {
		clickByXpathNoSnap("//input[@id='" + value + "']");
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterEmailID(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
		
	public IrctcFtrCreateNewUserProfilePage selectOccupation(String data) {
		selectByXpath("//select[@name='occupation']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterFirstName(String data) {
		enterByXpath("//input[@name='fname']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterMiddleName(String data) {
		enterByXpath("//input[@name='mname']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterLastName(String data) {
		enterByXpath("//input[@name='lname']", data);
		return this;
	}
	public IrctcFtrCreateNewUserProfilePage selectNationality(String value) {
		selectVisibileTextByXpath("//select[@name='natinality']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterFlatDoorBlockNo(String data) {
		enterByXpath("//input[@name='flatNo']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterStreetLane(String data) {
		enterByXpath("//input[@name='street']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterAreaLocation(String data) {
		enterByXpath("//input[@name='area']", data);
		return this;
	}
	public IrctcFtrCreateNewUserProfilePage selectCountry(String value) {
		selectVisibileTextByXpathNoSnap("//select[@id='country']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterMobileNumber(String data) {
		enterByXpath("//input[@name='mobile']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterPinCode(String data) {
		enterByXpath("//input[@name='pincode']", data);
		scrolldown();
		waitProperty(3000);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectCityTown(String value) {
		selectVisibileTextByXpathNoSnap("//select[@id='city']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectState(String value) {
		selectVisibileTextByXpathNoSnap("//select[@id='state']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectPostOffice(String value) {
		selectVisibileTextByXpathNoSnap("//select[@id='postOffice']", value);
		scrolldown();
		waitProperty(3000);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage clickCommAddressSameAsResidential() {
		clickByXpath("//input[@id='sameAddresses1']");
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterOfficeFlatDoorBlockNo(String data) {
		enterByXpath("//input[@name='flatNoOffice']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterOfficeStreetLane(String data) {
		enterByXpath("//input[@name='streetOffice']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterOfficeAreaLocation(String data) {
		enterByXpath("//input[@name='areaOffice']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectOfficeCountry(String value) {
		selectVisibileTextByXpath("//select[@name='countryOffice']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterOfficeMobile(String data) {
		enterByXpath("//input[@name='mobileOffice']", data);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage enterOfficePinCode(String data) {
		enterByXpath("//input[@name='pincodeOffice']", data);
		scrolldown();
		waitProperty(3000);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectOfficeCity(String value) {
		selectVisibileTextByXpathNoSnap("//select[@id='cityOffice']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectOfficeState(String value) {
		selectVisibileTextByXpathNoSnap("//select[@id='stateOffice']", value);
		return this;
	}
	
	public IrctcFtrCreateNewUserProfilePage selectOfficePostOffice(String value) {
		selectVisibileTextByXpathNoSnap("//select[@id='postOfficeOffice']", value);
		return this;
	}
	
	
}

