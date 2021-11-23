
package com.telran.scheduler.tests;

import com.telran.scheduler.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        app.getUser().login(new User().setEmail("krozzs@gm.com").setPassword("123Nr5gt11"));
        Assert.assertTrue(app.getEvent().isContainerReportPresent());
    }

    @Test
    public void loginNegativeWithWrongPasswordTest() {
        app.getUser().login(new User().setEmail("krozzs@gm.com").setPassword("123Nr5gt111"));
        Assert.assertTrue(app.getEvent().isAlertPresent());
    }

    // nav_list_fr_container
}

