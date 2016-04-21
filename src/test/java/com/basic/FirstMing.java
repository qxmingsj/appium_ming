package com.basic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

/**
 * Created by kf23 on 2016/4/17.
 */
   public class FirstMing {
    AppiumDriver driver;
    private  String apkName ="news.apk";
    private  String deviceName ="Nexus 5";
    private  String platformVersion = "4.4.4";
    private  String appActivity ="com.netease.nr.biz.ad.AdActivity";

    @Before
    public void setUp()throws Exception{
        File apk = new File(System.getProperty("user.dir")+File.separator+"apk"+File.separator+apkName);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName",deviceName);
        capabilities.setCapability("platformVersion",platformVersion);
        capabilities.setCapability("app",apk);
        capabilities.setCapability("appActivity",appActivity);
        capabilities.setCapability("noSign",true); //不重签名
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @Test
    public void FirstTest() throws InterruptedException {
        Thread.sleep(20000);
        ( (WebElement)driver.findElements(By.className("android.widget.LinearLayout")).get(2)).click();
//        ((WebElement) driver.findElements(By.id("com.netease.newsreader.activity:id/biz_navi_tab")).get(4)).click();
//        driver.findElement(By.id("com.netease.newsreader.activity:id/biz_pc_main_info_profile_avatar")).click();
//        driver.findElement(By.id("com.netease.newsreader.activity:id/login_username")).sendKeys("robotium2016@163.com");
//        driver.findElement(By.id("com.netease.newsreader.activity:id/login_password")).click();
//        driver.findElement(By.id("com.netease.newsreader.activity:id/login_password")).sendKeys("uiautomator");
//        driver.findElement(By.id("com.netease.newsreader.activity:id/do_login_button")).click();
////        Thread.sleep(4000);
////        ((WebElement) driver.findElements(By.id("com.netease.newsreader.activity:id/biz_navi_tab")).get(0)).click();//通过id 定位；
//
//       // driver.findElement(By.xpath("//*[@text='体育']")).click();  //通过xpath定位；
//
//       // driver.findElement(By.name("邹市明携妻看时装秀 冉莹颖豪饮")).click();//通过name定位
//        //两种写法
////        ( (WebElement)driver.findElements(By.className("android.widget.TextView")).get(6)).click();//通过classname定位；
////        ((WebElement)driver.findElementsByClassName("android.widget.TextView").get(6)).click();
////        Thread.sleep(4000);
////        System.out.println(driver.findElementById("com.netease.newsreader.activity:id/title").getText().toString());//获取文本
////        Thread.sleep(4000);
//        driver.findElement(By.name("收藏")).click();
//        WebElement t = driver.findElement(By.name("\"致死\"问题疫苗你要知道这些"));
//        TouchAction action =new TouchAction(driver);
//        action.longPress(t).release().perform();

    }

    @After
    public void tearDown(){
        driver.quit();

    }

}
