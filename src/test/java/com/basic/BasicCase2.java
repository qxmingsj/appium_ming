package com.basic;

import org.junit.Test;

/**
 * Created by kf23 on 2016/4/19.
 */
public class BasicCase2 extends BasicCase {

    @Test
    public void Loign() throws InterruptedException {
        Thread.sleep(20000);
        pageManager.pageNavigation().clickNewsTitle(4);
        pageManager.pageMy().clickLogin();
        Thread.sleep(2000);
        pageManager.pageLogin().Login();

    }
}
