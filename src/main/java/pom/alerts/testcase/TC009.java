package pom.alerts.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.Alerts;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="Prompt Alert Validation";
		author="Praveen";
		category="Smoke";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	}
	@Test
	public void alert() {
		new Alerts()
		.frameChange()
		.clickTryIT()
		.sendTextToAlertMessage("PRAVEEN")
		.getAlertMessageText()
		.sleepProperty()
		.acceptAlertMessage()
		.verifyAlertTextOne("Hello PRAVEEN! How are you today?")
		.pageRefresh()
		.sleepProperty()
		.frameChange()
		.clickTryIT()
		.sendTextToAlertMessage("PRAVEEN")
		.getAlertMessageText()
		.sleepProperty()
		.dismissAlertMessage()
		.verifyAlertTextTwo("User cancelled the prompt.")
		.backToDefaultFrame()
		.clickOnHome();
	}
}
