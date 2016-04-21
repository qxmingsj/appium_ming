package com.page;

import com.basic.WYNewsUI;
import com.wait.Wait123;

/**
 * Created by kf23 on 2016/4/18.
 */
public class PageManager {
    WYNewsUI newsui;
    PageNavigation pageNavigation;
    PageMy pageMy;
    PageLogin pageLogin;
    PagePictureShow pagePictureShow;
    PageMyCollection pageMyCollection;
    PageSetting pageSetting;
    PagePostMoment pagePostMoment;
    PageBasic pageBasic;
    Wait123 wait123;

    public PageManager(WYNewsUI newsui){
        this.newsui = newsui;
    }
    public PageNavigation pageNavigation(){
        if(pageNavigation == null){
            pageNavigation = new PageNavigation(newsui);
        }
        return pageNavigation;
    }
    public PageMy pageMy(){
        if(pageMy == null){
            pageMy = new PageMy(newsui);
        }
        return  pageMy;
    }
    public PageLogin pageLogin(){
        if (pageLogin == null){
            pageLogin = new PageLogin(newsui);
        }
        return pageLogin;
    }
    public PagePictureShow pagePictureShow(){
        if (pagePictureShow == null){
            pagePictureShow = new PagePictureShow(newsui);
        }
        return pagePictureShow;
    }

    public PageMyCollection pageMyCollection(){
        if(pageMyCollection==null){
            pageMyCollection = new PageMyCollection(newsui);
        }
        return pageMyCollection;
    }
    public PageSetting pageSetting(){
        if(pageSetting == null){
            pageSetting = new PageSetting(newsui);
        }
        return pageSetting;
    }

    public PagePostMoment pagePostMoment(){
        if(pagePostMoment == null){
            pagePostMoment = new PagePostMoment(newsui);
        }
        return pagePostMoment;
    }

    public PageBasic pageBasic(){
        if(pageBasic == null){
            pageBasic = new PageBasic(newsui);
        }
        return pageBasic;
    }

    public Wait123 wait123(){
        if(wait123 == null){
            wait123 = new Wait123(newsui);
        }
        return wait123;
    }
}
