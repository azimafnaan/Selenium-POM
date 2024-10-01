package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillUserName(String username){
        getWebElement(By.name("username")).sendKeys(username);
        return this;
    }
    public LoginPage fillPassword(String password) {
        getWebElement(By.name("password")).sendKeys(password);
        return this;
    }
    public DashboardPage clickLoginBtn(){
        clickElement(By.cssSelector("form .button"));
        return getInstance(DashboardPage.class);
    }
}
