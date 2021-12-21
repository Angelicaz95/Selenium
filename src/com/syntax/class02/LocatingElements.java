package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
       // driver.findElement(By.id("email")).sendKeys("angiez@gmail.com");

        driver.findElement(By.name("email")).sendKeys("angie@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123qwerty");

      //  driver.findElement(By.name("login")).click();

       // driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();
    }
}
