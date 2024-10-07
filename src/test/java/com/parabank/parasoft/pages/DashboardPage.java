package com.parabank.parasoft.pages;

import com.parabank.parasoft.util.GeneralUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage extends LoginPage{
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogOutLinkText(){
        GeneralUtil.waitForSee();
        return getWebElements(By.linkText("Log Out")).size()>0;
    }

    public OpenAccountPage clickOpenAccountLink(){
        clickElement(By.linkText("Open New Account"));
        return getInstance(OpenAccountPage.class);
    }

    public DashboardPage selectAccountType(String value){
        new Select(getWebElement(By.cssSelector("select#type"))).selectByValue(value);
        return this;
    }

    public DashboardPage selectAccountType(int index){
        new Select(getWebElement(By.cssSelector("select#type"))).selectByIndex(index);
        return this;
    }
    public DashboardPage clickOpenAccountBtn(){
        clickElement(By.cssSelector("input.button"));
        return this;
    }
    public boolean hasNewAccountId(){
        GeneralUtil.waitForSee();
        return getWebElements(By.id("newAccountId")).size()>0;
    }

    public TransferFundsPage clickFundTransfer(){
        clickElement(By.linkText("Transfer Fund"));
        return getInstance(TransferFundsPage.class);
    }

}
