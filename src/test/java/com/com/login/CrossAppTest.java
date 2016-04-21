package com.com.login;

import com.basic.BasicCase;
import org.junit.Test;

/**
 * Created by kf23 on 2016/4/19.
 */
public class CrossAppTest extends BasicCase {
    @Test
    public void share() throws InterruptedException {
        pageManager.pageNavigation().waitForPageLoad();
        pageManager.pageNavigation().clickNewsItem(2);
        pageManager.pageSetting().clickSettingsView();
        pageManager.pageSetting().clickShareToWeChat();
        pageManager.pagePostMoment().enterMoment("hello");
        pageManager.pagePostMoment().clickSendBtn();
        Thread.sleep(10000);
    }
}
