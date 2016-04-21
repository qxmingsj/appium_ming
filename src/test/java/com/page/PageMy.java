package com.page;

import com.basic.WYNewsUI;

/**
 * Created by kf23 on 2016/4/19.
 */
public class PageMy {
    WYNewsUI news;
    public PageMy(WYNewsUI news){
        this.news = news;
    }
    //立即登录按钮
    public void clickLogin(){
        news.findById("com.netease.newsreader.activity:id/biz_pc_main_info_profile_avatar").click();
    }
    //收藏按钮
    public void clickCollectionBtn(){
        news.findById("com.netease.newsreader.activity:id/biz_pc_profile_collect").click();
    }
}
