package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.DashboardPage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.TransferFundsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferFundsTest extends BaseTest{
    @Test
    public void fundTransferShouldSucceed(){
    DashboardPage dashboardPage = page.getInstance(LoginPage.class)
                .fillUserName("zozo")
                .fillPassword("12345678")
                .clickLoginBtn();
        Assert.assertTrue(dashboardPage.hasLogOutLinkText());
        int amount = 2000;
        TransferFundsPage fundsPage = dashboardPage
                .clickFundTransfer()
                .fillAmount(amount)
                .clickTransferBtn();
    Assert.assertTrue(fundsPage.hasTransferAmount(amount));
    }
}
