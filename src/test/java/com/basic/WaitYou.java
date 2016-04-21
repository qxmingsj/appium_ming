package com.basic;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by kf23 on 2016/4/19.
 */
public class WaitYou {

    public static void waitForElementById(AppiumDriver driver , String id){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    }
    public static void waitForElementByText(AppiumDriver driver , String text){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(text)));
    }
}
