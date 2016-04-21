package com.wait;

import com.basic.WYNewsUI;

/**
 * Created by kf23 on 2016/4/21.
 */
public class Wait123 {

    WYNewsUI news;
    public Wait123(WYNewsUI news){
        this.news = news;
    }

    public void waitPageHomeLoad(){
        WaitYou.waitForElementById(news.getDriver(), "com.netease.newsreader.activity:id/img");
    }
    public void waitPageThreeBtnLoad(){
        WaitYou.waitForElementById(news.getDriver(),"com.netease.newsreader.activity:id/biz_newspage_menu_more");
    }
    public void waitPageCollectionLoad(){
        WaitYou.waitForElementById(news.getDriver(),"com.netease.newsreader.activity:id/title");
    }
}
