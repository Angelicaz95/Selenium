package com.syntax.class12.homework.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    public static void openWithSpecificUrl(String url){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();

        }


    }
}
