package com.login;

import com.basic.BasicCase;
import org.junit.Test;

/**
 * Created by kf23 on 2016/4/19.
 */
public class ToWebViewPage extends BasicCase {
    @Test
    public void fist() throws InterruptedException {
        pageManager.wait123().waitPageHomeLoad();
        pageManager.pageNavigation().clickNewsItem(2);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pageManager.pageBasic().switchContext();
    }
}
