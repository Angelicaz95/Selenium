package com.syntax.reviewclass04.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPageWithPF extends CommonMethods {
    @FindBy (css="a#menu_admin_viewAdminModule")
        WebElement adminButton;
    @FindBy(css="input#searchSystemUser_userName")
        WebElement searchField;
    @FindBy (css="select#searchSystemUser_userType")
    WebElement roleBtn;
    AdminPageWithPF(){
        PageFactory.initElements(driver,this);
    }

}
