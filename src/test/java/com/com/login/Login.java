package com.com.login;

import com.basic.BasicCase;
import com.page.PageLogin;
import com.page.PageManager;
import org.junit.Test;

/**
 * Created by kf23 on 2016/4/18.
 */
public class Login extends BasicCase {
    @Test
    public void Login() throws  InterruptedException{
        Thread.sleep(20000);
        pageManager.pageNavigation().clickNewsTitle(4);
//        Thread.sleep(3000);
//        pageManager.pageNavigation().clickNewsTab();
//        Thread.sleep(3000);
//        pageManager.pageNavigation().clickReadTab();
//        Thread.sleep(3000);
//        pageManager.pageNavigation().clickTopicTab();
//        Thread.sleep(3000);
//        pageManager.pageNavigation().clickVideoTab();
        pageManager.pageMy().clickLogin();
        pageManager.pageLogin().enterName("robotium2016@163.com");
        pageManager.pageLogin().enterPassword("uiautomator");
        pageManager.pageLogin().clickLoginButton();
        Thread.sleep(3000);


    }
}
