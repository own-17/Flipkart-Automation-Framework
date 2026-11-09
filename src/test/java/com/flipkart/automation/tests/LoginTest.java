package com.flipkart.automation.tests;

import com.flipkart.automation.base.BaseTest;
import com.flipkart.automation.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPage() {

        // Create LoginPage object
        LoginPage loginPage = new LoginPage(page);

        // Open Login Page
        loginPage.open();

        // Print Page Details
        System.out.println("Login Page Title: " + loginPage.getTitle());
        System.out.println("Login Page URL: " + loginPage.getCurrentUrl());

        // Verify Login Page
        Assert.assertTrue(
                loginPage.isLoginPageOpened(),
                "Login page should be opened"
        );

        System.out.println("Login Test Executed Successfully");
    }
}