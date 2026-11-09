package com.flipkart.automation.utils;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class WaitUtils {

    public static void waitForPageLoad(Page page) {

        page.waitForLoadState(
                LoadState.DOMCONTENTLOADED
        );
    }

    public static void waitForElementVisible(
            Page page, String locator) {

        page.locator(locator).waitFor();
    }
}