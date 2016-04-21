package com.page;

import com.basic.WYNewsUI;

/**
 * Created by kf23 on 2016/4/19.
 */
public class PageLogin {
    WYNewsUI news;
    public PageLogin(WYNewsUI news){
        this.news =news;
    }
    public void enterName(String name){
        news.findName("网易邮箱/手机号").click();
        news.findName("网易邮箱/手机号").sendKeys(name);
    }
    public void enterPassword(String password){
        news.findById("com.netease.newsreader.activity:id/login_password").click();
        news.findById("com.netease.newsreader.activity:id/login_password").sendKeys(password);
    }
    public void clickLoginButton(){
        news.findName("登 录").click();
    }

    public void Login() throws InterruptedException {
        enterName("qxmingsj@163.com");
        enterPassword("1990719QXM");
        clickLoginButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
