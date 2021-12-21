package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");

        Thread.sleep(1500);

        WebElement password =driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("");

        Thread.sleep(1500);

        WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();

        WebElement message = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        System.out.println(message.isDisplayed());









    }
}
