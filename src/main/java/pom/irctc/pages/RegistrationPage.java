package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {

	public RegistrationPage enterUserName(String data) {
		
		enterByXpath("//input[@id='userName']", data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath("//input[@name='usrPwd']", data);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath("//input[@name='cnfUsrPwd']", data);
		
		return this;
	}
	
	public RegistrationPage clickOnPregerredLanguage() {
		clickByXpath("//span[text()='Preferred Language']");
		
		return this;
	}
	
	public RegistrationPage clickPreferredLanguage() {
		clickByXpath("//span[text()='English']");
		
		return this;
	}
	
	public RegistrationPage clickOnSelectQuestion() {
		clickByXpath("//*[@formcontrolname='secque']");
	
		return this;
	}
	
	public RegistrationPage selectTheQuestion() {
		clickByXpath("//span[text()='What make was your first car or bike?']");
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String data) {
		enterByXpath("(//div[@class='col-xs-12 inputBoxPad'])[6]/input", data);
		
		return this;
	}
	
	public RegistrationPage clickOnContinue() {
		clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
		return this;
	}
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath("//input[@name='firstName']", data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath("//input[@name='middleName']", data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data) {
		enterByXpath("//input[@name='lastname']", data);
		return this;
	}
	
	public RegistrationPage clickSelectOccupation() {
		clickByXpath("//*[@formcontrolname='occupation']");
		return this;
	}
	 
	public RegistrationPage clickOnProfessional( String value ) {
		clickByXpath("//span[contains(text(),'" + value + "')]");
		return this;
	}
	
	public RegistrationPage clickDateOfBirth() {
		clickByXpath("//p-calendar[@formcontrolname='dob']");
		return this;
	}
	
	public RegistrationPage selectMonth(String data) {
		selectVisibileTextByXpath("//*[contains(@class,'ui-datepicker-month')]", data);
		return this;
	}
	
	public RegistrationPage selectYear(String data) {
		selectVisibileTextByXpath("//*[contains(@class,'ui-datepicker-year')]", data);
		return this;
	}
	
	public RegistrationPage clickDate(String data) {
		clickByXpath("//a[contains(text(),'" + data + "')]");
		return this;
	}
	
	 
	public RegistrationPage clickOnMaritalStatus(String data) {
		clickByXpath("//p-radiobutton[@id='" + data + "']");
		return this;
	}
	
	public RegistrationPage clickOnGender(String data) {
		clickByXpath("//div[@aria-label='" + data + "']");
		return this;
	}
	
	public RegistrationPage enterEmail(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	
	public RegistrationPage enterMobile(String data) {
		enterByXpath("//input[@name='mobile']", data);
		return this;
	}
	
	public RegistrationPage selectNationality(String value) {
		selectVisibileTextByXpath("//*[@formcontrolname='resCountry']", value);
		return this;
	}
	
	public RegistrationPage clickOnContinue1() {
		clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
		return this;
	}
	
	public RegistrationPage enterFlatDoorBlockNo(String data) {
		enterByXpath("//input[@name='resAddress1']", data);
		return this;
	}
	
	public RegistrationPage enterStreet(String data) {
		enterByXpath("//input[@name='resAddress2']", data);
		return this;
	}
	
	public RegistrationPage enterAreaLocality(String data) {
		enterByXpath("//input[@name='resAddress3']", data);
		return this;
	}
	
	public RegistrationPage enterPinCode(String data ) {
		enterByXpath("//input[@name='resPinCode']", data);
		waitProperty(2000);
		return this;
	}
	
	public RegistrationPage enterState(String data) {
		enterByXpath("//input[@name='resState']", data);
		waitProperty(3000);
		return this;
	}

	public RegistrationPage selectCity(String value) {
		selectVisibileTextByXpath("//select[@formcontrolname='resCity']", value);
		waitProperty(2000);
		return this;
	}
	
	public RegistrationPage selectPostOffice(String value) {
		selectVisibileTextByXpath("//select[@formcontrolname='resPostOff']", value);
		return this;
	}

	public RegistrationPage enterPhone(String data) {
		enterByXpath("//input[@id='resPhone']", data);
		return this;
	}	
	
	public RegistrationPage clickRadioButtonNo() {
		clickByXpath("//label[text()='No']");
		waitProperty(2000);
		return this;
	}
		
	public RegistrationPage enterOfficeFlatDootBlocNo(String data) {
		enterByXpath("//input[@name='offAddress1']", data);
		return this;
	}
	
	public RegistrationPage enterOfficeStreetLane(String data) {
		enterByXpath("//input[@name='offAddress2']", data);
		return this;
	}
	
	public RegistrationPage enterOfficeAreaLocation(String data) {
		enterByXpath("//input[@name='offAddress3']", data);
		return this;
	}
	
	public RegistrationPage clickCountry() {
		clickByXpath("//*[@value='countryId']");
		return this;
	}
	
	public RegistrationPage clickOnCountry(String data) {
		clickByXpath("//span[text()='" + data + "']");
		return this;
	}
	
	public RegistrationPage enterOfficePin(String data) {
		enterByXpath("//input[@id='offPinCode']", data);
		return this;
	}

	public RegistrationPage enterOfficeState(String data) {
		enterByXpath("//input[@id='offState']", data);
		return this;
	}
	
	public RegistrationPage enterCity1(String value) {
		enterByXpath("//input[@id='offCity']", value);
		return this;
	}
	
	public RegistrationPage enterOfficePostOffice(String value) {
		enterByXpath("//input[@id='offPostOff']", value);
		return this;
	}

	public RegistrationPage enterOfficePhone(String data) {
		enterByXpath("//input[@id='offPhone']", data);
		return this;
	}
	
	public RegistrationPage clickConditions() {
		clickByXpath("//input[@formcontrolname='termCondition']");
		return this;
	}
}