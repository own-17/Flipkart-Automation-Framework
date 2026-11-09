package com.flipkart.automation.tests;

import com.flipkart.automation.base.BaseTest;
import com.flipkart.automation.pages.CartPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void verifyCartPage() {


        CartPage cartPage = new CartPage(page);


        cartPage.open();


        Assert.assertTrue(
                cartPage.isCartPageOpened(),
                "Cart page should be opened"
        );

        System.out.println(cartPage.getCurrentUrl());

        System.out.println("Cart Test Executed Successfully");
    }
}