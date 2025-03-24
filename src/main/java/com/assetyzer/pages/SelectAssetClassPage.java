package com.assetyzer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetyzer.base.Keyword;
import com.assetyzer.utils.WaitFor;

public class SelectAssetClassPage {

	public SelectAssetClassPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(xpath = "//h3[text()=\"Ticketing\"]")
	private static WebElement ticketingOption;
	
	@FindBy(xpath="//a[@href=\"/auth/verify-email\"]")
	private static WebElement getStartedButton;
	
	public void clickOnTicketingOption() {
		WaitFor.elementToBeClickableMethod(ticketingOption);
		Keyword.clickOn(ticketingOption);
	}
	public void clickOnGetStartedButton() {
		WaitFor.elementToBeClickableMethod(getStartedButton);
		Keyword.clickOn(getStartedButton);
	}
	
}
