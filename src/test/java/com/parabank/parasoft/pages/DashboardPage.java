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

    public TransferFundsPage clickFundTransfer(){
        clickElement(By.linkText("Transfer Funds"));
        return getInstance(TransferFundsPage.class);
    }

}
