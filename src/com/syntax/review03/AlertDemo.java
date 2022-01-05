package com.syntax.review03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();
        WebElement alertButton = driver.findElement(By.xpath("//*[@id='alert']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


        Thread.sleep(2000);
        driver.quit();



    }
    }
