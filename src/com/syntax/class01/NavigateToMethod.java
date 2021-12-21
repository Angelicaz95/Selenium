package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

        Thread.sleep(2000);

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        // navigate allows move forward, backward and refresh
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close();
        // driver.close() ----> it will close the current tab
        // driver.quit() ------> it will close the whole browser










    }
}
