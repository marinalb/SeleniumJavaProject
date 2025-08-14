package com.soucedemo.tests;

import com.soucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginError() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz3400");
        loginPage.clickLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualErrorMessage.contains("Epic"));
    }
}
