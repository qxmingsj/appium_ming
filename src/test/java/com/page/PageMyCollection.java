package com.page;

import com.basic.WYNewsUI;

/**
 * Created by kf23 on 2016/4/19.
 */
public class PageMyCollection {
    WYNewsUI news;
    public PageMyCollection(WYNewsUI news){
        this.news = news;
    }
    //点击图片按钮
    public void clickPictureBtn(){
        news.findName("图片").click();
    }
    public  void clickGenTieBtn(){
        news.findName("跟贴").click();
    }
    public  void  clickNewsBtn(){
        news.findName("新闻").click();
    }
    public void longclickPicture() throws InterruptedException {
        try {
            news.longclick("《看客》第502期：失守的校园");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void clickSure(){
        news.findName("确定").click();
    }
}
