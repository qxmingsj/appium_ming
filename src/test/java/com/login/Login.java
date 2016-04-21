package com.login;

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
        pageManager.wait123().waitPageHomeLoad();
        pageManager.pageNavigation().clickNewsTitle(4);
        pageManager.pageMy().clickLogin();
        pageManager.pageLogin().enterName("robotium2016@163.com");
        pageManager.pageLogin().enterPassword("uiautomator");
        pageManager.pageLogin().clickLoginButton();
        Thread.sleep(3000);


    }
}
