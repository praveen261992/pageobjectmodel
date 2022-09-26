package wrappers;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class ProjectWrappers extends GenericWrappers{
	
	public String url ;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		loadObject();
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		invokeApp("chrome", url);
	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
	}
	
	@AfterTest
	public void afterTest() {
		unloadObject();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
	

}
