package pom.alert.pages;

import wrappers.GenericWrappers;

public class Alerts extends GenericWrappers{
	
	public Alerts frameChange() {
		switchToFrameById("iframeResult");
		return this;
	}
	public Alerts clickTryIT() {
		clickByXpathNoSnap("//button[text()='Try it']");
		return this;
	}
	
	public Alerts getAlertMessageText() {
		getAlertText();
		return this;
	}
	public Alerts acceptAlertMessage() {
		acceptAlert();
		return this;
	} 
	
	public Alerts backToDefaultFrame() {
		defaultFrame();
		return this;
	}  
	
	public Alerts clickOnHome() {
		clickByXpathNoSnap("//a[@id='tryhome']");
		return this;
	}
	public Alerts sleepProperty() {
		waitProperty(4000);
		return this;
	}
	public Alerts sendTextToAlertMessage(String text) {
		sendTexttoAlert(text);
		return this;
	}
		
	public Alerts getText() {
		getTextByXpath("//p[@id='demo']");
		return this;
	}
	public Alerts pageRefresh() {
		refresh();
		return this;
	}
	
	public Alerts verifyAlertTextOne(String text) {
		verifyTextByXpath("//p[@id='demo']", text);
		return this;
	}
	
	public Alerts verifyAlertTextTwo(String text) {
		verifyTextByXpath("//p[@id='demo']", text);
		return this;
	}
	public Alerts dismissAlertMessage() {
		dismissAlert();
		return this;
	}
	

}
