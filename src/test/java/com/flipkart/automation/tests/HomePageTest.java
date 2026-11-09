package com.flipkart.automation.tests;

import com.flipkart.automation.base.BaseTest;
import com.flipkart.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageLoads() {

        HomePage homePage = new HomePage(page);

        homePage.open(getBaseUrl());

        System.out.println("Page Title: " + homePage.getTitle());

        System.out.println("Current URL: " + page.url());

        Assert.assertTrue(
                homePage.getTitle().toLowerCase().contains("flipkart"),
                "Homepage title should contain Flipkart"
        );
    }
}