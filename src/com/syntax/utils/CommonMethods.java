package com.syntax.utils;

import com.syntax.testBase.BaseClass;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {
    // extends the base class because we want to use the same driver
    // common methods - methods that will be widely used


    /*
    sends text to a given element
    @param element --> WebElement
    @param text --> the text that you want to send
     */

    public static void sendText(WebElement element, String text){

        element.clear();
        element.sendKeys(text);

    }
    public void switchToFrame(int index){
        driver.switchTo().frame(index);
    }

}
