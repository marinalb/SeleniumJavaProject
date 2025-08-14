package com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.soucedemo.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMO_URL = "https://demoqa.com/";


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(DEMO_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage= new HomePage();
    }

}