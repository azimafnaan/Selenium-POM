package com.parabank.parasoft.testcases;
import com.parabank.parasoft.pages.DashboardPage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OpenAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountTest extends BaseTest {
    @Test
    public void openAccountShouldSucceed(){
    DashboardPage dashboardPage = page.getInstance(LoginPage.class)
                .fillUserName("zozo")
                .fillPassword("12345678")
                .clickLoginBtn();
        Assert.assertTrue(dashboardPage.hasLogOutLinkText());
        OpenAccountPage accountPage = dashboardPage.clickOpenAccountLink()
                .selectAccountType("1")
                .clickOpenAccountBtn();
        Assert.assertTrue(accountPage.hasNewAccountId());
    }
    @Test(enabled = false)
    public void openAccountShouldSucceed2(){
        OpenAccountPage accountPage = page.getInstance(LoginPage.class)
                .fillUserName("zozo")
                .fillPassword("12345678")
                .clickLoginBtn()
                .clickOpenAccountLink()
                .selectAccountType("1")
                .clickOpenAccountBtn();
        Assert.assertTrue(accountPage.hasNewAccountId());
    }
}
