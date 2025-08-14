package com.soucedemo.tests;

import com.soucedemo.base.BaseTest;
import com.soucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void testProductHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.loginApp("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isHeaderDisplayed(),
                "Header is not displayed");
    }


}
