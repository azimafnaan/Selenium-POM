package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    WebDriver driver;
    Page page;

    @BeforeMethod
    public void launchBrowser(){
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://parabank.parasoft.com/parabank/");
    page = new BasePage(driver);


    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
