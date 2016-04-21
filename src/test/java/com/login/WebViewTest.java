package com.login;

import com.basic.BasicCase;
import com.page.PageBasic;
import com.page.PageManager;
import org.junit.Test;

/**
 * Created by kf23 on 2016/4/19.
 */
public class WebViewTest extends BasicCase {
    @Test
    //真机跑不通
    public void test()throws InterruptedException{
        pageManager.wait123().waitPageHomeLoad();
        pageManager.pageNavigation().clickNewsItem(3);
        pageManager.pageBasic().switchContext();
        System.out.println(pageManager.pageSetting().getNewsTitleText());




    }
}
