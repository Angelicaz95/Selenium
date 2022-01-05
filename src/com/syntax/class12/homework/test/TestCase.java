package com.syntax.class12.homework.test;

import com.syntax.class12.homework.testBase.BaseClass;
import com.syntax.class12.homework.pages.LoginPagewithPageFactory;
import com.syntax.class12.homework.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class TestCase {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPagewithPageFactory page = new LoginPagewithPageFactory();

        WebElement userName = page.userName;
        CommonMethods.sendText(userName, "Admin");
        WebElement password = page.password;
        CommonMethods.sendText(password,"Hum@hrm123");
        WebElement loginBtn = page.loginButton;

        loginBtn.click();




        CommonMethods.takeTheScreenShot("LoginPageScreenshot");

        CommonMethods.closeBrowser();


    }
}
