package com.demo.pages;

import com.demo.base.BasePage;
import org.openqa.selenium.By;

public class ResetPasswordPage extends BasePage {

    private final By resetPasswordForm = By.id("user-pass");
    private final By userEmail = By.id("edit-name");
    private final By submitButton = By.id("edit-submit");

    private final By incorrectEmailMessage = By.xpath("//div[@class='form-item--error-message']/strong");

    public void waitForResetPasswordForm(){
        waitForElementVisibility(resetPasswordForm);
    }

    public void typeUserEmail(String email) {
        waitForElementVisibility(userEmail);
        type(email, userEmail);
    }

    public void clickSubmitButton() {
        waitForElementVisibility(submitButton);
        click(submitButton);
    }

    public boolean isIncorrectEmailMessageDisplayed() {
        waitForElementVisibility(incorrectEmailMessage);
        return isElementVisible(incorrectEmailMessage);
    }
}