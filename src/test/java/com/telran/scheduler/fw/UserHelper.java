package com.telran.scheduler.fw;

import com.telran.scheduler.model.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Random;

public class UserHelper extends HelperBase{

    public UserHelper(AppiumDriver driver) {
        super(driver);
    }

    public  void login(User user) {
        type(By.id("log_email_input"), user.getEmail());
        type(By.id("log_password_input"), user.getPassword());
        hideKeyboard();
        tapLoginButton();
    }

    public void tapLoginButton() {
        tap(By.id("login_btn"));
    }

    public void defaultLogin() {
        login(new User().setEmail("krozzs@gm.com").setPassword("123Nr5gt11"));

    }

    public void register() {
        Random random = new Random();

        int r = random.nextInt(100);
        login(new User().setEmail("dt" + r + "@gm.com").setPassword("1234567Fgtz"));

    }
}