package com.assetyzer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetyzer.base.Keyword;
import com.assetyzer.utils.WaitFor;

public class AssetyzerDashboard {
	public AssetyzerDashboard() {
		PageFactory.initElements(Keyword.driver, this);
	}

	 // Removed 'static' to properly initialize WebElements
    @FindBy(xpath = "//button[text()='Begin']")
    private WebElement beginButton;

    @FindBy(xpath = "//a[text()='Get Started']")
    private WebElement getStartedButton;

    // Click on 'Begin' button
    public void clickOnBegin() {
        WaitFor.visiblityOfElement(beginButton);
        Keyword.scrollwindow(beginButton);
        Keyword.clickOn(beginButton);
    }

    // Click on 'Get Started' button
    public void clickOnGetStarted() {
        WaitFor.visiblityOfElement(getStartedButton);
        Keyword.scrollwindow(getStartedButton);
        Keyword.clickOn(getStartedButton);
    }
}
	


