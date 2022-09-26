package pom.alerts.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.Alerts;

import wrappers.ProjectWrappers;

public class TC0011 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC0011";
		testCaseDescription="Simple Alert Validation";
		author="Praveen";
		category="Smoke";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	@Test
	public void alert() {
		new Alerts()
		.frameChange()
		.clickTryIT()
		.getAlertMessageText() 
		.sleepProperty()
		.acceptAlertMessage()
		.sleepProperty()
		.backToDefaultFrame()
		.clickOnHome(); 
	}
}
