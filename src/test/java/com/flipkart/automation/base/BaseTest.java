package com.flipkart.automation.base;

import com.flipkart.automation.utils.ConfigReader;
import com.microsoft.playwright.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected PlaywrightFactory playwrightFactory;
    protected Page page;

    @BeforeMethod
    public void setUp() {

        playwrightFactory = new PlaywrightFactory();

        page = playwrightFactory.launchBrowser();
    }


    protected String getBaseUrl() {

        return ConfigReader.get("baseUrl");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        if (playwrightFactory != null) {

            playwrightFactory.closeBrowser();
        }
    }
}