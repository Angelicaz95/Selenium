package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {
    @FindBy(id="txtUsername") // any other locators can be used
    public WebElement username; // have to declare a WebElement that was found with particular locator
    @FindBy(id="txtPassword")
    public WebElement password;
    @FindBy (id = "btnLogin")
    public WebElement loginBtn;

// if using page factory, you need to create a constructor and initialize your variables
    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver, this);
    }

}
