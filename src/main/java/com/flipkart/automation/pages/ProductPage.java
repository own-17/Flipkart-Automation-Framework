package com.flipkart.automation.pages;

import com.microsoft.playwright.Page;

public class ProductPage {

    private Page page;


    public ProductPage(Page page) {
        this.page = page;
    }

    public String getTitle() {
        return page.title();
    }

    public String getCurrentUrl() {
        return page.url();
    }

    public String getProductName() {
        return page.locator("h1").first().innerText();
    }
    public boolean isAddToCartVisible() {
        return page.getByText("Add to cart",
                        new Page.GetByTextOptions().setExact(true))
                .first().isVisible();
    }
}