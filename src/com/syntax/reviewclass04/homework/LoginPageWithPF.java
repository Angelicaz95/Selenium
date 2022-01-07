package com.syntax.reviewclass04.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPF extends CommonMethods{
    @FindBy(id="txtUsername")
    WebElement userName;
    @FindBy(id="txtPassword")
    WebElement password;
    @FindBy(id="btnLogin")
    WebElement loginBtn;

    LoginPageWithPF(){
        PageFactory.initElements(driver, this);
    }

}
