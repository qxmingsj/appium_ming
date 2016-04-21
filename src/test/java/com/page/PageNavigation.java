package com.page;

import com.basic.WYNewsUI;
import com.basic.WaitYou;

/**
 * Created by kf23 on 2016/4/18.
 */
public class PageNavigation {
    WYNewsUI newsui;

    public PageNavigation(WYNewsUI wyNewsUI){
        this.newsui = wyNewsUI;
    }

    public void clickNewsTitle(int index){
        newsui.findByIdAndIndex("icom.netease.newsreader.activty:id/biz_navi_tab",index).click();
    }


    public void  clickNewsItem(int index){
        newsui.findByIdAndIndex("com.netease.newsreader.activity:id/title", index).click();
    }

    public void waitForPageLoad(){
        WaitYou.waitForElementById(newsui.getDriver(),"com.netease.newsreader.activity:id/img");
    }
}
