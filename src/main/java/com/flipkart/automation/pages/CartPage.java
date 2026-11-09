package com.flipkart.automation.pages;

import com.microsoft.playwright.Page;

public class CartPage {

    private Page page;

    // Constructor
    public CartPage(Page page) {

        this.page = page;
    }

    // Open Cart Page
    public void open() {
        page.navigate("https://www.flipkart.com/viewcart");
    }

    // Get Page Title
    public String getTitle() {
        return page.title();
    }

    // Get Current URL
    public String getCurrentUrl() {
        return page.url();
    }

    // Verify Cart Page
    public boolean isCartPageOpened() {
        return page.url().contains("viewcart");
    }
}