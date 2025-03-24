package com.assetyzer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetyzer.base.Keyword;
import com.assetyzer.utils.WaitFor;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(xpath = "//div[@class=\"hidden lg:flex items-center gap-[12px]\"]/a[@href=\"/auth/asset-class\"][text()=\"Sign Up\"]")
	private static WebElement signupButton;
	@FindBy(xpath = "(//a[text()=\"Log In\"])[1]")
	private static WebElement loginButton;
	@FindBy(xpath = "//input[@name=\"email\"]")
	private static WebElement enterEmail;
	@FindBy(xpath = "//input[@name=\"password\"]")
	private static WebElement enterPassword;
	@FindBy(xpath = "//button[text()=\"Sign In\"]")
	private static WebElement signIn;
	

	
	public void clickOnSignupButton() {
		WaitFor.visiblityOfElement(signupButton);
		Keyword.clickOn(signupButton);
	}
	public void loginFlow() {
		WaitFor.visiblityOfElement(loginButton);
		Keyword.clickOn(loginButton);
		WaitFor.visiblityOfElement(enterEmail);
		Keyword.sendKeys(enterEmail, "riteekrakesh712@gmail.com");
		WaitFor.visiblityOfElement(enterPassword);
		Keyword.sendKeys(enterPassword,"riteekrakesh712@gmail.com");
		Keyword.clickOn(signIn);
		

		
	}


}
