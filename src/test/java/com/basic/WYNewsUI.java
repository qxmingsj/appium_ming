package com.basic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by kf23 on 2016/4/18.
 */
public class WYNewsUI {
    private AppiumDriver driver;
    private String name;
    private int index;


    public WYNewsUI(AppiumDriver driver){
        this.driver = driver;
    }

    public WebElement findById(String  id){
        return  driver.findElement(By.id(id));
    }

    public WebElement findName(String name){
        return  driver.findElement(By.name(name));
    }

    public WebElement findByClassName(String clsName){
        return  driver.findElement(By.className(clsName));
    }

    public WebElement findByClassNameAndIndex(String name,int index){
        return (WebElement) driver.findElements(By.className(name)).get(index);
    }

    public WebElement findByXpath(String xpath){
        return  driver.findElement(By.xpath(xpath));

    }

    public WebElement findByIdAndIndex(String id,int index){
       return  (WebElement) driver.findElements(By.id(id)).get(index);
    }


    public WebElement longClickClassName(String classname,int index) throws  InterruptedException{
        WebElement webElement1= (WebElement) driver.findElements(By.className(classname)).get(index);
        TouchAction action = new TouchAction(driver);
        action.longPress(webElement1).release().perform();
        Thread.sleep(2000);
        return webElement1;
    }

    public  WebElement longClickName(String name) throws InterruptedException {
        WebElement webElement = driver.findElement(By.name(name));
        TouchAction action = new TouchAction(driver);
        action.longPress(webElement).release().perform();
        Thread.sleep(2000);
        return webElement;
    }


    public AppiumDriver getDriver() {
        return driver;
    }



}
