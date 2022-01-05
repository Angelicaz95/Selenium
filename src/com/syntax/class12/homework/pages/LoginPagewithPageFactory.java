package com.syntax.class12.homework.pages;

import com.syntax.class12.homework.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagewithPageFactory extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement userName;
    @FindBy(id="txtPassword")
    public WebElement password;
    @FindBy(id="btnLogin")
    public WebElement loginButton;
   public  LoginPagewithPageFactory(){
        PageFactory.initElements(driver, this);
    }
}
