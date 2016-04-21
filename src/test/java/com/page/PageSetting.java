package com.page;

import com.basic.WYNewsUI;
import org.openqa.selenium.WebElement;

/**
 * Created by kf23 on 2016/4/19.
 */
public class PageSetting {
    WYNewsUI news;
    public PageSetting(WYNewsUI news){
        this.news =news;
    }

    public WebElement getSettingsView(){
        return news.findById("com.netease.newsreader.activity:id/biz_special_menu_share");
    }
    public void clickSettingsView(){
        getSettingsView().click();
    }

    public WebElement getShareView(){
        return  news.findName("分享");
    }

    public void  clickShareToWeChat(){
        news.findName("微信朋友圈").click();
    }

    public WebElement getNewsTitle(){
        WebElement title = news.findByXpath("//*[@id=\"article_body\"]/div[2]/div[1]");
        return title;
    }
    public String getNewsTitleText(){
        return getNewsTitle().getText().toString();
    }
}
