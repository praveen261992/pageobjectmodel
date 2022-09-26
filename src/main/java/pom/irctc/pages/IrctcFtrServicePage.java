package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcFtrServicePage extends GenericWrappers{

	public IrctcFtrCreateNewUserProfilePage clickOnNewUser() {
		clickByXpath("//a[text()='New User? Signup']");
		return new IrctcFtrCreateNewUserProfilePage(); 
	}
}
