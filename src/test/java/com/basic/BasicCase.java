package com.basic;

import com.page.PageManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

/**
 * Created by kf23 on 2016/4/18.
 */
public class BasicCase {
    AppiumDriver driver;
    private  String apkName ="news.apk";
//    private  String deviceName ="Nexus 5";
    private  String deviceName ="MI 3";
    private  String platformVersion = "4.4.4";
    private  String appActivity ="com.netease.nr.biz.ad.AdActivity";
    private WYNewsUI NewsUI;
    protected PageManager pageManager;

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
        NewsUI = new WYNewsUI(driver);
        pageManager = new PageManager(NewsUI);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
