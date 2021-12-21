package com.syntax.review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.google.com/");
        // returns a current URL from the browser
        System.out.println(driver.getCurrentUrl());
        //returns the title
        System.out.println(driver.getTitle());





        driver.quit();





    }
}
