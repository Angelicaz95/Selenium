package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;

public class LoginPageTest {
    public static void main(String[] args) {

        // open the browser and navigate to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/validateCredentials

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        // locate the elements and send keys

        LoginPage loginPage = new LoginPage();
       // loginPage.userNameField.sendKeys("Admin");
      //  loginPage.passwordField.sendKeys("Hum@nhrm123");
      //  loginPage.loginBtn.click();

        CommonMethods.sendText(loginPage.userNameField, "Admin");
        CommonMethods.sendText(loginPage.passwordField, "Hum@nhrm123");
        loginPage.loginBtn.click();


    }
}
