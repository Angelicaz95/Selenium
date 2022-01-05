package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadAFile {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // locate choose file button
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        // in order to upload a file
        chooseFile.sendKeys("/Users/angelicazaporozhets/Desktop/Unknown.jpeg");

        driver.findElement(By.cssSelector("input#file-submit")).click();



    }
}
