package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);


        driver.findElement(By.name("firstname")).sendKeys("Angelica");
        driver.findElement(By.name("lastname")).sendKeys("Andriyenko");
        driver.findElement(By.name("reg_email__")).sendKeys("angelica@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("angelica@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Qwerty09876");




        Thread.sleep(2000);
        driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();

        driver.close();
        Thread.sleep(2000);

        driver.quit();

    }
}
