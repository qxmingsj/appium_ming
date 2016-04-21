package com.page;

import com.basic.WYNewsUI;

/**
 * Created by kf23 on 2016/4/19.
 */
public class PagePictureShow {
    WYNewsUI news;
    public PagePictureShow(WYNewsUI news){
        this.news = news;
    }
    public void clickMoreBtn(){
        news.findById("com.netease.newsreader.activity:id/biz_pic_menu_more").click();
    }
    public void clickCollection(){
        news.findById("com.netease.newsreader.activity:id/icon").click();
    }
    public void clickBackBtn(){
        news.findByClassName("android.widget.ImageButton").click();
    }

}
