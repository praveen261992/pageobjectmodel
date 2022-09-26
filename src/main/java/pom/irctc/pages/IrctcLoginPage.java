package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcLoginPage extends GenericWrappers{


	public IrctcLoginPage enterEmail(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	
	public IrctcLoginPage enterMobileNumber(String data) {
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
	}
	
	public HotelsPage clickLogin() {
		clickByXpath("(//button[text()='Login'])[2]");
		return new HotelsPage();
	}
	 
}
