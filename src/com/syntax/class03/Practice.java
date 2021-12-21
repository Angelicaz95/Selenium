package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/");
        driver.manage().window().maximize();

        WebElement practice = driver.findElement(By.xpath("//a[contains(@id,'btn_b')]"));
        practice.click();

        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();

        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");

        driver.findElement(By.xpath("//button[text()='Show Message']")).click();



        // advance xpath

      //  driver.findElement(By.xpath("//label[text()='Enter message']/following-sibling::input")).sendKeys("Hello");




    }
}