package pom.alerts.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.Alerts;

import wrappers.ProjectWrappers;

public class TC0010 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC0010";
		testCaseDescription="Confirmation Alert Validation";
		author="Praveen";
		category="Smoke";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	@Test
	public void alert() {
		new Alerts()
		.frameChange()
		.clickTryIT()
		.getAlertMessageText()
		.sleepProperty()
		.acceptAlertMessage()
		.verifyAlertTextOne("You pressed OK!")
		.pageRefresh()
		.sleepProperty()
		.frameChange()
		.clickTryIT()
		.getAlertMessageText()
		.sleepProperty()
		.sleepProperty()
		.dismissAlertMessage()
		.verifyAlertTextTwo("You pressed Cancel!")
		.backToDefaultFrame()
		.clickOnHome();
	}
}
