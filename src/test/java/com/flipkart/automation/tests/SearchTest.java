package com.flipkart.automation.tests;

import com.flipkart.automation.base.BaseTest;
import com.flipkart.automation.pages.HomePage;
import com.flipkart.automation.pages.SearchPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchProductTest() {

        // Create HomePage object
        HomePage homePage = new HomePage(page);

        // Open Flipkart
        homePage.open(getBaseUrl());

        // Search Product
        homePage.searchProduct("iPhone");

        // Create SearchPage object
        SearchPage searchPage = new SearchPage(page);

        // Print Page Details
        System.out.println("Search Page Title: " + searchPage.getTitle());
        System.out.println("Search Page URL: " + searchPage.getCurrentUrl());

        // Verify Search Results
        Assert.assertTrue(
                searchPage.getCurrentUrl().contains("search"),
                "Search page should be displayed"
        );

        System.out.println("Search Test Executed Successfully");
    }
}