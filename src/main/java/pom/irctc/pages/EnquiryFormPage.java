package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers {

	public EnquiryFormPage enterNameOfApplicant(String data) {
		enterByXpath("//input[@name='name']", data);
		return this;
	}

	public EnquiryFormPage enterNameOfOrganisation(String data) {
		enterByXpath("//input[@name='organization']", data);
		return this;
	}

	public EnquiryFormPage enterAddress(String data) {
		enterByXpath("//input[@name='address']", data);
		return this;
	}

	public EnquiryFormPage enterMobile(String data) {
		enterByXpath("//input[@name='mobile']", data);
		return this;
	}

	public EnquiryFormPage enterEmail(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}

	public EnquiryFormPage selectRequestFor(String value) {
		selectVisibileTextByXpath("//select[@name='requestFor']", "Saloon Charter");
		return this;
	}

	public EnquiryFormPage enterOriginatingStation(String data) {
		enterByXpath("//input[@name='originStation']", data);
		return this;
	}

	public EnquiryFormPage enterDestinationStation(String data) {
		enterByXpath("//input[@name='destnStation']", data);
		return this;
	}

	public EnquiryFormPage clickDateOfDeparture() {
		clickByXpathNoSnap("//input[@name='checkInDate']");
		return this;
	}

	public EnquiryFormPage clickCheckInDate(String data) {
		clickByXpathNoSnap("//span[text()=" + data + "]");
		return this;
	}

	public EnquiryFormPage clickDateOfArrivalBack() {
		clickByXpathNoSnap("//input[@name='checkOutDate']");
		return this;
	}

	public EnquiryFormPage clickCheckOutDateCharter(String data) {
		clickByXpathNoSnap("(//span[text()=" + data + "])[2]");
		return this;
	}

	public EnquiryFormPage enterDurationOfTour(String data) {
		waitProperty(3000);
		enterByXpath("//input[@name='durationPeriod']", data);
		return this;
	}

	public EnquiryFormPage enterNumberAndTypeOfCoachesRequired(String data) {
		enterByXpath("//input[@name='coachDetails']", data);
		return this;
	}

	public EnquiryFormPage enterNumberOfPassenger(String data) {
		enterByXpath("//input[@name='numPassenger']", data);
		return this;
	}

	public EnquiryFormPage enterPurposeOfCharter(String data) {
		enterByXpath("//textarea[@name='charterPurpose']", data);
		return this;
	}

	public EnquiryFormPage enterAdditionalServicesRequired(String data) {
		enterByXpath("//textarea[@name='services']", data);
		return this;
	}

	public EnquiryFormPage clickSubmit() {
		clickByXpath("//button[@class='btn btn-radius-none btn-yellow']");
		return this;
	}

}
