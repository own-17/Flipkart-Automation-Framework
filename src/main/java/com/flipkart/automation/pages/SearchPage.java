package com.flipkart.automation.pages;

import com.microsoft.playwright.Page;

public class SearchPage {

    private Page page;

    public SearchPage(Page page) {
        this.page = page;
    }

    public String getTitle() {
        return page.title();
    }

    public String getCurrentUrl() {
        return page.url();
    }

    public boolean isSearchResultDisplayed() {

        return page.locator("body")
                .innerText()
                .toLowerCase()
                .contains("mobile");
    }
}