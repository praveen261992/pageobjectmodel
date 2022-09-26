package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpPage extends GenericWrappers{
	
	public OtpPage clickOnVerify() {
		clickByXpath("//button[text()='Verify']");
		return this;
	}
	
	public OtpPage getMessage() {
		getTextByXpath("//input[@name='otp']/../span[@class='ERR2']");
		return this;		
		}
	
	public OtpPage validateOtp() {
		verifyTextByXpath("//input[@name='otp']/../span[@class='ERR2']", "otp is required.");
		return this;
	}

}
