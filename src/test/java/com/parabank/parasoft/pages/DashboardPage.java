package com.parabank.parasoft.pages;

import org.openqa.selenium.WebDriver;

public class DashboardPage extends LoginPage{
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void TestPrint(){
        System.out.println("Hello World!");
        System.out.println("Test Automation!");
    }
}
