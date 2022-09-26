package pom.facebook.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{
	
	
	 
	public SignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("SignupPage.FirstName.Xpath"), data);
		return this;
	}
	
	public SignUpPage enterLastName(String data) {
		enterByXpath(prop.getProperty("SignupPage.LastName.Xpath"), data);
		return this;
	}
	
	public SignUpPage enterMobileNumberOrEmailAddress(String data) {
		enterByXpath(prop.getProperty("SignupPage.EmailAddress.Xpath"), data);
		return this;
	}
	
	public SignUpPage enterReEnterEmailAddress(String data) {
		enterByXpath(prop.getProperty("SignupPage.ReEnterEmailAddress.Xpath"), data);
		return this;
	}
	
	public SignUpPage enterNewPassword(String data) {
		enterByXpath(prop.getProperty("SignupPage.NewPassword.Xpath"), data);
		return this;
	}
	
	public SignUpPage selectDay(String value) {
		selectByXpath(prop.getProperty("SignupPage.Day.Xpath"), value);
		return this;
	}
	
	public SignUpPage selectMonth(String value) {
		selectByXpath(prop.getProperty("SignupPage.Month.Xpath"), value);
		return this;
	}
	
	public SignUpPage selectYear(String value) {
		selectByXpath(prop.getProperty("SignupPage.Year.Xpath"), value);
		return this;
	}
	
	public SignUpPage clickOnGender(String data) {
		clickByXpath(prop.getProperty("SignupPage.Gender.Xpath", "+data+"));
		return this;
	}
	
	public SignUpPage clickOnSignUp() {
		clickByXpath(prop.getProperty("SignupPage.SignUp.Xpath"));
		return this;
	}
	 	
	
}
