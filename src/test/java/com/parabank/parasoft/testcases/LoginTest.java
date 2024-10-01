package com.parabank.parasoft.testcases;
import com.parabank.parasoft.pages.DashboardPage;
import com.parabank.parasoft.pages.LoginPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginShouldFailWithoutPassword(){
        LoginPage login = page.getInstance(LoginPage.class)
                .fillUserName(LoremIpsum.getInstance().getName())
                .clickLoginLinkBtn();
        Assert.assertTrue(login.hasError());
    }
    @Test
    public void loginShouldFailWithoutUserName(){
        LoginPage login = page.getInstance(LoginPage.class)
                .fillPassword(LoremIpsum.getInstance().getName())
                .clickLoginLinkBtn();
        Assert.assertTrue(login.hasError());
    }
    @Test
    public void loginShouldSucceed(){
        DashboardPage dashboard = page.getInstance(LoginPage.class)
                .fillUserName("zozo")
                .fillPassword("12345678")
                .clickLoginBtn();
        Assert.assertTrue(dashboard.hasLogOutLinkText());
    }

}
