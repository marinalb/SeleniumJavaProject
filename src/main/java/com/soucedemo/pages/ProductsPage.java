package com.soucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    By productHeadline = By.xpath("//span[text()='Products']");

    public boolean isHeaderDisplayed() {
        return find(productHeadline).isDisplayed();
    }
}
