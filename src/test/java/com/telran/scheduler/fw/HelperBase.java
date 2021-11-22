package com.telran.scheduler.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HelperBase {

    AppiumDriver driver;

    public HelperBase(AppiumDriver driver) {
        this.driver = driver;
    }

    public void tap (By locator) { // click
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        if (text != null) {
            tap (locator) ;
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

}