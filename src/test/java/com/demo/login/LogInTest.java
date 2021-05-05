package com.demo.login;

import com.demo.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void verifyLogin() {

        Pages.loginPage().waitForLoginForm();
        Pages.loginPage().typeUserName(Constants.INVALID_EMAIL);
        Pages.loginPage().typePassword(Constants.PASSWORD);
        Pages.loginPage().clickEnterButton();

        Assert.assertTrue(Pages.loginPage().isIncorrectEmailMessageDisplayed(),
                "Error is not visible");
    }
}