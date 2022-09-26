package pom.ftrservice.pages;

import wrappers.GenericWrappers;

public class CreateNewUserProfilePage extends GenericWrappers{
	
	public CreateNewUserProfilePage enterUserId(String data) {
		enterByXpath("//input[@name='userId']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterPassword(String data) {
		enterByXpath("//input[@name='password']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterCoonfirmPassword(String data) {
		enterByXpath("//input[@name='cnfPassword']", data);
		return this;
	}
	
	public CreateNewUserProfilePage selectSecurityQuestion(String value) {
		selectVisibileTextByXpath("//select[@name='secQstn']", value);
		return this;
	}
	
	public CreateNewUserProfilePage enterSecurityAnswer(String data) {
		enterByXpath("//input[@name='secAnswer']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterDateOfBirth(String data) {
		enterByXpath("//input[@name='dateOfBirth']", data);
		return this;
	}
	
	public CreateNewUserProfilePage clickOnGender(String Value) {
		clickByXpath("//input[@value='value']");
		return this;
	}
	
	public CreateNewUserProfilePage clickOnMaritalStatus(String value) {
		clickByXpath("//input[@value='value']");
		return this;
	}
	
	public CreateNewUserProfilePage enterEmailID(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
		
	public CreateNewUserProfilePage enterOccupation(String data) {
		enterByXpath("//select[@name='occupation']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterFirstName(String data) {
		enterByXpath("//input[@name='fname']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterMiddleName(String data) {
		enterByXpath("//input[@name='mname']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterLastName(String data) {
		enterByXpath("//input[@name='lname']", data);
		return this;
	}
	public CreateNewUserProfilePage selectNationality(String value) {
		selectVisibileTextByXpath("//select[@name='natinality']", value);
		return this;
	}
	
	public CreateNewUserProfilePage enterFlatDoorBlockNo(String data) {
		enterByXpath("//input[@name='flatNo']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterStreetLane(String data) {
		enterByXpath("//input[@name='street']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterAreaLocation(String data) {
		enterByXpath("//input[@name='area']", data);
		return this;
	}
	public CreateNewUserProfilePage selectCountry(String value) {
		selectVisibileTextByXpath("select[@name='country']", value);
		return this;
	}
	
	public CreateNewUserProfilePage enterMonileNumber(String data) {
		enterByXpath("//input[@name='mobile']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterPinCode(String data) {
		enterByXpath("//input[@name='pincode']", data);
		return this;
	}
	
	public CreateNewUserProfilePage selectCityTown(String value) {
		selectVisibileTextByXpath("//select[@name='city']", value);
		return this;
	}
	
	public CreateNewUserProfilePage selectState(String value) {
		selectVisibileTextByXpath("//select[@name='state']", value);
		return this;
	}
	
	public CreateNewUserProfilePage selectPostOffice(String value) {
		selectVisibileTextByXpath("//select[@name='postOffice']", value);
		return this;
	}
	
	public CreateNewUserProfilePage clickCommAddressSameAsResidential() {
		clickByXpath("//input[@id='sameAddresses1']");
		return this;
	}
	
	public CreateNewUserProfilePage enterOfficeFlatDoorBlockNo(String data) {
		enterByXpath("//input[@name='flatNoOffice']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterOfficeStreetLane(String data) {
		enterByXpath("//input[@name='streetOffice']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterOfficeAreaLocation(String data) {
		enterByXpath("//input[@name='areaOffice']", data);
		return this;
	}
	
	public CreateNewUserProfilePage selectOfficeCountry(String value) {
		selectVisibileTextByXpath("//select[@name='countryOffice']", value);
		return this;
	}
	
	public CreateNewUserProfilePage enterOfficeMobile(String data) {
		enterByXpath("//input[@name='mobileOffice']", data);
		return this;
	}
	
	public CreateNewUserProfilePage enterOfficePinCode(String data) {
		enterByXpath("//input[@name='pincodeOffice']", data);
		return this;
	}
	
	public CreateNewUserProfilePage selectOfficeCity(String value) {
		selectVisibileTextByXpath("//select[@name='cityOffice']", value);
		return this;
	}
	
	public CreateNewUserProfilePage selectOfficeState(String value) {
		selectVisibileTextByXpath("//select[@name='stateOffice']", value);
		return this;
	}
	
	public CreateNewUserProfilePage selectOfficePostOffice(String value) {
		selectVisibileTextByXpath("//select[@name='postOfficeOffice']", value);
		return this;
	}
	
	
}

