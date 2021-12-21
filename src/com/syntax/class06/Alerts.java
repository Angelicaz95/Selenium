package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get(" http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        // enable the alert
        driver.findElement(By.cssSelector("button#alert")).click();
        // switch the focus of selenium
        Thread.sleep(2000);

      Alert simpleAlert  =  driver.switchTo().alert();
      simpleAlert.accept();


      driver.findElement(By.cssSelector("button#confirm")).click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();






    }
}
