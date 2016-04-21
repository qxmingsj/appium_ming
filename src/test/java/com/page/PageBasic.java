package com.page;

import com.basic.WYNewsUI;

import java.util.Set;

/**
 * Created by kf23 on 2016/4/19.
 */
public class PageBasic {
    WYNewsUI newsui;

    public PageBasic(WYNewsUI wyNewsUI){
        this.newsui = wyNewsUI;
    }

    public void switchContext(){
        Set<String> contextNames = newsui.getDriver().getContextHandles();
        for (String contextName : contextNames){
            System.out.println(contextName);
        }
        String lastestContextView = contextNames.toArray()[contextNames.size()-1].toString();
        if(lastestContextView.contains("WEBVIEW")){
            newsui.getDriver().context(lastestContextView);
        }
    }
    public  void switchToNative(){
        newsui.getDriver().context("NATIVE");
    }

}
