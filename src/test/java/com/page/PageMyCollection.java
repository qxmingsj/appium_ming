package com.page;

import com.basic.WYNewsUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    public void LongClickClassName(int index) throws InterruptedException {
        try {
            news.longClickClassName("android.widget.LinearLayout", index);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void LongClickName() throws InterruptedException {
        try {
            news.longClickName("校长带老师开房续:系教育人员");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void clickNews(){
        news.findName("校长带老师开房续:系教育人员").click();
    }
    public void clickSure(){
        news.findName("确定").click();
    }
}
