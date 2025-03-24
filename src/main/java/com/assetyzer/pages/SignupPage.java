package com.assetyzer.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetyzer.base.Keyword;
import com.assetyzer.utils.WaitFor;

public class SignupPage {
	public SignupPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(xpath = "//div/h3[text()=\"Ticketing\"]")
	private static WebElement ticketingAssetOpt;

	@FindBy(css = "a[href=\"/auth/verify-email\"]")
	private static WebElement getStartedLink;

	@FindBy(css = "input#first_name")
	private static WebElement firstNameTextBox;

	@FindBy(css = "input#last_name")
	private static WebElement lastNameTextBox;

	@FindBy(css = "input#email")
	private static WebElement businessEmailAddress;

	@FindBy(css = "button[type=\"submit\"]")
	private static WebElement submitButtton;

	@FindBy(xpath = "//small[contains(text(),'Email Sent Successfully')]")
	private static WebElement emailSentMsg;

	@FindBy(css = "button[type=\"submit\"]")
	private static WebElement signupButton;

	@FindBy(css = "small.text-red-400")
	private static WebElement blankEmailErrorMsg;
	
	@FindBy(css="a[href=\"/contact\"]")
	private static WebElement reachOutToUsLink;
	
	@FindBy(css="img[src=\"/assetyzer-green.svg\"]")
	private static WebElement assetyzerLogo;
	
	@FindBy(css="a[href=\"/auth/login\"]")
	private static WebElement loginLink;

	public void clickOnTicketingAssetOpt() {
		WaitFor.elementToBeClickableMethod(ticketingAssetOpt);
		Keyword.clickOn(ticketingAssetOpt);
	}

	public void clickOnGetStarted() {
		WaitFor.elementToBeClickableMethod(getStartedLink);
		Keyword.clickOn(getStartedLink);

	}

	public void typeFirstName() {
		WaitFor.visiblityOfElement(firstNameTextBox);
		Keyword.sendKeys(firstNameTextBox, "John");
	}

	public void enterFirstNameInvalidFormats(String firstName) {
		WaitFor.visiblityOfElement(firstNameTextBox);
		Keyword.sendKeys(firstNameTextBox, firstName);
	}

	public void enterLastNameInvalidFormats(String lastName) {
		WaitFor.visiblityOfElement(lastNameTextBox);
		Keyword.sendKeys(lastNameTextBox, lastName);
	}

	public void typeLastName() {
		WaitFor.visiblityOfElement(lastNameTextBox);
		Keyword.sendKeys(lastNameTextBox, "Doe");
	}

	public void typeEmail(String text) {
		WaitFor.visiblityOfElement(businessEmailAddress);
		Keyword.sendKeys(businessEmailAddress,text);
	}

	public void typeInvalidEmail() {
		WaitFor.visiblityOfElement(businessEmailAddress);
		Keyword.sendKeys(businessEmailAddress, "johexample.com");
	}

	public void clickOnSubmitButton() {
		WaitFor.elementToBeClickableMethod(submitButtton);
		Keyword.clickOn(submitButtton);

	}

	public String getTextEmailSent() {
		WaitFor.visiblityOfElement(emailSentMsg);
		return Keyword.getText(emailSentMsg);
	}

	public void clickOnSignupButton() {
		WaitFor.elementToBeClickableMethod(signupButton);
		Keyword.clickOn(signupButton);
	}

	public String getFirstNameErrorMsg() {
		WaitFor.visiblityOfElement(firstNameTextBox);
		return Keyword.getValidationMessage(firstNameTextBox);

	}

	public String getLastNameErrorMsg() {
		WaitFor.visiblityOfElement(lastNameTextBox);
		return Keyword.getValidationMessage(lastNameTextBox);

	}

	public String getBlankEmailErrorMsg() {
		WaitFor.visiblityOfElement(blankEmailErrorMsg);
		return Keyword.getText(blankEmailErrorMsg);
	}

	public String getInvalidEmailErrorMsg() {
		WaitFor.visiblityOfElement(businessEmailAddress);
		return Keyword.getValidationMessage(businessEmailAddress);

	}

	public boolean isErrorMessageDisplayedFirstName() {
		WaitFor.visiblityOfElement(firstNameTextBox);
		return Keyword.isMessageDisplayed(firstNameTextBox);
	}
	public boolean isErrorMessageDisplayedLastName() {
		WaitFor.visiblityOfElement(lastNameTextBox);
		return Keyword.isMessageDisplayed(lastNameTextBox);
	}
	public void clickOnReachOutToUsLink() {
		WaitFor.elementToBeClickableMethod(reachOutToUsLink);
		Keyword.clickOn(reachOutToUsLink);
	}
	public void clickOnAssetyzerLogo() {
		WaitFor.elementToBeClickableMethod(assetyzerLogo);
		Keyword.clickOn(assetyzerLogo);
	}
	public void clickOnLoginLink() {
		WaitFor.elementToBeClickableMethod(loginLink);
		Keyword.clickOn(loginLink);
	}

}
