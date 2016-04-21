package com.page;

import com.basic.WYNewsUI;
import org.openqa.selenium.WebElement;

/**
 * Created by kf23 on 2016/4/19.
 */
public class PagePostMoment {
    WYNewsUI news;
    public PagePostMoment(WYNewsUI news){
        this.news =news;
    }
    public WebElement getSendBtn(){
        return news.findById("com.tencent.mm:id/cdb");
    }
    public void clickSendBtn(){
        getSendBtn().click();
    }
    public WebElement getMomentEditText(){
        return news.findById("com.tencent.mm:id/bne");
    }
    public void enterMoment(String text){
        getMomentEditText().click();
        getMomentEditText().sendKeys(text);
    }
}
