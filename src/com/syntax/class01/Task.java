package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        driver.quit();


    }
}
