package com.flipkart.automation.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private Page page;

    // Constructor
    public HomePage(Page page) {
        this.page = page;
    }

    // Open Flipkart
    public void open(String baseUrl) {
        page.navigate(baseUrl);
    }

    // Get Page Title
    public String getTitle() {
        return page.title();
    }

    // Search Product
    public void searchProduct(String productName) {

        page.locator("input[name='q']")
                .first()
                .fill(productName);

        page.keyboard().press("Enter");
    }
}