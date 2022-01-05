package com.syntax.test;

import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        LoginPageWithPageFactory login = new LoginPageWithPageFactory();
       // login.username.sendKeys("Admin");
        // login.password.sendKeys("Hum@nhrm123");
        // login.loginBtn.click();
        WebElement userName = login.username;
        CommonMethods.sendText(userName, "Admin");
        WebElement password = login.password;
        CommonMethods.sendText(password, "Hum@nhrm123");
        login.loginBtn.click();


        // close the browser
        BaseClass.tearDown();




    }
}
