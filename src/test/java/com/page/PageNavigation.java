package com.page;

import com.basic.WYNewsUI;

/**
 * Created by kf23 on 2016/4/18.
 */
public class PageNavigation {
    WYNewsUI news;

    public PageNavigation(WYNewsUI wyNewsUI){
        this.news = wyNewsUI;
    }

    public void clickNewsTitle(int index){
        news.findByIdAndIndex("com.netease.newsreader.activity:id/biz_navi_title",index).click();
    }


    public void  clickNewsItem(int index){
        news.findByIdAndIndex("com.netease.newsreader.activity:id/title", index).click();
    }


}
