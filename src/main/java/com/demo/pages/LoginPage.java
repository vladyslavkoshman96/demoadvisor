package com.demo.pages;

import com.demo.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By loginForm = By.id("user-login-form");
    private final By userNameField = By.id("edit-name");
    private final By passwordField = By.id("edit-pass");
    private final By enterButton = By.id("edit-submit");
    private final By forgotPasswordButton = By.id("edit-forgot");

    private final By incorrectEmailMessage = By.xpath("//div[@class='form-item--error-message']/strong");

    public void waitForLoginForm(){
        waitForElementVisibility(loginForm);
    }

    public void typeUserName(String email) {
        type(email, userNameField);
    }

    public void typePassword(String password) {
        type(password, passwordField);
    }

    public void clickEnterButton() {
        click(enterButton);
    }

    public void clickForgotPasswordButton() {
        click(forgotPasswordButton);
    }

    public boolean isIncorrectEmailMessageDisplayed() {
        waitForElementVisibility(incorrectEmailMessage);
        return isElementVisible(incorrectEmailMessage);
    }
}