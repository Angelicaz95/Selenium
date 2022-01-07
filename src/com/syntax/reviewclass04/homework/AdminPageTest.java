package com.syntax.reviewclass04.homework;

import org.openqa.selenium.WebElement;

public class AdminPageTest {
    public static void main(String[] args) {
        BaseClass.openBrowserWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        LoginPageWithPF loginPage = new LoginPageWithPF();
        WebElement username= loginPage.userName;
        CommonMethods.sendText(username, "Admin");
        WebElement password = loginPage.password;
        CommonMethods.sendText(password, "Hum@nhrm123");
        WebElement loginBtn = loginPage.loginBtn;
        loginBtn.click();

        AdminPageWithPF adminPage= new AdminPageWithPF();
        WebElement adminButton= adminPage.adminButton;
        adminButton.click();

        WebElement searchButton = adminPage.searchField;
        CommonMethods.sendText(searchButton, "Admin");

        WebElement role= adminPage.roleBtn;
        CommonMethods.selectByText(role, "Admin");


        CommonMethods.takeScreenShot("AdminPage");

        CommonMethods.tearDown();





    }
}
