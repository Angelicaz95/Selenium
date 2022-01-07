package com.syntax.reviewclass04.homework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);

    }

    public static void selectByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }

    public static void takeScreenShot(String filename ){

        TakesScreenshot ts=(TakesScreenshot) driver;

        File screenShot = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenShot,new File("screenshot/ss/"+filename+".png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
