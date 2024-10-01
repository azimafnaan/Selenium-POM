package com.parabank.parasoft.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class BasePage extends Page{
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By selector) {
        WebElement element=null;
        try{
            element = driver.findElement(selector);
        }catch (Exception e){
            System.out.println(selector.toString() + "Not such element found");
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By selector) {
        List<WebElement> elements = null;
        try{
          elements = driver.findElements(selector);
        }catch (Exception e){
            System.out.println(selector.toString() + "Not such element found");
        }
        return elements;
    }

    @Override
    public void waitElement(By selector) {
        wait.until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    @Override
    public void clickElement(By selector) {
        wait.until(ExpectedConditions.elementToBeClickable(getWebElement(selector))).click();
    }

    @Override
    public String getElementText(By selector) {
       return wait.until(ExpectedConditions.presenceOfElementLocated(selector)).getText().trim();
    }
}
