package com.syntax.class12.homework.test;

import com.syntax.class12.homework.testBase.BaseClass;
import com.syntax.class12.homework.pages.DashBoardPageWithPageFactory;
import com.syntax.class12.homework.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class DashBoardPageTest {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
       DashBoardPageWithPageFactory login = new DashBoardPageWithPageFactory();
       WebElement userName =  login.userName;
       CommonMethods.sendText(userName, "Admin");
       WebElement password  = login.password;
       CommonMethods.sendText(password, "Hum@nhrm123");
       WebElement loginBtn = login.loginButton;
       loginBtn.click();
       WebElement welcomeAdminButton = login.adminButton;
       String text =  welcomeAdminButton.getText();
       System.out.println(text);

       CommonMethods.takeTheScreenShot("DashboardPage");

       CommonMethods.closeBrowser();



    }
}
