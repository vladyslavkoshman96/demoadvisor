package com.demo.login;

import com.demo.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetPasswordTest extends BaseTest {

    @Test
    public void verifyResetPasswordValidation(){

        Pages.loginPage().waitForLoginForm();
        Pages.loginPage().clickForgotPasswordButton();

        Pages.resetPasswordPage().waitForResetPasswordForm();
        Pages.resetPasswordPage().typeUserEmail(Constants.INVALID_EMAIL);
        Pages.resetPasswordPage().clickSubmitButton();

        Assert.assertTrue(Pages.resetPasswordPage().isIncorrectEmailMessageDisplayed(),
                "Error is not visible.");
    }
}