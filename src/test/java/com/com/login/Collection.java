package com.com.login;

import com.basic.BasicCase2;
import org.junit.Test;

/**
 * Created by kf23 on 2016/4/19.
 */
public class Collection extends BasicCase2 {
    @Test
    public void Collection() throws InterruptedException {
        Thread.sleep(3000);
        pageManager.pageNavigation().clickNewsTitle(0);
        pageManager.pageNavigation().clickNewsItem(2);
        pageManager.pagePictureShow().clickMoreBtn();
        pageManager.pagePictureShow().clickCollection();
        pageManager.pagePictureShow().clickBackBtn();
        pageManager.pageNavigation().clickNewsTitle(4);
        pageManager.pageMy().clickCollectionBtn();
        pageManager.pageMyCollection().clickPictureBtn();
        Thread.sleep(3000);
        pageManager.pageMyCollection().longclickPicture();
        pageManager.pageMyCollection().clickSure();
    }
}
