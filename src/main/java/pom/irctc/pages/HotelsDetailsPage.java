package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsDetailsPage extends GenericWrappers{
	
	public HotelsDetailsPage getHoteName() {
		getTextByXpath("//div[@class='mid-searchpack']/h5");
		return this;
	}
	
	public HotelsDetailsPage getPrice() {
		getTextByXpath("//span[contains(text(),'Standard')]/following::div/strong");
		return this;
	}
	
	public HotelsDetailsPage clickContinueToBook() {
		clickByXpath("//b[text()='Continue to Book']");
		return this;
	}
	
	public HotelsDetailsPage selectTitle(String value) {
		selectVisibileTextByXpathNoSnap("//select[@name='title']", value);
		return this;
	}
	
	public HotelsDetailsPage enterFirstName(String data) {
		enterByXpath("//input[@name='firstName']", data);
		return this;
	}

	public HotelsDetailsPage enterLastName(String data) {
		enterByXpath("//input[@name='lastName']", data); 
		return this;
	}
	
	public HotelsDetailsPage selectState(String value) {
		selectVisibileTextByXpath("//select[@name='state']", value);
		return this;
	}
	
	public HotelsDetailsPage clickOnContinue() {
		clickByXpath("//button[text()='Continue']");
		return this;
	}
	
	public HotelsDetailsPage compareHotelName() {
		verifyTextContainsByXpath("//div[@class='mid-searchpack']/h5", "//div[@class='mid-searchpack']/h5");
		return this;
	}
	
	public HotelsDetailsPage comparePrice() {
		verifyTextContainsByXpath("//div[@class='faredetails-in faredetails-in-total']/strong","//span[contains(text(),'Standard')]/following::div/strong");
		return this;
	}
	
	public HotelsDetailsPage clickOnAgree() {
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public OtpPage clickMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return new OtpPage();
	}
	
	public HotelsDetailsPage selectOnGST(String value) {
		selectVisibileTextByXpath("//select[@name='gst']", value);
		return this;
	}
	
	public HotelsDetailsPage enterGSTNumber(String data) {
		enterByXpath("//input[@name='gstNumber']", data);
		return this;
	}

	public HotelsDetailsPage enterCompanyName(String data) {
		enterByXpath("//input[@name='companyName']", data);
		return this;
	}

	public HotelsDetailsPage enterCompanyAddress(String data) {
		enterByXpath("//input[@name='companyAddress']", data);
		return this;
	}
	
	public HotelsDetailsPage clickContinue() {
		clickByXpath("//button[contains(text(),'Continue')]");
		return this;
	}
}
