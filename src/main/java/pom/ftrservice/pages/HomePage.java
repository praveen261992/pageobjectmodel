package pom.ftrservice.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public CreateNewUserProfilePage clickNewUserSignup() {
		clickByXpath("//a[text()='New User? Signup']");
		return new CreateNewUserProfilePage();
	}
}
