package com.demo.base;

import com.codeborne.selenide.Selenide;
import com.demo.config.SelenideConfig;
import com.demo.utils.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        SelenideConfig.createBrowserConfig("chrome");
        Selenide.open(Constants.URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
