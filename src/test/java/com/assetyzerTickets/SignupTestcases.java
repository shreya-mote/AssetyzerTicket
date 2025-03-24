package com.assetyzerTickets;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.assetyzer.base.Keyword;
import com.assetyzer.base.TestBase;
import com.assetyzer.pages.HomePage;
import com.assetyzer.pages.SelectAssetClassPage;
import com.assetyzer.pages.SignupPage;

public class SignupTestcases extends TestBase {
	// 1
	@Test(priority = 0)
	public void toVerifySignupWithValidUserDetails() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		System.out.println("clicked on signup");
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		System.out.println("click On Ticketing Option");
		selectAsset.clickOnGetStartedButton();
		System.out.println("click On Get Started Button");
		SignupPage signuppage = new SignupPage();
		signuppage.typeFirstName();
		System.out.println("typeFirstName");
		signuppage.typeLastName();
		System.out.println("typeLastName");
		signuppage.typeEmail("shreya00011patil5@gmail.com");
		System.out.println("typeEmail");
		signuppage.clickOnSignupButton();
		System.out.println("clickOnSignupButton");
		String ExpectedMsg = "Email Sent Successfully. Check your Mail!";
		System.out.println(ExpectedMsg);
		String ActualMsg = signuppage.getTextEmailSent();
		System.out.println(ActualMsg);
		Assert.assertEquals(ExpectedMsg, ActualMsg);

	}

//2
	@Test(priority = 1)
	public void toVerifySignupWithBlankFirstName() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		signuppage.typeLastName();
		signuppage.typeEmail("jshremotn5679@gmail.com");
		signuppage.clickOnSignupButton();
		String validationMessage = signuppage.getFirstNameErrorMsg();
		Assert.assertEquals(validationMessage, "Please fill out this field.",
				"Validation message does not match for the First Name field.");
	}

//3
	@Test(priority = 2)
	public void toVerifySignupWithBlankLastName() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		signuppage.typeFirstName();
		signuppage.typeEmail("johndoe54576487@gmail.com");		signuppage.clickOnSignupButton();
		String validationMessage = signuppage.getLastNameErrorMsg();
		Assert.assertEquals(validationMessage, "Please fill out this field.",
				"Validation message does not match for the First Name field.");
	}

//4
	@Test(priority = 3)
	public void toVerifySignupWithBlankEmail() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		signuppage.typeFirstName();
		signuppage.typeLastName();
		signuppage.clickOnSignupButton();
		String ExpectedMsg = "This field has to be filled.,This is not a valid email.";
		System.out.println("Expected Msg->>" + ExpectedMsg);
		String ActualMsg = signuppage.getBlankEmailErrorMsg();
		System.out.println("Actual Msg->>" + ActualMsg);
		Assert.assertEquals(ExpectedMsg, ActualMsg);
	}

//5
	@Test(priority = 4)
	public void toVerifySignupWithInvalidEmail() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		signuppage.typeFirstName();
		signuppage.typeLastName();
		signuppage.typeInvalidEmail();
		signuppage.clickOnSignupButton();
		String validationMessage = signuppage.getInvalidEmailErrorMsg();
		System.out.println(validationMessage);
		Assert.assertEquals(validationMessage, "Please enter an email address.",
				"Validation message does not match for the First Name field.");
	}

//6 Defect-not showing error msg after entering numeric first name
	@Test(priority = 5)
	public void toVerifySignupWithNumericFirstName() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		signuppage.enterFirstNameInvalidFormats("12345");
		signuppage.typeLastName();
		signuppage.typeEmail("johndoe54576487@gmail.com");
		signuppage.clickOnSignupButton();
		boolean isErrorDisplayed = signuppage.isErrorMessageDisplayedFirstName();
		Assert.assertFalse(isErrorDisplayed, "Error message should be displayed for numeric input, but it's not!");

	}

	// 7
	@Test(priority = 6)
	public void toVerifySignupwithSpecialCharInFirstName() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		signuppage.enterFirstNameInvalidFormats("####@@");
		signuppage.typeLastName();
		signuppage.typeEmail("johndoe54576487@gmail.com");		
		signuppage.clickOnSignupButton();
		boolean isErrorDisplayed = signuppage.isErrorMessageDisplayedFirstName();
		Assert.assertFalse(isErrorDisplayed,
				"Error message should be displayed for special charecter input, but it's not!");

	}

	// 8
	@Test(priority = 7)
	public void toVerifySignupwithSpecialCharInLastName() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		signuppage.typeFirstName();
		signuppage.enterLastNameInvalidFormats("$@@@@");
		signuppage.typeEmail("johndoe54576487@gmail.com");
		signuppage.clickOnSignupButton();
		boolean isErrorDisplayed = signuppage.isErrorMessageDisplayedLastName();
		Assert.assertFalse(isErrorDisplayed,
				"Error message should be displayed for special charecter input, but it's not!");

	}

	// 9
	@Test(priority = 8)
	public void toVerifyAfterclickOnReachOutUsNavigateContactPage() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		String signupUrl = Keyword.getCurrentUrl();
		System.out.println("signup url->>" + signupUrl);
		signuppage.clickOnReachOutToUsLink();
		String contactUsUrl = Keyword.getCurrentUrl();
		System.out.println("contact us url->>" + contactUsUrl);
		String expectedKeywordInUrl = "contact";
		Assert.assertTrue(contactUsUrl.contains(expectedKeywordInUrl),
				"URL after clicking Reach Out to Us does not contain the expected keyword");

	}

	// 10
	@Test(priority = 9)
	public void toVerifyAfterClickingLogoUserNavigateHomePage() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		String signupUrl = Keyword.getCurrentUrl();
		System.out.println("signup url->>" + signupUrl);
		signuppage.clickOnAssetyzerLogo();
		String actualUrl = Keyword.getCurrentUrl();
		String expectedUrl = "https://assetyzer-9z7t4n29l-rohan-sharans-projects.vercel.app/";
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	//11
	@Test(priority = 10)
	public void toVerifyAfterClickingLoginLinkNavigateLoginPage() {
		HomePage homepage=new HomePage();
		homepage.clickOnSignupButton();
		SelectAssetClassPage selectAsset=new SelectAssetClassPage();
		selectAsset.clickOnTicketingOption();
		selectAsset.clickOnGetStartedButton();
		SignupPage signuppage = new SignupPage();
		String signupUrl = Keyword.getCurrentUrl();
		System.out.println("signup url->>" + signupUrl);
		signuppage.clickOnLoginLink();
		String actualUrl = Keyword.getCurrentUrl();
		String expectedKeywordInUrl = "login";
		Assert.assertTrue(actualUrl.contains(expectedKeywordInUrl),
				"URL after clicking Reach Out to Us does not contain the expected keyword");


	}

}
