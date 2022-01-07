package com.syntax.class12.homework.test;

import com.syntax.class12.homework.pages.DashBoardPage;
import com.syntax.class12.homework.pages.LoginPagewithPageFactory;
import com.syntax.class12.homework.testBase.BaseClass;
import com.syntax.class12.homework.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class DashBoard2 {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPagewithPageFactory login = new LoginPagewithPageFactory();
        WebElement userName =  login.userName;
        CommonMethods.sendText(userName, "Admin");
        WebElement password  = login.password;
        CommonMethods.sendText(password, "Hum@nhrm123");
        WebElement loginBtn = login.loginButton;
        loginBtn.click();

        DashBoardPage dashBoard = new DashBoardPage();
        WebElement message = dashBoard.welcomeMessage;
        System.out.println( message.getText());

        CommonMethods.takeTheScreenShot("DashBoardPage");


        CommonMethods.closeBrowser();




    }
}
