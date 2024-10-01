package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.List;

public abstract class Page {
    WebDriver driver;
    WebDriver wait;


   public Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }
    public abstract WebElement getWebElement(By selector);
    public abstract List<WebElement> getWebElements(By selector);
    public abstract void waitElement(By selector);
    public abstract void clickElement(By selector);
    public abstract String getElementText(By selector);

    public <T extends BasePage> T getInstance(Class<T> tClass){
        try {
            return tClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
