package pom.frro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.frro.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To perform Frro registraion";
		author="Praveen";
		category="Smoke";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		
	}
		
	
	
	
	@Test
	public void frro() {
		
		new HomePage()
		.clickOnSignUpRegistration()
		.enterUserId("Praveen1234")
		.enterPassword("Neev!123")
		.enterConfirmPassword("Neev!123")
		.selectQuestion("5")
		.enterAnswer("College")
		.enterName("Praveen")
		.selectGender("M")
		.enterDateOfBirth("26/09/1992")
		.enterDesignaton("Software Engineer")
		.enterEmailId("Praveen26.cse@gmail.com")
		.enterMobileNumber("8940142349")
		.enterPhoneNumber("2224444")
		.enterName1("Praveen")
		.enterCapacity("3")
		.enterAddress("39, Vasahthapurn, Poonamallee")
		.selectState("28")
		.selectCityDistrict("4C")
		.selectFrroDescrption("B002")
		.selectAccomodationType("H")
		.selectAccomodationGrade("4s")
		.enterEmail("Praveen26.cse@gmail.com")
		.enterMobileNo("8940142349")
		.enterPhoneNo("2224444")		
		.enterNameo("Praveen")
		.enterAddresso("9, Vasanthapuri, Poonamallee")
		.selectStateo("28")
		.selectCityDisto("4C")
		.enterEmailIdo("Praveen26.cse@gmail.com")
		.enterPhoneNoo("2224444")
		.enterMobileNoo("8940142349")
		.clickAdd()
		
		.enterNameo2("Raja")
		.enterAddresso2("81, Vasanthapuri, Poonamallee")
		.selectStateo2("28")
		.selectCityDisto2("4C")
		.enterEmailIdo2("Raja.cse@gmail.com")
		.enterPhoneNoo2("2224444")
		.enterMobileNoo2("9944538962")
		.clickAdd2()
		
		.enterNameo3("Prakash")
		.enterAddresso3("81, Vasanthapuri, Poonamallee, Chennai")
		.selectStateo3("28")
		.selectCityDisto3("4C")
		.enterEmailIdo3("prakash11@gmail.com")
		.enterPhoneNoo3("2224444")
		.enterMobileNoo3("9488083691")
		
		
		;
		
	}
}
