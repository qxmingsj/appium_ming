package com.login;

import com.basic.BasicCase;
import com.basic.BasicCase2;
import org.junit.Test;

/**
 * Created by kf23 on 2016/4/19.
 */
public class Collection extends BasicCase {
    @Test
    public void Collection() throws InterruptedException {

        pageManager.wait123().waitPageHomeLoad();
        pageManager.pageNavigation().clickNewsItem(2);
        pageManager.wait123().waitPageThreeBtnLoad();
        pageManager.pagePictureShow().clickMoreBtn2();
        pageManager.pagePictureShow().clickThreeBtn(1);
        pageManager.pagePictureShow().clickBackBtn();
        pageManager.pageNavigation().clickNewsTitle(4);
        pageManager.pageMy().clickLogin();
        pageManager.pageLogin().enterName("qxmingsj@163.com");
        pageManager.pageLogin().enterPassword("1990719QXM");
        pageManager.pageLogin().clickLoginButton();
        pageManager.pageMy().clickCollectionBtn();
        pageManager.wait123().waitPageCollectionLoad();
        Thread.sleep(2000);
        pageManager.pageMyCollection().clickGenTieBtn();
        pageManager.pageMyCollection().clickPictureBtn();
        pageManager.pageMyCollection().LongClickClassName(2);
        pageManager.pageMyCollection().clickSure();
    }
}
