package com.demo.pages;

public class Pages {

    private static LoginPage loginPage;
    private static ResetPasswordPage resetPasswordPage;

    public static LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public static ResetPasswordPage resetPasswordPage() {
        if (resetPasswordPage == null) {
            resetPasswordPage = new ResetPasswordPage();
        }
        return resetPasswordPage;
    }
}