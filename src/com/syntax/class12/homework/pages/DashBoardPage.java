package com.syntax.class12.homework.pages;

import com.syntax.class12.homework.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends CommonMethods {
    @FindBy(id="welcome")
    public WebElement welcomeMessage;

    public DashBoardPage(){
        PageFactory.initElements(driver, this);

    }
}
