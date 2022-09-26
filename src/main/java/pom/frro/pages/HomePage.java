package pom.frro.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public UserRegistrationPage  clickOnSignUpRegistration() {
		clickByXpath(prop.getProperty("HomePage.SignUpRegistration.XPath"));
		return new UserRegistrationPage();
	}

}
