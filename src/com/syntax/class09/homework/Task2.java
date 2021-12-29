package com.syntax.class09.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://chercher.tech/practice/explicit-wait");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement displayButton = driver.findElement(By.xpath("//button[@id='display-other-button']"));

        displayButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement newButton = driver.findElement(By.cssSelector("button#hidden"));

        wait.until(ExpectedConditions.elementToBeClickable(newButton));


        System.out.println(newButton.isDisplayed());

        driver.quit();




    }
}
