package com.syntax.class06.homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get(" http://syntaxprojects.com/javascript-alert-box-demo.php");

        driver.manage().window().maximize();
        // simple alert
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        Thread.sleep(2000);

        // confirm alert
        driver.findElement(By.xpath("//button[text()='Click me!'][@class='btn btn-default btn-lg']")).click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();
        Thread.sleep(2000);

        // prompt alert

        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][text()='Click for Prompt Box']")). click();
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        promptAlert.sendKeys("Prompt Alert");
        promptAlert.accept();
        Thread.sleep(2000);

        driver.quit();
        






    }


}
