package com.flipkart.automation.pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    // Constructor
    public LoginPage(Page page) {
        this.page = page;
    }

    // Open Login Page
    public void open() {
        page.navigate("https://www.flipkart.com/account/login");
    }

    // Get Page Title
    public String getTitle() {
        return page.title();
    }

    // Get Current URL
    public String getCurrentUrl() {
        return page.url();
    }

    // Check Login Page
    public boolean isLoginPageOpened() {
        return page.url().contains("account/login");
    }
}