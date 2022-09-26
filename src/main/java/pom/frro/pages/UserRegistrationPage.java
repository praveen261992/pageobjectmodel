package pom.frro.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers{
	
	public UserRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.UserId.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage selectQuestion(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.Question.XPath"), value);
		return this;
	}
	public UserRegistrationPage enterAnswer(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Answer.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Name.XPath"),data);
		return this;
	}
	
	public UserRegistrationPage selectGender(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.Gender.XPath"), value);
		return this;
	}
	
	public UserRegistrationPage enterDateOfBirth(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.DateOfBirth.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterDesignaton(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Designaton.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.EmailId.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.MobileNumber.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.PhoneNumber.XPath"), data);
		return this;
	}
	
	
	public UserRegistrationPage enterName1(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Name1.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterCapacity(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Capacity.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterAddress(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Address.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage selectState(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.State.XPath"), value);
		waitProperty(3000);
		return this;
	}
	
	public UserRegistrationPage selectCityDistrict(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.CityDistrict.XPath"), value);
		waitProperty(3000);
		return this;
	}
	
	public UserRegistrationPage selectFrroDescrption(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.FrroDescrption.XPath"), value);
		return this;
	}
	
	public UserRegistrationPage selectAccomodationType(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.AccomodationType.XPath"), value);
		return this;
	}
	
	public UserRegistrationPage selectAccomodationGrade(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.AccomodationGrade.XPath"), value);
		return this;
	}	
	
	public UserRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.MobileNo.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterPhoneNo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.PhoneNo.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterNameo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Nameo.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterAddresso(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Addresso.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage selectStateo(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.Stateo.XPath"), value);
		waitProperty(3000);
		return this;
	}
	
	public UserRegistrationPage selectCityDisto(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.CityDisto.XPath"), value);
		return this;
	}
	
	
	public UserRegistrationPage enterEmailIdo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.EmailIdo.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterPhoneNoo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.PhoneNoo.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterMobileNoo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.MobileNoo.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage clickAdd() {
		clickByXpath(prop.getProperty("UserRegistrationPage.Add.XPath"));
		return this;
	}
	
	public UserRegistrationPage enterNameo2(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Nameo2.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterAddresso2(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Addresso2.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage selectStateo2(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.Stateo2.XPath"), value);
		waitProperty(3000);
		return this;
	}
	
	public UserRegistrationPage selectCityDisto2(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.CityDisto2.XPath"), value);
		return this;
	}
	
	
	public UserRegistrationPage enterEmailIdo2(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.EmailIdo2.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterPhoneNoo2(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.EmailIdo2.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterMobileNoo2(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.MobileNoo2.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage clickAdd2() {
		clickByXpath(prop.getProperty("UserRegistrationPage.Add2.XPath"));
		return this;
	}
	
	public UserRegistrationPage enterNameo3(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Nameo3.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterAddresso3(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Addresso3.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage selectStateo3(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.Stateo3.XPath"), value);
		waitProperty(3000);
		return this;
	}
	
	public UserRegistrationPage selectCityDisto3(String value) {
		selectByXpath(prop.getProperty("UserRegistrationPage.CityDisto3.XPath"), value);
		return this;
	}
	
	
	public UserRegistrationPage enterEmailIdo3(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.EmailIdo3.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterPhoneNoo3(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.PhoneNoo3.XPath"), data);
		return this;
	}
	
	public UserRegistrationPage enterMobileNoo3(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.MobileNoo3.XPath"), data);
		return this;
	}
	
	

}
