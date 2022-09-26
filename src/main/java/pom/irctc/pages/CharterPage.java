package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	 
	public EnquiryFormPage clickEnquiryForm() {
		clickByXpath("//a[text()='Enquiry Form']");
		return new EnquiryFormPage();
	}
	
}
