package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // will maximize the window that we have
        driver.manage().window().maximize();

        driver.quit();




    }
}
